/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.floo.floolib;

import android.os.Build;

/**
 *  SDK设置管理
 **/
public class BMXSDKConfig {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;
  static final private String sdkVersion = "1.0.1.20190203";
  protected BMXSDKConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BMXSDKConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        flooJNI.delete_BMXSDKConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class HostConfig {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected HostConfig(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(HostConfig obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          flooJNI.delete_BMXSDKConfig_HostConfig(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public HostConfig() {
      this(flooJNI.new_BMXSDKConfig_HostConfig__SWIG_0(), true);
    }

    /**
     *  服务设置
     * @param im IM服务器地址
     * @param port IM服务器端口
     * @param rest ratel服务器地址
     **/
    public HostConfig(String im, int port, String rest) {
      this(flooJNI.new_BMXSDKConfig_HostConfig__SWIG_1(im, port, rest), true);
    }
  
    public void setImHost(String value) {
      flooJNI.BMXSDKConfig_HostConfig_imHost_set(swigCPtr, this, value);
    }
  
    public String getImHost() {
      return flooJNI.BMXSDKConfig_HostConfig_imHost_get(swigCPtr, this);
    }
  
    public void setImPort(int value) {
      flooJNI.BMXSDKConfig_HostConfig_imPort_set(swigCPtr, this, value);
    }
  
    public int getImPort() {
      return flooJNI.BMXSDKConfig_HostConfig_imPort_get(swigCPtr, this);
    }
  
    public void setRestHost(String value) {
      flooJNI.BMXSDKConfig_HostConfig_restHost_set(swigCPtr, this, value);
    }
  
    public String getRestHost() {
      return flooJNI.BMXSDKConfig_HostConfig_restHost_get(swigCPtr, this);
    }
  
  }

  /**
   *  构造函数
   * @param type 客户端类型
   * @param vsn 客户端OS版本
   * @param dataDir 聊天数据存储路径
   * @param cacheDir 缓存数据存储路径
   * @param pushCertName Push证书名字
   * @param deliveryAck 是否发送消息送达回执
   **/
  public BMXSDKConfig(BMXClientType type, String vsn, String dataDir, String cacheDir, String pushCertName, boolean deliveryAck) {
    this(flooJNI.new_BMXSDKConfig__SWIG_0(type.swigValue(), vsn, dataDir, cacheDir, sdkVersion, pushCertName, android.os.Build.BRAND+ ";" + Build.MODEL + ";" + Build.VERSION.SDK_INT, deliveryAck), true);
  }

  public BMXSDKConfig(BMXClientType type, String vsn, String dataDir, String cacheDir, String pushCertName) {
    this(flooJNI.new_BMXSDKConfig__SWIG_1(type.swigValue(), vsn, dataDir, cacheDir, sdkVersion, pushCertName, android.os.Build.BRAND+ ";" + Build.MODEL + ";" + Build.VERSION.SDK_INT), true);
  }

  public String getDataDir() {
    return flooJNI.BMXSDKConfig_getDataDir(swigCPtr, this);
  }

  public String getCacheDir() {
    return flooJNI.BMXSDKConfig_getCacheDir(swigCPtr, this);
  }

  public BMXClientType getClientType() {
    return BMXClientType.swigToEnum(flooJNI.BMXSDKConfig_getClientType(swigCPtr, this));
  }

  public String getVsn() {
    return flooJNI.BMXSDKConfig_getVsn(swigCPtr, this);
  }

  public String getSDKVersion() {
    return flooJNI.BMXSDKConfig_getSDKVersion(swigCPtr, this);
  }

  public String getPushCertName() {
    return flooJNI.BMXSDKConfig_getPushCertName(swigCPtr, this);
  }

  public String getUserAgent() {
    return flooJNI.BMXSDKConfig_getUserAgent(swigCPtr, this);
  }

  public boolean enableDeliveryAck() {
    return flooJNI.BMXSDKConfig_enableDeliveryAck(swigCPtr, this);
  }

  public void setEnableDeliveryAck(boolean arg0) {
    flooJNI.BMXSDKConfig_setEnableDeliveryAck(swigCPtr, this, arg0);
  }

  public BMXLogLevel getLogLevel() {
    return BMXLogLevel.swigToEnum(flooJNI.BMXSDKConfig_getLogLevel(swigCPtr, this));
  }

  public void setLogLevel(BMXLogLevel arg0) {
    flooJNI.BMXSDKConfig_setLogLevel(swigCPtr, this, arg0.swigValue());
  }

  public boolean getConsoleOutput() {
    return flooJNI.BMXSDKConfig_getConsoleOutput(swigCPtr, this);
  }

  public void setConsoleOutput(boolean arg0) {
    flooJNI.BMXSDKConfig_setConsoleOutput(swigCPtr, this, arg0);
  }

  public void setHostConfig(BMXSDKConfig.HostConfig config) {
    flooJNI.BMXSDKConfig_setHostConfig(swigCPtr, this, BMXSDKConfig.HostConfig.getCPtr(config), config);
  }

  public BMXSDKConfig.HostConfig getHostConfig() {
    return new BMXSDKConfig.HostConfig(flooJNI.BMXSDKConfig_getHostConfig(swigCPtr, this), false);
  }

  public boolean getLoadAllServerConversations() {
    return flooJNI.BMXSDKConfig_getLoadAllServerConversations(swigCPtr, this);
  }

  public void setLoadAllServerConversations(boolean enable) {
    flooJNI.BMXSDKConfig_setLoadAllServerConversations__SWIG_0(swigCPtr, this, enable);
  }

  public void setLoadAllServerConversations() {
    flooJNI.BMXSDKConfig_setLoadAllServerConversations__SWIG_1(swigCPtr, this);
  }

  public String getDeviceUuid() {
    return flooJNI.BMXSDKConfig_getDeviceUuid(swigCPtr, this);
  }

  public void setDeviceUuid(String uuid) {
    flooJNI.BMXSDKConfig_setDeviceUuid(swigCPtr, this, uuid);
  }

  public boolean getVerifyCertificate() {
    return flooJNI.BMXSDKConfig_getVerifyCertificate(swigCPtr, this);
  }

  public void setVerifyCertificate(boolean verify) {
    flooJNI.BMXSDKConfig_setVerifyCertificate__SWIG_0(swigCPtr, this, verify);
  }

  public void setVerifyCertificate() {
    flooJNI.BMXSDKConfig_setVerifyCertificate__SWIG_1(swigCPtr, this);
  }

  public boolean getEnableDNS() {
    return flooJNI.BMXSDKConfig_getEnableDNS(swigCPtr, this);
  }

  public void setEnableDNS(boolean enable) {
    flooJNI.BMXSDKConfig_setEnableDNS__SWIG_0(swigCPtr, this, enable);
  }

  public void setEnableDNS() {
    flooJNI.BMXSDKConfig_setEnableDNS__SWIG_1(swigCPtr, this);
  }

  public String getUserDNSAddress() {
    return flooJNI.BMXSDKConfig_getUserDNSAddress(swigCPtr, this);
  }

  public void setUserDNSAddress(String dns) {
    flooJNI.BMXSDKConfig_setUserDNSAddress(swigCPtr, this, dns);
  }

  public String getAppID() {
    return flooJNI.BMXSDKConfig_getAppID(swigCPtr, this);
  }

  public void setAppID(String appID) {
    flooJNI.BMXSDKConfig_setAppID(swigCPtr, this, appID);
  }

  public long getDebugLogReceiverId() {
    return flooJNI.BMXSDKConfig_getDebugLogReceiverId(swigCPtr, this);
  }

  public void setDebugLogReceiverId(long uid) {
    flooJNI.BMXSDKConfig_setDebugLogReceiverId(swigCPtr, this, uid);
  }

}
