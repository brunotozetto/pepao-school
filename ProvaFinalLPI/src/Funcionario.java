import java.util.Scanner;

public class Funcionario {
	private String nome;
	private int idade;
	private String situacao;
	
	public Funcionario(){
		setNome(digita("Digite o nome: "));
		setIdade(Integer.parseInt(digita("Digite a idade: ")));
		setSituacao(lerSituacao());
	}
	
	private String lerSituacao() {
		String sit;
		System.out.println("Selecione a situa��o do funcion�rio:\n1- Ativo\n2 - Inativo");
		int a = new Scanner(System.in).nextInt();		
		if (a == 1)
			return sit = "Ativo";
		return sit = "Inativo";
	}

	
	/*public String toString() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", situacao=" + situacao + "]";
	}*/

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String mostraFuncionario(){
		return "Nome = " + this.nome + ", Idade = " + this.idade + ", Situa��o =" + this.situacao;
	}
	
	public static String digita(String msg) {
		Scanner a = new Scanner(System.in);
		System.out.println(msg);
		return a.nextLine();
	}
	 
	

}
