package snackBar;

public class Main {
    public static void snackTime() {
        Customer Jane = new Customer("Jane", 45.25);
        Customer Bob = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        System.out.println("*** Transaction 1 ***");
        System.out.println("Jane's cash: " + Jane.getCashOnHand());
        System.out.println("s4 qty: " + s4.getQuantity());

        System.out.println("*** Transaction 2 ***");
        Jane.setCashOnHand(Jane.getCashOnHand() - 3 * s4.getCost());
        s4.setQuantity(s4.getQuantity() - 3);
        System.out.println("Jane's cash: " + Jane.getCashOnHand());
        System.out.println("s4 qty: " + s4.getQuantity());

        System.out.println("*** Transaction 3 ***");
        Jane.setCashOnHand(Jane.getCashOnHand() - 1 * s3.getCost());
        System.out.println("Jane's cash: " + Jane.getCashOnHand());
        System.out.println("s4 qty: " + s3.getQuantity());

        System.out.println("*** Transaction 4 ***");
        Bob.setCashOnHand(Bob.getCashOnHand() - 2 * s4.getCost());
        System.out.println("Bob's cash: " + Bob.getCashOnHand());
        System.out.println("s3 qty: " + s3.getQuantity());

        System.out.println("*** Transaction 5 ***");
        Jane.setCashOnHand(Jane.getCashOnHand() + 10);
        System.out.println("Jane's cash: " + Jane.getCashOnHand());

        System.out.println("*** Transaction 6 ***");
        Jane.setCashOnHand(Jane.getCashOnHand() - 1 * s2.getCost());
        System.out.println("Jane's cash: " + Jane.getCashOnHand());
        System.out.println("s2 qty: " + s2.getQuantity());

        System.out.println("*** Transaction 7 ***");
        s3.setQuantity(s3.getQuantity() + 12);
        System.out.println("s3 qty: " + s3.getQuantity());

        System.out.println("*** Transaction 8 ***");
        Bob.setCashOnHand(Bob.getCashOnHand() - 3 * s3.getCost());
        System.out.println("Bob's cash: " + Bob.getCashOnHand());
        System.out.println("s3 qty: " + s3.getQuantity());

        System.out.println("*** Stretch ***");
        System.out.println(s5.toString());

        System.out.println(VendingMachine.GetById.ARIN.nameById());
    }

    public static void main(String[] args) {
        snackTime();
    }
}



