package installator;

import installator.stages.execution.ExecStage;

import java.util.Iterator;

public class Execution implements Iterable<ExecStage> {

	public Execution(Configuration configuration) {
	}

	@Override
	public Iterator<ExecStage> iterator() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
