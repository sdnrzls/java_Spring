package com.myperson.model;

import java.util.HashMap;
import java.util.List;

public interface PersonService {
		//추가
		public void person_insert(Person person);
		//수정
		public void person_update(Person person);
		//삭제
		public void person_delete(String id);
		//전체보기
		public List<Person>person_list(HashMap<String,String>hm);
		//상세보기
		public Person person_detail(String id);
}
