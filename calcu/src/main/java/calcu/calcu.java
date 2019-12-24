package calcu;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="calcu")
public class calcu {
private int n1;
private int n2;
private int result;
public int getN1() {
	return n1;
}
public void setN1(int n1) {
	this.n1 = n1;
}
public int getN2() {
	return n2;
}
public void setN2(int n2) {
	this.n2 = n2;
}
public int getResult() {
	return result;
}
public void setResult(int result) {
	this.result = result;
}
public String add() {
	result=n1+n1;
	return null;
}
}
