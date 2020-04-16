package cs131.pa5.CarsTunnels;

import java.util.Collection;

import cs131.pa5.Abstract.Scheduler;
import cs131.pa5.Abstract.Tunnel;
import cs131.pa5.Abstract.Vehicle;


/**
 * The preemptive priority scheduler assigns vehicles to tunnels based on their priority and supports 
 * preemption with ambulances.
 * It extends the Scheduler class.
 * @author cs131a
 *
 */
public class PreemptivePriorityScheduler extends Scheduler{

	/**
	 * Creates an instance of a preemptive priority scheduler with the given name and tunnels
	 * @param name the name of the preemptive priority scheduler
	 * @param tunnels the tunnels where the vehicles will be scheduled to
	 */
	public PreemptivePriorityScheduler(String name, Collection<Tunnel> tunnels) {
		super(name, tunnels);
	}

	@Override
	public Tunnel admit(Vehicle vehicle) {
		return null;
	}

	@Override
	public void exit(Vehicle vehicle) {
	}
	
}

