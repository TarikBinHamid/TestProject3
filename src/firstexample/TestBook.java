package firstexample;

public class TestBook {
    public static void main(String[] args) {


        Author author=new Author("ABC",65,'F',"PhD");
        Book book1=new Book("First Day at PNT",author,3245,55);

        // Alternative Way

//        Book book1=new Book("First Day at PNT", new Author ("ABC",65,'F',"PhD"),3245,55);




        System.out.println(book1.getAuthor().getName());
        System.out.println(book1.getTitle());
    }
}
