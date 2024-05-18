public class AssentoPClasse implements Assento{
    private boolean reservado = false;
    
    @Override
    public boolean reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("Assento Primeira Classe reservado! Valor: " );
            return true;
        } else {
            System.out.println("Assento Primeira Classe já está ocupado.");
            return false;
        }
    }
}