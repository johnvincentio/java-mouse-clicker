package io.johnvincent.clicker;

import java.awt.Robot;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
	private Coords m_target;
	private Robot m_robot;
	
	public int m_count = 0;
	
	public MyTimerTask(Robot robot, Coords target) {
		m_robot = robot;
		m_target = target;
	}
    public void run() {
        try {
        	if (m_target == null || ! m_target.isValid()) {
        		throw new Exception("MyTimerTask::run; target "+m_target+" is invalid");
        	}
        	Coords current = Utils.getCurrentCoords();
        	
            System.out.println("Robot; Count "+(++m_count)+" Mouse Coords "+m_target);
        	m_robot.mouseMove(m_target.getX(), m_target.getY());
        	m_robot.mousePress(java.awt.event.InputEvent.BUTTON1_DOWN_MASK );
        	m_robot.mouseRelease(java.awt.event.InputEvent.BUTTON1_DOWN_MASK);
        	
        	m_robot.mouseMove(current.getX(), current.getY());

        }
        catch (Exception e) {
            System.out.println("Exception occured :" + e.getMessage());
        }
    }
}
