package taller3.televisores;

public class Control {
	private TV tv;

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public void turnOn() {
		tv.turnOn();
	}

	public void turnOff() {
		tv.turnOff();
	}

	public void canalUp() {
		tv.canalUp();
	}

	public void canalDown() {
		tv.canalDown();
	}
	

	public void setCanal(int canal) {
		if(canal<=120 && canal>0 && tv.getEstado()) {
			tv.setCanal(canal);
		}
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}

	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void enlazar(TV t) {
		tv=t;
		t.setControl(this);
	}
}
