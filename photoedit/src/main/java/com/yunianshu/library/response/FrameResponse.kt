package com.yunianshu.library.response

/**
 * Create by WingGL
 * createTime: 2022/4/5
 */
data class FrameResponse(
    var code: Int,
    var data: Data,
    var msg: String,
    var status: Boolean
)

data class Data(
    var count: Int,
    var list: List<Frame>
)

data class Frame(
    var model_id: Int = 0,
    var image: String = "",
    var src:Int = 0,
    var sort: Int = 0,
    var status: Int = 0,
    var thumbnail: String,
    var frame_name: String = "",
    var frame_id: Int = 0,
    var update_time: Int = 0,
    var create_time: Int = 0
)