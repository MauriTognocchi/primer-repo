package classes;

import enums.TipoCriatura;
import interfaces.Acuatico;
import interfaces.Volador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Criatura> criaturas = new ArrayList<>();

        TipoCriatura tipo = TipoCriatura.MURCIELAGO;
        Criatura murcielago = new Murcielago("Dracula",tipo.getVidaBase(),tipo.getEnergiaBase(),tipo.getAtaqueBase(),tipo.getDefensaBase());

        tipo = TipoCriatura.PATO;
        Criatura pato = new Pato("Donald",tipo.getVidaBase(),tipo.getEnergiaBase(),tipo.getAtaqueBase(),tipo.getDefensaBase());

        tipo = TipoCriatura.PEZ;
        Criatura pez = new Pez("Nemo",tipo.getVidaBase(),tipo.getEnergiaBase(),tipo.getAtaqueBase(),tipo.getDefensaBase());

        criaturas.add(murcielago);
        criaturas.add(pato);
        criaturas.add(pez);

        Collections.sort(criaturas);

        for(Criatura c : criaturas){
            System.out.println("========================================================================================");
            System.out.println(c);
            pausa(scan);
            System.out.println("==================================== "+c.getClass().getSimpleName()+" ====================================");
            c.ataqueComun(c);
            c.ataqueEspecial(c);
            c.comer("Ensalada");
            c.dormir();
            c.curacion(10);
            c.emitirSonido();

            if(c instanceof Acuatico a){
                a.nadar();
            }else if (c instanceof Volador v) {
                v.volar();
                v.caminar();
            }
        }

    }

    public static void pausa(Scanner scan) {
        System.out.print("Press Enter To Continue");
        scan.nextLine();
    }
}
