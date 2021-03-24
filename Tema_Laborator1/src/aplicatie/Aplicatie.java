package aplicatie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplicatie {

	public static void main(java.lang.String[] args) throws IOException {

		Scanner inputScan = new Scanner(System.in);
		System.out.println("Introduceti cuvintele:");
		java.lang.String readValue = inputScan.next();
		FileWriter writer = new FileWriter("output.txt", true);

		try {
			while (!"end".equalsIgnoreCase(readValue)) {
				writer.write(readValue);
				readValue = inputScan.nextLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
