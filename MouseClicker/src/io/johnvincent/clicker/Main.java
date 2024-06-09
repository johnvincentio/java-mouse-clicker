package io.johnvincent.clicker;

import java.awt.Robot;
import java.util.Timer;

public class Main {
    public static int INITIAL_SLEEP = 3, DELAY, PERIOD;
    
    private Coords m_target = null;			// where mouse will click
    private Robot m_robot = null;
    
    public static void main(String[] args) {
    	DELAY = Integer.parseInt(args[0]);		// in seconds
    	PERIOD = Integer.parseInt(args[1]);		// in seconds
        System.out.println("Delay "+DELAY+" period "+PERIOD);
        (new Main()).doit();
    }
    
    private void doit() {
    	try {
    		m_robot = new Robot();
        }
        catch (Exception e) {
            System.out.println("Robot; Exception occured: " + e.getMessage());
        }
    	
    	if (m_robot != null) {
	    	Utils.sleep(INITIAL_SLEEP * 1000);
	    	m_target = Utils.getCurrentCoords();
	    	if (m_target != null && m_target.isValid()) {
		    	MyTimerTask timerTask = new MyTimerTask(m_robot, m_target);
		        Timer t = new Timer();
		        t.schedule(timerTask, DELAY * 1000, PERIOD * 1000);
	    	}
    	}
    }
}
