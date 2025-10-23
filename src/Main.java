import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner s = new Scanner(System.in);
        int op, numHabDobles = 8, numHabIndividuales = 2, precioHabDoble = 60, precioHabIndividual = 45;


        // Pintado de Menú inicial
        System.out.println("""
                
                
                
                
                
                
                
                             @@@@@@@@@@@@@@@@@@@@@@          @@@@@@@@@@@@@@@@@@@@@@                                                                                                                \s
                                 @@@@@@@@@@@@@@                  @@@@@@@@@@@@@@                                                                                                                    \s
                                   @@@@@@@@@@                     @@@@@@@@@@@                                                                                                                      \s
                                    @@@@@@@@@                      @@@@@@@@@                                                                                                                       \s
                                    @@@@@@@@                        @@@@@@@@    .                             *@@@@@@                                                 :                            \s
                                    @@@@@@@@                        @@@@@@@@    @@@@@@@      @@@@@@@      @@@@@@@  @@@@@@    @@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@    @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@=    @@@@@@@      @@@@@@@     @@@@@@     @@@@@@@        @@@@@@@        @@@@@@@             @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@    @@@@@@@      @@@@@@        @@@@@@@@       @@@@@@@%            @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@   @@@@@@@       @@@@@@@       @@@@@@@@       @@@@@@@%            @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@   @@@@@@@       @@@@@@@       @@@@@@@@       @@@@@@@             @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@@@@@@@@@@@@@@   @@@@@@@       @@@@@@@.      @@@@@@@@       @@@@@@@@@@@@@@@     @@@@@@@                      \s
                                    @@@@@@@@                        @@@@@@@     @@@@@@@      @@@@@@@   @@@@@@@       @@@@@@@-      @@@@@@@@       @@@@@@@             @@@@@@@                      \s
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
                                    @@@@@@@@                        @@@@@@@     =%%%%-  %%  +%%%.  %:#%%   %* #% .%.%%%      %%:%%   :%%%    =% #% %%  %  %+ %%  %%  %%    #%%%#  %%%              \s
                                    @@@@@@@@                        @@@@@@@                                                                                                                        \s
                                    @@@@@@@@                        @@@@@@@+                                                                                                                       \s
                                    @@@@@@@@                        @@@@@@@@                                                                                                                       \s
                                    @@@@@@@@                       .@@@@@@@@                                                                                                                       \s
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
        if (op == 1){
            System.out.printf("Actualmente quedan %d habitaciones disponibles. De las cuales:\n", numHabDobles + numHabIndividuales);
            System.out.printf("• %d son habitaciones dobles (%d€/noche).\n", numHabDobles, precioHabDoble);
            System.out.printf("• %d son habitaciones individuales (%d€/noche).\n", numHabIndividuales, precioHabIndividual);
        } else if (op == 2) {
            System.out.println("""
                    ¿Que tipo de habitación deseas reservar?
                    1. Habitación individual.
                    2. Habitación doble.
                    Introduce la opción deseada:\s""");
            op = Integer.parseInt(s.nextLine());
            if (op == 1){

            } else if (op == 2) {

            } else {
                System.out.println("El valor introducido no es válido...");
            }
        } else if (op == 3) {

        } else if (op == 4) {

        } else {
            System.out.println("El valor introducido no es válido...");
        }
    }
}