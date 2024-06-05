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

public val Icons.Filled.BullseyePointer: ImageVector
    get() {
        if (_bullseyePointer != null) {
            return _bullseyePointer!!
        }
        _bullseyePointer = Builder(name = "BullseyePointer", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.293f, 23.707f)
                curveToRelative(0.391f, 0.391f, 1.023f, 0.391f, 1.414f, 0.0f)
                lineToRelative(1.077f, -1.077f)
                lineToRelative(1.726f, -1.726f)
                lineToRelative(2.786f, 2.786f)
                curveToRelative(0.241f, 0.243f, 0.593f, 0.343f, 0.924f, 0.27f)
                curveToRelative(0.333f, -0.074f, 0.606f, -0.313f, 0.723f, -0.635f)
                lineToRelative(3.263f, -8.969f)
                curveToRelative(0.268f, -0.738f, 0.09f, -1.541f, -0.466f, -2.097f)
                curveToRelative(-0.554f, -0.555f, -1.356f, -0.734f, -2.096f, -0.464f)
                lineTo(0.676f, 15.057f)
                curveToRelative(-0.321f, 0.116f, -0.561f, 0.39f, -0.635f, 0.723f)
                curveToRelative(-0.073f, 0.334f, 0.027f, 0.683f, 0.27f, 0.924f)
                lineToRelative(2.786f, 2.786f)
                lineToRelative(-1.726f, 1.726f)
                lineToRelative(-1.077f, 1.077f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(14.992f, 15.004f)
                curveToRelative(-0.212f, -0.511f, 0.03f, -1.096f, 0.54f, -1.308f)
                curveToRelative(3.997f, -1.64f, 2.79f, -7.707f, -1.532f, -7.696f)
                curveToRelative(-1.626f, 0.0f, -3.078f, 0.971f, -3.699f, 2.474f)
                curveToRelative(-0.211f, 0.512f, -0.797f, 0.753f, -1.306f, 0.542f)
                curveToRelative(-0.511f, -0.211f, -0.753f, -0.795f, -0.542f, -1.306f)
                curveToRelative(0.931f, -2.254f, 3.108f, -3.71f, 5.547f, -3.71f)
                curveToRelative(6.511f, 0.034f, 8.3f, 9.03f, 2.299f, 11.544f)
                curveToRelative(-0.125f, 0.052f, -0.255f, 0.076f, -0.383f, 0.076f)
                curveToRelative(-0.392f, 0.0f, -0.764f, -0.231f, -0.924f, -0.616f)
                close()
                moveTo(13.0f, 19.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(10.588f, -0.376f, 10.586f, -15.626f, 0.0f, -16.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveTo(4.0f, 4.486f, 8.486f, 0.0f, 14.0f, 0.0f)
                curveToRelative(13.248f, 0.503f, 13.245f, 19.499f, 0.0f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bullseyePointer!!
    }

private var _bullseyePointer: ImageVector? = null
