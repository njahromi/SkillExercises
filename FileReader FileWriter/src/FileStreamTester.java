import java.io.*;

public class FileStreamTester {

	public static void main(String[] args) throws IOException {

		Reader inFile = null;
		Writer outFile = null;
		try {
			inFile = new FileReader("ReadFrom.txt");
			outFile = new FileWriter("WriteTo.txt");

			int i = inFile.read();
			while (i != -1) {
				outFile.write(i);
				i = inFile.read();
			}
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (inFile != null)
				inFile.close();
			if (outFile != null)
				outFile.close();
		}
	}
}
