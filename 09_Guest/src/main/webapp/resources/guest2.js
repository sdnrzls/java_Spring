$(function(){
 getData(1,"","");
 });
 
 function createHtmlStr(item){
  return` <tr>
		 <td>${item.num}</td>
		 <td><a href="javascript:fview(${item.num})">${item.name}</a></td>
		 <td>${item.grade}</td>
		 <td>${item.created}</td>
		 <td><a href="javascript:fdelete(${item.num})">삭제</a></td>					
		 </tr>	
		`
	}

 function getData(pageNum,field,word){
	$.get("gList",
		{"pagaNum":pageNum,"field":field,"word":word},
		function(resp){
		var countStr="<div algin='right'>총 게시물 수 :"+resp.count+"</div>";
		$("#resultCount").html(countStr); //개수
		
		var htmlTitle ="<table><thead><tr>";
			htmlTitle+="<td>번호</td>";
			htmlTitle+="<td>이름</td>";
			htmlTitle+="<td>평가</td>";
			htmlTitle+="<td>날짜</td>";
			htmlTitle+="<td>삭제</td>";
			htmlTitle+="</tr></thead>";
			
			$("#resultArea thead").html(htmlTitle); //테이블 타이틀 
			var container = document.querySelector("#resultArea tbody");
			container.innerHTML=resp.list.map(item=>createHtmlStr(item)).join('').replace(/null/gi,"");
				
				$("#pageArea").html(resp.pageHtml);//페이징
	 }
	
	);//get
}
	//상세보기
	function fview(num){
	$.get("gView",{"num":num},function(resp){
		resp=JSON.parse(resp);
		var htmlStr="";
		htmlStr +=resp.name+"<br>";
		htmlStr +=resp.content+"<br>";
		htmlStr +=resp.grade+"<br>";
		htmlStr +=resp.created+"<br>";
		htmlStr +=resp.ipaddr+"<br>";
		$("#detailArea").html(htmlStr);
		})
	}
	
	//삭제	
	function fdelete(num){
		if(confirm("("+num+")의 게시물을 삭제할까요?")){
		$.get("gDelete",{"num":num},function(resp){
			if(resp=="success"){
				alert("삭제 성공");
				getData(1,"","");
				/*location.href="/myguest"*/
			}
		});
		}
	}
				
