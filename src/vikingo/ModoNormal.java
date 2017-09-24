package vikingo;

public class ModoNormal implements EstadoVikingo {
	private static final int ATAQUE = 10;
	private static final int DEFENSA = 5;

	@Override
	public EstadoVikingo agitar() {
		return new ModoEnojado();
	}

	@Override
	public EstadoVikingo beber() {
		return new ModoBorracho();
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