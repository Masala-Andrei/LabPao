package Exercitiul2;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void a() throws FileNotFoundException {
        File file = new File("src/main/java/Exercitiul2/input.txt");
        Scanner scanner = new Scanner(file);
        String maxString = scanner.nextLine();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.length() > maxString.length())
                maxString = line;
        }
        scanner.close();
        System.out.println(maxString);
    }

    public static void b() throws IOException {
        String path = "src/main/java/Exercitiul2/Main.java";
        try (BufferedReader reader = new BufferedReader(new FileReader(path));
             FileWriter myWriter = new FileWriter("src/main/java/Exercitiul2/input.txt")) {
            String line;
            while ((line = reader.readLine()) != null) {
                myWriter.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void c() throws IOException {
        String path = "src/main/java/Exercitiul2/input.txt";
        ArrayList<String> content = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while((line = reader.readLine())!=null){
                content.add(line);
            }
            System.out.println(content);
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        a();
        c();
        b();
        c();
    }
}
