/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package installator.stages.execution;

import java.io.File;
import java.io.IOException;

/**
 * @author Vera
 */
public class MkDirStage implements ExecStage {
	String name = null;

	public MkDirStage(String name) {
		this.name = name;
	}

	@Override
	public int run() throws IOException {
		boolean flag;
		File file = new File(name);
		flag = file.mkdirs();
		return flag ? 0 : 1;
	}
}
