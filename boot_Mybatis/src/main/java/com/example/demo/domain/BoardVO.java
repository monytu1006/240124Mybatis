package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
	//create table board(
	//bno bigint auto_increment,
	//title varchar(200) not null,
	//writer varchar(200) not null,
	//content text not null,
	//reg_at datetime default now(),
	//mod_at datetime default now(),
	//primary key(bno)
	//);

	//lombok 터짐
	
	private long bno;
	private String title;
	private String writer;
	private String content;
	private String regAt;
	private String modAt;
	
//	private int readCount;
	
	
//	public long getBno() {
//		return bno;
//	}
//	public void setBno(long bno) {
//		this.bno = bno;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getWriter() {
//		return writer;
//	}
//	public void setWriter(String writer) {
//		this.writer = writer;
//	}
//	public String getContent() {
//		return content;
//	}
//	public void setContent(String content) {
//		this.content = content;
//	}
//	public String getRegAt() {
//		return regAt;
//	}
//	public void setRegAt(String regAt) {
//		this.regAt = regAt;
//	}
//	public String getModAt() {
//		return modAt;
//	}
//	public void setModAt(String modAt) {
//		this.modAt = modAt;
//	}
//	
//	public BoardVO(long bno, String title, String writer, String content, String regAt, String modAt) {
//		this.bno = bno;
//		this.title = title;
//		this.writer = writer;
//		this.content = content;
//		this.regAt = regAt;
//		this.modAt = modAt;
//	}
//	
//	public BoardVO() {
//	}
//	@Override
//	public String toString() {
//		return "BoardVO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regAt="
//				+ regAt + ", modAt=" + modAt + "]";
//	}
	
	
}

