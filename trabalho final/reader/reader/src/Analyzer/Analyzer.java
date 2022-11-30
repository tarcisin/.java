package Analyzer;

public class Analyzer {

  public static int stringCounter(String file, String word){
    int occurences = 0;
    String res = "";
      for(int i = 0; i < file.length() - word.length(); i++){
        for(int j = 0; j < word.length(); j++){
          res += file.charAt(i + j);
        }
        System.out.println(res + "\n");
        if(res.equals(word)){
          occurences += 1;
        }
        res = "";
      }

    return occurences;
  }
  

  
}
