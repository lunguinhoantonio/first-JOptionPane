import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        short totalNumbers = 0;
        short evenNumbers = 0;
        short oddNumbers = 0;
        short above1HundredNumbers = 0;
        short negativeNumbers = 0;
        short zeroNumbers = 0;
        float averageArith;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Input a number" +
                            "<br>" +
                    "<em>The program will stop when entering 0</em></html>", JOptionPane.ERROR_MESSAGE));
            sum += num;
            totalNumbers++;

            if (num % 2 == 0) evenNumbers++;
            else oddNumbers++;

            if (num > 100) above1HundredNumbers++;
            else if (num < 0) negativeNumbers++;
            else if (num == 0) zeroNumbers++;

        } while (num != 0);

        averageArith = (float) sum / totalNumbers;

        JOptionPane.showMessageDialog(null,
                "<html>Final results" +
                        "<hr><br>" +
                        "Sum of values: " + sum + "<br>" +
                        "Total values entered: " + totalNumbers + "<br>" +
                        "Evens: " + evenNumbers + "<br>" +
                        "Odds: " + oddNumbers + "<br>" +
                        "Above 100: " + above1HundredNumbers + "<br>" +
                        "Negatives: " + negativeNumbers + "<br>" +
                        "0 entered: " + zeroNumbers + "<br>" +
                        "Arithmetic mean of values: " + averageArith + "<br>" +
                        "</html>");

    }
}