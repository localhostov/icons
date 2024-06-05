package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline._6: ImageVector
    get() {
        if (__6 != null) {
            return __6!!
        }
        __6 = Builder(name = "_6", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.769f, 10.514f)
                curveToRelative(-1.507f, -1.586f, -3.51f, -2.479f, -5.638f, -2.513f)
                curveToRelative(-2.152f, -0.013f, -4.202f, 0.781f, -5.742f, 2.296f)
                curveToRelative(-0.135f, 0.133f, -0.265f, 0.27f, -0.389f, 0.41f)
                verticalLineToRelative(-0.708f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(8.486f, 0.0f, 4.0f, 4.486f, 4.0f, 10.0f)
                curveToRelative(0.0f, 0.0f, -0.005f, 6.087f, 0.0f, 6.129f)
                curveToRelative(0.185f, 4.245f, 3.467f, 7.666f, 7.612f, 7.862f)
                curveToRelative(0.131f, 0.006f, 0.261f, 0.009f, 0.391f, 0.009f)
                curveToRelative(2.017f, 0.0f, 3.927f, -0.743f, 5.416f, -2.115f)
                curveToRelative(1.586f, -1.461f, 2.501f, -3.451f, 2.576f, -5.602f)
                curveToRelative(0.073f, -2.101f, -0.738f, -4.203f, -2.226f, -5.769f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.686f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return __6!!
    }

private var __6: ImageVector? = null
