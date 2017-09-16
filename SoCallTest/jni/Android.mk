LOCAL_PATH := $(call my-dir)

#第三方的编译模块
include $(CLEAR_VARS)
LOCAL_MODULE    := algo
LOCAL_SRC_FILES := lib/libalgo.so
#下面是申明第三方头文件路径
LOCAL_EXPORT_C_INCLUDES := lib/include
include $(PREBUILT_SHARED_LIBRARY)

#自己的编译模块
include $(CLEAR_VARS)
LOCAL_MODULE    := test
LOCAL_SRC_FILES := test.cpp
LOCAL_LDLIBS    += -L$(SYSROOT)/lib -llog
LOCAL_CFLAGS    := -g
#这里引入第三方编译模块
LOCAL_SHARED_LIBRARIES := algo
include $(BUILD_SHARED_LIBRARY)