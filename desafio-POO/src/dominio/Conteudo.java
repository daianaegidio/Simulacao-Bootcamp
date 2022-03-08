package dominio;

public abstract class Conteudo {

	public static final double XP_PADRAO =10d; // static significa que pode acessar fora da  classe conteudo 
    String titulo;
    String descricao;
    
    public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    //abstract siginifica que não é possivel instanciar contéudo


}

