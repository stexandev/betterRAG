
package com.RAG.json;

import java.util.List;


public class JsonObj{
   	private List<AaData> aaData;
   	private int iTotalDisplayRecords;
   	private Number sEcho;

 	public List<AaData> getAaData(){
		return this.aaData;
	}
	public void setAaData(List<AaData> aaData){
		this.aaData = aaData;
	}
 	public int getITotalDisplayRecords(){
		return this.iTotalDisplayRecords;
	}
	public void setITotalDisplayRecords(int iTotalDisplayRecords){
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}
 	public Number getSEcho(){
		return this.sEcho;
	}
	public void setSEcho(Number sEcho){
		this.sEcho = sEcho;
	}
}
