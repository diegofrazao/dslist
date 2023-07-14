package com.example.diiegofrazao.dslist.dto;

import com.example.diiegofrazao.dslist.entities.Game;
import com.example.diiegofrazao.dslist.projections.GameMinProjection;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
	}
	
	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year= entity.getYear();
		this.shortDescription= entity.getShortDescription();
	}

	public GameMinDTO(GameMinProjection projection) {
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year= projection.getYear();
		this.shortDescription= projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
