import java.io.FileWriter;
import java.util.*;
import java.io.IOException;

public class Txt {
	// We create each ArrayList item in a single line to txt
	private void createFile(String file, ArrayList<String> arrData) throws IOException {
		FileWriter writer = new FileWriter(file + ".txt");
		int size = arrData.size();
		for (int i = 0; i < size; i++) {
			String str = arrData.get(i).toString();
			writer.write(str);
			// With this we prevent creating a blank like at the end of the file
			if (i < size - 1)
				writer.write("\n");
		}
		writer.close();
	}
}
