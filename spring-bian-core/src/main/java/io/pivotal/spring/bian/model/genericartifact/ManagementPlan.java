package io.pivotal.spring.bian.model.genericartifact;

public class ManagementPlan extends GenericArtifact {
	private static final String GENERIC_ARTIFACT_TYPE = "ManagementPlan";

	@Override
	public String getGenericArtifactType() {
		return GENERIC_ARTIFACT_TYPE;
	}
}
