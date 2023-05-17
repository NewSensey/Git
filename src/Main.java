import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Docente> profesores = new ArrayList<Docente>();
		File file = new File("Profesores.txt");
		profesores = getProfesoresFromFile(file, profesores);
		for(Docente p:profesores) {
			p.mostrarDatos();
		}
		
	}
	
	public static ArrayList<Docente> getProfesoresFromFile(File fichero, ArrayList<Docente> profesores) {
		String st;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			while ((st = br.readLine()) != null) {
				String[] data = st.split("\\|");
				Docente profe = new Docente("00"+data[0], data[1].toLowerCase(), data[2].toLowerCase(), data[4], data[6].toLowerCase());
				profesores.add(profe);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
		return profesores;
	}

}
