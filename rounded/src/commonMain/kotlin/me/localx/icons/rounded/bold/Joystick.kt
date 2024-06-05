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

public val Icons.Bold.Joystick: ImageVector
    get() {
        if (_joystick != null) {
            return _joystick!!
        }
        _joystick = Builder(name = "Joystick", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.085f, -0.011f, -0.166f, -0.025f, -0.247f)
                curveToRelative(2.036f, -0.632f, 3.525f, -2.509f, 3.525f, -4.753f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.239f, -5.0f, 5.0f)
                curveToRelative(0.0f, 2.244f, 1.489f, 4.121f, 3.525f, 4.753f)
                curveToRelative(-0.013f, 0.081f, -0.025f, 0.162f, -0.025f, 0.247f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(20.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _joystick!!
    }

private var _joystick: ImageVector? = null
