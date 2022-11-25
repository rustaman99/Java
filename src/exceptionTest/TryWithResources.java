package exceptionTest;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) throws IOException {

        try(Reader reader= new FileReader(new File("someFileName"))){
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
