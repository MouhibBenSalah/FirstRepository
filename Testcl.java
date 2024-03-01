public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans la calculatrice Java !");
        
        while (true) {
            System.out.println("\nChoisissez une opération :");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();

            if (choix == 5) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.println("Entrez le premier nombre :");
            double nombre1 = scanner.nextDouble();
            System.out.println("Entrez le deuxième nombre :");
            double nombre2 = scanner.nextDouble();

            double resultat;
            switch (choix) {
                case 1:
                    resultat = Calculatrice.addition(nombre1, nombre2);
                    break;
                case 2:
                    resultat = Calculatrice.soustraction(nombre1, nombre2);
                    break;
                case 3:
                    resultat = Calculatrice.multiplication(nombre1, nombre2);
                    break;
                case 4:
                    try {
                        resultat = Calculatrice.division(nombre1, nombre2);
                    } catch (ArithmeticException e) {
                        System.out.println("Erreur : " + e.getMessage());
                        continue; // Redemander l'opération à l'utilisateur
                    }
                    break;
                default:
                    System.out.println("Choix invalide !");
                    continue; // Redemander l'opération à l'utilisateur
            }

            System.out.println("Le résultat de l'opération est : " + resultat);
        }

        scanner.close();
    }
}