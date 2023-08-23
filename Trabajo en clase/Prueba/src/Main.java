import generated.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AlphaScanner inst = null;
        AlphaParser2 parser2 = null;

        ParseTree tree=null;

        CharStream input=null;
        CommonTokenStream tokens = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new AlphaScanner(input);
            tokens = new CommonTokenStream(inst);
            parser2 = new AlphaParser2(tokens);
            //AlphaParserManual parser = new AlphaParserManual(inst);
            try {
                tree = parser2.program();
                parser2.program();
                System.out.println("Compilación Terminada!!\n");
            }
            catch(RecognitionException e){
                System.out.println("Error!!!");
                e.printStackTrace();
            }
        }
        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}

    }
}