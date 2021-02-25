package Diagrama de Classe;

public abstract class RelatorioTemplate {

	private List<Pedido> pedidos;

	public void gerar() {

	}

	public abstract void montaCabecalho();

	public abstract void montaConteudo();

	public abstract void montaRodape();

}
