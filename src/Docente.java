
public class Docente {

	private String id;
	private String nombre;
	private String curso;
	private String horario_curso;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getHorario_curso() {
		return horario_curso;
	}

	public void setHorario_curso(String horario_curso) {
		this.horario_curso = horario_curso;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	private String jefe;

	public Docente(String id, String nombre, String curso, String horario_curso, String jefe) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.horario_curso = horario_curso;
		this.jefe = jefe;
	}

	public Docente() {
		super();
	}

	public void mostrarDatos() {
		System.out.println("Id: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Rama: " + this.curso);
		System.out.println("Horario de mañanas: " + this.horario_curso);
		System.out.println("Cargo: " + this.jefe);
		System.out.println();
	}
}
