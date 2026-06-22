interface Movie{
  public  void Fight();
     public void Comedy();
}
public class Interface implements Movie{
   public void Fight(){
          System.out.println("Salaar");
    }
    public void Comedy(){
        System.out.println("Jathi Ratnalu");

    }
    public static void main(String[] args) {
        Interface I=new Interface();
        I.Fight();
        I.Comedy();

        
    }
    
}
