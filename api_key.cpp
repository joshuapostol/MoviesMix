#include <jni.h>
JNIEXPORT jstring;
jstring
Java_com_memad_moviesmix_utils_AccessNative_getApiKey(JNIEnv *env, jobject thiz) {
    return (*env)->  NewStringUTF(env, "98a3f245a5eb8805fa7ea762d6f83597");
}
