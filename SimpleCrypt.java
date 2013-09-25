import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SimpleCrypt {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(args[0]);
		System.out.println(path.toString());
		byte[] input = Files.readAllBytes(path);
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
			input[i] += 1;
			System.out.println(input[i]);
		}
		File output = new File("\\SimpleCrypt\\src\\out.garbacrypt");
		FileOutputStream fop = new FileOutputStream(output);

		fop.write(input);
		fop.flush();
		fop.close();
	}
}
