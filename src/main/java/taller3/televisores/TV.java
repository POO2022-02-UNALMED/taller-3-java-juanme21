package taller3.televisores;

public class TV {

	private boolean estado;
	private Marca marca;
	private int precio = 500;
	private int volumen = 1;
	private Control control;
	private int canal = 1;
	static int numTV;

	public TV(Marca mar, boolean est) {
		this.marca = mar;
		this.estado = est;

		numTV++;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn(){
		this.estado=true;
	}
	
	public void turnOff(){
		this.estado=false;
	}
	
	public boolean getEstado() {
		return estado;
	}

	public void canalUp() {
		if((canal<120 && canal>=1) && (estado)) {
			canal++;
		}
	}
	
	public void canalDown() {
		if((canal<=120 && canal>1) && (estado)) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if((volumen<=7 && volumen>0) && (estado)) {
			volumen--;
		}
	}
	
	public void volumenDown() {
		if((volumen<=7 && volumen>0) && (estado)) {
			volumen--;
		}
	}
}
