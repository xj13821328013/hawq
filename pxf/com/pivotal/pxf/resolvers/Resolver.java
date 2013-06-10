package com.pivotal.pxf.resolvers;

import java.util.List;

import com.pivotal.pxf.format.OneField;
import com.pivotal.pxf.format.OneRow;
import com.pivotal.pxf.utilities.InputData;
import com.pivotal.pxf.utilities.Plugin;

/*
 * Abstract class that defines the deserializtion of one record brought from the external input data.
 * Every implementation of a deserialization method (Writable, Avro, BP, Thrift, ...)
 * must inherit this abstract class
 */
public abstract class Resolver extends Plugin
{
	public Resolver(InputData metaData)
	{
		super(metaData);
	}
	
	public abstract List<OneField> GetFields(OneRow row) throws Exception;
}
