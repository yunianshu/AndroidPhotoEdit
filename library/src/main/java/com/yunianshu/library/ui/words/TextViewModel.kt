package com.yunianshu.library.ui.words

import androidx.lifecycle.ViewModel
import com.kunminx.architecture.ui.callback.UnPeekLiveData
import com.yunianshu.library.bean.StickerInfo

class TextViewModel : ViewModel() {

   var editType = UnPeekLiveData<Int>()

}