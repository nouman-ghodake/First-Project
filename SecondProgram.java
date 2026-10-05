public class SecondProgram{
    public static void main(String[] args) {

        int costPrice = 100;
        int sellingPrice = 130;

        if (sellingPrice > costPrice) {
            System.out.println("Profit = " + (sellingPrice - costPrice));
        } 
        else if (sellingPrice < costPrice) {
            System.out.println("Loss = " + (costPrice - sellingPrice));
        } 
        else {
            System.out.println("No Profit No Loss");
        }
    }
}
