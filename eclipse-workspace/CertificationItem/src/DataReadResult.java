
	import java.io.*;
	import java.io.IOException;

	public class DataReadResult {

	 String[][] stu_arr=new String[6][4];     //2차원 배열 정의
	 String name;
	 String result;
	 String lvl;
	 int kuk;
	 int eng;
	 int mat;
	 int tot;
	 int avg;
	   
	 
	 // 학생코드를 정의해 놓고 해당학생의 이름, 국영수받는 메서드
	 public void getScr(int i){ //학생코드 (1 : 이순신, 2 : 유관순, 3 : 강감찬, 4 : 홍길동, 5 : 장길산)
	  this.name=stu_arr[i][0];
	  this.kuk=Integer.parseInt(stu_arr[i][1]);
	  this.eng=Integer.parseInt(stu_arr[i][2]);
	  this.mat=Integer.parseInt(stu_arr[i][3]);
	 } //end getScr()
	 
	 
	 // 총점 구하는 메서드
	 public int getTot(){
	  return this.tot=kuk+eng+mat;
	 } //end getTot()
	 
	 // 평균 구하는 메서드
	 public int setAvg(){
	  return this.avg=(kuk+eng+mat)/3;
	 } //end getAvg()
	 
	 // 평균 95를 넘으면 Award주는 메서드
	 public void getAvg(){
	  if(avg>=95){
	   result += "\n★☆ 축하합니다. 우수상입니다. ☆★";
	  }
	 } //end getAvg()
	 
	 
	 // 수우미양가를 받는 메서드
	 public void getRes(){
	   if(this.avg>=90){
	      lvl="수";
	     }else if(this.avg>=80){
	      lvl="우";
	     }else if(this.avg>=70){
	      lvl="미";
	     }else if(this.avg>=60){
	      lvl="양";
	     }else{
	      lvl="가";
	     }
	 } //end getRes()
	 
	 // txt파일을 로드하는 메서드 : ' , ' 단위로 나눠서 배열로 저장
	 public void getTxt() throws IOException{
	  try{
	   /* File : data.txt 파일을 부르고
	    * FileReader : data.txt 파일의 내용을 읽고
	    * BufferedReader : 효율적으로 data.txt의 내용을 읽기 위해 (readLine)  */
	   BufferedReader br=new BufferedReader(new FileReader(new File("data.txt")));  
	   String str="";
	   
	  // data.txt의 내용 한 줄을 읽는다. - 첫줄 
	   str=br.readLine(); 
	  
	  // data.txt의 두번째줄부터 마지막줄까지 읽는 Loop문.  
	   int i=0;
	   while(str != null){  // 한줄을 읽었을때 null값이 나올때까지 계속 반복
//	    System.out.println("readline결과 : "+ str);
	    this.stu_arr[i]=str.split(", ");
	    for(int j=0;j<stu_arr[i].length;j++){
//	     System.out.println("\t배열저장값 ["+ i +"]["+ j + "] : "+stu_arr[i][j]);
	    } //end for   
	   str=br.readLine();
	   i++;
	   } //end while
	   
	  }catch(FileNotFoundException e){
	   System.out.println("파일명을 찾을 수 없습니다.");
	  }catch(NullPointerException e){
	   System.out.println("Err : "+e);
	  } //end try-catch
	 } //end getTxt()
	 
	 
	 // 최종결과 문자열 정리하기
	 public void getResStr(){
	  getRes();
	  result="이름 : "+name+ "\n국어 : "+kuk + "\t영어 : "+eng + "\t수학 : "+mat + "\t평균 : "+avg+"\t성적 : "+lvl;
	 } //end getResStr()
	 
	 //메인 = main!!
	 public static void main(String[] args) throws Exception {
	  DataReadResult obj=new DataReadResult();
	   
	  obj.getTxt(); //data.txt 으로부터 값을 분석
	  
	  int i=1;  
	  while(i<6){
	   obj.getScr(i);  // 학생의 국영수점수 해석 (1 : 이순신, 2 : 유관순, 3 : 강감찬, 4 : 홍길동, 5 : 장길산)
	   obj.setAvg();  // 평균계산
	   obj.getResStr(); // 최종 성적 출력문자열 처리
	   obj.getAvg();  // 평균 Award
	   System.out.println(obj.result);  //최종 문자열 출력
	   
	   //해당학생의 성적결과를 파일로 Export
	   FileWriter fw = new FileWriter(obj.name+"상장.txt");
	   fw.write(obj.result);
	   fw.close();
	   
	   //i ( 학생코드 ) 의 count를 1 늘림 = 다음 학생
	   i++;
	  }

	  
	 } //end main

	}
