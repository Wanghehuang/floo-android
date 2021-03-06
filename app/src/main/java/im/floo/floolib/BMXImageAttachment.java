/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.floo.floolib;

/**
 *  图片消息附件
 **/
public class BMXImageAttachment extends BMXFileAttachment {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BMXImageAttachment(long cPtr, boolean cMemoryOwn) {
    super(flooJNI.BMXImageAttachment_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BMXImageAttachment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        flooJNI.delete_BMXImageAttachment(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  构造函数，构建发送图片消息附件
   * @param path 本地路径
   * @param size 图片的大小，宽度和高度
   * @param displayName 展示名
   **/
  public BMXImageAttachment(String path, BMXMessageAttachment.Size size, String displayName) {
    this(flooJNI.new_BMXImageAttachment__SWIG_0(path, BMXMessageAttachment.Size.getCPtr(size), size, displayName), true);
  }

  public BMXImageAttachment(String path, BMXMessageAttachment.Size size) {
    this(flooJNI.new_BMXImageAttachment__SWIG_1(path, BMXMessageAttachment.Size.getCPtr(size), size), true);
  }

  /**
   *  构造函数，构建接收图片消息附件
   * @param url 图片服务器地址
   * @param size 图片的大小，宽度和高度
   * @param displayName 展示名
   * @param fileLength 文件大小
   **/
  public BMXImageAttachment(String url, BMXMessageAttachment.Size size, String displayName, long fileLength) {
    this(flooJNI.new_BMXImageAttachment__SWIG_2(url, BMXMessageAttachment.Size.getCPtr(size), size, displayName, fileLength), true);
  }

  /**
   *  返回图片附件类型
   * @return Type
   **/
  public BMXMessageAttachment.Type type() {
    return BMXMessageAttachment.Type.swigToEnum(flooJNI.BMXImageAttachment_type(swigCPtr, this));
  }

  /**
   *  克隆函数
   * @return BMXMessageAttachmentPtr
   **/
  public BMXMessageAttachment clone() {
    long cPtr = flooJNI.BMXImageAttachment_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new BMXMessageAttachment(cPtr, true);
  }

  /**
   *  图片大小
   * @return Size
   **/
  public BMXMessageAttachment.Size size() {
    return new BMXMessageAttachment.Size(flooJNI.BMXImageAttachment_size(swigCPtr, this), false);
  }

  /**
   *  设置发送图片消息缩略图
   * @param path 本地路径
   **/
  public void setThumbnail(String path) {
    flooJNI.BMXImageAttachment_setThumbnail(swigCPtr, this, path);
  }

  /**
   *  缩略图本地路径
   * @return std::string
   **/
  public String thumbnailPath() {
    return flooJNI.BMXImageAttachment_thumbnailPath(swigCPtr, this);
  }

  /**
   *  缩略图下载状态
   * @return DownloadStatus
   **/
  public BMXMessageAttachment.DownloadStatus thumbnailDownloadStatus() {
    return BMXMessageAttachment.DownloadStatus.swigToEnum(flooJNI.BMXImageAttachment_thumbnailDownloadStatus(swigCPtr, this));
  }

  public static BMXImageAttachment dynamic_cast(BMXMessageAttachment attachment) {
    long cPtr = flooJNI.BMXImageAttachment_dynamic_cast(BMXMessageAttachment.getCPtr(attachment), attachment);
    return (cPtr == 0) ? null : new BMXImageAttachment(cPtr, true);
  }

}
