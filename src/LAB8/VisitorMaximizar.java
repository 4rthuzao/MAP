package LAB8;

public class VisitorMaximizar implements VisitorIF{

	@Override
	public String visitaRetangulo(Retangulo retangulo) {
		//retangulo.setAltura(retangulo.getAltura() * 2);
		//retangulo.setLargura(retangulo.getLargura() * 2);
		return "Medidas do Retângulo Maximizado: " + (retangulo.getAltura() * retangulo.getLargura()) * 2 ;
	}

	@Override
	public String visitaCirculo(Circulo circulo) {
		//circulo.setRaio(circulo.getRaio() * 2);
		return "Medidas do circulo Maximizado: " + (3.14 * circulo.getRaio() * circulo.getRaio()) * 2;
	}

	@Override
	public String visitaTriangulo(Triangulo triangulo) {
		//triangulo.setAltura(triangulo.getAltura() * 2);
		//triangulo.setBase(triangulo.getBase() * 2);
		return "Medidas do triangulo Maximizado: " + (triangulo.getAltura() * triangulo.getBase()/2) *2;

}
}