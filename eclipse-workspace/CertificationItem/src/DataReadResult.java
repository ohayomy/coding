
	import java.io.*;
	import java.io.IOException;

	public class DataReadResult {

	 String[][] stu_arr=new String[6][4];     //2���� �迭 ����
	 String name;
	 String result;
	 String lvl;
	 int kuk;
	 int eng;
	 int mat;
	 int tot;
	 int avg;
	   
	 
	 // �л��ڵ带 ������ ���� �ش��л��� �̸�, �������޴� �޼���
	 public void getScr(int i){ //�л��ڵ� (1 : �̼���, 2 : ������, 3 : ������, 4 : ȫ�浿, 5 : ����)
	  this.name=stu_arr[i][0];
	  this.kuk=Integer.parseInt(stu_arr[i][1]);
	  this.eng=Integer.parseInt(stu_arr[i][2]);
	  this.mat=Integer.parseInt(stu_arr[i][3]);
	 } //end getScr()
	 
	 
	 // ���� ���ϴ� �޼���
	 public int getTot(){
	  return this.tot=kuk+eng+mat;
	 } //end getTot()
	 
	 // ��� ���ϴ� �޼���
	 public int setAvg(){
	  return this.avg=(kuk+eng+mat)/3;
	 } //end getAvg()
	 
	 // ��� 95�� ������ Award�ִ� �޼���
	 public void getAvg(){
	  if(avg>=95){
	   result += "\n�ڡ� �����մϴ�. ������Դϴ�. �١�";
	  }
	 } //end getAvg()
	 
	 
	 // ����̾簡�� �޴� �޼���
	 public void getRes(){
	   if(this.avg>=90){
	      lvl="��";
	     }else if(this.avg>=80){
	      lvl="��";
	     }else if(this.avg>=70){
	      lvl="��";
	     }else if(this.avg>=60){
	      lvl="��";
	     }else{
	      lvl="��";
	     }
	 } //end getRes()
	 
	 // txt������ �ε��ϴ� �޼��� : ' , ' ������ ������ �迭�� ����
	 public void getTxt() throws IOException{
	  try{
	   /* File : data.txt ������ �θ���
	    * FileReader : data.txt ������ ������ �а�
	    * BufferedReader : ȿ�������� data.txt�� ������ �б� ���� (readLine)  */
	   BufferedReader br=new BufferedReader(new FileReader(new File("data.txt")));  
	   String str="";
	   
	  // data.txt�� ���� �� ���� �д´�. - ù�� 
	   str=br.readLine(); 
	  
	  // data.txt�� �ι�°�ٺ��� �������ٱ��� �д� Loop��.  
	   int i=0;
	   while(str != null){  // ������ �о����� null���� ���ö����� ��� �ݺ�
//	    System.out.println("readline��� : "+ str);
	    this.stu_arr[i]=str.split(", ");
	    for(int j=0;j<stu_arr[i].length;j++){
//	     System.out.println("\t�迭���尪 ["+ i +"]["+ j + "] : "+stu_arr[i][j]);
	    } //end for   
	   str=br.readLine();
	   i++;
	   } //end while
	   
	  }catch(FileNotFoundException e){
	   System.out.println("���ϸ��� ã�� �� �����ϴ�.");
	  }catch(NullPointerException e){
	   System.out.println("Err : "+e);
	  } //end try-catch
	 } //end getTxt()
	 
	 
	 // ������� ���ڿ� �����ϱ�
	 public void getResStr(){
	  getRes();
	  result="�̸� : "+name+ "\n���� : "+kuk + "\t���� : "+eng + "\t���� : "+mat + "\t��� : "+avg+"\t���� : "+lvl;
	 } //end getResStr()
	 
	 //���� = main!!
	 public static void main(String[] args) throws Exception {
	  DataReadResult obj=new DataReadResult();
	   
	  obj.getTxt(); //data.txt ���κ��� ���� �м�
	  
	  int i=1;  
	  while(i<6){
	   obj.getScr(i);  // �л��� ���������� �ؼ� (1 : �̼���, 2 : ������, 3 : ������, 4 : ȫ�浿, 5 : ����)
	   obj.setAvg();  // ��հ��
	   obj.getResStr(); // ���� ���� ��¹��ڿ� ó��
	   obj.getAvg();  // ��� Award
	   System.out.println(obj.result);  //���� ���ڿ� ���
	   
	   //�ش��л��� ��������� ���Ϸ� Export
	   FileWriter fw = new FileWriter(obj.name+"����.txt");
	   fw.write(obj.result);
	   fw.close();
	   
	   //i ( �л��ڵ� ) �� count�� 1 �ø� = ���� �л�
	   i++;
	  }

	  
	 } //end main

	}
