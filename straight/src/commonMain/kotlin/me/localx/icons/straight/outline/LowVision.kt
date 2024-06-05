package me.localx.icons.straight.outline

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

public val Icons.Outline.LowVision: ImageVector
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
                moveTo(7.489f, 6.046f)
                lineToRelative(1.771f, 1.771f)
                curveToRelative(1.939f, -1.27f, 4.573f, -1.054f, 6.275f, 0.648f)
                curveToRelative(1.702f, 1.702f, 1.918f, 4.336f, 0.648f, 6.275f)
                lineToRelative(2.084f, 2.084f)
                curveToRelative(2.139f, -1.693f, 3.31f, -3.904f, 3.737f, -4.836f)
                curveToRelative(-0.753f, -1.621f, -3.697f, -6.987f, -10.003f, -6.987f)
                curveToRelative(-1.621f, 0.0f, -3.133f, 0.351f, -4.512f, 1.046f)
                close()
                moveTo(14.121f, 9.879f)
                curveToRelative(-0.917f, -0.916f, -2.283f, -1.114f, -3.395f, -0.595f)
                lineToRelative(3.99f, 3.99f)
                curveToRelative(0.519f, -1.112f, 0.321f, -2.478f, -0.595f, -3.395f)
                close()
            }
        }
        .build()
        return _lowVision!!
    }

private var _lowVision: ImageVector? = null
