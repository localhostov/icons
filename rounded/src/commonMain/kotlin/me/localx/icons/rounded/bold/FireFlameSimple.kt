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

public val Icons.Bold.FireFlameSimple: ImageVector
    get() {
        if (_fireFlameSimple != null) {
            return _fireFlameSimple!!
        }
        _fireFlameSimple = Builder(name = "FireFlameSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.738f, 5.105f)
                lineToRelative(-3.734f, -3.465f)
                curveToRelative(-1.076f, -1.058f, -2.498f, -1.641f, -4.004f, -1.641f)
                reflectiveCurveToRelative(-2.928f, 0.583f, -3.973f, 1.61f)
                lineToRelative(-3.809f, 3.536f)
                curveTo(-0.065f, 9.452f, -0.065f, 16.457f, 4.219f, 20.763f)
                curveToRelative(2.078f, 2.088f, 4.842f, 3.237f, 7.781f, 3.237f)
                reflectiveCurveToRelative(5.703f, -1.149f, 7.781f, -3.237f)
                curveToRelative(4.284f, -4.306f, 4.284f, -11.311f, -0.043f, -15.657f)
                close()
                moveTo(17.654f, 18.645f)
                curveToRelative(-1.511f, 1.519f, -3.519f, 2.354f, -5.654f, 2.354f)
                reflectiveCurveToRelative(-4.144f, -0.836f, -5.654f, -2.354f)
                curveToRelative(-3.124f, -3.138f, -3.124f, -8.244f, -0.043f, -11.341f)
                lineToRelative(3.797f, -3.525f)
                curveToRelative(0.511f, -0.503f, 1.187f, -0.779f, 1.9f, -0.779f)
                reflectiveCurveToRelative(1.39f, 0.276f, 1.932f, 0.81f)
                lineToRelative(3.723f, 3.454f)
                curveToRelative(3.124f, 3.138f, 3.124f, 8.244f, 0.0f, 11.382f)
                close()
                moveTo(14.828f, 12.138f)
                curveToRelative(1.562f, 1.57f, 1.562f, 4.114f, 0.0f, 5.684f)
                curveToRelative(-0.781f, 0.785f, -1.805f, 1.177f, -2.828f, 1.177f)
                curveToRelative(-1.024f, 0.0f, -2.047f, -0.392f, -2.829f, -1.177f)
                curveToRelative(-1.562f, -1.57f, -1.562f, -4.114f, 0.0f, -5.684f)
                lineToRelative(1.586f, -1.63f)
                curveToRelative(0.345f, -0.34f, 0.794f, -0.509f, 1.243f, -0.509f)
                reflectiveCurveToRelative(0.898f, 0.17f, 1.243f, 0.509f)
                lineToRelative(1.585f, 1.63f)
                close()
            }
        }
        .build()
        return _fireFlameSimple!!
    }

private var _fireFlameSimple: ImageVector? = null
