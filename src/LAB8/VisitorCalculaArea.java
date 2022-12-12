package LAB8;

public class VisitorCalculaArea implements VisitorIF{

	@Override
	public String visitaRetangulo(Retangulo retangulo) {
		return "A área do Retangulo é: " + retangulo.getAltura() * retangulo.getLargura();
	}

	@Override
	public String visitaCirculo(Circulo circulo) {
		return "A área do Circulo é: " + 3.14 * circulo.getRaio() * circulo.getRaio();
	}

	@Override
	public String visitaTriangulo(Triangulo triangulo) {
		return "A área do Triangulo é: " + (triangulo.getAltura() * triangulo.getBase()) / 2;
	}

	@Override
	public String visitaTrapezio(Trapezio trapezio) {
		return "A área do Trapezio é: " + ((trapezio.getBaseInferior() + trapezio.getBaseSuperior()) * trapezio.getAltura()) / 2;
	}
}