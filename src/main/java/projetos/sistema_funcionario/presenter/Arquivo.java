package projetos.sistema_funcionario.presenter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

import org.apache.commons.lang3.ArrayUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import projetos.sistema_funcionario.model.Funcionario;
import projetos.sistema_funcionario.model.FuncionarioCollection;

public class Arquivo {
    private static final Logger LOGGER = LoggerFactory.getLogger(Funcionario.class);
    
    public void salvar(FuncionarioCollection funcionario) throws IOException{
        String directoryName = System.getProperty("user.dir");
        Path caminho = Paths.get(directoryName + "/src/main/java/projetos/sistema_funcionario/presenter/Arquivo.txt");
        
        // Lê e escreve no arquivo
        String textoEscrita = funcionario.toString();
        byte[] textoLeitura = Files.readAllBytes(caminho);
        byte[] textoEmByte = textoEscrita.getBytes();
        byte[] textoCompleto = ArrayUtils.addAll(textoEmByte, textoLeitura);
        
        try{
            Files.write(caminho, textoCompleto);
            JOptionPane.showMessageDialog(null, "Funcionarios salvos no arquivo!");
        }
        catch(Exception e){
            LOGGER.info("Erro: " + e);
        }
    }
}
