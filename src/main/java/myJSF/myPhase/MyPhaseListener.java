/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
/**
 * 
 */
package myJSF.myPhase;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * @author tcleyman
 * 
 * The phaseListener is defined in faces-config.xml file
 * Just for debugging purposes added this one. 
 *
 */
public class MyPhaseListener implements PhaseListener {

	/* (non-Javadoc)
	 * @see javax.faces.event.PhaseListener#afterPhase(javax.faces.event.PhaseEvent)
	 */
	
	private static final Logger logger = Logger.getLogger(MyPhaseListener.class.getName());
	
	@Override
	public void afterPhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		logger.log(Level.INFO,"afterPhase: " + event.getPhaseId().toString());
	}

	/* (non-Javadoc)
	 * @see javax.faces.event.PhaseListener#beforePhase(javax.faces.event.PhaseEvent)
	 */
	@Override
	public void beforePhase(PhaseEvent event) {
		logger.log(Level.INFO,"beforePhase: " + event.getPhaseId().toString());

	}

	/* (non-Javadoc)
	 * @see javax.faces.event.PhaseListener#getPhaseId()
	 */
	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE; // test 
	}

}
