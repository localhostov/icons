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

public val Icons.Outline.UserKey: ImageVector
    get() {
        if (_userKey != null) {
            return _userKey!!
        }
        _userKey = Builder(name = "UserKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(9.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(20.268f, 12.732f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.586f, 0.586f, -1.536f, 0.586f, -2.121f, 0.0f)
                reflectiveCurveToRelative(-0.586f, -1.536f, 0.0f, -2.121f)
                reflectiveCurveToRelative(1.536f, -0.586f, 2.121f, 0.0f)
                close()
                moveTo(22.389f, 10.611f)
                curveToRelative(-1.038f, -1.039f, -2.42f, -1.611f, -3.889f, -1.611f)
                reflectiveCurveToRelative(-2.851f, 0.572f, -3.889f, 1.611f)
                curveToRelative(-1.445f, 1.445f, -1.956f, 3.537f, -1.354f, 5.497f)
                verticalLineToRelative(0.393f)
                horizontalLineToRelative(-2.25f)
                lineToRelative(-0.015f, 2.0f)
                horizontalLineToRelative(-1.997f)
                lineToRelative(0.024f, 5.486f)
                horizontalLineToRelative(4.944f)
                reflectiveCurveToRelative(4.012f, -4.013f, 4.012f, -4.013f)
                curveToRelative(1.619f, 0.149f, 3.244f, -0.415f, 4.413f, -1.585f)
                curveToRelative(1.039f, -1.039f, 1.611f, -2.42f, 1.611f, -3.889f)
                reflectiveCurveToRelative(-0.572f, -2.851f, -1.611f, -3.889f)
                close()
                moveTo(20.975f, 16.975f)
                curveToRelative(-0.627f, 0.627f, -1.456f, 1.021f, -2.323f, 1.021f)
                curveToRelative(-1.036f, 0.0f, -1.357f, -0.169f, -1.357f, -0.169f)
                lineToRelative(-4.158f, 4.158f)
                horizontalLineToRelative(-2.125f)
                reflectiveCurveToRelative(-0.007f, -1.485f, -0.007f, -1.485f)
                horizontalLineToRelative(1.974f)
                lineToRelative(0.015f, -2.0f)
                horizontalLineToRelative(2.265f)
                verticalLineToRelative(-2.716f)
                curveToRelative(-0.527f, -1.457f, -0.175f, -2.816f, 0.768f, -3.759f)
                curveToRelative(1.322f, -1.322f, 3.627f, -1.322f, 4.949f, 0.0f)
                curveToRelative(0.661f, 0.661f, 1.025f, 1.541f, 1.025f, 2.475f)
                reflectiveCurveToRelative(-0.364f, 1.813f, -1.025f, 2.475f)
                close()
                moveTo(9.0f, 16.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _userKey!!
    }

private var _userKey: ImageVector? = null
