public class Main{

    public static void main(String[] args){

        Product product = new Product("Наушники",10.4,10);

        System.out.println("Название: " + product.getName());
        System.out.println("Цена за штуку: " + product.getPrice());
        System.out.println("Кол-во товара: " + product.getQantity());
        System.out.println("Общая стоимость: " + product.totalCost());





    }
}