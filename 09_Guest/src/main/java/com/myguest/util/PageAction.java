package com.myguest.util;

import org.springframework.stereotype.Component;

@Component
public class PageAction {
	public String paging(int count,int pageSize,int currentPage,String field, String word) {
		
//		String file="javascript:getData(";
//		int pageCount = count/pageSize+(count%pageSize==0?0:1);
//		int pageBlock = 3;
//		int startPage = ((currentPage-1)/pageBlock)*pageBlock+1;
//		int endPage= startPage+pageBlock;
//		if(endPage>pageCount)endPage=pageCount;
//		StringBuilder sb = new StringBuilder();
//		if(count>0) {
//			//����
//			if(startPage > pageBlock) {//getData(1,'name','ȫ�浿');
//				sb.append("<a href=");
//				sb.append(file);
//				sb.append((startPage-pageBlock));
//				sb.append(","+field);
//				sb.append(","+word+")");
//				sb.append(">����</a>"); 
//			}
//			//��������ȣ
//			for(int i=startPage; i<=endPage; i++) {
//				if(i==currentPage) {//���������� ��ũ����
//					sb.append("["+i+"]");
//				}else {//���� ������ �ƴ� ��ũ �ɱ�
//					sb.append("<a href=");
//					sb.append(file);
//					sb.append(i);
//					sb.append(",'"+field);
//					sb.append("','"+word+"')");
//					sb.append(">["+i+"]</a>");
//				}
//			}
//			
//			//����
//			if(endPage > pageCount) {
//				sb.append("<a href=");
//				sb.append(file);
//				sb.append((startPage+pageBlock));
//				sb.append(",'"+field);
//				sb.append("','"+word+"')");
//				sb.append(">����</a>");
//			}
//		}
		
		return null; //sb.toString();
	}

}
