package com.nambimobile.widgets.efab

import android.view.Gravity
import com.nambimobile.widgets.efab.LabelPosition.LEFT

/**
 * The legal positions of Labels, in relation to the view they're attached to.
 * By default, labels are positioned to the [LEFT] of the view they're attached to.
 *
 * @since 1.0.0
 * */
enum class LabelPosition(val value: Int) {
    LEFT(Gravity.START.or(Gravity.CENTER_VERTICAL)),
    CENTER(Gravity.CENTER.or(Gravity.CENTER_VERTICAL)),
    RIGHT(Gravity.END.or(Gravity.CENTER_VERTICAL))
}