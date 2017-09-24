package vikingo;

public class ModoEnojado implements EstadoVikingo{
	private static final int ATAQUE = 30;
	private static final int DEFENSA= 0;

	@Override
	public EstadoVikingo agitar() {
		return this;
	}

	@Override
	public EstadoVikingo beber() {
		return new ModoNormal();
	}

	@Override
	public int estadoAtaque() {
		return ATAQUE;
	}

	@Override
	public int estadoDefensa() {
		return DEFENSA;
	}
}