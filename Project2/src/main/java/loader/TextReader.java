package loader;

import entity.Configs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 * TextReader.java
 * <p>
 * Special class for reading information from file
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class TextReader {

    public String readFile() {
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(Configs.FILE_INPUT));
            return new String(encoded, Configs.DEFAULT_ENCODING);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
