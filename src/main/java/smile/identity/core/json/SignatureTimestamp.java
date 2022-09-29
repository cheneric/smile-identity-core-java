package smile.identity.core.json;

public class SignatureTimestamp {

	private String signature;
	private Long timestamp;

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "{signature: \""
			+ signature
			+ "\", timestamp: "
			+ timestamp
			+ "}";
	}
}
