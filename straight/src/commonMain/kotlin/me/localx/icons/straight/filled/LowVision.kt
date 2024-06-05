package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.LowVision: ImageVector
    get() {
        if (_lowVision != null) {
            return _lowVision!!
        }
        _lowVision = Builder(name = "LowVision", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.876f, 7.118f)
                lineToRelative(13.189f, 13.189f)
                curveToRelative(-0.715f, 0.254f, -1.489f, 0.441f, -2.314f, 0.559f)
                lineTo(1.602f, 8.718f)
                curveToRelative(0.361f, -0.517f, 0.781f, -1.06f, 1.274f, -1.6f)
                close()
                moveTo(0.179f, 11.181f)
                curveToRelative(-0.237f, 0.521f, -0.237f, 1.118f, 0.0f, 1.64f)
                curveToRelative(0.041f, 0.091f, 0.094f, 0.199f, 0.147f, 0.308f)
                lineToRelative(6.911f, 6.911f)
                curveToRelative(1.107f, 0.476f, 2.361f, 0.8f, 3.766f, 0.908f)
                lineTo(0.529f, 10.473f)
                curveToRelative(-0.143f, 0.272f, -0.261f, 0.514f, -0.35f, 0.708f)
                close()
                moveTo(19.689f, 18.246f)
                lineToRelative(4.292f, 4.292f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.019f, 1.403f)
                lineTo(1.433f, -0.011f)
                lineToRelative(4.58f, 4.58f)
                curveToRelative(1.809f, -1.042f, 3.819f, -1.57f, 5.988f, -1.57f)
                curveToRelative(7.498f, 0.0f, 10.944f, 6.261f, 11.821f, 8.18f)
                curveToRelative(0.238f, 0.521f, 0.238f, 1.119f, 0.0f, 1.639f)
                curveToRelative(-0.478f, 1.046f, -1.77f, 3.485f, -4.134f, 5.427f)
                close()
                moveTo(8.541f, 7.097f)
                lineToRelative(1.446f, 1.446f)
                curveToRelative(1.531f, -0.891f, 3.531f, -0.682f, 4.842f, 0.628f)
                reflectiveCurveToRelative(1.52f, 3.311f, 0.628f, 4.842f)
                lineToRelative(1.446f, 1.446f)
                curveToRelative(1.653f, -2.341f, 1.433f, -5.609f, -0.66f, -7.702f)
                curveToRelative(-2.093f, -2.094f, -5.362f, -2.314f, -7.702f, -0.66f)
                close()
            }
        }
        .build()
        return _lowVision!!
    }

private var _lowVision: ImageVector? = null
