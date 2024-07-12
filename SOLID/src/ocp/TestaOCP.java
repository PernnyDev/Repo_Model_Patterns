package ocp;

public class TestaOCP {

	public static void main(String[] args) {
		Fatura fatura = new Fatura();
		
		Persistencia persistencia = getPersistencia(args[0]);
		persistencia.persistir(fatura);
//		if (args[0].equals("f")) {
//			persistencia.persistir(fatura);
//		} else if (args[0].equals("db")) {
//			persistencia.persistirEmBD(fatura);
//		}
	}

	private static Persistencia getPersistencia(String tipo) {
		try {
			Persistencia p = (Persistencia) Class
											.forName("ocp.Persistencia"+tipo)
											.newInstance();
			return p;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
