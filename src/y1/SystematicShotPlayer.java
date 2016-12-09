/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package y1;

import battleship.interfaces.BattleshipsPlayer;
import battleship.interfaces.Fleet;
import battleship.interfaces.Position;
import battleship.interfaces.Board;
import battleship.interfaces.Ship;
import java.util.Random;

/**
 *
 * @author Tobias
 */
public class SystematicShotPlayer implements BattleshipsPlayer
{
    private final static Random rnd = new Random();
    private int sizeX;
    private int sizeY;
    private int lastX;
    private int lastY;
    
    private int nextX;
    private int nextY;

    public SystematicShotPlayer()
    {
    }
    
    
    /**
     * The method called when its time for the AI to place ships on the board 
     * (at the beginning of each round).
     * 
     * The Ship object to be placed  MUST be taken from the Fleet given 
     * (do not create your own Ship objects!).
     * 
     * A ship is placed by calling the board.placeShip(..., Ship ship, ...) 
     * for each ship in the fleet (see board interface for details on placeShip()).
     * 
     * A player is not required to place all the ships. 
     * Ships placed outside the board or on top of each other are wrecked.
     * 
     * @param fleet Fleet all the ships that a player should place. 
     * @param board Board the board were the ships must be placed.
     */
    @Override
    public void placeShips(Fleet fleet, Board board)
    {
        nextX = 0;
        nextY = 0;
        sizeX = board.sizeX();
        sizeY = board.sizeY();
        
        nextX = 0;
        nextY = 0;
        sizeX = board.sizeX();
        sizeY = board.sizeY();
        int layout = rnd.nextInt(4)+1;
        boolean vertical = true;
        Position pos;
 
        //layout 1,
        if(layout == 1){
            //ship 1 Size: 2
             Ship s = fleet.getShip(0);
             int x = 2;
             int y = 0;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 2 Size: 3
             s = fleet.getShip(1);
             x = 1;
             y = 6;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 3 Size: 3
             s = fleet.getShip(2);
             x = 6;
             y = 5;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 4 Size: 4
             s = fleet.getShip(3);
             x = 7;
             y = 1;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 5 Size: 5
             s = fleet.getShip(4);
             x = 2;
             y = 7;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
        }
           
        //layout 2,
        if(layout == 2){
            //ship 1 Size: 2
             Ship s = fleet.getShip(0);
             int x = 9;
             int y = 8;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 2 Size: 3
             s = fleet.getShip(1);
             x = 6;
             y = 1;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 3 Size: 3
             s = fleet.getShip(2);
             x = 2;
             y = 6;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 4 Size: 4
             s = fleet.getShip(3);
             x = 6;
             y = 5;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 5 Size: 5
             s = fleet.getShip(4);
             x = 1;
             y = 4;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
        }
             
        //layout 3,
        if(layout == 3){
            //ship 1 Size: 2
             Ship s = fleet.getShip(0);
             int x = 4;
             int y = 5;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 2 Size: 3
             s = fleet.getShip(1);
             x = 7;
             y = 0;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 3 Size: 3
             s = fleet.getShip(2);
             x = 0;
             y = 9;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 4 Size: 4
             s = fleet.getShip(3);
             x = 8;
             y = 5;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 5 Size: 5
             s = fleet.getShip(4);
             x = 1;
             y = 1;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
        }
           
        //layout 4,
        if(layout == 4){
            //ship 1 Size: 2
             Ship s = fleet.getShip(0);
             int x = 2;
             int y = 6;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 2 Size: 3
             s = fleet.getShip(1);
             x = 3;
             y = 6;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 3 Size: 3
             s = fleet.getShip(2);
             x = 6;
             y = 4;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 4 Size: 4
             s = fleet.getShip(3);
             x = 5;
             y = 3;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 5 Size: 5
             s = fleet.getShip(4);
             x = 9;
             y = 0;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
           
             
        }
        //layout 5,
        if(layout == 5){
            //ship 1 Size: 2
             Ship s = fleet.getShip(0);
             int x = 1;
             int y = 0;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 2 Size: 3
             s = fleet.getShip(1);
             x = 1;
             y = 9;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 3 Size: 3
             s = fleet.getShip(2);
             x = 7;
             y = 1;
             vertical = false;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 4 Size: 4
             s = fleet.getShip(3);
             x = 2;
             y = 5;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
             
            //ship 5 Size: 5
             s = fleet.getShip(4);
             x = 8;
             y = 4;
             vertical = true;
             pos = new Position(x, y);
             board.placeShip(pos, s, vertical);
           
             
        }
        
        
        
//        for(int i = 0; i < fleet.getNumberOfShips(); ++i)
//        {
//            Ship s = fleet.getShip(i);
//            boolean vertical = rnd.nextBoolean();
//            Position pos;
//            if(vertical)
//            {
//                int x = rnd.nextInt(sizeX);
//                int y = rnd.nextInt(sizeY-(s.size()-1));
//                pos = new Position(x, y);
//            }
//            else
//            {
//                int x = rnd.nextInt(sizeX-(s.size()-1));
//                int y = rnd.nextInt(sizeY);
//                pos = new Position(x, y);
//            }
//            board.placeShip(pos, s, vertical);
//        }
    }
    
    
    /**
     * Called every time the enemy has fired a shot.
     * 
     * The purpose of this method is to allow the AI to react to the 
     * enemy's incoming fire and place his/her ships differently next round.
     * 
     * @param pos Position of the enemy's shot 
     */
    @Override
    public void incoming(Position pos)
    {
        
        //Do nothing
    }

    /**
     * Called by the Game application to get the Position of your shot.
     *  hitFeedBack(...) is called right after this method.
     * 
     * @param enemyShips Fleet the enemy's ships. Compare this to the Fleet 
     * supplied in the hitFeedBack(...) method to see if you have sunk any ships.
     * 
     * @return Position of you next shot.
     */
    @Override
    public Position getFireCoordinates(Fleet enemyShips)
    {
        Position shot = new Position(nextX, nextY);
        nextX += 4;
        if(nextX >= sizeX)
        {
            nextX = nextX % 10; 
            nextY++;
            if(nextY >= sizeY)
            {
                nextY = 0;
            }
        }
        lastX = nextX;
        lastY = nextY;
        return shot;
    }
    
    
    /**
     * Called right after getFireCoordinates(...) to let your AI know if you hit
     * something or not. 
     * 
     * Compare the number of ships in the enemyShips with that given in 
     * getFireCoordinates in order to see if you sunk a ship.
     * 
     * @param hit boolean is true if your last shot hit a ship. False otherwise.
     * @param enemyShips Fleet the enemy's ships.
     */
    @Override
    public void hitFeedBack(boolean hit, Fleet enemyShips)
    {
        //Do nothing
    }
    
    
    /**
     * Called in the beginning of each match to inform about the number of 
     * rounds being played.
     * @param rounds int the number of rounds i a match
     */
    @Override
    public void startMatch(int rounds, Fleet ships, int sizeX, int sizeY)
    {
        //Do nothing...
    }
    
    
    /**
     * Called at the beginning of each round.
     * @param round int the current round number.
     */
    @Override
    public void startRound(int round)
    {
        //Do nothing
    }
    
    
    /**
     * Called at the end of each round to let you know if you won or lost.
     * Compare your points with the enemy's to see who won.
     * 
     * @param round int current round number.
     * @param points your points this round: 100 - number of shot used to sink 
     * all of the enemy's ships. 
     *
     * @param enemyPoints int enemy's points this round. 
     */
    @Override
    public void endRound(int round, int points, int enemyPoints)
    {
        //Do nothing
    }

    
    /**
     * Called at the end of a match (that usually last 1000 rounds) to let you 
     * know how many losses, victories and draws you scored.
     * 
     * @param won int the number of victories in this match.
     * @param lost int the number of losses in this match.
     * @param draw int the number of draws in this match.
     */
    @Override
    public void endMatch(int won, int lost, int draw)
    {
        //Do nothing
    }
}
