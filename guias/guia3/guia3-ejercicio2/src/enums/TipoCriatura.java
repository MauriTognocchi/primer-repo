package enums;

public enum TipoCriatura {
    PATO(100, 10, 20, 50),
    PEZ(70, 15, 27, 40),
    MURCIELAGO(60, 15, 33, 27);

    private final int vidaBase;
    private final int energiaBase;
    private final int ataqueBase;
    private final int defensaBase;

    TipoCriatura(int vida, int energia, int ataque, int defensa) {
        this.vidaBase = vida;
        this.energiaBase = energia;
        this.ataqueBase = ataque;
        this.defensaBase = defensa;
    }

    public int getVidaBase() {
        return vidaBase;
    }

    public int getEnergiaBase() {
        return energiaBase;
    }

    public int getDefensaBase() {
        return defensaBase;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }
}
