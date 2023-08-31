package nosqplpj;
import Connection.util.Conn;
import com.mongodb.client.MongoDatabase;
public class Nosqplpj {
 public static void main(String[] args) {
 // TODO code application logic here
 //Conn c=new Conn();
 String s="Nosql";
 MongoDatabase database=new Conn().getConnect(s);
 new Login().setVisible(true);
 }
 
14
}
