package chapter07.orderApp;

/*
    Product 클래스(부모 클래스)
    - Field : name(제품명), price(제품가격)
    - Constructor : Product(name, price)
    - Method : getName(), getPrice(), calculateTax() : 세금 계산 메서드(기본 18% 세율)
*/


public class Product {
    protected String name;
    public int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    // 세금 계산 메서드
    double calculateTax() {
        return price * 0.1;
    }

    public static class Main {
        public static void main(String[] args) {
            // 제품 생성
            Product laptop = new Electronics("Laptop", 5000);
            Product apple = new Food("Apple", 6000);

            // 주문 생성
            Order order1 = new Order(laptop, 1);
            Order order2 = new Order(apple, 10);

            System.out.println(order1);
            System.out.println(order2);

        }
    }
}
