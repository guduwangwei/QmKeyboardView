package com.qmai.android.keyboard;

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText
import com.qmai.android.keyboardview.R

/**
 *   created by wangwei   ON 6/12/20  email:wangwei_5521@163.com
 *   @version 1.1.1
 *   @Description
 **/
class NumberKeyBoard : QmKeyboardView {


    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context)
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(context)
    }


    fun bindEditText(editText: EditText) {

    }

    private fun init(context: Context?) {
        val keyBoard = QmKeyboard(context, R.xml.numkeyboard)
        isEnabled = true
        isPreviewEnabled = false

        this.keyboard = keyBoard
        onKeyboardActionListener = object : OnKeyboardActionListener {
            override fun swipeRight() {

            }

            override fun onPress(primaryCode: Int) {

            }

            override fun onRelease(primaryCode: Int) {

            }

            override fun swipeLeft() {

            }

            override fun swipeUp() {

            }

            override fun swipeDown() {

            }

            override fun onKey(primaryCode: Int, keyCodes: IntArray?) {

            }

            override fun onText(text: CharSequence?) {

            }
        }
    }


}