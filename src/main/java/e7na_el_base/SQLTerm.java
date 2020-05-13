package e7na_el_base;

public class SQLTerm {
String _strTableName;
String _strColumnName;
String _strOperator;
Comparable _objValue;
boolean indexed=false;
public SQLTerm(String _strTableName,String _strColumnName,String _strOperator,Comparable _objValue) {
	this._strTableName=_strTableName;
	this._strColumnName=_strColumnName;
	this._strOperator=_strOperator;
	this._objValue=_objValue;
	boolean indexed=false;
}
}
