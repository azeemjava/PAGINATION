package in.triton.unidirectional.response;

import lombok.Data;

@Data
public class AdharCardResponse {
	
	private String adharId;

	public String getAdharId() {
		return adharId;
	}

	public void setAdharId(String adharId) {
		this.adharId = adharId;
	}

}
