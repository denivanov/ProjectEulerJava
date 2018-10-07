// Project Euler Java Solutions by Denitza Anderson 2018
// main class here for running and outputting code solutions

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProjectEuler {
    public static void main(String[] args) throws IOException {
        List<String> lines = new ArrayList<>();

        lines.add("Problem 1 solution: " + Problem1.solve());
        lines.add("Problem 2 solution: " + Problem2.solve());
        lines.add("Problem 3 solution: " + Problem3.solve());
        lines.add("Problem 4 solution: " + Problem4.solve());
        
        Path file = Paths.get("ProjectEulerSolutions.txt");
        Files.write(file, lines, Charset.forName("UTF-8"));
    }
}
