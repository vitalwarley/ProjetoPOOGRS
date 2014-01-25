package excecoes;

public class AutenticarException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Anexar uma causa ao erro ocorrido.
	 * @param e
	 */
	public AutenticarException(Exception e){
		super(e);
	}
	
	/**
	 * Anexar uma mensagem e uma causa ao erro ocorrido.
	 * 
	 * @param msg
	 *            Mensagem que deve ser acrescentada no Stacktrace
	 * @param e
	 *            Causa do erro
	 */
	public AutenticarException(String msg, Exception e) {
		super(msg, e);
	}
	
	/**
	 * Anexar uma mensagem ao erro ocorrido.
	 * 
	 * @param msg
	 *            Mensagem que deve ser acrescentada no Stacktrace
	 */
	public AutenticarException(String msg) {
		super(msg, null);
	}
}
