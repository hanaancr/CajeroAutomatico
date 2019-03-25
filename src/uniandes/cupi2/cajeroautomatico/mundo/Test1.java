package uniandes.cupi2.cajeroautomatico.mundo;

public class Test1 {
	public void hacerAlgo(){
		System.out.println("***** metodo hacer algo");
	}
	public int retornarAlgo( int param){
		System.out.println("***** metodo retornar algo");
		return 10100;
	}
	public void fallarEnAlog( int param) throws Exception{
		System.out.println("***** metodo fallar en algo");
		throw new Exception("esto es una excepcion provocada ");
		//return 0;
	}
}
