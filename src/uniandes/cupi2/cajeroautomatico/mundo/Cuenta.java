package uniandes.cupi2.cajeroautomatico.mundo;

public class Cuenta {
	
	public void consultarSaldo(){
		System.out.println("\t**** CONSULTAR SALDO");
	}
	
	 public void adicionarAlSaldo(){
			System.out.println("\t**** Se adiciona el valor al saldo de la cuenta del beneficiario");
	  }
	  public void descontarAlSaldo(){
			System.out.println("\t**** Se descuenta el valor al saldo de la cuenta del usuario");
	  }
	  public void actualizarSaldo(){
			System.out.println("\t**** Se actualiza el saldo");
	  }
}
