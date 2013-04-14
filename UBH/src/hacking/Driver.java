package hacking;

import java.io.IOException;


public class Driver {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Parse p = new Parse();
		p.total();
		p.tax();
		System.out.println(p.total());
		System.out.println(p.tax());
		FiletoExcel fe = new FiletoExcel();
		fe.excel(p.total(), p.tax());
		MailReader mail = new MailReader();
		try {
			mail.connect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
