package ex2;

public class PessoaJuridica extends Cliente{

	public PessoaJuridica(String pais, String dataCadastro, String razaoSocial, String nomeFantasia, String sigla, String CNPJ) {
		super(pais, dataCadastro);
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.sigla = sigla;
		this.CNPJ = CNPJ;
	}
	
	private String razaoSocial;
	private String nomeFantasia;
	private String sigla;
	private String CNPJ;
	
	public void Imprime() {
		super.Imprime();
		System.out.println("Razao Social: "+this.razaoSocial);
		System.out.println("Nome Fantasia: "+this.nomeFantasia);
		System.out.println("Sigla: "+this.sigla);
		System.out.println("CNPJ: "+this.CNPJ);
		
	}
	
}
