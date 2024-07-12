package ilp037.behavioural.iterator;

import java.io.File;

public class GetFile {
	private String path;
	private File[] list;
	private int curr = 0;
	
	/**
	 * Creates an object ......
	 * @param path Directory path to read the list of Files
	 */
	public GetFile(String path) {
		this.path = path;
	}
	
	/**
	 * Return an iterator
	 * @return Returns an object that enable you to iterate in list of Files
	 */
	public Iterator<File> iterator() {
		File file = new File(path);
		list = file.listFiles();
		
		return new Iterator<File>() {
			@Override
			public boolean hasNext() {
				return curr < list.length;
			}
			@Override
			public File next() {
				return list[curr++];
			}
		};
	}
}
