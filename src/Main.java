/*- В проекте StringExperiments внести изменения таким образом, чтобы суммы заработков каждого человека извлекались из
текста регулярным выражением, а в конце программы рассчитывалась и распечатываль общая сумма заработка всех.
Приложить zip-­архив изменённого проекта StringExperiments.
"Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"
 */

public class Main {

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        text = text.replaceAll("[^0-9]+"," ");
        String[] salaries = text.trim().split("\\s");

        int sum = 0;
        for (int i=0; i<salaries.length; i++)
        {
            sum += Integer.parseInt(salaries[i]);
        }
        System.out.println("Общая сумма заработка: " + sum);
    }
}