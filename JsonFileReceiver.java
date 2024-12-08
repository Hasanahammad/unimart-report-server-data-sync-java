package zaberp.zab;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class JsonFileReceiver extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		InputStream inputStream = request.getInputStream();
		String filename = request.getParameter("filename");
		String filePath = "";
		filePath = "E:\\jsondata\\" + filename + "";
		FileOutputStream fileOutputStream = new FileOutputStream("" + filePath + ".json");
		byte[] buffer = new byte[4096];
		int bytesRead;
		while ((bytesRead = inputStream.read(buffer)) != -1) {
			fileOutputStream.write(buffer, 0, bytesRead);
		}
		// Close streams
		fileOutputStream.close();
		inputStream.close();
	}
}
