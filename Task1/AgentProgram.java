package Task1;

import Task1.Environment.LocationState;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
		//TODO
		if(p.getLocationState().equals(LocationState.DIRTY)){
			return Environment.SUCK_DIRT;
		} else {
			if(p.getAgentLocation().equals(Environment.LOCATION_A)) {
				return Environment.MOVE_RIGHT;
			} else {
				if(p.getAgentLocation().equals(Environment.LOCATION_B)) {
					return Environment.MOVE_LEFT;
				}
			}
		}
		return NoOpAction.NO_OP;
		
	}
}