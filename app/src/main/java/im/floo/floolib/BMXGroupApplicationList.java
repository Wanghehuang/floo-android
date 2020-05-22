/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.floo.floolib;

public class BMXGroupApplicationList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BMXGroupApplicationList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BMXGroupApplicationList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        flooJNI.delete_BMXGroupApplicationList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BMXGroupApplicationList() {
    this(flooJNI.new_BMXGroupApplicationList__SWIG_0(), true);
  }

  public BMXGroupApplicationList(long n) {
    this(flooJNI.new_BMXGroupApplicationList__SWIG_1(n), true);
  }

  public long size() {
    return flooJNI.BMXGroupApplicationList_size(swigCPtr, this);
  }

  public long capacity() {
    return flooJNI.BMXGroupApplicationList_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    flooJNI.BMXGroupApplicationList_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return flooJNI.BMXGroupApplicationList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    flooJNI.BMXGroupApplicationList_clear(swigCPtr, this);
  }

  public void add(BMXGroup.Application x) {
    flooJNI.BMXGroupApplicationList_add(swigCPtr, this, BMXGroup.Application.getCPtr(x));
  }

  public BMXGroup.Application get(int i) {
    long cPtr = flooJNI.BMXGroupApplicationList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new BMXGroup.Application(cPtr, true);
  }

  public void set(int i, BMXGroup.Application val) {
    flooJNI.BMXGroupApplicationList_set(swigCPtr, this, i, BMXGroup.Application.getCPtr(val));
  }

}
