package alquilerbicicleta.com.util;

public class Util {
	//tipo de alquiler
	public static String getTIPO_ALQULIER_HOLA ="H";
	public static String getTIPO_ALQULIER_DIA ="D";
	public static String getTIPO_ALQULIER_SEM ="S";
	
	//cantidad de bicicletas es tipo generico se puede setear hasta 3
	public static int getTOTAL_BICICLETAS_ALQUILADO =3;	
	public static boolean isFAMILY_RENTAL=true;
	
	//por horas
	public static int getCANTIDAD_HORAS =2;
	public static double getIMPORTE_POR_HORAS=5 ;
	public static double getDESCUENTO =0.30; 
	
	public static double getIMPORTE_TOTAL_POR_UNA_HORAS =10;
	public static double getIMPORTE_TOTAL_POR_DOS_HORAS =20;
	public static double getIMPORTE_TOTAL_POR_TRES_HORAS =30;
	public static double getIMPORTE_TOTAL_POR_CUATRO_HORAS =40;
	public static double getIMPORTE_TOTAL_POR_CINCO_HORAS =50;
	
	public static double getDESCUENTO_FINAL_POR_TRES_HORA=9;
	public static double getDESCUENTO_FINAL_POR_CUATRO_HORA=12;
	public static double getDESCUENTO_FINAL_POR_CINCO_HORA=15;
	
	public static double getIMPORTE_TOTAL_CON_DESCUENTO_POR_TRES_HORAS =21;
	public static double getIMPORTE_TOTAL_CON_DESCUENTO_POR_CUATRO_HORAS =28;
	public static double getIMPORTE_TOTAL_CON_DESCUENTO_POR_CINCO_HORAS =35;

	//por dias	
	
	public static int getCANTIDAD_DIAS =2;
	public static double getIMPORTE_POR_DIA =20;
	public static double getDESCUENTO_POR_DIA =0.30; 
	
	public static double getIMPORTE_TOTAL_POR_UN_BICI_POR_DIA =40;//para 1 dia
	public static double getIMPORTE_TOTAL_POR_DOS_BICI_DIA =80;//para 2 dias
	public static double getIMPORTE_TOTAL_POR_TRES_BICI_DIA =120;//para 3 dias
	public static double getIMPORTE_TOTAL_POR_CUATRO_BICI_DIA =160;//para 4 dias
	public static double getIMPORTE_TOTAL_POR_CINCO_BICI_DIA =200;//para 5 dias
	//descuento por dias
	public static double getDESCUENTO_FINAL_POR_TRES_DIA=36;//para 3 dia
	public static double getDESCUENTO_FINAL_POR_CUATRO_DIA=48;//para 4 dia
	public static double getDESCUENTO_FINAL_POR_CINCO_DIA=60;//para 5 dia

	public static double getIMPORTE_TOTAL_CON_DESCUENTO_POR_TRES_DIA =84; //para 3 dia
	public static double getIMPORTE_TOTAL_CON_DESCUENTO_POR_CUATRO_DIA =112;//para 4 dia
	public static double getIMPORTE_TOTAL_CON_DESCUENTO_POR_CINCO_DIA =140;//para 5 dia
	
 //por semana
	public static int getCANTIDAD_SEMANAS =2;
	public static double getIMPORTE_POR_SEMANAS =60;
	public static double getDESCUENTO_POR_SEMANAS =0.30; 
	
	public static double getIMPORTE_TOTAL_POR_UN_BICI_PARA_UNA_SEMANAS =120;//para 1 semana
	public static double getIMPORTE_TOTAL_POR_DOS_BICI_PARA_UNA_SEMANAS =240;//para 2 semanas
	public static double getIMPORTE_TOTAL_POR_TRES_SEMANAS =360; //para 3 semanas
	public static double getIMPORTE_TOTAL_POR_CUATRO_SEMANAS =480; //para 4 semanas
	public static double getIMPORTE_TOTAL_POR_CINCO_SEMANAS =600; //para 5 semanas

	public static double getDESCUENTO_FINAL_POR_TRES_SEMANAS=108;//para 1 semana
	public static double getDESCUENTO_FINAL_POR_CUATRO_SEMANAS=144;//para 2 semana
	public static double getDESCUENTO_FINAL_POR_CINCO_SEMANAS=180;//para 3 semana
	
	public static double getIMPORTE_TOTAL_CON_DESCUENTO_POR_TRES_SEMANAS =252;//para 1 semana
	public static double getIMPORTE_TOTAL_CON_DESCUENTO_POR_CUATRO_SEMANAS =336;//para 2 semana
	public static double getIMPORTE_TOTAL_CON_DESCUENTO_POR_CINCO_SEMANAS =420;//para 3 semana
	
	
	public static int getGetTOTAL_BICICLETAS_ALQUILADO() {
		return getTOTAL_BICICLETAS_ALQUILADO;
	}
	public static void setGetTOTAL_BICICLETAS_ALQUILADO(int getTOTAL_BICICLETAS_ALQUILADO) {
		Util.getTOTAL_BICICLETAS_ALQUILADO = getTOTAL_BICICLETAS_ALQUILADO;
	}
	
}

