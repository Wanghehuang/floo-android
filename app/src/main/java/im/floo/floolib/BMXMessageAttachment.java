/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.floo.floolib;

/**
 *  消息附件
 **/
public class BMXMessageAttachment extends BMXBaseObject {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BMXMessageAttachment(long cPtr, boolean cMemoryOwn) {
    super(flooJNI.BMXMessageAttachment_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BMXMessageAttachment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        flooJNI.delete_BMXMessageAttachment(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  图片/视频大小
   **/
  static public class Size {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Size(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Size obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          flooJNI.delete_BMXMessageAttachment_Size(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public Size(double width, double height) {
      this(flooJNI.new_BMXMessageAttachment_Size__SWIG_0(width, height), true);
    }
  
    public Size(double width) {
      this(flooJNI.new_BMXMessageAttachment_Size__SWIG_1(width), true);
    }
  
    public Size() {
      this(flooJNI.new_BMXMessageAttachment_Size__SWIG_2(), true);
    }
  
    public void setMWidth(double value) {
      flooJNI.BMXMessageAttachment_Size_mWidth_set(swigCPtr, this, value);
    }
  
    public double getMWidth() {
      return flooJNI.BMXMessageAttachment_Size_mWidth_get(swigCPtr, this);
    }
  
    public void setMHeight(double value) {
      flooJNI.BMXMessageAttachment_Size_mHeight_set(swigCPtr, this, value);
    }
  
    public double getMHeight() {
      return flooJNI.BMXMessageAttachment_Size_mHeight_get(swigCPtr, this);
    }
  
  }

  /**
   *  附件类型
   * @return Type
   **/
  public BMXMessageAttachment.Type type() {
    return BMXMessageAttachment.Type.swigToEnum(flooJNI.BMXMessageAttachment_type(swigCPtr, this));
  }

  /**
   *  复制附件
   * @return BMXMessageAttachmentPtr
   **/
  public BMXMessageAttachment clone() {
    long cPtr = flooJNI.BMXMessageAttachment_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new BMXMessageAttachment(cPtr, true);
  }

  /**
   *  附件类型
   **/
  public enum Type {
    Image(1),
    Voice,
    Video,
    File,
    Location,
    Command,
    Forward;

    public final int swigValue() {
      return swigValue;
    }

    public static Type swigToEnum(int swigValue) {
      Type[] swigValues = Type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Type(Type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  /**
   *  附件下载状态
   **/
  public enum DownloadStatus {
    Downloaing,
    Successed,
    Failed,
    NotStart,
    Canceled;

    public final int swigValue() {
      return swigValue;
    }

    public static DownloadStatus swigToEnum(int swigValue) {
      DownloadStatus[] swigValues = DownloadStatus.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (DownloadStatus swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + DownloadStatus.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private DownloadStatus() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private DownloadStatus(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private DownloadStatus(DownloadStatus swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}