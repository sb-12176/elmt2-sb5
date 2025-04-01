
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    private static final int DEFAULT_POWER = 10;

    // instance variables
    private int power;
    private String name;

    // constructors

    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */
    public PowerPill (String name){
        this.name = name;
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
    public PowerPill (String name, int power){
        this.name = name;
        this.power = power;

    }


    // accessor methods

    /**
     * Returns the name of the power pill.
     *
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the power of the power pill.
     *
     */
    public int getPower(){
        return power;
    }


    // mutator methods

    /**
     * Changes the name of the power pill to the string in the parameter.
     *
     * @param name  What the name of the power pill will be changed to.
     *
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Changes the power of the power pill to the value of the int parameter.
     *
     * @param power  What the power of the power pill will be changed to.
     *
     */
    public void setPower(int power){
        this.power = power;
    }

    // toString method

    @Override
    public String toString(){
        return "PowerPill " + name + " = " + power;
    }

}