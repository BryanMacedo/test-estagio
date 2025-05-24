import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // fazer uma função q receba n registros
        // q representem o consumo de bateria e eventos de carregamento
        // um valor POSITIVO indica MINUTOS CARREGADOS
        // um valor NEGATIVO indica MINUTOS JOGANDO(o laptop consome 1% de bateria por minuto)
        // a bateria não pode passar de 100%
        // a carga inicial é de 50%
        // -> a função deve RETORNAR A PORCENTAGEM FINAL DA BATERIA
        // EX: N = 4 EVENTOS[10, -20, 61, -15] SAIDA = 85

        List<Integer> events = new ArrayList<>(Arrays.asList(10, -20, 61, -15));
        List<Integer> events02 = new ArrayList<>(Arrays.asList(10, -20, -40, -15));

        System.out.println("Final: " + getBattery(events02));
    }

    public static int getBattery(List<Integer> events) {
        int batteryPercentage = 50;

        for (Integer event : events) {
            if (event > 0) {
                batteryPercentage += event;
                if (batteryPercentage > 100) batteryPercentage = 100;
            } else {
                batteryPercentage += event;
                if (batteryPercentage < 0) batteryPercentage = 0;
            }
        }
        return batteryPercentage;
    }
}
