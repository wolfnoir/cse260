//everett yang 111756324

import java.io.File;
import java.util.LinkedList;

public class DirectorySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File(args[0]);
		LinkedList<File> l = new LinkedList();
		l.add(f);
		int size = 0;
		while(!l.isEmpty()) {
			File f2 = l.poll();
			if(f2.isDirectory()) {
				File[]a = f2.listFiles();
				for(File f3:a)
					l.offer(f3);
			} else {
				size += f2.length();
			}
		}
		
		System.out.println(size);

	}

}
