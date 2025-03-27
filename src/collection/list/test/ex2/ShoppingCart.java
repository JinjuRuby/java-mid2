package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < items.size(); i++) {
            String name = items.get(i).getName();
            int totalPrice = items.get(i).getTotalPrice();

            System.out.println("상품명: " + name + ", 합계: " + totalPrice);
        }

        // 유지보수성을 위해 전체 가격 합을 구하는 코드를 위의 코드와 분리해서 작성한다.
        int total = 0;

        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getTotalPrice();
        }

        System.out.println("전체 가격 합: " + total);

    }


}
