package com.ssl.inbound.rest.db.beans;

// Generated Feb 18, 2017 6:19:13 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PaSprI8 generated by hbm2java
 */
@Entity
@Table(name = "PA_SPR_I8")
public class PaSprI8 implements java.io.Serializable {

	private PaSprI8Id id;
	private String nmSpr;

	public PaSprI8() {
	}

	public PaSprI8(PaSprI8Id id) {
		this.id = id;
	}

	public PaSprI8(PaSprI8Id id, String nmSpr) {
		this.id = id;
		this.nmSpr = nmSpr;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idSpr", column = @Column(name = "ID_SPR", nullable = false, length = 20)),
			@AttributeOverride(name = "lcl", column = @Column(name = "LCL", nullable = false, length = 10)) })
	public PaSprI8Id getId() {
		return this.id;
	}

	public void setId(PaSprI8Id id) {
		this.id = id;
	}

	@Column(name = "NM_SPR", length = 120)
	public String getNmSpr() {
		return this.nmSpr;
	}

	public void setNmSpr(String nmSpr) {
		this.nmSpr = nmSpr;
	}

}