package com.lti.compiledstrategy;

import com.lti.Exception.Security.NoPriceException;
import com.lti.Exception.Strategy.ParameterException;
import com.lti.Exception.Strategy.VariableException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.*;

import com.lti.service.bo.*;
import java.util.*;
import com.lti.type.*;
import com.lti.type.finance.*;
import com.lti.type.executor.*;
import com.lti.util.*;
import com.tictactec.ta.lib.*;
import com.lti.util.simulator.ParameterUtil;

@SuppressWarnings({ "deprecation", "unused" })
public class S&P_Diversified_Trends_Indicator_strategy428 extends SimulateStrategy{
	public S&P_Diversified_Trends_Indicator_strategy428(){
		super();
		StrategyID=428L;
		StrategyClassID=0L;
	}
	//----------------------------------------------------
	//parameters
	//----------------------------------------------------
	@SuppressWarnings("deprecation")
	public void fetchParameters()throws ParameterException{
		Map<String,String> parameters=SimulateParameters;
		//curAsset=parameters.get("curAsset");
	}
	//----------------------------------------------------
	//variables
	//----------------------------------------------------
	
	public String getVariables(){
		StringBuffer sb=new StringBuffer();
		return sb.toString();
	}
	
	public void writeObject(ObjectOutputStream stream) throws IOException{
	}
	
	public void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
	}
	
	//----------------------------------------------------
	//user defined functions
	//----------------------------------------------------	
	

	//----------------------------------------------------
	//initialize code
	//----------------------------------------------------
	@SuppressWarnings({ "deprecation", "unchecked" })
	public void init() throws Exception{
		Asset CurrentAsset;
double TotalAmount = CurrentPortfolio.getTotalAmount(CurrentDate);
CurrentPortfolio.sellAssetCollection(CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("Energy");
CurrentAsset.setClassID(getAssetClassID("COMMODITIES"));
CurrentAsset.setTargetPercentage(0.1875);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "DBE", TotalAmount *0.1875,CurrentDate);	
		
CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("Industrial metal");
CurrentAsset.setClassID(getAssetClassID("COMMODITIES"));
CurrentAsset.setTargetPercentage(0.05);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VTSMX", TotalAmount * 0.05,CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("Precious metal");
CurrentAsset.setClassID(getAssetClassID("COMMODITIES"));
CurrentAsset.setTargetPercentage(0.0525);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VISVX", TotalAmount * 0.0525,CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("Agriculture");
CurrentAsset.setClassID(getAssetClassID("COMMODITIES"));
CurrentAsset.setTargetPercentage(0.20);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VIVAX", TotalAmount * 0.20,CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("5");
CurrentAsset.setClassID(getAssetClassID("INTERNATIONAL Equity"));
CurrentAsset.setTargetPercentage(0.05);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VEIEX", TotalAmount * 0.05,CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("Euro");
CurrentAsset.setClassID(getAssetClassID("FIXED INCOME"));
CurrentAsset.setTargetPercentage(0.13);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "FXE", TotalAmount * 0.13,CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("Japanese Yen");
CurrentAsset.setClassID(getAssetClassID("FIXED INCOME"));
CurrentAsset.setTargetPercentage(0.05);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "FXY", TotalAmount * 0.12,CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("British Pound");
CurrentAsset.setClassID(getAssetClassID("FIXED INCOME"));
CurrentAsset.setTargetPercentage(0.05);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "FXB", TotalAmount * 0.05,CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("Swiss Franc");
CurrentAsset.setClassID(getAssetClassID("FIXED INCOME"));
CurrentAsset.setTargetPercentage(0.02);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "NAESX", TotalAmount * 0.02,CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("Canadian Dollar");
CurrentAsset.setClassID(getAssetClassID("FIXED INCOME"));
CurrentAsset.setTargetPercentage(0.01);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "FXC", TotalAmount * 0.01,CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("U.S treasury bond");
CurrentAsset.setClassID(getAssetClassID("FIXED INCOME"));
CurrentAsset.setTargetPercentage(0.01);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VBMFX", TotalAmount * 0.075,CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("U.S treasury note");
CurrentAsset.setClassID(getAssetClassID("FIXED INCOME"));
CurrentAsset.setTargetPercentage(0.075);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "^TNX", TotalAmount * 0.075,CurrentDate);

	}
	//----------------------------------------------------
	//re-initialize code
	//----------------------------------------------------
	@SuppressWarnings({ "deprecation", "unchecked" })
	public void reinit() throws Exception{
		
	}
	
	//----------------------------------------------------
	//action code
	//----------------------------------------------------	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public void action() throws Exception{
	
		
		
		
		
		
		if(new Boolean(true).equals(false)){
			
		}
		
		
		else{
		
			Security1.getReturn(-1, TimeUnit.MONTHLY,CurrentDate,false);;
		}
		
	}
	
	public double getVersion(){
		return version;
	}
	
}

//D:\workspace\LTISystem\WEB-INF\src\com\lti\compiledstrategy\S&P_Diversified_Trends_Indicator_strategy428.java:22:  � '{'
//public class S&P_Diversified_Trends_Indicator_strategy428 extends SimulateStrategy{
//              ^
//D:\workspace\LTISystem\WEB-INF\src\com\lti\compiledstrategy\S&P_Diversified_Trends_Indicator_strategy428.java:23:  � <�&>
//	public S&P_Diversified_Trends_Indicator_strategy428(){
//	        ^
//D:\workspace\LTISystem\WEB-INF\src\com\lti\compiledstrategy\S&P_Diversified_Trends_Indicator_strategy428.java:23: ����H ���{�
//	public S&P_Diversified_Trends_Indicator_strategy428(){
//	         ^
//3 �