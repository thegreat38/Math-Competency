
public class Main {
    public static void main(String[] args) {

        TeamLeader carl = new TeamLeader(new Name("Carl"), 10);

        for (int i=1; i<5; i++) {
            Salesperson sp = new Salesperson(5);
            sp.setName(new Name("Person-"+i));
            sp.setAddress(new Address("50","Street 1","32650","Selangor","KL"));

            for (int j = 0; j < sp.getMaxSales(); j++) {
                Sales sale1 = new Sales((float) Math.random() * 1000,
                        new Date(20, 1, 2023));
                sp.addSales(sale1);
            }
            carl.addTeam(sp);
        }

        // Create three more salespersons and add them to the team
        Salesperson sp2 = new Salesperson(5);
        sp2.setName(new Name("Person-5"));
        sp2.setAddress(new Address("10","Street 2","31010","Sarawak","Sabah"));
        for (int j = 0; j < sp2.getMaxSales(); j++) {
            Sales sale1 = new Sales((float) Math.random() * 1000,
                    new Date(20, 1, 2023));
            sp2.addSales(sale1);
        }
        carl.addTeam(sp2);

        Salesperson sp3 = new Salesperson(5);
        sp3.setName(new Name("Person-6"));
        sp3.setAddress(new Address("20","Street 3","30010","G",""));
        for (int j = 0; j < sp3.getMaxSales(); j++) {
            Sales sale1 = new Sales((float) Math.random() * 1000,
                    new Date(20, 1, 2023));
            sp3.addSales(sale1);
        }
        carl.addTeam(sp3);

        Salesperson bestPerformer = carl.getBestPerformer();
        System.out.println("Team performance: " + carl.calcPerformance());
        System.out.println("Best performer so far is " + bestPerformer.getName().getFname() + " from: " + bestPerformer.getAddress().getDistrict());


    }
}
