package FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {
  public static String Read(String fileDir){
    String content = "";
    try {
        FileReader file = new FileReader(fileDir);
        BufferedReader readFile = new BufferedReader(file);
        String line = "";
        try {
            line = readFile.readLine();
            while(line!=null){
                content += line+"\n";
                line = readFile.readLine();
            }
            file.close();
            return content;
        } catch (IOException ex) {
            System.out.println("Erro: Não foi possível ler o arquivo!");
            return "";
        }
    } catch (FileNotFoundException ex) {
        System.out.println("Erro: Arquivo não encontrado!");
        return "";
    }
  }
}
