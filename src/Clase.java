
public class Clase {

	public int opSuma(Operacion op){
		return op.a + op.b;
	}
	public int opGral(Operacion op){
		return ((op.a*op.b) + (op.a / op.b) );
	}
}
