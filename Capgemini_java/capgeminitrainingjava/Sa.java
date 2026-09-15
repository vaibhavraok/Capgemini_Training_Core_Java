package capgeminitrainingjava;
import java.io.FileInputStream;
class Sa {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("D:\\Capgemini Training Period\\Java\\notes\\example.txt");
			//PrintWriter p = new PrintWriter(f);
			//p.println("Hi");
			//p.append("Hello");
			//p.flush():
			//System.out.println("Data Stored");
			int data=f.read();
			while(data !=-1)
			{
				System.out.print((char)data);
				data=f.read();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
