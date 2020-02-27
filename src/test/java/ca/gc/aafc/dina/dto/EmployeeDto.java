package ca.gc.aafc.dina.dto;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonApiResource(type = "employee")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

  @JsonApiId
  private Integer id;

  private String name;

  /** This field is generated from the name field. */
  private String nameUppercase;

  private String job;

  @JsonApiRelation
  private DepartmentDto department;

}