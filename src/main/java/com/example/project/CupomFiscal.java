package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	private static String ENDLN = System.lineSeparator();

	private static boolean isEmpty(String str){
        int spaceCount = str.length() - str.replace(".", "").length();
        return (str == null || spaceCount == str.length());
    }

	public static String dadosLoja() throws RuntimeException{
		if(NOME_LOJA.equals("")){
			throw new RuntimeException("O campo nome da loja é obrigatório");
		}

		if(LOGRADOURO.equals("")){
			throw new RuntimeException("O campo logradouro do endereço é obrigatório");
		}

		String numero1 = NUMERO + "";
		if(NUMERO == 0){
			numero1 = "s/n";
		}

		if(MUNICIPIO.equals("")){
			throw new RuntimeException("O campo município do endereço é obrigatório");
		}
		
		if(ESTADO.equals("")){
			throw new RuntimeException("O campo estado do endereço é obrigatório");
		}

		if(CNPJ.equals("")){
			throw new RuntimeException("O campo CNPJ da loja é obrigatório");
		}

		if(INSCRICAO_ESTADUAL.equals("")){
			throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
		}

		var linha2 = LOGRADOURO + ", " + numero1;
		if (! isEmpty(COMPLEMENTO)){
			linha2 += " " + COMPLEMENTO;
		}
		
		var linha3 = "";
		if (! isEmpty(BAIRRO)){
		  linha3 += BAIRRO + " - ";
		}
		linha3 += MUNICIPIO + " - " + ESTADO;
	  
		var linha4 = "";
		if (! isEmpty(CEP)){
		  linha4 = "CEP:" + CEP;
		}
		if (! isEmpty(TELEFONE)){
		  if (! isEmpty(linha4)){
			linha4 += " ";
		  }
		  linha4 += "Tel " + TELEFONE;
		}
		if (! isEmpty(linha4)){
		  linha4 += ENDLN;
		}
	  
		var linha5 = "";
		if (! isEmpty(OBSERVACAO)){
		  linha5 += OBSERVACAO;
		}
	  
		String output = NOME_LOJA + ENDLN;
		output += linha2 + ENDLN;
		output += linha3 + ENDLN;
		output += linha4;
		output += linha5 + ENDLN;
		output += "CNPJ: " + CNPJ + ENDLN;
		output += "IE: " + INSCRICAO_ESTADUAL + ENDLN;
	  
		return output;
	  }

	}

