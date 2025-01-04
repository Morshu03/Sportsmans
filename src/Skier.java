public class Skier extends Sportsman{
    public Skier(String name, String team, int age) {
        super(name, team, age);
    }

    @Override
    public String getTeam() {
        return super.getTeam();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void run() {
        System.out.println("Лыжник бежит");
    }

    public void totalPointsInTheSprint(int countOfPoints) {
        System.out.println("Лыжник " + getName()
                + " за карьеру набрал " + countOfPoints
                + " очков в спринте");
    }
}
