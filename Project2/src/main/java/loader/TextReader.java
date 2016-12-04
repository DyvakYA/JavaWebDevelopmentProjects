package main.java.loader;

import main.java.model.Configs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextReader {

    public static String readFile() {
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(Configs.FILE_INPUT));
            return new String(encoded, Configs.DEFAULT_ENCODING);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
