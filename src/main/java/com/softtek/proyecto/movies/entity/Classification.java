package com.softtek.proyecto.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classification")
public class Classification {
	
	@Id
	@Column(name = "classification_id")
	private Integer classification_id;
	
	@Column(name = "classification_name")
	private String classification_name;

	public Integer getClassification_id() {
		return classification_id;
	}

	public void setClassification_id(Integer classification_id) {
		this.classification_id = classification_id;
	}

	public String getClassification_name() {
		return classification_name;
	}

	public void setClassification_name(String classification_name) {
		this.classification_name = classification_name;
	}

	@Override
	public String toString() {
		return "Classification [classification_id=" + classification_id + ", classification_name=" + classification_name
				+ "]";
	}
	
	

}