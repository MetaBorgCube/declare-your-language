package ExerciseE.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

import com.github.krukow.clj_lang.PersistentTreeMap;

import ds.generated.interpreter.Generic_A_Program;

public class runprogram_0_0 extends Strategy {

	public static runprogram_0_0 instance = new runprogram_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm program) {

		return new Generic_A_Program(null, program).exec_default(null,
				PersistentTreeMap.EMPTY, PersistentTreeMap.EMPTY, PersistentTreeMap.EMPTY)
				.toStrategoTerm(context.getFactory());
	}
}
