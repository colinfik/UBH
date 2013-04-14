package hacking;

import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.Flags.Flag;
import javax.mail.search.FlagTerm;
import javax.net.ssl.SSLSocket;

import com.sun.mail.pop3.POP3SSLStore;
 

public class MailReader {
	private String _sever = "pop.gmail.com";
	private int _port = 995;
	private String  _userName = "ubhackers12";
	private String _password = "poopydoopy12";
	private SSLSocket _socket;
	private BufferedReader _bufferedReader;
	private PrintWriter _printWriter;
		
		public MailReader(){
			
			
		}
		public void connect() throws Exception {

		    String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

		    Properties pop3Props = new Properties();

		    pop3Props.setProperty("mail.pop3.socketFactory.class", SSL_FACTORY);
		    pop3Props.setProperty("mail.pop3.socketFactory.fallback", "false");
		    pop3Props.setProperty("mail.pop3.port",  "995");
		    pop3Props.setProperty("mail.pop3.socketFactory.port", "995");

		    URLName url = new URLName("pop3", "pop.gmail.com", 995, "",
		            _userName, _password);

		    Session session = Session.getInstance(pop3Props, null);
		   Store store = new POP3SSLStore(session, url);
		    store.connect();
		    Folder folder = store.getDefaultFolder();
			folder = folder.getFolder("inbox");
		    folder.open(Folder.READ_ONLY);
		    Message[] messages = folder.getMessages();
		    System.out.println(messages.length);
			System.out.println("it works");
			//messages[0].getSubject();
			for(int i=0; i<messages.length; i++){
				InputStream stream = messages[i].getInputStream();
				
				System.out.println(stream);
		}
			folder.close(true);
			store.close();
		
		}



		public void readMail()throws Exception{
			Properties prop = System.getProperties();
			Session sesh = Session.getDefaultInstance(prop);
			Store store = sesh.getStore("pop3");
			store.connect(_sever,_userName, _password);
			Folder folder = store.getFolder("inbox");
			folder.open(Folder.READ_ONLY);
			Message[] messages = new Message[1];
			
			for(int i=0; i<messages.length; i++){
				InputStream stream = messages[i].getInputStream();
				while(stream.available() != 0){
				System.out.println((char)stream.read());
				}
			}
			folder.close(true);
			store.close();
		}
}
