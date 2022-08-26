
public class No {
	private int Info;
	private No Next;
	private No Pre;

	
	public No() {
		
	}
	
	public No(int info) {
		this.setInfo(info);
		this.setNext(null);
	}
	
	public No( No pre, int info, No next) {
		this.setInfo(info);
		this.setNext(next);
		this.setPre(Pre);
	}
	
	public No getPre() {
		return Pre;
	}

	public void setPre(No nula) {
		Pre = nula;
	}

	public int getInfo() {
		return Info;
	}
	
	public void setInfo(int info) {
		Info = info;
	}
	
	public No getNext() {
		return Next;
	}
	
	public void setNext(No next) {
		Next = next;
	}
}
