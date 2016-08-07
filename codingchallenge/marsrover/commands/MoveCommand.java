package codingchallenge.marsrover.commands;

import codingchallenge.marsrover.MarsRover;

/**
 * Created by parvez on 7/8/16.
 */
public class MoveCommand implements CommandInterface {
    @Override
    public void execute(MarsRover rover) {
        rover.move();
    }
}
