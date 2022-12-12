package LAB8;

public class VisitorMaximizar implements VisitorIF{

	@Override
	public String visitaRetangulo(Retangulo retangulo) {
	
		return "Medidas do Retângulo Maximizado: " + (retangulo.getAltura() * retangulo.getLargura()) * 2 ;
	}

	@Override
	public String visitaCirculo(Circulo circulo) {
		
		return "Medidas do circulo Maximizado: " + (3.14 * circulo.getRaio() * circulo.getRaio()) * 2;
	}

	@Override
	public String visitaTriangulo(Triangulo triangulo) {
		
		return "Medidas do triangulo Maximizado: " + (triangulo.getAltura() * triangulo.getBase()/2) * 2;
	}

	@Override
	public String visitaTrapezio(Trapezio trapezio) {
		
		return "Medidas do trapézio maximizado: " + (trapezio.getAltura() * trapezio.getBaseInferior() * trapezio.getBaseSuperior()) * 2 ;

}
}