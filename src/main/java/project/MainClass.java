package project;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        try {
            Path path = FileSystems.getDefault().getPath("Text.txt");
            List<String> text = Files.readAllLines(path, StandardCharsets.UTF_8);
            Collections.reverse(text);
            File file = new File("TextResult.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(text);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
