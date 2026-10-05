public class Main {
    public static void main(String[] args) {
        double costPrice = 100.0;
        double sellingPrice = 120.0;

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit: " + profit);
        } 
        else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        } 
        else {
            System.out.println("No profit, no loss.");
        }
    }
}