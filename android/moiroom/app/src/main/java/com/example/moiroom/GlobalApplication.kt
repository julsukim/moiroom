// 네이티브 앱 키 작성을 위한 코드(성현)
package com.example.moiroom

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "73feb9815bbfa19c168a93f9873366ff")
    }
}