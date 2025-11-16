import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner s = new Scanner(System.in);
        int op, nightNum, bookingNumDigit = 1, cont, passKeyboard, doubleReservationNum = 0, singleReservationNum = 0,
                numBills200 = 10, numBills100 = 10, numBills50 = 20, numBills20 = 20, numBills10 = 20, numBills5 = 20,
                numCoins200 = 50, numCoins100 = 50, numCoins50 = 50, numCoins20 = 50, numCoins10 = 50, numCoins5 = 50,
                numCoins2 = 50, numCoins1 = 50, numReturnBills200 = 0, numReturnBills100 = 0, numReturnBills50 = 0,
                numReturnBills20 = 0, numReturnBills10 = 0, numReturnBills5 = 0, numReturnCoins200 = 0,
                numReturnCoins100 = 0, numReturnCoins50 = 0, numReturnCoins20 = 0, numReturnCoins10 = 0,
                numReturnCoins5 = 0, numReturnCoins2 = 0, numReturnCoins1 = 0;
        float priceNight, total, totalIncome = 0, introducedMoney;
        final int DOUBLE_ROOMS_PRICE = 60,NUM_DOUBLE_ROOMS = 8, NUM_SINGLE_ROOMS = 2, SINGLE_ROOMS_PRICE = 45;
        LocalDate entryDate = LocalDate.now(), exitDate = LocalDate.now();
        final String ADMIN_USER = "root";
        final int ADMIN_PASS = 1234;a
        String keyboard, choosedRoom = "", customerName = "", bookingNum = "", userKeyboard;
        boolean simpleRoomOneOccuped = false, simpleRoomTwoOccuped = false, doubleRoomOneOccuped = false,
                doubleRoomTwoOccuped = false, doubleRoomThreeOccuped = false, doubleRoomFourOccuped = false,
                doubleRoomFiveOccuped = false, doubleRoomSixOccuped = false, doubleRoomSevenOccuped = false,
                doubleRoomEightOccuped = false, exitApp = false, entryToday = false, flag = false, moneyLack = false;


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
                    totalIncome += total;
                    do {
                    switch (choosedRoom){
                        case "S1":
                            singleReservationNum++;
                            simpleRoomOneOccuped = false;
                            flag = true;
                            break;
                        case "S2":
                            singleReservationNum++;
                            simpleRoomTwoOccuped = false;
                            flag = true;
                            break;
                        case "D1":
                            doubleReservationNum++;
                            doubleRoomOneOccuped = false;
                            flag = true;
                            break;
                        case "D2":
                            doubleReservationNum++;
                            doubleRoomTwoOccuped = false;
                            flag = true;
                            break;
                        case "D3":
                            doubleReservationNum++;
                            doubleRoomThreeOccuped = false;
                            flag = true;
                            break;
                        case "D4":
                            doubleReservationNum++;
                            doubleRoomFourOccuped = false;
                            flag = true;
                            break;
                        case "D5":
                            doubleReservationNum++;
                            doubleRoomFiveOccuped = false;
                            flag = true;
                            break;
                        case "D6":
                            doubleReservationNum++;
                            doubleRoomSixOccuped = false;
                            flag = true;
                            break;
                        case "D7":
                            doubleReservationNum++;
                            doubleRoomSevenOccuped = false;
                            flag = true;
                            break;
                        case "D8":
                            doubleReservationNum++;
                            doubleRoomEightOccuped = false;
                            flag = true;
                            break;
                        default:
                            System.out.println("No existe ninguna habitación con ese número, vuelva a introducirlo...");
                            break;
                    }
                    }while(!flag);
                    do {
                    System.out.print("Introduzca el dinero solicitado (solo se permite en efectivo): ");
                    introducedMoney = Float.parseFloat(s.nextLine()) - total;

                    do {
                    if (introducedMoney > 200 && numBills200 > 0){
                        numReturnBills200++;
                        numBills200--;
                        introducedMoney -= 200;
                    }
                    else if (introducedMoney > 100 && numBills100 > 0){
                        numReturnBills100++;
                        numBills100--;
                        introducedMoney -= 100;
                    }
                    else if (introducedMoney > 50 && numBills50 > 0){
                        numReturnBills50++;
                        numBills50--;
                        introducedMoney -= 50;
                    }
                    else if (introducedMoney > 20 && numBills20 > 0){
                        numReturnBills20++;
                        numBills20--;
                        introducedMoney -= 20;
                    }
                    else if (introducedMoney > 10 && numBills10 > 0){
                        numReturnBills10++;
                        numBills10--;
                        introducedMoney -= 10;
                    }
                    else if (introducedMoney > 5 && numBills5 > 0){
                        numReturnBills5++;
                        numBills5--;
                        introducedMoney -= 5;
                    }
                    else if (introducedMoney > 2 && numCoins200 > 0){
                        numReturnCoins200++;
                        numCoins200--;
                        introducedMoney -= 2;
                    }
                    else if (introducedMoney > 1 && numCoins100 > 0){
                        numReturnCoins100++;
                        numCoins100--;
                        introducedMoney -= 1;
                    }
                    else if (introducedMoney > 0.5 && numCoins50 > 0){
                        numReturnCoins50++;
                        numCoins50--;
                        introducedMoney -= 0.5F;
                    }
                    else if (introducedMoney > 0.2 && numCoins20 > 0){
                        numReturnCoins20++;
                        numCoins20--;
                        introducedMoney -= 0.2F;
                    }
                    else if (introducedMoney > 0.1 && numCoins10 > 0){
                        numReturnCoins10++;
                        numCoins10--;
                        introducedMoney -= 0.1F;
                    }
                    else if (introducedMoney > 0.05 && numCoins5 > 0){
                        numReturnCoins5++;
                        numCoins5--;
                        introducedMoney -= 0.05F;
                    }
                    else if (introducedMoney > 0.02 && numCoins2 > 0){
                        numReturnCoins2++;
                        numCoins2--;
                        introducedMoney -= 0.02F;
                    }
                    else if (introducedMoney > 0.01 && numCoins1 > 0){
                        numReturnCoins1++;
                        numCoins1--;
                        introducedMoney -= 0.01F;
                    }else moneyLack = true;
                    }while (introducedMoney > 0.009);
                    if (moneyLack) System.out.println("No disponemos del suficiente cambio para dicho importe, por favor introduzca uno diferente...");
                    else {
                        System.out.println("Tu cambio es de:");
                        if (numReturnBills200 > 0) System.out.printf("%d billetes de 200€.\n", numReturnBills200);
                        if (numReturnBills100 > 0) System.out.printf("%d billetes de 100€.\n", numReturnBills100);
                        if (numReturnBills50 > 0) System.out.printf("%d billetes de 50€.\n", numReturnBills50);
                        if (numReturnBills20 > 0) System.out.printf("%d billetes de 20€.\n", numReturnBills20);
                        if (numReturnBills10 > 0) System.out.printf("%d billetes de 10€.\n", numReturnBills10);
                        if (numReturnBills5 > 0) System.out.printf("%d billetes de 5€.\n", numReturnBills5);
                        if (numReturnCoins200 > 0) System.out.printf("%d monedas de 2€.\n", numReturnCoins200);
                        if (numReturnCoins100 > 0) System.out.printf("%d monedas de 1€.\n", numReturnCoins100);
                        if (numReturnCoins50 > 0) System.out.printf("%d monedas de 50 cents.\n", numReturnCoins50);
                        if (numReturnCoins20 > 0) System.out.printf("%d monedas de 20 cents.\n", numReturnCoins20);
                        if (numReturnCoins10 > 0) System.out.printf("%d monedas de 10 cents.\n", numReturnCoins10);
                        if (numReturnCoins5 > 0) System.out.printf("%d monedas de 5 cents.\n", numReturnCoins5);
                        if (numReturnCoins2 > 0) System.out.printf("%d monedas de 2 cents.\n", numReturnCoins2);
                        if (numReturnCoins1 > 0) System.out.printf("%d monedas de 1 cents.\n", numReturnCoins1);
                    }
                    }while (moneyLack);

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
                        for (int i = 0; i < 50; i++) {
                            System.out.println();
                        }
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
                                System.out.printf("Se ha recaudado un total de %.2f€ y han habido %d reservas, de las cuales:\n", totalIncome, doubleReservationNum + singleReservationNum);
                                System.out.printf("- %d reservas son de habitaciones individuales.", singleReservationNum);
                                System.out.printf("- %d reservas son de habitaciones dobles.", doubleReservationNum);
                                break;
                            case 2:
                                System.out.println("Actualmente quedan:");
                                System.out.printf("%d billetes de 200€.\n", numBills200);
                                System.out.printf("%d billetes de 100€.\n", numBills100);
                                System.out.printf("%d billetes de 50€.\n", numBills50);
                                System.out.printf("%d billetes de 20€.\n", numBills20);
                                System.out.printf("%d billetes de 10€.\n", numBills10);
                                System.out.printf("%d billetes de 5€.\n", numBills5);
                                System.out.printf("%d monedas de 2€.\n", numCoins200);
                                System.out.printf("%d monedas de 1€.\n", numCoins100);
                                System.out.printf("%d monedas de 50 cents.\n", numCoins50);
                                System.out.printf("%d monedas de 20 cents.\n", numCoins20);
                                System.out.printf("%d monedas de 10 cents.\n", numCoins10);
                                System.out.printf("%d monedas de 5 cents.\n", numCoins5);
                                System.out.printf("%d monedas de 2 cents.\n", numCoins2);
                                System.out.printf("%d monedas de 1 cents.\n", numCoins1);
                                System.out.println("\nPulsa ENTER para continuar...");
                                s.nextLine();
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