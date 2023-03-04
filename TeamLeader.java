public class TeamLeader {
    private Name name;
    private Address address;
    private Salesperson[] team;
    private int currteamsz;

    public TeamLeader(Name name, int maxteamsz) {
        this.name = name;
        team = new Salesperson[maxteamsz];
    }

    // setter/getter for name, address, currteamsz here (not shown)
    public Salesperson getTeam(int i) {
        return team[i];
    }

    public void addTeam(Salesperson member) {
        if (currteamsz == team.length)
            return;
        this.team[currteamsz] = member;
        currteamsz++;
    }

    public float calcPerformance() {
        float sale = 0.0f;
        for (int i = 0; i < currteamsz; i++) {
            sale += team[i].calcPerformance();
        }
        return sale;
    }

    public Salesperson getBestPerformer() {
        int top = 0;
        float max = team[0].calcPerformance();
        for (int i = 1; i < currteamsz; i++) {
            float sale = team[i].calcPerformance();
            if (sale > max) {
                max = sale;
                top = i;
            }
        }
        return team[top];
    }
}

