package decorator;

public class Acai implements Adicional {

	private String descricao = "a�ai";
	private float custoI = 10;

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public float custo() {
		return custoI;
	}
}