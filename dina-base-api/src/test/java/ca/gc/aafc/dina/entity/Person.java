package ca.gc.aafc.dina.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person implements DinaEntity {

  @Id
  @GeneratedValue
  private Long id;

  @NaturalId
  private UUID uuid;

  private String name;

  @OneToOne()
  @JoinColumn(name = "employee_id")
  private Employee employee;

}