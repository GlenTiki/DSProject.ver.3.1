package ie.wit.io;

import ie.wit.abs.Device;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import javax.swing.JOptionPane;

public class FileHandler<currentClass> {
	private String driveLetter;
	private FileOutputStream outByteStream;
	private ObjectOutputStream OOStream;
	private FileInputStream inByteStream;
	private ObjectInputStream OIStream;

	private File aFile = new File("objects.dat");

	public boolean isFileEmpty() {
		return (aFile.length() <= 0);
	}

	public void writeToFile(List<? extends Serializable> list) {
		try {
			outByteStream = new FileOutputStream(aFile);
			OOStream = new ObjectOutputStream(outByteStream);

			OOStream.writeObject(list);

			outByteStream.close();
			OOStream.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "I/O Error on " + e + "\nPlease Contact your Administrator :-)");
		}
	}

	public List<currentClass> readFromFile(Class<? extends Serializable> currentClass) {
		List<currentClass> temp = null;

		try {
			inByteStream = new FileInputStream(aFile);
			OIStream = new ObjectInputStream(inByteStream);

			if (!this.isFileEmpty())
				temp = (List<currentClass>) OIStream.readObject();

			inByteStream.close();
			OIStream.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "I/O Error" + e + "\nPlease Contact your Administrator :-)");
		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "General Error" + e + "\nPlease Contact your Administrator :-)");
		}

		return temp;
	}
}
