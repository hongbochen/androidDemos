LOCAL_PATH := $(call my-dir)

#�������ı���ģ��
include $(CLEAR_VARS)
LOCAL_MODULE    := algo
LOCAL_SRC_FILES := lib/libalgo.so
#����������������ͷ�ļ�·��
LOCAL_EXPORT_C_INCLUDES := lib/include
include $(PREBUILT_SHARED_LIBRARY)

#�Լ��ı���ģ��
include $(CLEAR_VARS)
LOCAL_MODULE    := test
LOCAL_SRC_FILES := test.cpp
LOCAL_LDLIBS    += -L$(SYSROOT)/lib -llog
LOCAL_CFLAGS    := -g
#�����������������ģ��
LOCAL_SHARED_LIBRARIES := algo
include $(BUILD_SHARED_LIBRARY)