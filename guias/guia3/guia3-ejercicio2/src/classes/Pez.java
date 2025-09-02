package classes;

import enums.TipoCriatura;
import interfaces.Acuatico;

public class Pez extends Criatura implements Acuatico {

    public Pez(String name, int vida, int energia, int ataque, int defensa) {
        super(name, vida, energia, ataque, defensa);
        this.tipo = TipoCriatura.PEZ;
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
    public void comer(String comida) {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Empieza a comer " + comida);
    }

    @Override
    public void nadar() {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Empieza a nadar velozmente por las profundidades...");

    }
}
