package pl.piomin.services.employee.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Long id;
	private Long organizationId;
	private Long departmentId;
	private String name;
	private int age;
	private String position;
}
