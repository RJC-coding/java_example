import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class listMaker {
    public listObject makeList(String fileDirectory) {
        File file = new File(fileDirectory);
        listObject listObject = new listObject();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                listObject.getList().add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return listObject;
    }
}
