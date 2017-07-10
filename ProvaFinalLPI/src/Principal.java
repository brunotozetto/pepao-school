import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
	static int tamanho = 5;
	static Funcionario vFuncionario[] = new Funcionario[tamanho];

	Funcionario func = new Funcionario();

	public static void main(String[] args) {
		while (true) {
			switch (digita(menu())) {
			case "1":
				// tamanhoCadastro();
				cadastraFuncionario();
				break;
			case "2":
				consultarFuncionario();
				break;
			case "3":
				listaFuncionarios();
				break;
			case "4":
				listaFuncionariosAtivos();
				break;
			case "5":
				listaFuncionarioCresc();
				break;
			case "10":

			default:
				System.out.println("Erro! Escolha uma opção válida.");
			}
		}
	}

	private static void listaFuncionariosAtivos() {
		for (int k = 0; k < vFuncionario.length; k++) {
			if (vFuncionario[k] != null)
				if (vFuncionario[k].getSituacao() == "Ativo")
					System.out.println(vFuncionario[k].mostraFuncionario());
		}
	}

	private static void listaFuncionarios() {
		for (int k = 0; k < vFuncionario.length; k++) {
			if (vFuncionario[k] != null)
				System.out.println(vFuncionario[k].mostraFuncionario());
		}
	}

	private static void tamanhoCadastro() {
		System.out.println("Digite a quantidade de funcionários: ");
		int num = new Scanner(System.in).nextInt();
		tamanho = num;
	}

	private static void cadastraFuncionario() {
		if (vFuncionario[vFuncionario.length - 1] == null)
			for (int k = 0; k < tamanho; k++) {
				if (vFuncionario[k] == null) {
					vFuncionario[k] = new Funcionario();
					return;
				}
			}
		System.out.println("Não é possível cadastrar mais funcionários!");
	}

	private static void consultarFuncionario() {
		// TODO Auto-generated method stub

	}

	private static void listaFuncionarioCresc() {
		Funcionario vCrescente[] = new Funcionario[5];
		for (int k = 0; k < vFuncionario.length; k++)
			if (vFuncionario[k] != null)
				vCrescente[k] = vFuncionario[k];  

		Arrays.sort(vCrescente);
		
		for (int k = 0; k < vCrescente.length; k++)
			System.out.println(vCrescente[k].mostraFuncionario());
	}

	public static String digita(String msg) {
		Scanner a = new Scanner(System.in);
		System.out.println(msg);
		return a.nextLine();
	}

	public static String menu() {
		String menu = "";
		menu += "Menu: \n 1 - CADASTRAR FUNCIONÁRIO";
		menu += "\n 2 - CONSULTAR FUNCIONÁRIO";
		menu += "\n 3 - LISTAR TODOS FUNCIONÁRIOS";
		menu += "\n 4 - LISTAR SOMENTE FUNCIONÁRIOS ATIVOS";
		menu += "\n 5 - LISTAR FUNCIONÁRIOS EM ORDEM DE IDADE CRESCENTE";
		menu += "\n 10 - SAIR";
		menu += "\nSelecione: ";
		return menu;
	}

}
