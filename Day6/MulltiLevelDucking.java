import java.io.*;
public class MultiLevelDucking{

    static void readFile()throws IOException{
        FileReader fr = new FileReader("Day6Notes.txt");  //FileReader is used to read the contents of the file "Day6Notes.txt". If the file does not exist, it will throw a FileNotFoundException, which is a subclass of IOException.
        System.out.println("File Opened Successfully");
    }

    static void processFile()throws IOException{
        readFile();
    }

    static void handleFile()throws IOException{
        processFile();
    }

    public static void main(String[] args){
        try{
            handleFile();
        }
        catch(IOException){
            System.out.println("Caught exception in main");
        }
        finally{
            System.out.println("Program executed");
        }
    }
}