import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner s = new Scanner(System.in);
        int op, numDoubleRooms = 8, numSingleRooms = 2;
        final int DOUBLE_ROOMS_PRICE = 60, SINGLE_ROOMS_PRICE = 45;


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
        switch (op){
            case 1:
                System.out.printf("Actualmente quedan %d habitaciones disponibles. De las cuales:\n", numDoubleRooms + numSingleRooms);
                System.out.printf("• %d son habitaciones dobles (%d€/noche).\n", numDoubleRooms, DOUBLE_ROOMS_PRICE);
                System.out.printf("• %d son habitaciones individuales (%d€/noche).\n", numSingleRooms, SINGLE_ROOMS_PRICE);
                System.out.print("Pulsa ENTER para continuar...");
                s.nextLine();
                break;
            case 2:
                System.out.println("""
                    ¿Que tipo de habitación deseas reservar?
                    1. Habitación individual.
                    2. Habitación doble.
                    Introduce la opción deseada:\s""");
                op = Integer.parseInt(s.nextLine());
                switch (op){
                    case 1:

                        break;
                    case 2:

                        break;
                    default:
                        System.out.println("El valor introducido no es válido...");
                        break;
                }
                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("El valor introducido no es válido...");
                break;
        }
        }while (true);
    }
}