
public class Main {


    public static void main(String[] args)
    {
        boolean bol = true;


        if(bol){
        functie();
        bol = false;
        }
        if(!bol) {
            functie2();
            bol= true;
        }

    }
    public static void functie()
    {
        System.out.println("IK BEN FUNCTIE");
    }
    public static void functie2(){
        System.out.println("ik ben functie 2");
    }
}
