package vikingo;

public class ModoBorracho implements EstadoVikingo{
	private static final int ATAQUE = 7;
	private static final int DEFENSA = 2;

	@Override
	public EstadoVikingo agitar() {
		return new ModoNormal();
	}

	@Override
	public EstadoVikingo beber() {
		return this;
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