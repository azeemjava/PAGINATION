package in.triton.unidirectional.service;

import in.triton.unidirectional.entity.Student;
import in.triton.unidirectional.response.ApiResponse;

public interface IStudentService {

	public ApiResponse getSort(String field);
	public Student saveAll(Student student);
	public ApiResponse getPaginationWithSort(int ofSet, int pageSize,String sort);
	public ApiResponse getPagination(int ofSet,int pageSize );

	
	
}
