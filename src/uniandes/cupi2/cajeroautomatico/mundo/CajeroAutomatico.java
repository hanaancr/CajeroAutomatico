package uniandes.cupi2.cajeroautomatico.mundo;

public class CajeroAutomatico {
	Cuenta cuenta = new Cuenta();
	public void hacerRetiro(){
		System.out.println("\t**** HACER RETIRO");
		cuenta.descontarAlSaldo();
		cuenta.actualizarSaldo();
	}
	public void hacerTransferencia(){
		System.out.println("\t**** HACER TRANSFERENCIA");
		cuenta.descontarAlSaldo();
		cuenta.actualizarSaldo();
	}
	public void hacerConsignacion(){
		System.out.println("\t**** HACER CONSIGNACION");
		cuenta.adicionarAlSaldo();
		cuenta.actualizarSaldo();
	}
	
	
	
}
