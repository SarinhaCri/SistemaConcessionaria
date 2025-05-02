public class carro {
    
    private static int totalCarros = 0;

   
    private final String placa;
    private int passageiros;

   
    public carro(String placa, int passageiros) {
        this.placa = placa;
        this.passageiros = passageiros;
        totalCarros++; 
    }

    
    public String getPlaca() {
        return placa;
    }

    
    public int getPassageiros() {
        return passageiros;
    }

    
    public void setPassageiros(int passageiros) {
        if (passageiros >= 0) {
            this.passageiros = passageiros;
        } else {
            System.out.println("Quantidade de passageiros inválida.");
        }
    }

    
    public static int getTotalCarros() {
        return totalCarros;
    }
}
