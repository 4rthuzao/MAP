package LAB8;

public class VisitorCalculaPerimetro implements VisitorIF{

	@Override
	public String visitaRetangulo(Retangulo retangulo) {
		return "O perimetro do Retangulo é: " + ((retangulo.getAltura() * 2) + (retangulo.getLargura() * 2));
	}

	@Override
	public String visitaCirculo(Circulo circulo) {
		return "O perimetro do Circulo é: " + (2 * 3.14 * circulo.getRaio());
	}

	@Override
	public String visitaTriangulo(Triangulo triangulo) {
		return "O perimetro do Triangulo é: " + ((triangulo.getAltura() * 2) + triangulo.getBase());
	}
}
