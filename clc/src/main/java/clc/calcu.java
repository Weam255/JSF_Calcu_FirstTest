package clc;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
@ManagedBean(name="FullClc")
@ViewScoped
public class calcu {
	private int num1;
	private int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String append(String n) {
		num1=Integer.parseInt(n);
		return null;
	}
	
}
