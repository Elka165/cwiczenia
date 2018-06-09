import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        int liczba = 0;
        System.out.println("Wybierz liczbę przy argumencie: ");
        for (Opcje arg : Opcje.values()) {
            System.out.println(liczba + ": " + arg);
            liczba++;
        }
        Scanner scaner = new Scanner(System.in);

        int outDana = scaner.nextInt();



            switch (outDana) {
                case 0:
                    break;
                case 1:
                    menu.setOpcje(Opcje.DODAWANIE);
                    break;
                case 2:
                    menu.setOpcje(Opcje.ODEJMOWANIE);
                    break;
                case 3:
                    menu.setOpcje(Opcje.MNOŻENIE);
                    break;
                case 4:
                    menu.setOpcje(Opcje.DZIELENIE);
                    break;
            }
            System.out.println(menu.getOpcje());


        }

}
