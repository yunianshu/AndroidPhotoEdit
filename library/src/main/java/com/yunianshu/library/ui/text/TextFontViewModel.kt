package com.yunianshu.library.ui.text

import androidx.lifecycle.ViewModel
import com.kunminx.architecture.ui.callback.UnPeekLiveData
import com.yunianshu.library.bean.FontInfo

class TextFontViewModel : ViewModel() {

    var list = UnPeekLiveData<List<FontInfo>>()

}