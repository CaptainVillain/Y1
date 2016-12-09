
package y1;

import battleship.interfaces.BattleshipsPlayer;
import tournament.player.PlayerFactory;

/**
 *
 * @author Anton, Kasper, Kristian
 */
public class Y1 implements PlayerFactory<BattleshipsPlayer>
{
    public Y1(){}
    
    
    @Override
    public BattleshipsPlayer getNewInstance()
    {
        return new SystematicShotPlayer();
    }

    @Override
    public String getID()
    {
        return "Y1";
    }

    @Override
    public String getName()
    {
        return "Systematic shooter";
    }

    @Override
    public String[] getAuthors()
    {
        String[] res = {"Anton, Kasper, Kristian"};
        return res;
    }
    
}
