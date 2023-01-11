package in.triton.unidirectional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import in.triton.unidirectional.entity.Student;

import in.triton.unidirectional.request.StudentRequet;
import in.triton.unidirectional.response.ApiResponse;
import in.triton.unidirectional.response.StudentResponse;
import in.triton.unidirectional.service.impl.StudentServiceImpl;
import io.micrometer.common.lang.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

	@Autowired
	StudentServiceImpl studentService;
	
	@Autowired
	StudentRequet requet;

	

	@PostMapping("/")
	public ResponseEntity<String> saveAll(@Valid @RequestBody Student student) {
		Student studentGet = studentService.saveAll(student);
		studentService.saveAll(studentGet);
		return new ResponseEntity<String>("saved", HttpStatus.OK);
	}


	@GetMapping("/sort")
	public ResponseEntity<ApiResponse> getSort(@Nullable @RequestParam(value = "field",defaultValue = "id") String field) {
		ApiResponse apiResponses = studentService.getSort(field);
		return ResponseEntity.ok(apiResponses);
	}
	
	@GetMapping("/pagination")
	public ResponseEntity<ApiResponse> getPagination(@Nullable @RequestParam(value ="ofSet",defaultValue = "1") int ofSet,@RequestParam(value ="pageSize",defaultValue = "3") int pageSize) {
		ApiResponse apiResponses = studentService.getPagination(ofSet,pageSize);
		return ResponseEntity.ok(apiResponses);
	}
	
	@GetMapping("/paginationAll")
	public ResponseEntity<ApiResponse> getPagination
	(@Nullable @RequestParam(value="ofSet",defaultValue = "1") int ofSet,
     @Nullable @RequestParam(value="pageSize",defaultValue = "2") int pageSize,
     @Nullable@RequestParam(value="sort",defaultValue = "id")String sort) {
		
		ApiResponse apiResponses = studentService.getPaginationWithSort(ofSet,pageSize,sort);
		return ResponseEntity.ok(apiResponses);
	}
	
	
	

}
