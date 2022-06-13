package projetos.sistema_funcionario.dao;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import org.apache.commons.lang3.ArrayUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import projetos.sistema_funcionario.model.*;


public class DAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(Funcionario.class);

    Path caminho;

    public DAO() {
        this.caminho = Paths.get(System.getProperty("user.dir") + "/src/main/java/projetos/sistema_funcionario/dao/Arquivo.txt");
    }
    
    public void resetaArquivo() {
        try {
            File file = new File(System.getProperty("user.dir") + "/src/main/java/projetos/sistema_funcionario/dao/Arquivo.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        } catch(Exception e) {
            LOGGER.info("Erro ao ler arquivo: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo: " + e);
        }
    }
    
    // salva todos os funcionarios
    public void salvarFuncionarios(List<Funcionario> funcs) {
        resetaArquivo();
        for (Funcionario f: funcs) {
            this.salvarFuncionario(f);
        }
        
    }
    
    // salva um funcionário
    public void salvarFuncionario(Funcionario funcionario) {
        try{
            String textoEscrita = funcionario.toString();
            byte[] textoLeitura = Files.readAllBytes(caminho);
            byte[] textoEmByte = textoEscrita.getBytes();
            byte[] textoCompleto = ArrayUtils.addAll(textoEmByte, textoLeitura);
        
            Files.write(caminho, textoCompleto);
        }
        catch(Exception e){
            LOGGER.info("Erro ao salvar funcionário no arquivo: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao salvar funcionário no arquivo: " + e);
        }
    }
    
    // pega a lista de funcionários
    public List<Funcionario> getFuncionarios() {
        try {
            if (!Files.isReadable(caminho)) {
                throw new RuntimeException("Não foi possível ler o arquivo");
            }
            
            List<Funcionario> funcionarios = new ArrayList<Funcionario>();
            String[] funcionariosLeitura = new String(Files.readAllBytes(caminho)).split("@split");
            
            if (funcionariosLeitura.length > 0) {
                for (int i = 0; i < funcionariosLeitura.length; i++) {
                    try {
                        funcionarios.add(leituraToFuncionario(funcionariosLeitura[i]));
                    } catch(Exception e) {}
                }
                return funcionarios;
            } 
            
        } catch(Exception e) {
            LOGGER.info("Erro: " + e);
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return new ArrayList<Funcionario>();
    }
    
    // transforma a string de um funcionário em uma instância
    public Funcionario leituraToFuncionario(String s) {
        String nome = s.substring(s.indexOf("Nome: "), s.indexOf("\n" + "Cargo: ")).split("Nome: ")[1];
        String cargo = s.substring(s.indexOf("Cargo: "), s.indexOf("\n" + "Idade: ")).split("Cargo: ")[1];
        int idade = Integer.parseInt(s.substring(s.indexOf("Idade: "), s.indexOf("\n" + "Salario: ")).split("Idade: ")[1]);
        double salarioBase = Double.parseDouble(s.substring(s.indexOf("Salario: "), s.indexOf("\n" + "\n" + "BONUS DO FUNCIONARIO")).split("Salario: ")[1]);

        String tipoBonus = s.substring(s.indexOf("Bonus padrão: "), s.indexOf("\n" + "Faltas: ")).split("Bonus padrão: ")[1];
        int faltas = Integer.parseInt(s.substring(s.indexOf("Faltas: "), s.indexOf("\n" + "Tempo de serviço: ")).split("Faltas: ")[1]);
        int tempoServico = Integer.parseInt(s.substring(s.indexOf("Tempo de serviço: "), s.indexOf("\n" + "Funcionario do mes: ")).split("Tempo de serviço: ")[1]);
        boolean funcionarioMes = Boolean.parseBoolean(s.substring(s.indexOf("Funcionario do mes: "), s.indexOf("\n" + "\n" + "------------------------------------------ //")).split("Funcionario do mes: ")[1]);

        Salario salario = new Salario(tipoBonus, faltas, tempoServico, funcionarioMes, salarioBase);
        return new Funcionario(nome, cargo, idade, salario);
    }
}
