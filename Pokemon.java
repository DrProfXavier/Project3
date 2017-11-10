public class Pokemon
{
    int attack, defense, speed;
    String species = null;


    public Pokemon(String species)
    {
        species = "";
        attack = species.length() * 4 + 2;
        defense = species.length() * 2 + 7;
        speed = species.length() * 3 + 5;

    }
    //return species as string
    public String getSpecies()
    {
        return species;

    }


    public void setSpecies(String spc)
    {
        species = spc;
    }

    //return attack as int
    public int getAttack()
    {
        return attack;
    }


    public void setAttack(int atk)
    {
        this.attack = atk;

    }

    public int getDefense()
    {

        return defense;
    }

    public void setDefense(int def)
    {
        defense = def;

    }

    //Return int speed
    public int getSpeed()
    {
        return speed;
    }

    //Set int speed to new speed
    public void setSpeed(int spd)
    {
        speed = spd;
    }

    /*
* When called, the evolve method will double the speed stat,
* triple the attack stat, and multiply the defense stat by 5.
*/
    public void evolve(int eAtk, int eDef, int eSpd)
    {
        int evolveAtk = eAtk * 3;
        int evolveDef = eDef * 5;
        int evolveSpd = eSpd * 2;
    }


}