public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Escolha uma fábrica (Nike, Adidas, Puma, Umbro, Kappa): ");
        String fabricante = scanner.nextLine();

        System.out.print("Escolha um time (Brasil, Flamengo, Botafogo, Fluminense, Vasco): ");
        String time = scanner.nextLine();

        FabricaEsportiva fabrica = obterFabrica(fabricante);

        if (fabrica != null) {
            CamisaEsportiva camisa = fabrica.criarCamisa();
            System.out.println("Camisa do " + camisa.getTime() + " fabricada pela " + camisa.getFabricante());
        } else {
            System.out.println("Fábrica não encontrada.");
        }

        scanner.close();
    }

    public static FabricaEsportiva obterFabrica(String nome) {
        switch (nome.toLowerCase()) {
            case "nike":
                return new NikeFactory();
            case "adidas":
                return new AdidasFactory();
            case "puma":
                return new PumaFactory();
            case "umbro":
                return new UmbroFactory();
            case "kappa":
                return new KappaFactory();
            default:
                return null;
        }
    }
}
