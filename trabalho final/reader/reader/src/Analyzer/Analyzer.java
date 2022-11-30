package Analyzer;

public class Analyzer {

  public static int stringCounter(String file, String word){
    int occurences = 0;
    String res = "";
      for(int i = 0; i < file.length() - word.length(); i++){
        for(int j = 0; j < word.length(); j++){
          res += file.charAt(i + j);
        }
        if(res.equals(word)){
          occurences += 1;
        }
        res = "";
      }

    return occurences;
  }

  public static int stringCounterDif(String file, String word){
    String fileL = file.toLowerCase();
    String wordL = word.toLowerCase();
    int occurences = 0;
    String res = "";
      for(int i = 0; i < file.length() - word.length(); i++){
        for(int j = 0; j < word.length(); j++){
          res += fileL.charAt(i + j);
        }
        if(res.equals(wordL)){
          occurences += 1;
        }
        res = "";
      }

    return occurences;
  }
  

  
}
