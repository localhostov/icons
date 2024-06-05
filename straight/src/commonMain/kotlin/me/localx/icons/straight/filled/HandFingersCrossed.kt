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

public val Icons.Filled.HandFingersCrossed: ImageVector
    get() {
        if (_handFingersCrossed != null) {
            return _handFingersCrossed!!
        }
        _handFingersCrossed = Builder(name = "HandFingersCrossed", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(20.5f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(7.077f, 5.734f)
                lineToRelative(1.775f, -3.201f)
                lineToRelative(-0.891f, -1.612f)
                curveTo(7.613f, 0.233f, 6.82f, -0.167f, 6.086f, 0.067f)
                curveToRelative(-0.936f, 0.298f, -1.347f, 1.34f, -0.922f, 2.179f)
                lineToRelative(1.914f, 3.488f)
                close()
                moveTo(20.5f, 17.0f)
                curveToRelative(-0.743f, 0.0f, -1.433f, -0.233f, -2.0f, -0.63f)
                curveToRelative(-0.609f, 0.425f, -1.358f, 0.663f, -2.163f, 0.626f)
                curveToRelative(-1.899f, -0.087f, -3.337f, -1.774f, -3.337f, -3.675f)
                verticalLineToRelative(-3.603f)
                reflectiveCurveToRelative(-1.672f, 3.16f, -1.672f, 3.16f)
                curveToRelative(-0.552f, 1.042f, -1.238f, 2.007f, -2.04f, 2.871f)
                lineToRelative(-1.636f, 1.76f)
                lineToRelative(-1.446f, -1.382f)
                lineToRelative(2.213f, -2.213f)
                curveToRelative(0.088f, -0.088f, 0.201f, -0.24f, 0.333f, -0.441f)
                curveToRelative(0.47f, -0.843f, 0.284f, -1.954f, -0.561f, -2.584f)
                curveToRelative(-0.81f, -0.604f, -1.965f, -0.437f, -2.68f, 0.276f)
                lineToRelative(-2.718f, 2.711f)
                curveToRelative(-1.032f, 1.03f, -1.034f, 2.702f, -0.003f, 3.733f)
                lineToRelative(6.391f, 6.391f)
                horizontalLineToRelative(12.82f)
                verticalLineToRelative(-7.338f)
                curveToRelative(-0.455f, 0.217f, -0.964f, 0.338f, -1.5f, 0.338f)
                close()
                moveTo(9.385f, 9.285f)
                curveToRelative(0.41f, 0.306f, 0.746f, 0.678f, 1.004f, 1.091f)
                curveToRelative(0.002f, -0.004f, 0.007f, -0.005f, 0.009f, -0.009f)
                lineTo(14.833f, 2.245f)
                curveToRelative(0.425f, -0.838f, 0.014f, -1.881f, -0.922f, -2.179f)
                curveToRelative(-0.735f, -0.233f, -1.527f, 0.166f, -1.876f, 0.853f)
                lineToRelative(-4.255f, 7.671f)
                curveToRelative(0.582f, 0.107f, 1.129f, 0.338f, 1.606f, 0.694f)
                close()
            }
        }
        .build()
        return _handFingersCrossed!!
    }

private var _handFingersCrossed: ImageVector? = null
