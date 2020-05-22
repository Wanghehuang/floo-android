/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.floo.floolib;

/**
 *  消息文件附件
 **/
public class BMXFileAttachment extends BMXMessageAttachment {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BMXFileAttachment(long cPtr, boolean cMemoryOwn) {
    super(flooJNI.BMXFileAttachment_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BMXFileAttachment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        flooJNI.delete_BMXFileAttachment(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  构造函数，构建发送文件消息附件
   * @param path 文件的本地路径
   * @param displayName 文件展示名
   **/
  public BMXFileAttachment(String path, String displayName) {
    this(flooJNI.new_BMXFileAttachment__SWIG_0(path, displayName), true);
  }

  public BMXFileAttachment(String path) {
    this(flooJNI.new_BMXFileAttachment__SWIG_1(path), true);
  }

  /**
   *  构造函数，构建接收文件消息附件
   * @param url 文件服务器地址
   * @param displayName 文件展示名
   * @param fileLength 文件大小
   **/
  public BMXFileAttachment(String url, String displayName, long fileLength) {
    this(flooJNI.new_BMXFileAttachment__SWIG_2(url, displayName, fileLength), true);
  }

  /**
   *  返回文件类型
   * @return Type
   **/
  public BMXMessageAttachment.Type type() {
    return BMXMessageAttachment.Type.swigToEnum(flooJNI.BMXFileAttachment_type(swigCPtr, this));
  }

  /**
   *  克隆函数
   * @return BMXMessageAttachmentPtr
   **/
  public BMXMessageAttachment clone() {
    long cPtr = flooJNI.BMXFileAttachment_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new BMXMessageAttachment(cPtr, true);
  }

  /**
   *  本地路径
   * @return std::string
   **/
  public String path() {
    return flooJNI.BMXFileAttachment_path(swigCPtr, this);
  }

  /**
   *  显示名
   * @return std::string
   **/
  public String displayName() {
    return flooJNI.BMXFileAttachment_displayName(swigCPtr, this);
  }

  /**
   *  远程URL
   * @return std::string
   **/
  public String url() {
    return flooJNI.BMXFileAttachment_url(swigCPtr, this);
  }

  /**
   *  文件长度
   * @return std::string
   **/
  public long fileLength() {
    return flooJNI.BMXFileAttachment_fileLength(swigCPtr, this);
  }

  /**
   *  附件下载状态
   * @return DownloadStatus
   **/
  public BMXMessageAttachment.DownloadStatus downloadStatus() {
    return BMXMessageAttachment.DownloadStatus.swigToEnum(flooJNI.BMXFileAttachment_downloadStatus(swigCPtr, this));
  }

  public static BMXFileAttachment dynamic_cast(BMXMessageAttachment attachment) {
    long cPtr = flooJNI.BMXFileAttachment_dynamic_cast(BMXMessageAttachment.getCPtr(attachment), attachment);
    return (cPtr == 0) ? null : new BMXFileAttachment(cPtr, true);
  }

}