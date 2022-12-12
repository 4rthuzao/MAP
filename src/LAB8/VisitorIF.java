package LAB8;

public interface VisitorIF {
	public String visitaRetangulo(Retangulo retangulo);
	public String visitaCirculo(Circulo circulo);
	public String visitaTriangulo(Triangulo triangulo);
	public String visitaTrapezio(Trapezio trapezio);
}
