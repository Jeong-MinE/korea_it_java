package chapter14;

// 주문 목록에서 상품별 총 판매량 계산

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 주문 클래스
@Getter
@AllArgsConstructor
@ToString
class Order {
    private String product;
    private int quantity;
}

public class J_practice {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("노트북", 5),
                new Order("핸드폰", 6),
                new Order("태블릿", 2),
                new Order("노트북", 3),
                new Order("스마트워치", 1),
                new Order("핸드폰", 2)
        );

        // 상품별 총 판매량 계산
        Map<String, Integer> productSales = orders.stream()
                .collect(Collectors.groupingBy(Order::getProduct,
                        Collectors.summingInt(Order::getQuantity)));

        System.out.println(productSales);
    }
}
