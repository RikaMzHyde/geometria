/**
 *
 * @author Laura María Pinedo Puertas
 * Esta es la versión 1.2
 *
 */
public class Rectangulo_LMPP extends FiguraGeometrica_LMPP {
	private double l1;
	private double l2;
	
	/**
	 * Constructor objeto Rectangulo_LMPP.
	 *
	 * @param tipoFigura Tipo de figura que representa el rectángulo
	 * @param lG Tamaño de la base del rectángulo.
	 * @param lP Altura de la base del rectángulo.
	 */
	public Rectangulo_LMPP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Método que devuelve el área del rectángulo.
	 * @return devuelve el resultado de la multiplicación.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Método que devuelve el perímetro del rectángulo.
	 * @return devuelve el resultado de la operación.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
