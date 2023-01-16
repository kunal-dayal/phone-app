public class Main {
    public static void main(String[] args){
        landLine l1 = new landLine("123");
        landLine l2 = new landLine("456");
        landLine l3 = new landLine("789");

        l1.callNumber("456");
        l2.receivedCall("456");
        System.out.println(l2.ansCall());
    }
}