package com.ahmed.motos.entities;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Model {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idModel;
	private String nomModel;
	private String descriptionModel;

	@OneToMany(mappedBy="model")// model and motos relie with an attribut called model
	@JsonIgnore
	private List<Moto> motos;


}
