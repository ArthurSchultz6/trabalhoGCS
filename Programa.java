
public class Programa {

    public static void saudar(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nomeUsuario = scanner.nextLine();
        saudar(nomeUsuario);


    }
}