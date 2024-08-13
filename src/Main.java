import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int num;
        int soma = 0;
        short totalNumbers = 0;
        short evenNumbers = 0;
        short oddNumbers = 0;
        short above1HundredNumbers = 0;
        short negativeNumbers = 0;
        short zeroNumbers = 0;
        float averageArith;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Insira um número" +
                            "<br>" +
                    "<em>O Valor 0 interrompe o programa</em></html>", JOptionPane.ERROR_MESSAGE));
            soma += num;
            totalNumbers++;

            if (num % 2 == 0) evenNumbers++;
            else oddNumbers++;

            if (num > 100) above1HundredNumbers++;
            else if (num < 0) negativeNumbers++;
            else if (num == 0) zeroNumbers++;

        } while (num != 0);

        averageArith = (float) soma / totalNumbers;

        JOptionPane.showMessageDialog(null,
                "<html>Resultado final" +
                        "<hr><br>" +
                        "Soma dos valores: " + soma + "<br>" +
                        "Total de valores digitados: " + totalNumbers + "<br>" +
                        "Pares: " + evenNumbers + "<br>" +
                        "Ímpares: " + oddNumbers + "<br>" +
                        "Acima de 100: " + above1HundredNumbers + "<br>" +
                        "Negativos: " + negativeNumbers + "<br>" +
                        "0 digitados: " + zeroNumbers + "<br>" +
                        "Média aritmética dos valores: " + averageArith + "<br>" +
                        "</html>");

    }
}