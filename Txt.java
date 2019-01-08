import java.io.FileWriter;
import java.util.*;
import java.io.IOException;

public class Txt {
	/**We create each arrayaist item in a single line to txt*/
	public void createFile(ArrayList<ArrayList<String>> inner) throws IOException {
		try {
			FileWriter writer = new FileWriter("data.txt");
			int size = inner.size();
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < inner.get(i).size(); j++) {
				String str = inner.get(i).get(j).toString();
				writer.write(str);
				/**With this we prevent creating a blank like at the end of the file*/
				if (i < size - 1)
					writer.write("\n");
				}
			}
			writer.close();
		} catch (IOException e) {
		}
	}
}