package Builder;

public abstract class Componente implements IComponente {

    private String nomeComponente;

    public Componente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }

    public String getnomeComponente() {
        return nomeComponente;
    }

    public void setnomeComponente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }

}
