class Date{
	int day;
	int month;
	int year;
	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	Date(){
		this.day=4;
		this.month=3;
		this.year=2016;
	}
	int getDay(){
		return day;
	}
	int getMonth(){
		return month;
	}
	int getYear(){
		return year;
	}
}

class Teacher{
	String name;
    boolean sex;
    Date birthday=new Date();
    int salaryID;
    String department;
    String rank;
    void setName(String name){
    	this.name=name;
    }
    String getName(){
    	return name;
    }
    void setSex(boolean sex){
    	this.sex=sex;
    }
    boolean getSex(){
    	return sex;
    }
    void setBirthday(int day,int month,int year){
    	birthday.day=day;
    	birthday.month=month;
    	birthday.year=year;
    }
    Date getBirthday(){
    	return birthday;
    }
    void setSalaryID(int salaryID){
    	this.salaryID=salaryID;
    }
    int getSalaryID(){
    	return salaryID;
    }
    void setDepartment(String department){
    	this.department=department;
    }
    String getDepartment(){
    	return department;
    }
    void setRank(String rank){
    	this.rank=rank;
    }
    String getRank(){
    	return rank;
    }
}

class computerTeacher extends Teacher{
	String computerClassRoom;
	void setComputerClassRoom(String classRoom){
		computerClassRoom=classRoom;
	}
	String getComputerClassRoom(){
		return computerClassRoom;
	}
}

class teacher_ad extends Teacher{
	String addepartment;
	void setAddepartment(String addepartment){
		this.addepartment=addepartment;
	}
	String getAddepartment(){
		return addepartment;
	}
}

class teacher_ex extends Teacher{
	String experiment;
	void setExperiment(String experiment){
		this.experiment=experiment;
	}
	String getExperiment(){
		return experiment;
	}
}

class teacher_re extends Teacher{
	String research;
	void setReseacher(String research){
		this.research=research;
	}
	String getResearch(){
		return research;
	}
}

class teacher_lib extends Teacher{
	String library;
	void setLibrary(String library){
		this.library=library;
	}
	String getLibrary(){
		return library;
	}
}

public class teacherManagement{
	public static void main(String[] args){
		Teacher teacher1=new Teacher();
		computerTeacher teacher2=new computerTeacher();
		teacher1.setName("List");
		System.out.println("This teacher's name is "+teacher1.getName());
		teacher1.setBirthday(2,4,5);
    System.out.println("This teacher's birthday is year:"+teacher1.getBirthday().year+"/month:"+teacher1.getBirthday().month+"/day:"+teacher1.getBirthday().day);
    teacher2.setName("MaGuangZhi");
    System.out.println("This teacher's name is "+teacher2.getName());
    teacher2.setComputerClassRoom("Class1");
    System.out.println("This computer teacher's classroom is "+teacher2.getComputerClassRoom());
	}
}
