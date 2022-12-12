package LAB8;

public class App {
	public static void main(String[] args) {
		// criando as figuras...
		Circulo circulo = new Circulo(15);
		Retangulo retangulo = new Retangulo(16, 8);
		Triangulo triangulo = new Triangulo(10, 5);
		Trapezio trapezio = new Trapezio(15, 20, 10);
		
		//criando o visitor para calcular a área...
		VisitorIF visitaCA = new VisitorCalculaArea();
		
		circulo.aceitaVisita(visitaCA);
		retangulo.aceitaVisita(visitaCA);
		triangulo.aceitaVisita(visitaCA);
		trapezio.aceitaVisita(visitaCA);
		System.out.println();

		//Criando o Visitor para calcular a Perimetro das figuras...
		visitaCA = new VisitorCalculaPerimetro();
		
		circulo.aceitaVisita(visitaCA);
		retangulo.aceitaVisita(visitaCA);
		triangulo.aceitaVisita(visitaCA);
		trapezio.aceitaVisita(visitaCA);
		System.out.println();
		
		//Criando o Visitor para desenhar figuras geometricas...
		visitaCA = new VisitorDesenhar();
		
		circulo.aceitaVisita(visitaCA);
		retangulo.aceitaVisita(visitaCA);
		triangulo.aceitaVisita(visitaCA);
		trapezio.aceitaVisita(visitaCA);
		System.out.println();

		//Criando o Visitor para Maximizar as figuras...
		visitaCA = new VisitorMaximizar();
		
		circulo.aceitaVisita(visitaCA);
		retangulo.aceitaVisita(visitaCA);
		triangulo.aceitaVisita(visitaCA);
		trapezio.aceitaVisita(visitaCA);
				
	}
}