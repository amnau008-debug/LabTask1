public class LabDemo {

    public static void main(String[] args) {

        Date d1 = new Date(10,6,2025);

        Lab lab1 = new Lab("COMSATS","CS","A","Programming Lab",40,10,d1);

        Lab lab2 = new Lab("COMSATS","IT","B");

        Lab lab3 = new Lab();

        Lab lab4 = new Lab(lab1);

        lab1.bookComputers(5);

        lab1.cancelBooking(2);

        if(lab1.equals(lab4))
            System.out.println("\nLab1 and Lab4 are same");
        else
            System.out.println("\nLab1 and Lab4 are different");

        System.out.println(lab1);
        System.out.println(lab2);
        System.out.println(lab3);
        System.out.println(lab4);

        System.out.println("\nTotal Labs Created: " + Lab.getTotalLabs());
    }
}