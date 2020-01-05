package com.coal.data.remote.network

import com.coal.data.remote.request.DummyRequest
import com.coal.data.remote.response.DummyResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST


interface NetworkServices {


    @POST(EndPoints.DUMMY_CALL)
    fun getData(
        @Body dummyRequest: DummyRequest,
        @Header(NetworkClass.HEADER_API_KEY) apiKey: String = NetworkClass.API_KEY
    ) : Single<DummyResponse>


}