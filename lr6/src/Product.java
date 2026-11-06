class Product{

    private String name;
    private double price;
    private int qantity;

    public Product(String name,double price, int qantity){

        this.name=name;
        this.price=price;
        this.qantity=qantity;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQantity() {
        return qantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price>=0){
            this.price = price;
        }else{
            System.out.println("Цена не может быть отрицательной");
        }
    }

    public void setQantity(int qantity) {
        if(qantity>=0){
            this.qantity = qantity;
        }else{
            System.out.println("Кол-во не должно быть отрицательным");
        }
    }

    public double totalCost() {
            return price * qantity;

    }
}

