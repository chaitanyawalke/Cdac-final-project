package com.app.dto;

import java.util.Objects;




/*
 * Product Entity : id, name,price,desc,inStock +
private Category productCategory;

 */

public class CategoryDtoToUpdate {
	
	@Override
	public String toString() {
		return "CategoryDto [categoryName=" + categoryName + ", description=" + description + "]";
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public CategoryDtoToUpdate() {
		super();
	}
	
	public CategoryDtoToUpdate(Long id, String categoryName, String description) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.description = description;
	}

	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String categoryName;
	private String description;
	
}
