package main.java.loader;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

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