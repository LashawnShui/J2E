package cn.paper;

public class TextPaper implements Paper {
	private int charPerLine = 16;
	private int linePerPage = 5;
	private String content = "";
	private int posX = 0;
	private int posY = 0;
	private int posP = 1;

	public void setCharPerLine(int charPerLine) {
		this.charPerLine = charPerLine;
	}
	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}

	public void putInChar(char c) {
		content += c;
		++posX;
		if (posX==charPerLine) {
			content += Paper.newline;
			posX = 0;
			++posY;
		}
		if (posY==linePerPage) {
			content += "== ตฺ " + posP + " าณ ==";
			content += Paper.newline + Paper.newline;
			posY = 0;
			++posP;
		}
	}
	public String getContent() {
		String ret = this.content;
		if (!(posX==0 && posY==0)) {
			int count = linePerPage - posY;
			for (int i = 0; i < count; i++) {
				ret += Paper.newline;
			}
			ret += "==ตฺ " + posP + " าณ==";
		}
		return ret;
	}

}
