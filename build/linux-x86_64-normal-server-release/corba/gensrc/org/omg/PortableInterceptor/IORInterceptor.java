package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/IORInterceptor.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/thomas/git/openjdk-jdk8u/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Tuesday, July 30, 2019 2:40:11 AM PDT
*/


/**
   * Interceptor used to establish tagged components in the profiles within 
   * an IOR.
   * <p>
   * In some cases, a portable ORB service implementation may need to add 
   * information describing the server's or object's ORB service related 
   * capabilities to object references in order to enable the ORB service 
   * implementation in the client to function properly. 
   * <p>
   * This is supported through the <code>IORInterceptor</code> and 
   * <code>IORInfo</code> interfaces. 
   *
   * @see IORInfo
   */
public interface IORInterceptor extends IORInterceptorOperations, org.omg.PortableInterceptor.Interceptor, org.omg.CORBA.portable.IDLEntity 
{
} // interface IORInterceptor
