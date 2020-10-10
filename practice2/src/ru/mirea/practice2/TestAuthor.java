package ru.mirea.practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1=new Author("Sss","ghd@mail.ru", 'f');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        a1.setEmail("bkj@mail.ru");
        System.out.println(a1);

    }
}
