
public aspect CajerosAutomaticos {
	
	  pointcut metodosCajerosAutomaticos() : call( * uniandes.cupi2.cajeroautomatico.mundo..*(..));

	  before(): metodosCajerosAutomaticos() {

		System.out.println("\t-----------------Detecta pointcut---------------------");
	    System.out.println("\t objeto     : " + thisJoinPoint.getTarget());
	    System.out.println("\t método     : " + thisJoinPoint.getSignature());
	    System.out.println("\t argumentos : " + thisJoinPoint.getArgs());
	    System.out.println("\t----------------------------------------------");
	    if( thisJoinPoint.getSignature().toString().contains("hacerRetiro") ||
	    		thisJoinPoint.getSignature().toString().contains("hacerTransferencia")){
	    	validarSaldoReducido();
			
	    }
	  }
	    after(): metodosCajerosAutomaticos() {
			
			  if( thisJoinPoint.getSignature().toString().contains("hacerRetiro") ||
			    		thisJoinPoint.getSignature().toString().contains("hacerTransferencia")||
			    		thisJoinPoint.getSignature().toString().contains("hacerConsignacion")){
				    agregarARegistroAuditoria();
			}
	   }
		  
	  public void validarSaldoReducido(){
			System.out.println("\t**** Se valida que el saldo sea mínimo de $200.000");
	  }

	  public void agregarARegistroAuditoria(){
			System.out.println("\t**** Se escribe en listado de operaciones del usuario");
	  }
	 
	  

}
