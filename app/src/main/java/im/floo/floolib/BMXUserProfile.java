/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.floo.floolib;

/**
 *  用户Profile
 **/
public class BMXUserProfile extends BMXBaseObject {
  public transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BMXUserProfile(long cPtr, boolean cMemoryOwn) {
    super(flooJNI.BMXUserProfile_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public BMXUserProfile() {
    super(flooJNI.BMXUserProfile_SWIGSmartPtrUpcast(0), true);
    swigCMemOwnDerived = false;
    swigCPtr = 0;
  }

  protected static long getCPtr(BMXUserProfile obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        flooJNI.delete_BMXUserProfile(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  添加好友时的校验问题
   **/
  static public class AuthQuestion {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected AuthQuestion(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(AuthQuestion obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          flooJNI.delete_BMXUserProfile_AuthQuestion(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public AuthQuestion() {
      this(flooJNI.new_BMXUserProfile_AuthQuestion(), true);
    }
  
    public void setMQuestion(String value) {
      flooJNI.BMXUserProfile_AuthQuestion_mQuestion_set(swigCPtr, this, value);
    }
  
    public String getMQuestion() {
      return flooJNI.BMXUserProfile_AuthQuestion_mQuestion_get(swigCPtr, this);
    }
  
    public void setMAnswer(String value) {
      flooJNI.BMXUserProfile_AuthQuestion_mAnswer_set(swigCPtr, this, value);
    }
  
    public String getMAnswer() {
      return flooJNI.BMXUserProfile_AuthQuestion_mAnswer_get(swigCPtr, this);
    }
  
  }

  /**
   *  用户消息设置
   **/
  static public class MessageSetting {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected MessageSetting(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(MessageSetting obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          flooJNI.delete_BMXUserProfile_MessageSetting(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public MessageSetting() {
      this(flooJNI.new_BMXUserProfile_MessageSetting(), true);
    }
  
    public void setMPushEnabled(boolean value) {
      flooJNI.BMXUserProfile_MessageSetting_mPushEnabled_set(swigCPtr, this, value);
    }
  
    public boolean getMPushEnabled() {
      return flooJNI.BMXUserProfile_MessageSetting_mPushEnabled_get(swigCPtr, this);
    }
  
    public void setMPushDetail(boolean value) {
      flooJNI.BMXUserProfile_MessageSetting_mPushDetail_set(swigCPtr, this, value);
    }
  
    public boolean getMPushDetail() {
      return flooJNI.BMXUserProfile_MessageSetting_mPushDetail_get(swigCPtr, this);
    }
  
    public void setMPushNickname(String value) {
      flooJNI.BMXUserProfile_MessageSetting_mPushNickname_set(swigCPtr, this, value);
    }
  
    public String getMPushNickname() {
      return flooJNI.BMXUserProfile_MessageSetting_mPushNickname_get(swigCPtr, this);
    }
  
    public void setMNotificationSound(boolean value) {
      flooJNI.BMXUserProfile_MessageSetting_mNotificationSound_set(swigCPtr, this, value);
    }
  
    public boolean getMNotificationSound() {
      return flooJNI.BMXUserProfile_MessageSetting_mNotificationSound_get(swigCPtr, this);
    }
  
    public void setMNotificationVibrate(boolean value) {
      flooJNI.BMXUserProfile_MessageSetting_mNotificationVibrate_set(swigCPtr, this, value);
    }
  
    public boolean getMNotificationVibrate() {
      return flooJNI.BMXUserProfile_MessageSetting_mNotificationVibrate_get(swigCPtr, this);
    }
  
    public void setMAutoDownloadAttachment(boolean value) {
      flooJNI.BMXUserProfile_MessageSetting_mAutoDownloadAttachment_set(swigCPtr, this, value);
    }
  
    public boolean getMAutoDownloadAttachment() {
      return flooJNI.BMXUserProfile_MessageSetting_mAutoDownloadAttachment_get(swigCPtr, this);
    }
  
  }

  /**
   *  用户ID（唯一）
   * @return int64_t
   **/
  public long userId() {
    return flooJNI.BMXUserProfile_userId(swigCPtr, this);
  }

  /**
   *  用户策略
   * @return UserCategory
   **/
  public BMXUserProfile.UserCategory category() {
    return BMXUserProfile.UserCategory.swigToEnum(flooJNI.BMXUserProfile_category(swigCPtr, this));
  }

  /**
   *  用户名（唯一）
   * @return std::string
   **/
  public String username() {
    return flooJNI.BMXUserProfile_username(swigCPtr, this);
  }

  /**
   *  用户昵称
   * @return std::string
   **/
  public String nickname() {
    return flooJNI.BMXUserProfile_nickname(swigCPtr, this);
  }

  /**
   *  用户头像
   * @return std::string
   **/
  public String avatarUrl() {
    return flooJNI.BMXUserProfile_avatarUrl(swigCPtr, this);
  }

  /**
   *  用户头像本地存储路径
   * @return std::string
   **/
  public String avatarPath() {
    return flooJNI.BMXUserProfile_avatarPath(swigCPtr, this);
  }

  /**
   *  用户头像缩略图本地存储路径
   * @return std::string
   **/
  public String avatarThumbnailPath() {
    return flooJNI.BMXUserProfile_avatarThumbnailPath(swigCPtr, this);
  }

  /**
   *  用户手机
   * @return std::string
   **/
  public String mobilePhone() {
    return flooJNI.BMXUserProfile_mobilePhone(swigCPtr, this);
  }

  /**
   *  用户邮箱
   * @return std::string
   **/
  public String email() {
    return flooJNI.BMXUserProfile_email(swigCPtr, this);
  }

  /**
   *  用户公开扩展信息，好友可见
   * @return JSON(std::string)
   **/
  public String publicInfo() {
    return flooJNI.BMXUserProfile_publicInfo(swigCPtr, this);
  }

  /**
   *  用户私有扩展信息，好友不可见
   * @return JSON(std::string)
   **/
  public String privateInfo() {
    return flooJNI.BMXUserProfile_privateInfo(swigCPtr, this);
  }

  /**
   *  加好友校验方式
   * @return AddFriendAuthMode
   **/
  public BMXUserProfile.AddFriendAuthMode addFriendAuthMode() {
    return BMXUserProfile.AddFriendAuthMode.swigToEnum(flooJNI.BMXUserProfile_addFriendAuthMode(swigCPtr, this));
  }

  /**
   *  添加好友时的验证问题
   * @return AuthQuestion
   **/
  public BMXUserProfile.AuthQuestion authQuestion() {
    return new BMXUserProfile.AuthQuestion(flooJNI.BMXUserProfile_authQuestion(swigCPtr, this), false);
  }

  /**
   *  用户消息设定
   * @return MessageSetting
   **/
  public BMXUserProfile.MessageSetting messageSetting() {
    return new BMXUserProfile.MessageSetting(flooJNI.BMXUserProfile_messageSetting(swigCPtr, this), false);
  }

  /**
   *  收到群组邀请进群时是否自动同意进群
   * @return bool
   **/
  public boolean isAutoAcceptGroupInvite() {
    return flooJNI.BMXUserProfile_isAutoAcceptGroupInvite(swigCPtr, this);
  }

  /**
   *  对方申请加好友时的验证方式
   **/
  public enum AddFriendAuthMode {
    Open,
    NeedApproval,
    AnswerQuestion,
    RejectAll;

    public final int swigValue() {
      return swigValue;
    }

    public static AddFriendAuthMode swigToEnum(int swigValue) {
      AddFriendAuthMode[] swigValues = AddFriendAuthMode.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (AddFriendAuthMode swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + AddFriendAuthMode.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private AddFriendAuthMode() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private AddFriendAuthMode(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private AddFriendAuthMode(AddFriendAuthMode swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  /**
   *  用户类型
   **/
  public enum UserCategory {
    Normal,
    Advanced;

    public final int swigValue() {
      return swigValue;
    }

    public static UserCategory swigToEnum(int swigValue) {
      UserCategory[] swigValues = UserCategory.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (UserCategory swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + UserCategory.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private UserCategory() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private UserCategory(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private UserCategory(UserCategory swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
