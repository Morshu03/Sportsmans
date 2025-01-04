public class Footballer extends Sportsman{

    public Footballer(String name, String team, int age) {
        super(name, team, age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getTeam() {
        return super.getTeam();
    }

    @Override
    public void run() {
        System.out.println("Футболист бежит");
    }

    public void scoringGoals(int countOfGoals) {
        System.out.println("Футболист " + getName()
                + " за карьеру забил " + countOfGoals
                + " голов");
    }
}
