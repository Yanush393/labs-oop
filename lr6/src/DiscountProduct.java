public class DiscountProduct extends Product {

    private double discount;

    public DiscountProduct(String name, double price, int qantity, double discount) {
        super(name, price, qantity);
        this.discount = discount;
    }

    public void setDiscount(double discount) {
        if (discount > 0 && discount < 1) {
            this.discount = discount;
        } else {
            System.out.println("Скидка должна быть от 0 ддо 1");
        }
    }

    public double getDiscount() {
        return discount;
    }


    @Override
    public double totalCost() {
        return super.totalCost()*(1-discount);
    }



}
