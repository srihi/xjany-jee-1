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
public class PIMCO_El-Erian_When_Markets_Collide_Portfolios604 extends SimulateStrategy{
	public PIMCO_El-Erian_When_Markets_Collide_Portfolios604(){
		super();
		StrategyID=604L;
		StrategyClassID=3L;
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
//CurrentPortfolio.sellAssetCollection(CurrentDate);

double TotalAmount = CurrentPortfolio.getTotalAmount(CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("US Equity");
//CurrentAsset.setClassID(getAssetClassID("US Equity"));
CurrentAsset.setTargetPercentage(0.3);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VTSMX", TotalAmount * 0.3,
		CurrentDate);
	
		
CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("International Equity");
//CurrentAsset.setClassID(getAssetClassID("International Equity"));
CurrentAsset.setTargetPercentage(0.15);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VGTSX", TotalAmount * 0.15,
		CurrentDate);
		
CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("REIT");
//CurrentAsset.setClassID(getAssetClassID("Real Estate"));
CurrentAsset.setTargetPercentage(0.2);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VGSIX", TotalAmount * 0.2,
		CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("EmergingMarket");
//CurrentAsset.setClassID(getAssetClassID("Emerging Market Equity"));
CurrentAsset.setTargetPercentage(0.05);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VEIEX", TotalAmount * 0.05,
		CurrentDate);


CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("TIPS");
//CurrentAsset.setClassID(getAssetClassID("Fixed Income"));
CurrentAsset.setTargetPercentage(0.15);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VIPSX", TotalAmount * 0.15,
		CurrentDate);

CurrentAsset = new Asset();
CurrentAsset.setAssetStrategyID(getStrategyID("STATIC"));
CurrentAsset.setName("LongTreasury");
//CurrentAsset.setClassID(getAssetClassID("Fixed Income"));
CurrentAsset.setTargetPercentage(0.15);
CurrentPortfolio.addAsset(CurrentAsset);
CurrentPortfolio.buy(CurrentAsset.getName(), "VUSTX", TotalAmount * 0.15,
		CurrentDate);
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
		
		 
		else if (isYearEnd(CurrentDate)) {
		   CurrentPortfolio.balance(CurrentDate);
		}
		
		
		else{
		
			;
		}
		
	}
	
	public double getVersion(){
		return version;
	}
	
}

//D:\workspace\LTISystem\WEB-INF\src\com\lti\compiledstrategy\PIMCO_El-Erian_When_Markets_Collide_Portfolios604.java:22:  � '{'
//public class PIMCO_El-Erian_When_Markets_Collide_Portfolios604 extends SimulateStrategy{
//                     ^
//D:\workspace\LTISystem\WEB-INF\src\com\lti\compiledstrategy\PIMCO_El-Erian_When_Markets_Collide_Portfolios604.java:23:  � <�&>
//	public PIMCO_El-Erian_When_Markets_Collide_Portfolios604(){
//	               ^
//D:\workspace\LTISystem\WEB-INF\src\com\lti\compiledstrategy\PIMCO_El-Erian_When_Markets_Collide_Portfolios604.java:23: ����H ���{�
//	public PIMCO_El-Erian_When_Markets_Collide_Portfolios604(){
//	                ^
//3 �