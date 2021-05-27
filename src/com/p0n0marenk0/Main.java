//1. На вход вашего метода дается два предложения,
//например: «I like walking in the park» ,«in».
//Создайте следующий интерфейс
//public interface StringWorker {
//int execute(String sentences, String word);
//}
//Будет 3 класса которые реализуют следующий функционал :
//Вы должны вернуть индекс числа где оно встречается. позицию первой встречи слова
//Вы должны посчитать количество повторений+
//Вы должны вернуть кол-во символов в предложение, если удалить все такие слова.

//2. Вывести это в файл/ либо в консоль в зависимости от того что решил пользователь
//Для этого создайте следующий интерфейс :
//public interface Writer {
//void write(String value);
//}
//Будет два класса которые реализуют данный интерфейс ConsoleWriter, FileWriter
//ConsoleWriter записывает все данные в консоль
//FileWriter аписывает все данные в файл

//3=. Создайте класс Main в котором :=
//1=) Считайте два предложения :=
//2=) Считайте информацию которую необходимо вывести о предложениях, forExample: showWordIndex
//3) Спросите у пользователя куда необходимо вывести информацию файл или консоль
//4. Создать сущности для вашего будущего курсового проекта. В отдельный репозиторий.
//Как пример можету посмотреть
//https://github.com/Ali96kz/flower-shop
//Начать читать про базы данных и SQL. В качестве базы данных можете выбрать что вам больше нравиться MySQL, PostgreSQL etc.

package com.p0n0marenk0;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите предложение");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Введите слово");
        String word = scanner.nextLine();

        System.out.println("Выберите: 1 - количество повторений слова: ");
        System.out.println("Выберите: 2 - количество символов без слова: ");
        System.out.println("Выберите: 3 - индекс первого найденого елемента слова: ");
        String whatWeDoWithSentence = scanner.nextLine();
        StringWorker stringWorker = null;
        if (whatWeDoWithSentence.equals("1")) {
            stringWorker = new CountAmountOfItarance();
        } else if (whatWeDoWithSentence.equals("2")) {
            stringWorker = new ReturningAmountOfSymbolsInSentences();
        } else if (whatWeDoWithSentence.equals("3")) {
            stringWorker = new GetIndexOfNumber();
        } else {
            System.out.println("Fatal ERROR#1 , DON'T TOUCH THIS PROGRAM");
        }

        if (stringWorker != null) {
            int result = stringWorker.execute(sentence, word);
            String outputStringWithResult = "Результат : " + result;
            System.out.println("Куда вывести результат ?");
            System.out.println(" 1 - файл");
            System.out.println(" 2 - консоль");
            int methodOfOutput = scanner.nextInt();

            Writer writer = null;
            if (methodOfOutput == 1) {
                writer = new FileWriter();
            } else if (methodOfOutput == 2) {
                writer = new ConsoleWriter();
            } else {
                System.out.println("Fatal ERROR#2 , WHY DID YOU DON'T LISTEN ME?");
            }
            if (writer != null) {
                writer.write(outputStringWithResult);
            }
        }
    }
}
