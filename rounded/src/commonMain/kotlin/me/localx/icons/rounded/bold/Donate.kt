package me.localx.icons.rounded.bold

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

public val Icons.Bold.Donate: ImageVector
    get() {
        if (_donate != null) {
            return _donate!!
        }
        _donate = Builder(name = "Donate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.115f, 18.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, -4.038f, 9.0f, -9.0f)
                curveToRelative(-0.453f, -11.923f, -17.549f, -11.92f, -18.0f, 0.0f)
                curveToRelative(0.0f, 4.962f, 4.037f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(10.537f, 3.175f)
                curveToRelative(0.293f, -1.483f, 2.497f, -1.561f, 2.893f, -0.103f)
                curveToRelative(0.983f, 0.191f, 1.857f, 0.794f, 2.368f, 1.678f)
                curveToRelative(0.975f, 1.703f, -1.608f, 3.196f, -2.597f, 1.502f)
                curveToRelative(-0.091f, -0.157f, -0.253f, -0.251f, -0.434f, -0.251f)
                horizontalLineToRelative(-1.181f)
                curveToRelative(-0.629f, -0.018f, -0.809f, 0.916f, -0.219f, 1.131f)
                lineToRelative(2.377f, 0.952f)
                curveToRelative(3.123f, 1.161f, 2.879f, 5.867f, -0.283f, 6.742f)
                curveToRelative(-0.294f, 1.482f, -2.497f, 1.561f, -2.893f, 0.103f)
                curveToRelative(-0.983f, -0.191f, -1.857f, -0.794f, -2.368f, -1.678f)
                curveToRelative(-0.415f, -0.717f, -0.17f, -1.635f, 0.547f, -2.05f)
                curveToRelative(0.716f, -0.414f, 1.635f, -0.169f, 2.049f, 0.548f)
                curveToRelative(0.091f, 0.157f, 0.253f, 0.251f, 0.434f, 0.251f)
                horizontalLineToRelative(1.181f)
                curveToRelative(0.629f, 0.018f, 0.809f, -0.916f, 0.219f, -1.131f)
                lineToRelative(-2.377f, -0.952f)
                curveToRelative(-3.123f, -1.161f, -2.879f, -5.867f, 0.283f, -6.742f)
                close()
                moveTo(23.999f, 19.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24.0f)
                curveToRelative(-4.053f, 0.077f, -6.065f, -5.214f, -3.001f, -7.854f)
                curveToRelative(0.617f, -0.555f, 1.564f, -0.503f, 2.118f, 0.116f)
                curveToRelative(0.553f, 0.617f, 0.5f, 1.565f, -0.116f, 2.118f)
                curveToRelative(-1.026f, 0.859f, -0.342f, 2.661f, 0.999f, 2.619f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.341f, 0.042f, 2.025f, -1.76f, 0.999f, -2.619f)
                curveToRelative(-0.617f, -0.553f, -0.669f, -1.501f, -0.116f, -2.118f)
                curveToRelative(0.553f, -0.618f, 1.501f, -0.67f, 2.118f, -0.116f)
                curveToRelative(0.953f, 0.854f, 1.499f, 2.076f, 1.499f, 3.354f)
                close()
            }
        }
        .build()
        return _donate!!
    }

private var _donate: ImageVector? = null
