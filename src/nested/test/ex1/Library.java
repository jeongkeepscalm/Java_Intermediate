package nested.test.ex1;

import java.util.Arrays;

public class Library {

  private Book[] books;
  private int bookCount;
  Library(int num) {
    books =  new Book[num];
    bookCount = 0;
  }

  private class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
      this.title = title;
      this.author = author;
    }
  }

  public void addBook(String title, String author) {
    if (bookCount < books.length) {
      books[bookCount++] = new Book(title, author);
    } else {
      System.out.println("도서관 저장 공간이 부족합니다.");
    }
  }

  public void showBooks() {
    System.out.println("== 책 목록 출력 ==");
    Arrays.stream(books).forEach(v -> {
      if (v != null) {
        System.out.println("도서 제목: " + v.title + ", 저자: " + v.author);
      }
    });
  }

}
