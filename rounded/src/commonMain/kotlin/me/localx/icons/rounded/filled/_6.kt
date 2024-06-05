package me.localx.icons.rounded.filled

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

public val Icons.Filled._6: ImageVector
    get() {
        if (__6 != null) {
            return __6!!
        }
        __6 = Builder(name = "_6", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.008f, 16.129f)
                curveToRelative(0.186f, 4.245f, 3.459f, 7.666f, 7.604f, 7.862f)
                curveToRelative(2.144f, 0.101f, 4.222f, -0.646f, 5.807f, -2.105f)
                curveToRelative(1.587f, -1.461f, 2.502f, -3.451f, 2.576f, -5.602f)
                curveToRelative(0.073f, -2.101f, -0.738f, -4.204f, -2.227f, -5.769f)
                curveToRelative(-1.508f, -1.586f, -3.51f, -2.479f, -5.639f, -2.513f)
                curveToRelative(-2.111f, -0.024f, -4.2f, 0.781f, -5.741f, 2.297f)
                curveToRelative(-0.135f, 0.133f, -0.265f, 0.27f, -0.389f, 0.41f)
                verticalLineToRelative(-0.708f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(8.486f, 0.0f, 4.0f, 4.486f, 4.0f, 10.0f)
                curveToRelative(0.0f, 0.0f, 0.003f, 6.087f, 0.008f, 6.129f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(3.314f, 0.0f, 6.0f, 2.686f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return __6!!
    }

private var __6: ImageVector? = null
