package main.general;

import main.dashboard.controller.MainController;
import main.games.floodit.controller.FloodItController;
import main.games.numericalbond.controller.NumericalBondController;

/**
 * Class that represents the launcher of the application.
 */
public final class Launcher {

    private Launcher() {
    }

    /**
     * It launches the application.
     * @param args
     *          ignored
     */
    public static void main(final String[] args) {
        new MainController(new NumericalBondController(), new FloodItController()); //, new MinefieldController());
    }

}
