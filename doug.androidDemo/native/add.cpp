/*
 * add.cpp
 *
 *  Created on: Sep 7, 2009
 *      Author: Schaefer
 */

#include <jni.h>

#define NATIVE_CALL(type, name) extern "C" JNIEXPORT type JNICALL Java_doug_androidDemo_AndroidDemo_ ## name

NATIVE_CALL(jint, add)(JNIEnv * env, jobject obj, jint x, jint y) {
	return x + y;
}
