package excepciones;

public class CalculadoraExcepcion extends RuntimeException {
  public CalculadoraExcepcion(String message) {
    super(message);
  }
}
