import javax.management.MBeanNotificationInfo;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        //a = weight, kilos
        //b = height, meters

        System.out.println();
        System.out.println("98kg / 1.87m");
        System.out.println(service.calculate(98, 1.87));

        System.out.println();
        System.out.println("66kg / 1.170m");
        System.out.println(service.calculate(66, 1.170));

        System.out.println();
        System.out.println("86kg / 1.56m");
        System.out.println(service.calculate(86, 1.56));
    }
}