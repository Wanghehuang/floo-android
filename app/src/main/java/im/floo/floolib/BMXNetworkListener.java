/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.floo.floolib;

/**
 *  网络监听者
 **/
public class BMXNetworkListener {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected BMXNetworkListener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BMXNetworkListener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        flooJNI.delete_BMXNetworkListener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    flooJNI.BMXNetworkListener_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    flooJNI.BMXNetworkListener_change_ownership(this, swigCPtr, true);
  }

  public void onNetworkChanged(BMXNetworkType type, boolean reconnect) {
    flooJNI.BMXNetworkListener_onNetworkChanged(swigCPtr, this, type.swigValue(), reconnect);
  }

  public BMXNetworkListener() {
    this(flooJNI.new_BMXNetworkListener(), true);
    flooJNI.BMXNetworkListener_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
