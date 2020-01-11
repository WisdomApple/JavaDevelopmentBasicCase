package ex4_IO;
import java.io.*; 
public class Text1 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
	
		int count;
	
		try {
			fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\java基础入门\\实验\\src\\ex4_IO\\t1.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:\\Users\\admin\\eclipse-workspace\\java基础入门\\实验\\src\\ex4_IO\\t1_1.txt");
			bos = new BufferedOutputStream(fos);
		
			while ((count = bis.read()) != -1) 
				bos.write(count);
			bos.flush(); 
		}
	
		catch(FileNotFoundException e1) {
			System.out.println(e1);
		}

		catch(IOException e2) {
			System.out.println(e2);
		}
	
		finally { 
			try { 
				if (fis != null) fis.close();
				if (fos != null) fos.close(); 
				if (bis != null) bis.close(); 
				if (bos != null) bos.close(); 
			}
		
			catch(IOException e3) { 
				System.out.println(e3);
			}
		}
	}
}