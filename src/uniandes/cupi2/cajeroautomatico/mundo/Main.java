package uniandes.cupi2.cajeroautomatico.mundo;

public class Main {

	public static void main(String[] args) {
			
		CajeroAutomatico cajeroAutomatico = new CajeroAutomatico();
		Auditoria auditoria = new Auditoria();
		Cuenta cuenta = new Cuenta();
		cuenta.consultarSaldo();
		cajeroAutomatico.hacerRetiro();
		cajeroAutomatico.hacerTransferencia();
		cajeroAutomatico.hacerConsignacion();		
		auditoria.escribirEnListadoOperaciones();
	}

}
