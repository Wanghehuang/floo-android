/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.floo.floolib;

public class BMXError {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BMXError(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BMXError obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        flooJNI.delete_BMXError(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BMXError(BMXErrorCode errorCode) {
    this(flooJNI.new_BMXError(errorCode.swigValue()), true);
  }

  public BMXErrorCode errorCode() {
    return BMXErrorCode.swigToEnum(flooJNI.BMXError_errorCode(swigCPtr, this));
  }

  public String description() {
    return flooJNI.BMXError_description(swigCPtr, this);
  }

}
