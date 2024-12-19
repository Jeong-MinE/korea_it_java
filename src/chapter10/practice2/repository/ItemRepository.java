package chapter10.practice2.repository;

import chapter10.practice2.entity.Item;

import java.util.Set;

public interface ItemRepository {
    void addItme (Item item);
    void removeItem(String itemed);
    Item findById(String itemId);
    Set<Item> findAll();
}
