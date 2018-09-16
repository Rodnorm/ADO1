package Builder;

public class Resistor extends Componente {

    private String tipoResistor;

    public Resistor(String nomeResistor, String tipoResistor) {
        super(nomeResistor);
        this.tipoResistor = tipoResistor;
    }

    @Override
    public void getInfo() {
        System.out.println("Nome do resistor: " + super.getnomeResistor() + " | " + this.tipoResistor);
    }

}
