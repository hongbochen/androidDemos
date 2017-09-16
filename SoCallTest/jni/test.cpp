#include <jni.h>
#include "lib/include/Algo.h"

extern "C" {
JNIEXPORT jint JNICALL Java_com_bobo_utils_NativeClass_add(JNIEnv *env,
		jobject obj);
JNIEXPORT jint JNICALL Java_com_bobo_utils_NativeClass_sub(JNIEnv *env,
		jobject obj);
JNIEXPORT jint JNICALL Java_com_bobo_utils_NativeClass_mul(JNIEnv *env,
		jobject obj);
JNIEXPORT jint JNICALL Java_com_bobo_utils_NativeClass_div(JNIEnv *env,
		jobject obj);

JNIEXPORT jint JNICALL Java_com_bobo_utils_NativeClass_add(JNIEnv *env,
		jobject obj) {
	Algo ba;

	return ba.add(1, 2);
}

JNIEXPORT jint JNICALL Java_com_bobo_utils_NativeClass_sub(JNIEnv *env,
		jobject obj) {
	Algo ba;

	return ba.sub(3, 1);
}

JNIEXPORT jint JNICALL Java_com_bobo_utils_NativeClass_mul(JNIEnv *env,
		jobject obj) {
	Algo ba;

	return ba.mul(3, 2);
}

JNIEXPORT jint JNICALL Java_com_bobo_utils_NativeClass_div(JNIEnv *env,
		jobject obj) {
	Algo ba;

	return ba.div(4, 2);
}

}
