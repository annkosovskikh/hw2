public class Main {
    public static void main(String[] args) {
        var telescopePrice = 14000;
        var account = 1000;
        var stipendya = 2500;
        var percentBank = Math.round(5.0/12.0*100)/100.0;
        int countMonth = 0;
        while(account< telescopePrice){
            countMonth++;
            account += account * percentBank /100;
            account += stipendya;
        }
        System.out.println("Потребовалось " + countMonth + " месяцев.");
        System.out.println("Средства на момент покупки составили " + account);
    }
}