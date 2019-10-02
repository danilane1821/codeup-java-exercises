
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {

public static List<String> getFileContents (String filePath) {
    Path givenPath = Paths.get("Src", filePath);
    List<String> fileContents = new ArrayList<>();
    try{
        fileContents = Files.readAllLines(givenPath);
    }catch(Exception e){
        e.printStackTrace();
    }

//    for (String name : fileContents) {
//            System.out.println("Hello, " + name + "!");
//        }
    return fileContents;
}

    public static void main(String[] args) {
        System.out.println(getFileContents("shapes/Circle.java"));
        System.out.println(getFileContents("names"));

    }



//    public static List<String>getContents(String location) throws IOException{
//    Path p = Paths.get(location);
//    return Files.readAllLines(p);
//    }
}
