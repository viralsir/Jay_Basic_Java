package iopackage;
/*
	data permentally


	FMS : - FILE MANAGMENT SYSTEM
					unstructured data .
					 no name qty rate price discount tax netamount

	 sequence
	 seperator
	 deletion

	 database = structured data.

	DBMS  (sql) 

	JDK 1.3

	jdk 1.16

		STREAM :- DATA -> BYTE 


			OUTPUTSTREAM :- TO WRITE / STORE DATA INTO FILE
			INPUTSTREAM :- TO READ FROM FILE 
		
		reader
		       Writer  : write data into file
		       Reader  : read data from file


		
*/

import java.io.*;
class ByteArrayOutputStreamDemo
{
	public static void main(String args[]) throws Exception
	{
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String temp="this is firstdemo by jay";

		byte b[] = temp.getBytes();
		bout.write(b);
		System.out.println("String is : " + bout.toString());
		
		FileOutputStream fout = new FileOutputStream("first.txt");
		bout.writeTo(fout);
	}
}