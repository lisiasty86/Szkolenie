package zajecia8Kolekcje;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) throws IOException {

        updateFile();

    }

    public static void updateFile() throws IOException {
        Map<Integer, String> ldapContent = new HashMap<>();
        String filePath = "C:\\Users\\llis\\Desktop\\MOJE\\PROGRAMOWANIE\\AUTOMATY\\Szkolenie\\notes.txt";
        FileWriter fileWriter = null;

/*        for (int j=0; j<hashMap.size(); j++) {
            ldapContent.put(j, hashMap.get(j));
        }*/
/*        for (int i = 0; i < ldapContent.size(); i++) {
            System.out.println(i + ": " + ldapContent.get(i));
            try {
                fileWriter = new FileWriter(filePath);
                fileWriter.write("dupa");
            } finally {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }
        }*/

        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write("dupa");
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

}
