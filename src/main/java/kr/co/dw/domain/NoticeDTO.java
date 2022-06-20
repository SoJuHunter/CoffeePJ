package kr.co.dw.domain;

import java.io.Serializable;
import java.util.Objects;

public class NoticeDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Nno;
	private String userId;
	private String nTitle;
	private String nContent;
	private String nWritedate;
	private String nUpdatedate;
	private int readCnt;
	
	public NoticeDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public NoticeDTO(int nno, String userId, String nTitle, String nContent, String nWritedate, String nUpdatedate,
			int readCnt) {
		super();
		Nno = nno;
		this.userId = userId;
		this.nTitle = nTitle;
		this.nContent = nContent;
		this.nWritedate = nWritedate;
		this.nUpdatedate = nUpdatedate;
		this.readCnt = readCnt;
	}



	public int getNno() {
		return Nno;
	}

	public void setNno(int nno) {
		Nno = nno;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getnTitle() {
		return nTitle;
	}

	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}

	public String getnContent() {
		return nContent;
	}

	public void setnContent(String nContent) {
		this.nContent = nContent;
	}

	public String getnWritedate() {
		return nWritedate;
	}

	public void setnWritedate(String nWritedate) {
		this.nWritedate = nWritedate;
	}

	public String getnUpdatedate() {
		return nUpdatedate;
	}

	public void setnUpdatedate(String nUpdatedate) {
		this.nUpdatedate = nUpdatedate;
	}

	public int getReadCnt() {
		return readCnt;
	}

	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public int hashCode() {
		return Objects.hash(Nno);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoticeDTO other = (NoticeDTO) obj;
		return Nno == other.Nno;
	}



	@Override
	public String toString() {
		return "NoticeDTO [Nno=" + Nno + ", userId=" + userId + ", nTitle=" + nTitle + ", nContent=" + nContent
				+ ", nWritedate=" + nWritedate + ", nUpdatedate=" + nUpdatedate + ", readCnt=" + readCnt + "]";
	}
	
	
	
	

	
	
}
