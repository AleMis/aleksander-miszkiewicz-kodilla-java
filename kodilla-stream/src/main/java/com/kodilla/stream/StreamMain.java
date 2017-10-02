package com.kodilla.stream;

import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.formuser.FormUser;
import com.kodilla.stream.formuser.Forum;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain {

    public static void main(String[] args) {

//        Processor processor = new Processor();
//       processor.executre(() -> System.out.println("This is example"));

//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(10, 5, (a,b) -> a + b);
//        expressionExecutor.executeExpression(10,5, (a,b) -> a * b);
//        expressionExecutor.executeExpression(10,5, (a,b) -> a-b);
//        expressionExecutor.executeExpression(10,5, (a,b) -> a/b);
//
//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);

//        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//        PoemBeautifier beautifier = new PoemBeautifier();
//        beautifier.beautify("makaron",  String::toUpperCase);
//        beautifier.beautify("trampolina", n -> "ABC" + n + "ABC");
//        beautifier.beautify("żelasko", (String) -> String.replace('e', 'E'));
//        beautifier.beautify("MONITOR", String::toLowerCase);

//        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//        NumbersGenerator generator = new NumbersGenerator();
//        generator.generateEven(100);

//        People.getList().stream()
//             .map(s -> s.toUpperCase())
//                .filter(s-> s.length() > 11)
//                .map(s-> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s-> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String, Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("#elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + " : " + entry.getValue())
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter((book -> book.getYearOfPublication() > 2005))
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n", "<<", ">>"));
//        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();
        Map<Integer, FormUser> theMapOfForumUsers = forum.getListOfUsers().stream()
                .filter(formUser -> formUser.getSex() == 'm')
                .filter(formUser -> formUser.getBirthData().getYear() <=1997)
                .filter(formUser -> formUser.getPostsNumber() >=1)
                .collect(Collectors.toMap(FormUser::getUserID, formUser -> formUser));

        theMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " ; " + entry.getValue())
                .forEach(System.out::println);


        BookDirectory bookDirectory = new BookDirectory();

                long number = IntStream.range(0, bookDirectory.getList().size())
                        .filter(n -> bookDirectory.getList().get(n).getYearOfPublication() > n)
                        .count();



        }

    }




