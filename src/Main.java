import java.time.LocalDate;
import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner s = new Scanner(System.in);
        int op, bookingNum = 0, guestNum = 0, nightNum = 0;
        float priceNight = 0, iva = 0, total = 0;
        final int DOUBLE_ROOMS_PRICE = 60,NUM_DOUBLE_ROOMS = 8, NUM_SINGLE_ROOMS = 2, SINGLE_ROOMS_PRICE = 45;
        LocalDate entryDate = LocalDate.now(), exitDate = LocalDate.now();
        boolean exitApp = false;
        boolean fechaEntradaHoy = false;
        final String ADMIN_USER = "root";
        final int ADMIN_PASS = 1234;
        String keyboard = "", choosedRoom = "", customerName = "";
        boolean simpleRoomOneOccuped = false;
        boolean simpleRoomTwoOccuped = false;
        boolean doubleRoomOneOccuped = false;
        boolean doubleRoomTwoOccuped = false;
        boolean doubleRoomThreeOccuped = false;
        boolean doubleRoomFourOccuped = false;
        boolean doubleRoomFiveOccuped = false;
        boolean doubleRoomSixOccuped = false;
        boolean doubleRoomSevenOccuped = false;
        boolean doubleRoomEightOccuped = false;


        // Pintado de Menú inicial
        do {
        System.out.println("""
                
                
                
                
                
                
                
                             @@@@@@@@@@@@@@@@@@@@@@          @@@@@@@@@@@@@@@@@@@@@@                                                                                                                \s
                                 @@@@@@@@@@@@@@                  @@@@@@@@@@@@@@                                                                                                                    \s
                                   @@@@@@@@@@                     @@@@@@@@@@@                                                                                                                      \s
                                    @@@@@@@@@                      @@@@@@@@@                                                                                                                       \s
                                    @@@@@@@@                        @@@@@@@@                                  *@@@@@@                                                                              \s
                                    @@@@@@@@                        @@@@@@@@    @@@@@@@      @@@@@@@      @@@@@@@  @@@@@@    @@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@    @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@=    @@@@@@@      @@@@@@@     @@@@@@     @@@@@@@        @@@@@@@        @@@@@@@             @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@    @@@@@@@      @@@@@@        @@@@@@@@       @@@@@@@%            @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@   @@@@@@@       @@@@@@@       @@@@@@@@       @@@@@@@%            @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@   @@@@@@@       @@@@@@@       @@@@@@@@       @@@@@@@             @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@@@@@@@@@@@@@@   @@@@@@@       @@@@@@@       @@@@@@@@       @@@@@@@@@@@@@@@     @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@   @@@@@@@       @@@@@@@       @@@@@@@@       @@@@@@@             @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@   @@@@@@@       @@@@@@@       @@@@@@@@       @@@@@@@%            @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@   @@@@@@@       @@@@@@@       @@@@@@@@       @@@@@@@%            @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@    @@@@@@#      @@@@@@=       @@@@@@@@       @@@@@@@#            @@@@@@@                      \s
                                    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@     @@@@@@@      @@@@@@@     @@@@@@     @@@@@@@        @@@@@@@@       @@@@@@@             @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@      @@@@@@   @@@@@@          @@@@@@@@       @@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@            \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@         @@@@@@@@@             @@@@@@@        @@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@            \s
                                    @@@@@@@@                        @@@@@@@                                                                                                                        \s
                                    @@@@@@@@                        @@@@@@@                                                                                                                        \s
                                    @@@@@@@@                        @@@@@@@                                                                                                                        \s
                                    @@@@@@@@                        @@@@@@@     %%%%%%  %%  %* #%  %%%%%-  #%#%#  %%%%%#     %%%%%*  *#%%    -%#%####  %##%: ###%%-:%%#%% =%%%%#   %%+             \s
                                    @@@@@@@@                        @@@@@@@    :*       *#  #: +*  #    *  #. -*  #    %     *+   *# **      :* :- +*  #  *- +*  ++  ++   #    ##  %*              \s
                                    @@@@@@@@                        @@@@@@@    :%    %= *#  #  =*  %   *%  *# +*  #   .*     ##  :#+ +*      :* +* **  #+ #- =* #+   #*   #*   ##   *.             \s
                                    @@@@@@@@                        @@@@@@@     =%%%%-  %%  +%%%.  %:#%%   %* #%  %.%%%      %%:%%   :%%%    =% #% %%  %  %+ %%  %%  %%    #%%%#  %%%              \s
                                    @@@@@@@@                        @@@@@@@                                                                                                                        \s
                                    @@@@@@@@                        @@@@@@@+                                                                                                                       \s
                                    @@@@@@@@                        @@@@@@@@                                                                                                                       \s
                                    @@@@@@@@                        @@@@@@@@                                                                                                                       \s
                                   @@@@@@@@@@                      @@@@@@@@@                                                                                                                       \s
                                  @@@@@@@@@@@@                    @@@@@@@@@@@@                                                                                                                     \s
                             .@@@@@@@@@@@@@@@@@@@@@          @@@@@@@@@@@@@@@@@@@@@                                                                                                                 \s
                
                
                
                
                
                
                """);
        System.out.print("""
                1. Ver el estado de ocupación de las habitaciones.
                2. Reservar una habitación.
                3. Realizar el checkout de una habitación.
                4. Menú de Administrador.
                Introduce la opción deseada:\s""");

        // Solicitud y tratamiento de opción deseada
        op = Integer.parseInt(s.nextLine());
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
        switch (op){
            case 1:
                System.out.printf("Actualmente quedan %d habitaciones disponibles. De las cuales:\n", NUM_DOUBLE_ROOMS + NUM_SINGLE_ROOMS);
                System.out.printf("• %d son habitaciones dobles (%d€/noche).\n", NUM_DOUBLE_ROOMS, DOUBLE_ROOMS_PRICE);
                System.out.printf("• %d son habitaciones individuales (%d€/noche).\n", NUM_SINGLE_ROOMS, SINGLE_ROOMS_PRICE);
                System.out.print("Pulsa ENTER para continuar...");
                s.nextLine();
                for (int i = 0; i < 100; i++) {
                    System.out.println();
                }
                break;
            case 2:
                do {
                    System.out.println("""
                    ¿Que tipo de habitación deseas reservar?
                    1. Habitación individual.
                    2. Habitación doble.
                    Introduce la opción deseada:\s""");
                    op = Integer.parseInt(s.nextLine());
                    switch (op){
                        case 1:
                            if (simpleRoomTwoOccuped && simpleRoomOneOccuped) System.out.println("Actualmente no hay habitaciones simples disponibles");
                            else {
                                do {
                                    System.out.print("¿Vas a entrar hoy? (S/N): ");
                                    keyboard = s.nextLine();
                                    if (keyboard.equalsIgnoreCase("s")) fechaEntradaHoy = true;
                                    else if (keyboard.equalsIgnoreCase("n")) fechaEntradaHoy = false;
                                    else {
                                        System.out.println("El valor introducido no es válido, pulsa ENTER para continuar...");
                                        s.nextLine();
                                    }
                                } while (!(keyboard.equalsIgnoreCase("n") || keyboard.equalsIgnoreCase("s")));
                                do {
                                    if (!fechaEntradaHoy) {
                                        System.out.print("Introduce el día de entrada (aaaa-mm-dd): ");
                                        entryDate = LocalDate.parse(s.nextLine());
                                        if (entryDate.isBefore(LocalDate.now())) {
                                            System.out.println("La fecha introducida no es válida, pulsa ENTER para continuar...");
                                            s.nextLine();
                                        }
                                    } else entryDate = LocalDate.now();

                                } while (entryDate.isBefore(LocalDate.now()));
                                do {
                                    System.out.print("Introduce el día de salida (aaaa-mm-dd): ");
                                    exitDate = LocalDate.parse(s.nextLine());
                                    if (exitDate.isBefore(entryDate)) {
                                        System.out.println("La fecha introducida no es válida, pulsa ENTER para continuar...");
                                        s.nextLine();
                                    }
                                } while (exitDate.isBefore(entryDate));
                                if (!simpleRoomOneOccuped) {
                                    choosedRoom = "S1";
                                    simpleRoomOneOccuped = true;
                                } else if (!simpleRoomTwoOccuped) {
                                    choosedRoom = "S2";
                                    simpleRoomTwoOccuped = true;
                                }else System.out.println("No hay habitaciones simples disponibles...");
                            }
                            System.out.println("Tu habitación será la habitación " + choosedRoom);
                            System.out.println("Pulsa ENTER para continuar...");
                            s.nextLine();
                            break;
                        case 2:
                            if (doubleRoomOneOccuped && doubleRoomTwoOccuped && doubleRoomThreeOccuped &&
                                    doubleRoomFourOccuped && doubleRoomFiveOccuped && doubleRoomSixOccuped &&
                                    doubleRoomSevenOccuped && doubleRoomEightOccuped)
                                System.out.println("Actualmente no hay habitaciones simples disponibles");
                            else {
                                do {
                                    System.out.print("¿Vas a entrar hoy? (S/N): ");
                                    keyboard = s.nextLine();
                                    if (keyboard.equalsIgnoreCase("s")) fechaEntradaHoy = true;
                                    else if (keyboard.equalsIgnoreCase("n")) fechaEntradaHoy = false;
                                    else {
                                        System.out.println("El valor introducido no es válido, pulsa ENTER para continuar...");
                                        s.nextLine();
                                    }
                                } while (!(keyboard.equalsIgnoreCase("n") || keyboard.equalsIgnoreCase("s")));
                                do {
                                    if (!fechaEntradaHoy) {
                                        System.out.print("Introduce el día de entrada (aaaa-mm-dd): ");
                                        entryDate = LocalDate.parse(s.nextLine());
                                        if (entryDate.isBefore(LocalDate.now())) {
                                            System.out.println("La fecha introducida no es válida, pulsa ENTER para continuar...");
                                            s.nextLine();
                                        }
                                    } else entryDate = LocalDate.now();

                                } while (entryDate.isBefore(LocalDate.now()));
                                do {
                                    System.out.print("Introduce el día de salida (aaaa-mm-dd): ");
                                    exitDate = LocalDate.parse(s.nextLine());
                                    if (exitDate.isBefore(entryDate)) {
                                        System.out.println("La fecha introducida no es válida, pulsa ENTER para continuar...");
                                        s.nextLine();
                                    }
                                } while (exitDate.isBefore(entryDate));
                                if (!doubleRoomOneOccuped) {
                                    choosedRoom = "D1";
                                    doubleRoomOneOccuped = true;
                                } else if (!doubleRoomTwoOccuped) {
                                    choosedRoom = "D2";
                                    doubleRoomTwoOccuped = true;
                                } else if (!doubleRoomThreeOccuped) {
                                    choosedRoom = "D3";
                                    doubleRoomThreeOccuped = true;
                                } else if (!doubleRoomFourOccuped) {
                                    choosedRoom = "D4";
                                    doubleRoomFourOccuped = true;
                                } else if (!doubleRoomFiveOccuped) {
                                    choosedRoom = "D5";
                                    doubleRoomFiveOccuped = true;
                                } else if (!doubleRoomSixOccuped) {
                                    choosedRoom = "D6";
                                    doubleRoomSixOccuped = true;
                                } else if (!doubleRoomSevenOccuped) {
                                    choosedRoom = "D7";
                                    doubleRoomSevenOccuped = true;
                                } else {
                                    choosedRoom = "D8";
                                    doubleRoomEightOccuped = true;
                                }
                            }
                            System.out.println("Tu habitación será la habitación " + choosedRoom);
                            System.out.println("Pulsa ENTER para continuar...");
                            s.nextLine();
                            break;
                        default:
                            System.out.println("El valor introducido no es válido...");
                            break;
                    }
                }while (op != 1 && op != 2);
                break;
            case 3:
                System.out.printf("""
                        ███████╗ █████╗  ██████╗████████╗██╗   ██╗██████╗  █████╗\s
                        ██╔════╝██╔══██╗██╔════╝╚══██╔══╝██║   ██║██╔══██╗██╔══██╗
                        █████╗  ███████║██║        ██║   ██║   ██║██████╔╝███████║
                        ██╔══╝  ██╔══██║██║        ██║   ██║   ██║██╔══██╗██╔══██║
                        ██║     ██║  ██║╚██████╗   ██║   ╚██████╔╝██║  ██║██║  ██║
                        ╚═╝     ╚═╝  ╚═╝ ╚═════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝
                        
                        
                        Descripción: %s
                        Confir: %d
                        Entrada: %s
                        Salida: %s
                        Pax: %d
                        Noches: %d
                        Tarifa: %.2f
                        Monto o total: %.2f
                        Subtotal: %.2f
                        IVA: %.2f
                        TOTAL: %.2f
                        """, customerName, bookingNum, entryDate, exitDate, guestNum, nightNum, priceNight, nightNum*priceNight, nightNum*priceNight, iva, total);
                break;
            case 4:
                System.out.println("Introduce el usuario: ");
                break;
            default:
                System.out.print("El valor introducido no es válido...");

                break;
        }
        }while (!exitApp);
    }
}