public class HockeyPlayer extends Sportsman{
    public HockeyPlayer(String name, String team, int age) {
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
        System.out.println("Хокеист бежит");
    }

    public void timeOnTheSite(int timeOnTheSiteInSecond) {
        System.out.println("Хокеист " + getName()
                + " всего на площадке КХЛ пробыл " + timeOnTheSiteInSecond
                + " секунд");
    }
}
