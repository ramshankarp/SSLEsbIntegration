package com.ssl.inbound.rest.db.beans;

// Generated Feb 18, 2017 6:19:13 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IdIdnPsId generated by hbm2java
 */
@Embeddable
public class IdIdnPsId implements java.io.Serializable {

	private String idStrRt;
	private String idItmPos;
	private String idItm;

	public IdIdnPsId() {
	}

	public IdIdnPsId(String idStrRt, String idItmPos, String idItm) {
		this.idStrRt = idStrRt;
		this.idItmPos = idItmPos;
		this.idItm = idItm;
	}

	@Column(name = "ID_STR_RT", nullable = false, length = 5)
	public String getIdStrRt() {
		return this.idStrRt;
	}

	public void setIdStrRt(String idStrRt) {
		this.idStrRt = idStrRt;
	}

	@Column(name = "ID_ITM_POS", nullable = false, length = 14)
	public String getIdItmPos() {
		return this.idItmPos;
	}

	public void setIdItmPos(String idItmPos) {
		this.idItmPos = idItmPos;
	}

	@Column(name = "ID_ITM", nullable = false, length = 14)
	public String getIdItm() {
		return this.idItm;
	}

	public void setIdItm(String idItm) {
		this.idItm = idItm;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IdIdnPsId))
			return false;
		IdIdnPsId castOther = (IdIdnPsId) other;

		return ((this.getIdStrRt() == castOther.getIdStrRt()) || (this
				.getIdStrRt() != null && castOther.getIdStrRt() != null && this
				.getIdStrRt().equals(castOther.getIdStrRt())))
				&& ((this.getIdItmPos() == castOther.getIdItmPos()) || (this
						.getIdItmPos() != null
						&& castOther.getIdItmPos() != null && this
						.getIdItmPos().equals(castOther.getIdItmPos())))
				&& ((this.getIdItm() == castOther.getIdItm()) || (this
						.getIdItm() != null && castOther.getIdItm() != null && this
						.getIdItm().equals(castOther.getIdItm())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdStrRt() == null ? 0 : this.getIdStrRt().hashCode());
		result = 37 * result
				+ (getIdItmPos() == null ? 0 : this.getIdItmPos().hashCode());
		result = 37 * result
				+ (getIdItm() == null ? 0 : this.getIdItm().hashCode());
		return result;
	}

}