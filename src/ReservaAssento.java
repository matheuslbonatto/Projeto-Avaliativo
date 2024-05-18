import java.util.Scanner;

public class ReservaAssento {
    public static void main(String[] args) throws Exception {
        Scanner scanner  = new Scanner(System.in);

        Assento[][] assentos = new Assento[20][11];

        
        for (int i = 0; 1 < 20; i++) {
            for(int j = 0; j < 11; j++){
                if (i == 0 || 1 == 5 ) {
                    assentos[i][j] =  new AssentoPClasse();
                }
            else {
                  assentos[i][j] = new AssentoEconomico();
            }

            System.out.print("Informe a fileira: ");
                int fileira = scanner.nextInt();
            System.out.print("Informe o numero da Pltrona: ");
                int poltrona = scanner.nextInt();
        
         if (fileira >= 1 && fileira <= 20 && poltrona >= 1 && poltrona <= 11) {
 
            boolean reserva = assentos[fileira-1][poltrona-1].reservar();
           
           
            if (reserva = true) {
                System.out.println("reserva feita.");
                System.out.println(assentos[fileira][poltrona]);
            }
        } else {
            System.out.println("tente outra.");
        }
        
    }
scanner.close();
}

}
}
    