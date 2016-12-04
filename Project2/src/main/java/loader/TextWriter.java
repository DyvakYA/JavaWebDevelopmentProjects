package loader;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * TextWriter.java
 * <p>
 * Special class for writing information from file
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class TextWriter {

    public void writeText(String text, String path) {
        text = text.replaceAll("[ ][\n][\n]", "\n\n");
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(path);
            printWriter.print(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } finally {
            printWriter.close();
        }
    }
}