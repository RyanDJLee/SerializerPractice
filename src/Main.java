import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		LocalDateTime t1 = new LocalDateTime("November 27th 2018", 12);
		
		// Serialize t
		OutputStream out = new FileOutputStream(new File("output.data"));
		ObjectOutputStream serializer = new ObjectOutputStream(out);
		serializer.writeObject(t1);
		out.close();
		
		// Deserialize from out
		InputStream in = new FileInputStream("output.data");
		ObjectInputStream deserializer = new ObjectInputStream(in);
		LocalDateTime t2 = (LocalDateTime) deserializer.readObject();
		deserializer.close();
		
		System.out.println(t1.displayDate());
		System.out.println(t2.displayDate());
	}
}
