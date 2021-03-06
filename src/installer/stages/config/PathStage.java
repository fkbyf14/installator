package installer.stages.config;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Стадия предназначенная для выбора пути установки. Основная полезная
 * информация при работе с пользователем: путь до папки в виде строки.
 *
 * @author cfif11
 */
public class PathStage extends ConfigStage<String> {

	private String text;
	private String defaultPath;

	public String doInConsole(BufferedReader b) throws IOException {
		System.out.println(text);
		System.out.println("Например: " + defaultPath);

		String s = b.readLine();
		if(exitConsole(s))
			return null;
		return s;
	}

	/**
	 * Создание стадии выбора пути с панелью {@link PathPanel по умолчанию}.
	 *
	 * @param text        текст вопроса
	 * @param defaultPath путь по умолчанию
	 */
	public PathStage(String text, String defaultPath) {
		this.text = text;
		this.defaultPath = defaultPath;
		setPanel(new PathPanel(index, text, defaultPath));
	}
}
