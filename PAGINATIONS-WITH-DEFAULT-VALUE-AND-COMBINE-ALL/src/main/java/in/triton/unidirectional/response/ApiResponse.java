package in.triton.unidirectional.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse  {

	
	private String error;
	private Object data;
	private Object status;
	private long code;
	public String getError() {
		return error;
	}
	public ApiResponse() {
		super();
	}
	public void setError(String error) {
		this.error = error;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getStatus() {
		return status;
	}
	public void setStatus(Object status) {
		this.status = status;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public ApiResponse(String error, Object data, Object status, long code) {
		super();
		this.error = error;
		this.data = data;
		this.status = status;
		this.code = code;
	}

}
