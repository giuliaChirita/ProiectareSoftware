package ro.ulbs.paradigme.lab5;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class lab5 {
    public static void main(String[] args) {
        try {
            List<String> lines = Collections.unmodifiableList(Files.readAllLines(Paths.get("in.txt")));
            List<String> modifiedLinesA = new ArrayList<>();
            for (String line : lines) {
                modifiedLinesA.add(line + "\n\n");
            }

            List<String> modifiedLinesB = new ArrayList<>();
            for (String line : lines) {
                StringBuilder newLine = new StringBuilder();
                for (char c : line.toCharArray()) {
                    newLine.append(c);
                    if (c == '.') {
                        newLine.append("\n\n");
                    }
                }
                modifiedLinesB.add(newLine.toString());
            }

            Files.write(Paths.get("out.txt"), modifiedLinesB);

            System.out.println("\nRezultatele modificarilor a):\n");
            modifiedLinesA.forEach(System.out::print);

            System.out.println("\nRezultatele modificarilor b):\n");
            modifiedLinesB.forEach(System.out::print);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}