public class MagicDoor {

    public Hero[] use(){

        Hero hero1 = new Hero(320,50,20);
        Hero hero2 = new Hero(320,60,30);
        Hero hero3 = new Hero(320,70,40);
        Hero hero4 = new Hero(320,80,50);
        Hero[] heroes = {hero1 , hero2 , hero3 , hero4};

        return heroes;

    }
}