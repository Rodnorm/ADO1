package Builder;

public class Capacitor extends Componente {

    private String capacitorTipo;

    public Capacitor(String capacitorNome, String capacitorTipo) {
        super(capacitorNome);
        this.capacitorTipo = capacitorTipo;
    }

    @Override
    public void getInfo() {
        System.out.println("Capacitor: " + super.getcapacitorNome() + " | " + this.capacitorTipo);
    }
}
