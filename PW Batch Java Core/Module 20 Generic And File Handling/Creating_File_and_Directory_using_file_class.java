import java.io.File;
import java.io.IOException;

public class Creating_File_and_Directory_using_file_class {
    public static void main(String[] args) throws IOException {
        File file1 = new File("rk.txt");
        System.out.println(file1.exists()); // out= false

        // create a new file

        file1.createNewFile();
        System.out.println(file1.exists()); // true

        // for directory

        File dir = new File("GK");
        System.out.println(dir.exists()); // false

        dir.mkdir(); // mkdir = make this directory--->

        System.out.println(dir.exists()); // true // this are create a folder like GK name -->

    }

}
