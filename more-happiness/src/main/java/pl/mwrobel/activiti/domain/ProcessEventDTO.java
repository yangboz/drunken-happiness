package pl.mwrobel.activiti.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Builder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author michalw
 */
@Data
@AllArgsConstructor
//@Builder
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProcessEventDTO {
    private String processId;    
    public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	private String activityId;
    public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	private String activityName;
    public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	private String activityType;
    public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	private String customActivityType;
	public String getCustomActivityType() {
		return customActivityType;
	}
	public void setCustomActivityType(String customActivityType) {
		this.customActivityType = customActivityType;
	}
}
