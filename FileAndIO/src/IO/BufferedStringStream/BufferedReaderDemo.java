package IO.BufferedStringStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        Reader reader=new FileReader("FileAndIO/src/IO/ByteStream/file.txt");
        Reader breader=new BufferedReader(reader);
    }
}