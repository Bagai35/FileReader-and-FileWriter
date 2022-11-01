import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        FileWriter fw = new FileWriter("test.txt");
        fw.write(txt);
        fw.close();

        FileReader fr = new FileReader("test.txt");
        Scanner scan = new Scanner(fr);
        System.out.println(scan.nextLine());

        fr.close();
    }
}