package cn.printer;

import cn.ink.Ink;
import cn.paper.Paper;

public class Printer {
	private Ink ink = null;
	private Paper paper = null;
	
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void print(String str){
		System.out.println(" ʹ�� " + ink.getColor(255, 200, 0) + " ��ɫ��ӡ��\n");
		for (int i = 0; i < str.length(); i++) {
			paper.putInChar(str.charAt(i));
		}
		System.out.println(paper.getContent());
	}
}
