package classes;

import enums.TipoEbook;
import enums.TipoMaterial;
import interfaces.I_Electronico;

public class Ebook extends Material implements I_Electronico {
    private TipoEbook tipo;

    public Ebook(String titulo, String autor, String fecha, TipoMaterial categoria, TipoEbook tipo) {
        super(titulo, autor, fecha, categoria);
        this.tipo = tipo;
    }


    @Override
    public void leerLibroEletronico(Ebook eBook) {
        System.out.println("Leyendo "+eBook.getTitulo()+" por la plataforma");
    }
}
