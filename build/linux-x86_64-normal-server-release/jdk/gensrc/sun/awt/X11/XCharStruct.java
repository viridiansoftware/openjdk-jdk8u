// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XCharStruct extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 12; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XCharStruct(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XCharStruct() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public short get_lbearing() { log.finest("");return (Native.getShort(pData+0)); }
	public void set_lbearing(short v) { log.finest(""); Native.putShort(pData+0, v); }
	public short get_rbearing() { log.finest("");return (Native.getShort(pData+2)); }
	public void set_rbearing(short v) { log.finest(""); Native.putShort(pData+2, v); }
	public short get_width() { log.finest("");return (Native.getShort(pData+4)); }
	public void set_width(short v) { log.finest(""); Native.putShort(pData+4, v); }
	public short get_ascent() { log.finest("");return (Native.getShort(pData+6)); }
	public void set_ascent(short v) { log.finest(""); Native.putShort(pData+6, v); }
	public short get_descent() { log.finest("");return (Native.getShort(pData+8)); }
	public void set_descent(short v) { log.finest(""); Native.putShort(pData+8, v); }
	public short get_attributes() { log.finest("");return (Native.getShort(pData+10)); }
	public void set_attributes(short v) { log.finest(""); Native.putShort(pData+10, v); }


	String getName() {
		return "XCharStruct"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(240);

		ret.append("lbearing = ").append( get_lbearing() ).append(", ");
		ret.append("rbearing = ").append( get_rbearing() ).append(", ");
		ret.append("width = ").append( get_width() ).append(", ");
		ret.append("ascent = ").append( get_ascent() ).append(", ");
		ret.append("descent = ").append( get_descent() ).append(", ");
		ret.append("attributes = ").append( get_attributes() ).append(", ");
		return ret.toString();
	}


}



