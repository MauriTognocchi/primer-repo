package classes;

import enums.TipoCriatura;

public abstract class Criatura implements Comparable<Criatura>{
    protected String name;
    protected TipoCriatura tipo;
    protected int vida;
    protected int energia;
    protected int ataque;
    protected int defensa;

    public Criatura() {

    }

    public Criatura(String name, int vida, int energia, int ataque, int defensa) {
        this.name = name;
        this.vida = vida;
        this.energia = energia;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    /// GETTERS AND SETTERS ============================================================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnergia() {
        return energia;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public double getVida() {
        return vida;
    }

    public TipoCriatura getTipo() {
        return tipo;
    }

    public void setTipo(TipoCriatura tipo) {
        this.tipo = tipo;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Criatura{" +
                "name='" + name + '\'' +
                ", tipo=" + tipo +
                ", vida=" + vida +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                '}';
    }

    /// METODOS ========================================================================================

    public abstract void emitirSonido();

    public abstract void dormir();

    public abstract void ataqueComun(Criatura objetivo);

    public abstract void ataqueEspecial(Criatura objetivo);

    public abstract void curacion(int curar);

    public abstract void comer(String comida);

    @Override
    public int compareTo(Criatura o) {
        return tipo.name().compareTo(o.tipo.name()) ;
    }
}
