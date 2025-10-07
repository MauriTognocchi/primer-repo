package enums;

public enum TipoMotor {
    JET,       // Motor a reacción, usado en comerciales y militares
    HELICE,    // Motor de hélice, común en aviones pequeños o privados
    TURBINA ;   // Turbina a gas, usado en grandes aviones de carga o comerciales

    public String descripcion() {
        switch(this) {
            case JET: return "Motor a reacción";
            case HELICE: return "Motor de hélice";
            case TURBINA: return "Turbina a gas";
            default: return "Desconocido";
        }
    }

    }
