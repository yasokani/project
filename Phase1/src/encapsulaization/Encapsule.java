package encapsulaization;

public class Encapsule {
private int securitycode;
private String brname;
private int brcode;
private String deptname;
private int deptcode;

public int getSecuritycode() {
	return securitycode;
}

public void setSecuritycode(int securitycode) {
	this.securitycode = securitycode;
}

public String getBrname() {
	return brname;
}

public void setBrname(String brname) {
	this.brname = brname;
}

public int getBrcode() {
	return brcode;
}

public void setBrcode(int brcode) {
	this.brcode = brcode;
}

public String getDeptname() {
	return deptname;
}

public void setDeptname(String deptname) {
	this.deptname = deptname;
}

public int getDeptcode() {
	return deptcode;
}

public void setDeptcode(int deptcode) {
	this.deptcode = deptcode;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsule en=new Encapsule();
en.setSecuritycode(231);
en.setBrcode(2362);
en.setDeptname("Computer");
en.setDeptcode(2);
System.out.println( en.getSecuritycode() + " "+ en.getBrcode()+" " + en.getDeptname()+ " " +  en.getDeptcode() );

	}

}
