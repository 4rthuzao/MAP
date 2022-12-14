package LAB8;

public class VisitorDesenhar implements VisitorIF{

	@Override
	public String visitaRetangulo(Retangulo r) {
		return "** Desenhando um Retangulo **";
	}

	@Override
	public String visitaCirculo(Circulo c) {
		return "** Desenhando um Circulo **";
	}

	@Override
	public String visitaTriangulo(Triangulo t) {
		return "** Desenhando um Triangulo **";
	}

	@Override
	public String visitaTrapezio(Trapezio trapezio) {
		return "** Desenhando um Trapezio **";
	}
}