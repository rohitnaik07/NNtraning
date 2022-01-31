package com.compare;

import java.util.Comparator;

public class StundentIdCompare implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		
		return stud1.id-stud2.id;
	}

}
