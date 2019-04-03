package pl.piomin.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import pl.piomin.services.employee.model.Employee;
import pl.piomin.services.employee.repository.EmployeeRepository;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}
	
	@Bean
	public Docket swaggerPersonApi10() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.basePackage("pl.piomin.services.employee.controller"))
					.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Employee API").description("Documentation Employee API v1.0").build());
	}

	@Bean
	public EmployeeRepository repository() {
		EmployeeRepository repository = new EmployeeRepository();
		repository.add(Employee.builder().organizationId(1L).departmentId(1L).name("John Smith").age(34).position("Analyst").build());
		repository.add(Employee.builder().organizationId(1L).departmentId(1L).name("Darren Hamilton").age(37).position("Manager").build());
		repository.add(Employee.builder().organizationId(1L).departmentId(1L).name("Tom Scott").age(26).position("Developer").build());
		repository.add(Employee.builder().organizationId(1L).departmentId(2L).name("Anna London").age(39).position("Analyst").build());		
		repository.add(Employee.builder().organizationId(2L).departmentId(2L).name("Patrick Dempsey").age(27).position("Developer").build());
		repository.add(Employee.builder().organizationId(2L).departmentId(3L).name("Kevin Price").age(38).position("Developer").build());		
		repository.add(Employee.builder().organizationId(2L).departmentId(3L).name("Ian Scott").age(34).position("Developer").build());
		repository.add(Employee.builder().organizationId(2L).departmentId(3L).name("Andrew Campton").age(30).position("Manager").build());
		repository.add(Employee.builder().organizationId(2L).departmentId(4L).name("Steve Franklin").age(25).position("Developer").build());
		repository.add(Employee.builder().organizationId(2L).departmentId(4L).name("Elisabeth Smith").age(30).position("Developer").build());
		return repository;
	}
}
