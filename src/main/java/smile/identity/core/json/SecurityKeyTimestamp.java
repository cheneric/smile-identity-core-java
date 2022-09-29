package smile.identity.core.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SecurityKeyTimestamp {

	private String securityKey;
	private Long timestamp;

	@JsonProperty("sec_key")
	public String getSecurityKey() {
		return securityKey;
	}

	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "{sec_key: \""
			+ securityKey
			+ "\", timestamp: "
			+ timestamp
			+ "}";
	}
}
