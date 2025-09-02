package classes;

import enums.TipoCriatura;
import interfaces.Volador;

public class Murcielago extends Criatura implements Volador {

    public Murcielago(String name, int vida, int energia, int ataque, int defensa) {
        super(name, vida, energia, ataque, defensa);
        this.tipo = TipoCriatura.MURCIELAGO;
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

    }

    @Override
    public void curacion(int curar) {
        if (vida + curar >= 100) {
            vida = 100;
            System.out.println("Vida al maximo VIDA: " + vida);
        } else {
            vida += curar;
            System.out.println(this.getClass().getSimpleName() + "|" + name + ": Curandose VIDA: " + vida);
        }
    }

    @Override
    public void volar() {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Empieza a volar por la oscuridad...");

    }

    public void colgarseCueva() {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Se cuelga boca abajo en la cueva...");
    }

    @Override
    public void comer(String comida) {
        System.out.println(this.getClass().getSimpleName() + "|" + name + ": Empieza a comer " + comida);
    }
}
