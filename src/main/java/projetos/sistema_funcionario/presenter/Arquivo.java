package projetos.sistema_funcionario.presenter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import projetos.sistema_funcionario.model.Funcionario;

public class Arquivo {
    public void salvar(Funcionario funcionario) throws IOException{
        
        /*É NECESSÁRIO CRIAR O ARQUIVO TXT ANTES*/
        
        String directoryName = System.getProperty("user.dir");
        Path caminho = Paths.get(directoryName + "/src/main/java/projetos/sistema_funcionario/presenter/Arquivo.txt");
        
        //LÊ E ESCREVE NO ARQUIVO (CONCATENADO)
        String textoEscrita = funcionario.toString();
        byte[] textoLeitura = Files.readAllBytes(caminho);
        byte[] textoEmByte = textoEscrita.getBytes();
        byte[] textoCompleto = ArrayUtils.addAll(textoEmByte, textoLeitura);
        
        //EXCEÇÃO
        try{
            Files.write(caminho, textoCompleto);
            JOptionPane.showMessageDialog(null, "Funcionario " + funcionario.getNome() + " foi salvo no arquivo!");
        }
        catch(Exception erro){
            
        }
    }
}
