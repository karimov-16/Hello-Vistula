import java.math.BigDecimal;

public class task4 {

    public static void main(String[] args) {

        double net = 9.99;
        double gross = net * 1.23;

        double totalGross = gross * 10000;
        double totalNet = totalGross / 1.23;

        System.out.println("net " + net);
        System.out.println("gross " + gross);
        System.out.println("total gross " + totalGross);
        System.out.println("total net " + totalNet);


        // BIGDECIMAL
        BigDecimal netBD = new BigDecimal("9.99");
        BigDecimal vat = new BigDecimal("0.23");
        BigDecimal one = new BigDecimal("1");

        BigDecimal grossBD = netBD.multiply(one.add(vat));
        System.out.println("Gross price (BigDecimal): " + grossBD);

        BigDecimal totalGrossBD = grossBD.multiply(new BigDecimal("10000"));
        System.out.println("Total gross (BigDecimal): " + totalGrossBD);

        BigDecimal totalNetBD = totalGrossBD.divide(one.add(vat));
        System.out.println("Net from gross (BigDecimal): " + totalNetBD);
    }
}