import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {

    public static void main(String[] args) throws IOException {
        File myFile = new File("myFile.txt");

        if (myFile.createNewFile()){
            System.out.println("File Created.");
        }else{
            System.out.println("File alread exists.");

        }
        FileWriter editFile = new FileWriter("myFile.txt");
        editFile.write("yooooooooooooooooooo");
        editFile.close();
        FileReader reader = new FileReader("myFile.txt");
        Scanner obj = new Scanner(reader);
        while(obj.hasNextLine()){
            String abc = obj.nextLine();
            System.out.println(abc);

        }
        reader.close();
    }
}
