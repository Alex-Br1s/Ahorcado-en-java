import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        //?"Juego de bebida"
        /* System.out.println("Eliga su bebida");
        System.out.println("1 Cafe");
        System.out.println("2 Mate");
        System.out.println("3 Gaseosa");
        System.out.println("4 Vino");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Tome su cafe");
                break;
            case 2:
                System.out.println("Tome su mate");
                break;
            case 3:
                System.out.println("Tome su gaseosa");
                break;
            case 4:
                System.out.println("Tome su vino");
                break;
        
            default:
            System.out.println("Opcion no valida");
                break;
        }
        if(option <= 4) {
            System.out.println("Disfrute de su bebida" );
        } */


        String palabraSecreta = "programador";
        int intentosMaximo = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while(!palabraAdivinada && intentos < intentosMaximo){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras )");
            System.out.println("Introduce una letra");

            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta te quedan " + (intentosMaximo - intentos) + " intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades adivinaste la palabra secreta! " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("Que pena te has quedado sin intento");
            System.out.println("GAME OVER");
        }
        scanner.close();
    }
}
