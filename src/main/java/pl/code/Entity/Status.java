package pl.code.Entity;

public class Status {

	private Long id;
	private Boolean accepted;
	private Boolean approvedRepairCosts;
	private Boolean inRepair;
	private Boolean readyToReceive;
	private Boolean resignation;

	public Status(Long id, Boolean accepted, Boolean approvedRepairCosts, Boolean inRepair, Boolean readyToReceive, Boolean resignation) {
		this.id = id;
		this.accepted = accepted;
		this.approvedRepairCosts = approvedRepairCosts;
		this.inRepair = inRepair;
		this.readyToReceive = readyToReceive;
		this.resignation = resignation;
	}

	public Status() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public Boolean getApprovedRepairCosts() {
		return approvedRepairCosts;
	}

	public void setApprovedRepairCosts(Boolean approvedRepairCosts) {
		this.approvedRepairCosts = approvedRepairCosts;
	}

	public Boolean getInRepair() {
		return inRepair;
	}

	public void setInRepair(Boolean inRepair) {
		this.inRepair = inRepair;
	}

	public Boolean getReadyToReceive() {
		return readyToReceive;
	}

	public void setReadyToReceive(Boolean readyToReceive) {
		this.readyToReceive = readyToReceive;
	}

	public Boolean getResignation() {
		return resignation;
	}

	public void setResignation(Boolean resignation) {
		this.resignation = resignation;
	}
}
