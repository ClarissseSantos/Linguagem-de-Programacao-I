package br.com.e2;

public class Felino {//atributos
		private String especie;
		private String genero;
		private double comprimento;
		private double altura;
		private int peso;
		//métodos de acesso
		public Felino(String especie, String genero, double comprimento, double altura, int peso){//método construtor
						this.especie = especie;
						this.genero = genero;
						this.comprimento = comprimento;
						this.altura = altura;
						this.peso = peso;
						}


		public String getEspecie() {
			return especie;
		}
		
		public void setEspecie(String especie){
			this.especie = especie;
		}
		
		public String getGenero() {
			return genero;
		}
		
		public void setGenero (String genero){
			this.genero = genero;
		}
		
		public double getComprimento() {
			return comprimento;
		}
		
		public void setComprimento(double comprimento){
			this.comprimento = comprimento;
		}
		
		public double getAltura() {
			return altura;
		}
		
		public void setAltura(double altura){
			this.altura = altura;
		}
		
		public int getPeso() {
			return peso;
		}
		
		public void setPeso(int peso){
			this.peso = peso;
		}
		//métodos de classes
		public void correr(int passos){
			System.out.println(passos + "km/h de velocidade");
		}
		
		public void cacar(int passos){
			System.out.println("Corre até "+ passos + " km/h");
		}

		public void falar(String som){
			System.out.println("A comunicação desta especie é feita através de " + som);
		}
		
		public boolean dormir(boolean obd){
			if (obd) {
				System.out.println("Dormindo");
			}
			else
			{
				System.out.println("Acordado");
			}
			
			return obd;
		}
		
		public void aspecto(String aparencia){
			System.out.println(aparencia);
			
		}
		public void vida(String expectativa){
			System.out.println("A expectativa de vida é de até"+ expectativa);
		}
		public void abanarCauda(){
			System.out.println("Abanar,abanar ...");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Felino f1=new Felino("Leão","M",2.50,1.75,250);
			System.out.println("Leão");
			f1.falar("rugidos" + "\n" + "Roar! rawww!\n");			
			
			Felino f2= new Felino("Tigre","F",3.5,1,250);
			System.out.println("Tigre");
			f2.dormir(true);
			System.out.println("\n");
			
			Felino f3= new Felino("Onça-Pintada","F",1.7,64,125);
			System.out.println("Onça-Pintada");
			f3.cacar(80);
			System.out.println("\n");
			
			Felino f4=new Felino("Leopardo","M",2.5,70,90);
			System.out.println("Leopardo");
			f4.abanarCauda();
			System.out.println("\n");
			
			Felino f5=new Felino("Leopardo das Neves","M",1.50,75,32);
			System.out.println("Leopardo das Neves");
			f5.aspecto("Sua pelagem é espessa e de diferentes tons de cinza, com manchas pretas em rosetas e peito branco.\nAlém disso, há gradações de cor amarelada ou marrom em algumas partes de seu corpo.");
			
			
		}
}