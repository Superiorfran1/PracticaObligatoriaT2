import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner s = new Scanner(System.in);
        int op, nightNum, bookingNumDigit = 1, cont, passKeyboard;
        float priceNight, total;
        final int DOUBLE_ROOMS_PRICE = 60,NUM_DOUBLE_ROOMS = 8, NUM_SINGLE_ROOMS = 2, SINGLE_ROOMS_PRICE = 45;
        LocalDate entryDate = LocalDate.now(), exitDate = LocalDate.now();
        final String ADMIN_USER = "root";
        final int ADMIN_PASS = 1234;
        String keyboard, choosedRoom = "", customerName = "", bookingNum = "", userKeyboard;
        boolean simpleRoomOneOccuped = false, simpleRoomTwoOccuped = false, doubleRoomOneOccuped = false,
                doubleRoomTwoOccuped = false, doubleRoomThreeOccuped = false, doubleRoomFourOccuped = false,
                doubleRoomFiveOccuped = false, doubleRoomSixOccuped = false, doubleRoomSevenOccuped = false,
                doubleRoomEightOccuped = false, exitApp = false, entryToday = false, flag = false;


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
                                        if (keyboard.equalsIgnoreCase("s")) entryToday = true;
                                        else if (keyboard.equalsIgnoreCase("n")) entryToday = false;
                                        else {
                                            System.out.println("El valor introducido no es válido, pulsa ENTER para continuar...");
                                            s.nextLine();
                                        }
                                    } while (!(keyboard.equalsIgnoreCase("n") || keyboard.equalsIgnoreCase("s")));
                                    System.out.print("Introduce tu nombre completo: ");
                                    customerName = s.nextLine();
                                    do {
                                        if (!entryToday) {
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
                                        bookingNum = String.valueOf(Year.now()) + bookingNumDigit;
                                        bookingNumDigit++;
                                    } else if (!simpleRoomTwoOccuped) {
                                        choosedRoom = "S2";
                                        simpleRoomTwoOccuped = true;
                                        bookingNum = String.valueOf(Year.now()) + bookingNumDigit;
                                        bookingNumDigit++;
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
                                        if (keyboard.equalsIgnoreCase("s")) entryToday = true;
                                        else if (keyboard.equalsIgnoreCase("n")) entryToday = false;
                                        else {
                                            System.out.println("El valor introducido no es válido, pulsa ENTER para continuar...");
                                            s.nextLine();
                                        }
                                    } while (!(keyboard.equalsIgnoreCase("n") || keyboard.equalsIgnoreCase("s")));
                                    System.out.print("Introduce tu nombre completo: ");
                                    customerName = s.nextLine();
                                    do {
                                        if (!entryToday) {
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
                                        bookingNum = String.valueOf(Year.now()) + bookingNumDigit;
                                        bookingNumDigit++;
                                    } else if (!doubleRoomTwoOccuped) {
                                        choosedRoom = "D2";
                                        doubleRoomTwoOccuped = true;
                                        bookingNum = String.valueOf(Year.now()) + bookingNumDigit;
                                        bookingNumDigit++;
                                    } else if (!doubleRoomThreeOccuped) {
                                        choosedRoom = "D3";
                                        doubleRoomThreeOccuped = true;
                                        bookingNum = String.valueOf(Year.now()) + bookingNumDigit;
                                        bookingNumDigit++;
                                    } else if (!doubleRoomFourOccuped) {
                                        choosedRoom = "D4";
                                        doubleRoomFourOccuped = true;
                                        bookingNum = String.valueOf(Year.now()) + bookingNumDigit;
                                        bookingNumDigit++;
                                    } else if (!doubleRoomFiveOccuped) {
                                        choosedRoom = "D5";
                                        doubleRoomFiveOccuped = true;
                                        bookingNum = String.valueOf(Year.now()) + bookingNumDigit;
                                        bookingNumDigit++;
                                    } else if (!doubleRoomSixOccuped) {
                                        choosedRoom = "D6";
                                        doubleRoomSixOccuped = true;
                                        bookingNum = String.valueOf(Year.now()) + bookingNumDigit;
                                        bookingNumDigit++;
                                    } else if (!doubleRoomSevenOccuped) {
                                        choosedRoom = "D7";
                                        doubleRoomSevenOccuped = true;
                                        bookingNum = String.valueOf(Year.now()) + bookingNumDigit;
                                        bookingNumDigit++;
                                    } else {
                                        choosedRoom = "D8";
                                        doubleRoomEightOccuped = true;
                                        bookingNum = String.valueOf(Year.now()) + bookingNumDigit;
                                        bookingNumDigit++;
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
                    System.out.print("Introduce tu número de habitación: ");
                    choosedRoom = s.nextLine();
                    nightNum = exitDate.getDayOfYear() - entryDate.getDayOfYear();
                    priceNight = choosedRoom.charAt(0) == 'S'? DOUBLE_ROOMS_PRICE : SINGLE_ROOMS_PRICE;
                    total = (nightNum*priceNight) + ((nightNum*priceNight) / 100) * 21;
                    System.out.printf("""
                        ‖=======================================================================‖
                        ‖                                                                       ‖
                        ‖\t\t███████╗ █████╗  ██████╗████████╗██╗   ██╗██████╗  █████╗       ‖
                        ‖\t\t██╔════╝██╔══██╗██╔════╝╚══██╔══╝██║   ██║██╔══██╗██╔══██╗      ‖
                        ‖\t\t█████╗  ███████║██║        ██║   ██║   ██║██████╔╝███████║      ‖
                        ‖\t\t██╔══╝  ██╔══██║██║        ██║   ██║   ██║██╔══██╗██╔══██║      ‖
                        ‖\t\t██║     ██║  ██║╚██████╗   ██║   ╚██████╔╝██║  ██║██║  ██║      ‖
                        ‖\t\t╚═╝     ╚═╝  ╚═╝ ╚═════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝      ‖
                        ‖                                                                       ‖
                        ‖=======================================================================‖
                        ‖                                   ‖                                   ‖
                        ‖Descripción:                       ‖  %30s   ‖
                        ‖Confir:                            ‖  %7s                          ‖
                        ‖Entrada:                           ‖    %10s                     ‖
                        ‖Salida:                            ‖    %10s                     ‖
                        ‖Pax:                               ‖    %d                              ‖
                        ‖Noches:                            ‖  %3d                              ‖
                        ‖Tarifa:                            ‖  %6.2f€                          ‖
                        ‖Monto o total:                     ‖  %6.2f€                         ‖
                        ‖Subtotal:                          ‖  %6.2f€                         ‖
                        ‖IVA:                               ‖  %6.2f€                          ‖
                        ‖                                   ‖                                   ‖
                        ‖===================================‖===================================‖
                        ‖TOTAL:                             ‖  %6.2f€                         ‖
                        ‖===================================‖===================================‖
                        
                        """, customerName, bookingNum, entryDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                            exitDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), choosedRoom.charAt(0) == 'S'? 1 : 2,
                            nightNum, priceNight, nightNum*priceNight, nightNum*priceNight, ((nightNum*priceNight) / 100) * 21, total);
                    do {
                    switch (choosedRoom){
                        case "S1":
                            simpleRoomOneOccuped = false;
                            flag = true;
                            break;
                        case "S2":
                            simpleRoomTwoOccuped = false;
                            flag = true;
                            break;
                        case "D1":
                            doubleRoomOneOccuped = false;
                            flag = true;
                            break;
                        case "D2":
                            doubleRoomTwoOccuped = false;
                            flag = true;
                            break;
                        case "D3":
                            doubleRoomThreeOccuped = false;
                            flag = true;
                            break;
                        case "D4":
                            doubleRoomFourOccuped = false;
                            flag = true;
                            break;
                        case "D5":
                            doubleRoomFiveOccuped = false;
                            flag = true;
                            break;
                        case "D6":
                            doubleRoomSixOccuped = false;
                            flag = true;
                            break;
                        case "D7":
                            doubleRoomSevenOccuped = false;
                            flag = true;
                            break;
                        case "D8":
                            doubleRoomEightOccuped = false;
                            flag = true;
                            break;
                        default:
                            System.out.println("No existe ninguna habitación con ese número, vuelva a introducirlo...");
                            break;
                    }
                    }while(!flag);
                    System.out.println("Pulsa ENTER para continuar...");
                    s.nextLine();
                    break;
                case 4:
                    cont = 0;
                    do {
                        System.out.println("Introduce el usuario: ");
                        userKeyboard = s.nextLine();
                        System.out.println("Introduce la contraseña: ");
                        passKeyboard = Integer.parseInt(s.nextLine());
                        cont++;
                        if (!userKeyboard.equals(ADMIN_USER) || passKeyboard != ADMIN_PASS){
                            if (cont < 3) {
                                System.out.println("El usuario o la contraseña no son válidos, quedan " +
                                        (3 - cont) + " intentos, pulsa ENTER para continuar...");
                                s.nextLine();
                            }else {
                                System.out.println("Te has quedado sin intentos, vuelva a intentarlo mas tarde...");
                            }
                        }
                    }while((!userKeyboard.equals(ADMIN_USER) || passKeyboard != ADMIN_PASS) && cont < 3);
                    if (userKeyboard.equals(ADMIN_USER) && passKeyboard == ADMIN_PASS){
                        System.out.printf("""
                                Bienvenido %s!
                                
                                1. Consultar los ingresos totales y el número de reservas finalizadas.
                                2. Consultar las monedas restantes para el cambio.
                                3. Apagar el software
                                Introduce la opción deseada:\s
                                """, ADMIN_USER);
                        op = Integer.parseInt(s.nextLine());
                        switch (op) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:
                                System.out.print("Saliendo de la app");
                                for (int i = 0; i < 3; i++) {
                                    try {
                                        Thread.sleep(600);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                    System.out.print(".");
                                }
                                exitApp = true;
                                break;
                        }
                    }

                    break;
                default:
                    System.out.print("El valor introducido no es válido...");

                    break;
            }
        }while (!exitApp);
    }
}