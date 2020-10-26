package com.myperson.model;

import java.util.HashMap;
import java.util.List;

public interface PersonDAO {
			//추가
			public void personInsert(String sqlId,Person person);
			//수정
			public void personUpdate(String sqlId,Person person);
			//삭제
			public void personDelete(String sqlId,String id);
			//전체보기
			public List<Person>personList(String sqlId,HashMap<String,String>hm);
			//상세보기
			public Person personDetail(String sqlId,String id);
}
