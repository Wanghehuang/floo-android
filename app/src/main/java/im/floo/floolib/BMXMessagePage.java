/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.floo.floolib;

public class BMXMessagePage extends BMXBaseObject {
  private transient long swigCPtr;

  protected BMXMessagePage(long cPtr, boolean cMemoryOwn) {
    super(flooJNI.BMXMessagePage_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BMXMessagePage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        flooJNI.delete_BMXMessagePage(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BMXMessagePage() {
    this(flooJNI.new_BMXMessagePage__SWIG_0(), true);
  }

  public BMXMessagePage(BMXMessageList result, long offset) {
    this(flooJNI.new_BMXMessagePage__SWIG_1(BMXMessageList.getCPtr(result), result, offset), true);
  }

  public BMXMessagePage(BMXMessageList result, String cursor) {
    this(flooJNI.new_BMXMessagePage__SWIG_2(BMXMessageList.getCPtr(result), result, cursor), true);
  }

  public BMXMessagePage(BMXMessagePage from) {
    this(flooJNI.new_BMXMessagePage__SWIG_3(BMXMessagePage.getCPtr(from), from), true);
  }

  public long count() {
    return flooJNI.BMXMessagePage_count(swigCPtr, this);
  }

  public long offset() {
    return flooJNI.BMXMessagePage_offset(swigCPtr, this);
  }

  public String cursor() {
    return flooJNI.BMXMessagePage_cursor(swigCPtr, this);
  }

  public BMXMessageList result() {
    return new BMXMessageList(flooJNI.BMXMessagePage_result(swigCPtr, this), false);
  }

}
