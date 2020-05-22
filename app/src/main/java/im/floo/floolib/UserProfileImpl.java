/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.floo.floolib;

public class UserProfileImpl extends BMXUserProfile {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected UserProfileImpl(long cPtr, boolean cMemoryOwn) {
    super(flooJNI.UserProfileImpl_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UserProfileImpl obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        flooJNI.delete_UserProfileImpl(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public UserProfileImpl(long uid) {
    this(flooJNI.new_UserProfileImpl(uid), true);
  }

  public long userId() {
    return flooJNI.UserProfileImpl_userId(swigCPtr, this);
  }

  public BMXUserProfile.UserCategory category() {
    return BMXUserProfile.UserCategory.swigToEnum(flooJNI.UserProfileImpl_category(swigCPtr, this));
  }

  public String username() {
    return flooJNI.UserProfileImpl_username(swigCPtr, this);
  }

  public String nickname() {
    return flooJNI.UserProfileImpl_nickname(swigCPtr, this);
  }

  public String avatarUrl() {
    return flooJNI.UserProfileImpl_avatarUrl(swigCPtr, this);
  }

  public String avatarPath() {
    return flooJNI.UserProfileImpl_avatarPath(swigCPtr, this);
  }

  public String avatarThumbnailPath() {
    return flooJNI.UserProfileImpl_avatarThumbnailPath(swigCPtr, this);
  }

  public String mobilePhone() {
    return flooJNI.UserProfileImpl_mobilePhone(swigCPtr, this);
  }

  public String email() {
    return flooJNI.UserProfileImpl_email(swigCPtr, this);
  }

  public String publicInfo() {
    return flooJNI.UserProfileImpl_publicInfo(swigCPtr, this);
  }

  public String privateInfo() {
    return flooJNI.UserProfileImpl_privateInfo(swigCPtr, this);
  }

  public BMXUserProfile.AddFriendAuthMode addFriendAuthMode() {
    return BMXUserProfile.AddFriendAuthMode.swigToEnum(flooJNI.UserProfileImpl_addFriendAuthMode(swigCPtr, this));
  }

  public BMXUserProfile.AuthQuestion authQuestion() {
    return new BMXUserProfile.AuthQuestion(flooJNI.UserProfileImpl_authQuestion(swigCPtr, this), false);
  }

  public BMXUserProfile.MessageSetting messageSetting() {
    return new BMXUserProfile.MessageSetting(flooJNI.UserProfileImpl_messageSetting(swigCPtr, this), false);
  }

  public boolean isAutoAcceptGroupInvite() {
    return flooJNI.UserProfileImpl_isAutoAcceptGroupInvite(swigCPtr, this);
  }

  public void set_userId(long value) {
    flooJNI.UserProfileImpl__userId_set(swigCPtr, this, value);
  }

  public long get_userId() {
    return flooJNI.UserProfileImpl__userId_get(swigCPtr, this);
  }

  public void set_category(BMXUserProfile.UserCategory value) {
    flooJNI.UserProfileImpl__category_set(swigCPtr, this, value.swigValue());
  }

  public BMXUserProfile.UserCategory get_category() {
    return BMXUserProfile.UserCategory.swigToEnum(flooJNI.UserProfileImpl__category_get(swigCPtr, this));
  }

  public void set_username(String value) {
    flooJNI.UserProfileImpl__username_set(swigCPtr, this, value);
  }

  public String get_username() {
    return flooJNI.UserProfileImpl__username_get(swigCPtr, this);
  }

  public void set_nickname(String value) {
    flooJNI.UserProfileImpl__nickname_set(swigCPtr, this, value);
  }

  public String get_nickname() {
    return flooJNI.UserProfileImpl__nickname_get(swigCPtr, this);
  }

  public void set_avatarUrl(String value) {
    flooJNI.UserProfileImpl__avatarUrl_set(swigCPtr, this, value);
  }

  public String get_avatarUrl() {
    return flooJNI.UserProfileImpl__avatarUrl_get(swigCPtr, this);
  }

  public void set_avatarPath(String value) {
    flooJNI.UserProfileImpl__avatarPath_set(swigCPtr, this, value);
  }

  public String get_avatarPath() {
    return flooJNI.UserProfileImpl__avatarPath_get(swigCPtr, this);
  }

  public void set_avatarThumbnailPath(String value) {
    flooJNI.UserProfileImpl__avatarThumbnailPath_set(swigCPtr, this, value);
  }

  public String get_avatarThumbnailPath() {
    return flooJNI.UserProfileImpl__avatarThumbnailPath_get(swigCPtr, this);
  }

  public void set_mobilePhone(String value) {
    flooJNI.UserProfileImpl__mobilePhone_set(swigCPtr, this, value);
  }

  public String get_mobilePhone() {
    return flooJNI.UserProfileImpl__mobilePhone_get(swigCPtr, this);
  }

  public void set_email(String value) {
    flooJNI.UserProfileImpl__email_set(swigCPtr, this, value);
  }

  public String get_email() {
    return flooJNI.UserProfileImpl__email_get(swigCPtr, this);
  }

  public void set_publicInfo(String value) {
    flooJNI.UserProfileImpl__publicInfo_set(swigCPtr, this, value);
  }

  public String get_publicInfo() {
    return flooJNI.UserProfileImpl__publicInfo_get(swigCPtr, this);
  }

  public void set_privateInfo(String value) {
    flooJNI.UserProfileImpl__privateInfo_set(swigCPtr, this, value);
  }

  public String get_privateInfo() {
    return flooJNI.UserProfileImpl__privateInfo_get(swigCPtr, this);
  }

  public void set_addFriendAuthMode(BMXUserProfile.AddFriendAuthMode value) {
    flooJNI.UserProfileImpl__addFriendAuthMode_set(swigCPtr, this, value.swigValue());
  }

  public BMXUserProfile.AddFriendAuthMode get_addFriendAuthMode() {
    return BMXUserProfile.AddFriendAuthMode.swigToEnum(flooJNI.UserProfileImpl__addFriendAuthMode_get(swigCPtr, this));
  }

  public void set_authQuestion(BMXUserProfile.AuthQuestion value) {
    flooJNI.UserProfileImpl__authQuestion_set(swigCPtr, this, BMXUserProfile.AuthQuestion.getCPtr(value), value);
  }

  public BMXUserProfile.AuthQuestion get_authQuestion() {
    long cPtr = flooJNI.UserProfileImpl__authQuestion_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BMXUserProfile.AuthQuestion(cPtr, false);
  }

  public void set_messageSetting(BMXUserProfile.MessageSetting value) {
    flooJNI.UserProfileImpl__messageSetting_set(swigCPtr, this, BMXUserProfile.MessageSetting.getCPtr(value), value);
  }

  public BMXUserProfile.MessageSetting get_messageSetting() {
    long cPtr = flooJNI.UserProfileImpl__messageSetting_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BMXUserProfile.MessageSetting(cPtr, false);
  }

  public void set_isAutoAcceptGroupInvite(boolean value) {
    flooJNI.UserProfileImpl__isAutoAcceptGroupInvite_set(swigCPtr, this, value);
  }

  public boolean get_isAutoAcceptGroupInvite() {
    return flooJNI.UserProfileImpl__isAutoAcceptGroupInvite_get(swigCPtr, this);
  }

  public void set_token(String value) {
    flooJNI.UserProfileImpl__token_set(swigCPtr, this, value);
  }

  public String get_token() {
    return flooJNI.UserProfileImpl__token_get(swigCPtr, this);
  }

  public void set_tokenExpireTime(long value) {
    flooJNI.UserProfileImpl__tokenExpireTime_set(swigCPtr, this, value);
  }

  public long get_tokenExpireTime() {
    return flooJNI.UserProfileImpl__tokenExpireTime_get(swigCPtr, this);
  }

  public void set_rosterVersion(long value) {
    flooJNI.UserProfileImpl__rosterVersion_set(swigCPtr, this, value);
  }

  public long get_rosterVersion() {
    return flooJNI.UserProfileImpl__rosterVersion_get(swigCPtr, this);
  }

  public void set_encryptPubKey(String value) {
    flooJNI.UserProfileImpl__encryptPubKey_set(swigCPtr, this, value);
  }

  public String get_encryptPubKey() {
    return flooJNI.UserProfileImpl__encryptPubKey_get(swigCPtr, this);
  }

  public void set_encryptType(int value) {
    flooJNI.UserProfileImpl__encryptType_set(swigCPtr, this, value);
  }

  public int get_encryptType() {
    return flooJNI.UserProfileImpl__encryptType_get(swigCPtr, this);
  }

  public void set_deviceGUID(String value) {
    flooJNI.UserProfileImpl__deviceGUID_set(swigCPtr, this, value);
  }

  public String get_deviceGUID() {
    return flooJNI.UserProfileImpl__deviceGUID_get(swigCPtr, this);
  }

  public void set_deviceToken(String value) {
    flooJNI.UserProfileImpl__deviceToken_set(swigCPtr, this, value);
  }

  public String get_deviceToken() {
    return flooJNI.UserProfileImpl__deviceToken_get(swigCPtr, this);
  }

  public void set_cacheBaseDir(String value) {
    flooJNI.UserProfileImpl__cacheBaseDir_set(swigCPtr, this, value);
  }

  public String get_cacheBaseDir() {
    return flooJNI.UserProfileImpl__cacheBaseDir_get(swigCPtr, this);
  }

  public void set_deviceSN(int value) {
    flooJNI.UserProfileImpl__deviceSN_set(swigCPtr, this, value);
  }

  public int get_deviceSN() {
    return flooJNI.UserProfileImpl__deviceSN_get(swigCPtr, this);
  }

}
