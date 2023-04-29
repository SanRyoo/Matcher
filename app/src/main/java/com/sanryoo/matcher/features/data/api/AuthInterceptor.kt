package com.sanryoo.matcher.features.data.api

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("Authorization", "Bearer ${ApiToken.token.value}")
            .build()
        return chain.proceed(request)
    }

}