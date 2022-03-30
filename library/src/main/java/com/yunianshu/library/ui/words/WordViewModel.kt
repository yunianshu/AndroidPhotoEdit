package com.yunianshu.library.ui.words

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import com.kunminx.architecture.ui.callback.UnPeekLiveData
import com.yunianshu.library.bean.StickerInfo
import com.yunianshu.library.view.StickerItem

/**
 * Create by WingGL
 * createTime: 2022/3/21
 */
class WordViewModel:ViewModel() {

    var list = UnPeekLiveData<List<StickerInfo>>()

    var addStickers = UnPeekLiveData<List<StickerItem>>()

    var bitmap = UnPeekLiveData<Bitmap>()
}