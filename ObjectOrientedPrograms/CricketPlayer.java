package ObjectOrientedPrograms;


class AuctionPlayer
{
    private int age=18;
    private String name;

    AuctionPlayer(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    AuctionPlayer(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }

}
public class CricketPlayer {
    public static void main(String[] args) {

        AuctionPlayer a1 = new AuctionPlayer("Aviral", 20);
        AuctionPlayer a2 = new AuctionPlayer("Vanshika");
        System.out.println("Name of Player :- "+a1.getName());
        System.out.println("Player Age :- "+a1.getAge());
        System.out.println("Name of Player :- "+a2.getName());
        System.out.println("Player Age :- "+a2.getAge());
    }
    
}
