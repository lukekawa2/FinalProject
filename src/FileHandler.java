import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileHandler {

    public Map<String, Integer> conversions = new HashMap<>();

    protected String conversionsMade(String filename) {
        StringBuilder rules = new StringBuilder();

        try {
            for (String line : Files.readAllLines(Paths.get(
                    "data/" + filename + "conversion.txt"))) {
                rules.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return rules.toString();
    }

    protected void loadConversions(String filename) {
        if (filename.isBlank()) {
            System.out.println("File name is null, please name file");
        }

    }
}
