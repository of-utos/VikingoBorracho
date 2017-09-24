package vikingo;

public class Vikingo {
	private int salud = 100;
	private EstadoVikingo estado = new ModoNormal();

	public void atacar(final Vikingo vikingo) {
		vikingo.serAtacado(this.estado.estadoAtaque());
	}

	private void serAtacado(final int ataque) {
		this.salud -= (ataque - this.estado.estadoDefensa());
		if(this.salud < 0){
			this.salud = 0;
		}
	}

	public int getSalud() {
		return this.salud;
	}

	public void agitarHermano(final Vikingo vikingo){
		vikingo.enojarse();
	}

	public void convidarBebida(final Vikingo vikingo) {
		vikingo.emborracharse();
	}
	
	private void emborracharse(){
		this.estado = this.estado.beber();
	}
	
	private void enojarse(){
		this.estado = this.estado.agitar();
	}
}