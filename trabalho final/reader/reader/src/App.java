import Analyzer.Analyzer;
import FileReader.File;

public class App {
    public static void main(String[] args) throws Exception {
        int b;
        String a = File.Read("DoNotGoGentleIntoThatGoodNight.txt");
        b = Analyzer.stringCounterDif(a, "os");
        System.out.println(b);
    }
}
