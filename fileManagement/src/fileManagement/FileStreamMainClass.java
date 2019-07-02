package fileManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileStreamMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      FileStreamMainClass fsc = new FileStreamMainClass();
	      
      Scanner sc = new Scanner(System.in);
      System.out.print("���� �̸� �Է� : ");
      String iFileName = sc.nextLine();
      
      
      File inputFile = new File(iFileName+".txt");
      File outputFile = new File(iFileName+".txt");
      
      fileCopy(inputFile, outputFile);
      
      
//      try {
//         File file = new File("C:\\javaproject\\file\\text3.txt");
//         FileInputStream fis = new FileInputStream("C:/javaproject/file/"+file.getName());
//         FileOutputStream fos = new FileOutputStream("C:\\javaproject\\file\\dir1\\"+file.getName());
//         
//         int readint;
//         while((readint=fis.read())!=-1) {
//            fos.write(readint);
//         }
//         
//         
//      } catch (Exception e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
   }
   private static void fileCopy(File inputFile,File outputFile) {
      try {
         System.out.println(outputFile.getAbsolutePath());
//         File file = new File("C:\\javaproject\\file\\text3.txt");
         FileInputStream fis = new FileInputStream("D:\\JavaProject\\file\\"+inputFile.getName());
         FileOutputStream fos = new FileOutputStream("D:\\JavaProject\\file\\dir1\\"+outputFile.getName());
         
         int readint;
         while((readint=fis.read())!=-1) {
            fos.write(readint);
         }
//         inputFile = new File(inputFile.getAbsolutePath());
         fis.close();
         fos.close();
         fileMove(inputFile, outputFile);
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   private static void fileMove(File inputFile, File outputFile) {	
      try {
         System.out.println("���� �ѱ�� ���� ���� �����Ϸ���");
         System.out.println(inputFile.getPath());
         File txtFile = new File("D:\\JavaProject\\file\\"+inputFile.getName());
         if(txtFile.exists()) {
            System.out.println("������ ��������");
            System.gc();
            txtFile.delete();
            System.out.println("�������� ��� �߰���");
         }
         
         
         
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

		
		
	}

}
