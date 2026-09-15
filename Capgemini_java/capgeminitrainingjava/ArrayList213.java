package capgeminitrainingjava;
import java.util.ArrayList;

class student213{
	int id;
	String name;
	student213(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "id:"+id+"name:"+name;
	}
}

public class ArrayList213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student213> a=new ArrayList();
		a.add(new student213(1, "Nithintatti"));
		a.add(new student213(2, "Nithin"));
		
		System.out.println(a);
		
	}

}
