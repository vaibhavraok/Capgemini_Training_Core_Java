package capgeminitrainingjava;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class stude {
	 int id;
	 String name;
	 public stude(int id,String name) {
		 super();
		 this.id=id;
		 this.name=name;
	 }
	 @Override
	 public String toString() {
		 return "Student [id=" +id+ ", name=" + name +"]";
	 }
}
 class Driver15{
	 public static void main(String[] args) {
		 LinkedList<stude> l =new LinkedList<stude>();
		 l.add(new stude(13,"Nithin"));
		 l.add(new stude(22,"Kruthik"));
		 l.add(new stude(14,"Suhail"));
		 l.add(new stude(18,"Vaibhav"));
//		 for(Object ele:l) {
//		 System.out.println(ele);
//	 }
//		 Iterator i= l.iterator();
//		 
//		 while(i.hasNext()==true) {
//			 System.out.println(i.next());
//		 }
		 
//		 ListIterator i=l.listIterator(l.size());
//		 while(i.hasPrevious()) {
//			 System.out.println(i.previous());
//		 }
//		 System.out.println(l.size());
//		 System.out.println(l.get(l.size()-1));
		 
		 
//		 for(int i=0;i<l.size();i++) {
//			 System.out.println(l.get(i));
//		 }
 }
}