package in.triton.unidirectional.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import in.triton.unidirectional.entity.Student;
import in.triton.unidirectional.repository.StudentRepository;
import in.triton.unidirectional.response.ApiResponse;

@Service
public class StudentServiceImpl  {

	@Autowired
	StudentRepository studentRepository;



	public Student saveAll(Student student) {
		if (studentRepository.existsById(student.getId())) {
			return null;
		} else {
			return studentRepository.save(student);
		}
	}

	public ApiResponse getSort(String field) {
		List<Student> page = studentRepository.findAll(Sort.by(Direction.ASC, field));
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setData(page);
		return apiResponse;
	}

	
	public ApiResponse getPagination(int ofSet, int pageSize) {
		Page<Student> page = studentRepository.findAll(PageRequest.of(ofSet, pageSize));
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setData(page);
		return apiResponse;
	}

	
	public ApiResponse getPaginationWithSort(int ofSet, int pageSize, String sort) {
		Page<Student> page = studentRepository.findAll(PageRequest.of(ofSet, pageSize).withSort(Sort.by(Direction.ASC, sort)));
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setData(page);
		return apiResponse;
	}

	

	

}
