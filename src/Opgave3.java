public class Opgave3 {

    public static double applyDisccount(double price, double discountPercent){
        price = price - (price * (discountPercent/100));
        return price;
    }

    public static double addTax(double price){
        return price + (price * 0.25);
    }

    public static double calculateFinalPrice(){
        return addTax(applyDisccount(500,20));
    }

    void main(){
        System.out.println(applyDisccount(200,20));
        System.out.println(calculateFinalPrice());
    }
}
