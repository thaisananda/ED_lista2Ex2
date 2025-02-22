package controller;

public class Controller08 {
	
	public Controller08() {
		super();
	}

	public int QuantDigitos(int n1, int digito) {
		
		/* 
		 * Condição de parada
		 * quando o número for 0, retorna 0
		 */
		
		if (n1 == 0) {
			return 0;
		
		} else {
			
			// 2. Verifica se o último dígito é igual ao procurado.
	        int ultimoDigito = n1 % 10;
	        int contagem = (ultimoDigito == digito) ? 1 : 0;
	        
	        
	        /* 3. Chamada recursiva, dividindo o número por 10.
	        
	        *O método contarDigito verifica o último dígito (n % 10). Se for igual ao dígito procurado, soma 1 e chama novamente a função com n / 10.
			
			*/
		
			return contagem + QuantDigitos(n1 / 10, digito);
			
				
			}
		}
	}
