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

//3. Создайте класс Main в котором :
//1) Считайте два предложения :
//2) Считайте информацию которую необходимо вывести о предложениях, forExample: showWordIndex
//3) Спросите у пользователя куда необходимо вывести информацию файл или консоль
//4. Создать сущности для вашего будущего курсового проекта. В отдельный репозиторий.
//Как пример можету посмотреть
//https://github.com/Ali96kz/flower-shop
//Начать читать про базы данных и SQL. В качестве базы данных можете выбрать что вам больше нравиться MySQL, PostgreSQL etc.

package com.p0n0marenk0;

public class Main {

    public static void main(String[] args) {
        String str = "I like walking in the park";
        String str1 = "in";
	CountAmountOfItarance Amount = new CountAmountOfItarance();
	int amount = Amount.execute(str,str1);
        System.out.println(amount);
    }
}
