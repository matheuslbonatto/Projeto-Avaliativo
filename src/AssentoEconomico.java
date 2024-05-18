public class AssentoEconomico implements Assento{
 
 
    private boolean reservado = false;
    @Override
    public boolean reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("Assento econômico reservado! Valor: " );
            return true;
        } else {
            System.out.println("Assento econômico já está ocupado.");
            return false;
        }
    }
 
 
   
}