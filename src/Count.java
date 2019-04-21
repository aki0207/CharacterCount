import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Count {

	public static void main(String[] args) {
		
		String test = "天才	";
		if (test.matches(".*天才\t.*")) {
			System.out.print("あるなぁ");
		} else {
			System.out.print("ないなぁ");
		}
//		String path = "/Users/nagami/Desktop/FileTest/";
//		String fileName = "result.txt";
//		File createFile = null;
//		String writeText = "";
//		ArrayList<Character> readCharacters = null;
//
//		try {
//
//			//ファイルがなければ作成
//			createFile = new File(path + fileName);
//			if (createFile.createNewFile()){
//				System.out.println("ファイル作成成功");
//			}else{
//				System.out.println("ファイルは既に存在してる");
//			}
//
//			//Fileクラスに読み込むファイルを指定する
//			File readFile = new File(path + "targetFile.txt");
//			//ファイルが存在するか確認する
//			if(readFile.exists()) {
//				//FileReaderクラスのオブジェクトを生成する
//				FileReader filereader = new FileReader(readFile);
//				//filereaderクラスのreadメソッドでファイルを読み込む
//				int data;
//				readCharacters = new ArrayList<Character>();
//				int i = 0;
//				while((data = filereader.read()) != -1) {
//					readCharacters.add((char) data);
//					writeText = writeText + readCharacters.get(i).toString();
//					i++;
//				}
//
//				//ファイルクローズ
//				filereader.close();
//
//			} else {
//				System.out.print("ファイルは存在しません");
//			}
//			
//			//書き込み
//			FileWriter fileWriter = new FileWriter(path + fileName);
//			PrintWriter printWriter = new PrintWriter(new BufferedWriter(fileWriter));
//
//			printWriter.print(writeText);
//			System.out.println("書き込みが完了しました");
//
//			printWriter.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}