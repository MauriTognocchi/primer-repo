package classes;

import enums.TipoCriatura;
import interfaces.Acuatico;
import interfaces.Volador;

public class Pato extends Criatura implements Volador, Acuatico {

    public Pato(String name, int vida, int energia, int ataque, int defensa) {
        super(name, vida, energia, ataque, defensa);
        this.tipo = TipoCriatura.PATO;
    }

    @Override
    public void caminar() {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Empieza a caminar...");
    }

    @Override
    public void emitirSonido() {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Emite un sonido...");

    }

    @Override
    public void dormir() {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Se relaja y duerme...");
    }

    @Override
    public void ataqueComun(Criatura objetivo) {

    }

    @Override
    public void ataqueEspecial(Criatura objetivo) {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Lanza su habilidad especial.");
        System.out.println(name + ": Se vuelve gigante y aplasta con sus alas.");
        System.out.println("Genero " + (ataque - defensa) + " de ataque.");

    }

    @Override
    public void curacion(int curar) {
        if (vida + curar >= 100) {
            vida = 100;
            System.out.println(this.getClass().getSimpleName() + "|" + name + ": Vida al maximo VIDA: " + vida);
        } else {
            vida += curar;
            System.out.println(this.getClass().getSimpleName() + "|" + name + ": Curandose VIDA: " + vida);
        }
    }

    @Override
    public void nadar() {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Empieza a nadar bajo el agua...");
    }

    @Override
    public void volar() {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Empieza a volar sobre el agua...");

    }

    @Override
    public void comer(String comida) {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Empieza a comer " + comida);
    }
}
