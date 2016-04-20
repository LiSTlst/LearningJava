import java.io.*;

public class App10{
	public static void main(String[] args){
		FileInputStream fin;
		FileOutputStream fout;
		char ch;
		int data;
		try{
			fin=new FileInputStream(FileDescriptor.in);
			fout=new FileOutputStream("d:\\cgi\\myfile.txt");
			while((ch=(char)fin.read())!='#'){
				fout.write(ch);
			}
			fin.close();
			fout.close();
			System.out.println();

			fin = new FileInputStream("d:\\cgi\\myfile.txt");
			fout=new FileOutputStream(FileDescriptor.out);
			while(fin.available()>0){
				data=fin.read();
				fout.write(data);
			}
			fin.close();
			fout.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		catch(IOException e){
			System.out.println("File IO error");
		}
	}
}