package projetos.sistema_funcionario.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

import org.apache.commons.lang3.ArrayUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import projetos.sistema_funcionario.model.Funcionario;

public class DAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(Funcionario.class);
    
    public void salvarFuncionario(Funcionario funcionario) {
        String directoryName = System.getProperty("user.dir");
        Path caminho = Paths.get(directoryName + "/src/main/java/projetos/sistema_funcionario/dao/Arquivo.txt");
        
        try{
            // Lê e escreve no arquivo
            String textoEscrita = funcionario.toString();
            byte[] textoLeitura = Files.readAllBytes(caminho);
            byte[] textoEmByte = textoEscrita.getBytes();
            byte[] textoCompleto = ArrayUtils.addAll(textoEmByte, textoLeitura);
        
            Files.write(caminho, textoCompleto);
            JOptionPane.showMessageDialog(null, "Funcionarios salvos no arquivo!");
        }
        catch(Exception e){
            LOGGER.info("Erro: " + e);
        }
    }
    
    public void getFuncionarios() {
        
    }
}
