package io.pivotal.spring.bian.model.behaviorqualifier;

public class Workstep extends BehaviorQualifier {
	private static final String BEHAVIOR_QUALIFIER_TYPE = "Workstep";

	@Override
	public String getBehaviorQualifierType() {
		return BEHAVIOR_QUALIFIER_TYPE;
	}
}
