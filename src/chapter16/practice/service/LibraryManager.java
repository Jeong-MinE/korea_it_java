package chapter16.practice.service;

import chapter16.practice.entity.Book;
import chapter16.practice.entity.Category;
import chapter16.practice.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager implements Manageable {
    private List<Item> items = new ArrayList<>();

    public LibraryManager() {
        items.add(new Book("1", "자바", "1", "이승아", "승아나라", 2024, 15000, 5, Category.FICTION));
        items.add(new Book("1", "자바", "1", "이승아", "승아나라", 2024, 15000, 5, Category.FANTASY));
        items.add(new Book("1", "자바", "1", "이승아", "승아나라", 2024, 15000, 5, Category.SCIENCE));
        items.add(new Book("1", "자바", "1", "이승아", "승아나라", 2024, 15000, 5, Category.HISTORY));
        items.add(new Book("1", "자바", "1", "이승아", "승아나라", 2024, 15000, 5, Category.NONFICTION));
        items.add(new Book("1", "자바", "1", "이승아", "승아나라", 2024, 15000, 5, Category.FICTION));
        items.add(new Book("1", "자바", "1", "이승아", "승아나라", 2024, 15000, 5, Category.FICTION));
        items.add(new Book("1", "자바", "1", "이승아", "승아나라", 2024, 15000, 5, Category.FANTASY));
        items.add(new Book("1", "자바", "1", "이승아", "승아나라", 2024, 15000, 5, Category.SCIENCE));
    }


        @Override
        public List<Item> searchByCategory(Category category) {
            List<Item> result = new ArrayList<>();

            for (Item itme : items) {
                if (itme instanceof Book && ((Book) itme).getCategory() == category) {
                    result.add(itme);
                }
            }
            return result;
        }
}
