package interfaces;

public class Test implements Football {

    @Override
    public void homeTeamScored(int points) {

    }

    @Override
    public void visitingTeamScored(int points) {

    }

    @Override
    public void endOfQuarter(int quarter) {
        System.out.println("quarter = " + quarter);
    }

    @Override
    public void setHomeTeam(String name) {
        System.out.println("name = " + name);
    }

    @Override
    public void setVisitingTeam(String name) {

    }
}
