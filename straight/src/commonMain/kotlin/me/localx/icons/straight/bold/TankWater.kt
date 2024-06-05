package me.localx.icons.straight.bold

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

public val Icons.Bold.TankWater: ImageVector
    get() {
        if (_tankWater != null) {
            return _tankWater!!
        }
        _tankWater = Builder(name = "TankWater", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.803f, 0.0f)
                curveToRelative(-0.098f, -0.02f, -7.461f, 0.0f, -7.461f, 0.0f)
                curveToRelative(0.0f, 0.0f, 2.506f, 2.833f, 2.632f, 3.0f)
                horizontalLineToRelative(4.526f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.525f)
                curveToRelative(0.126f, -0.167f, 2.632f, -3.0f, 2.632f, -3.0f)
                curveToRelative(0.0f, 0.0f, -7.363f, -0.02f, -7.461f, 0.0f)
                curveTo(1.411f, 0.156f, 0.0f, 1.674f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -1.826f, -1.411f, -3.344f, -3.197f, -3.5f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-5.424f)
                curveToRelative(0.614f, 0.269f, 1.288f, 0.424f, 2.0f, 0.424f)
                curveToRelative(1.363f, 0.0f, 2.597f, -0.551f, 3.5f, -1.438f)
                curveToRelative(0.903f, 0.887f, 2.137f, 1.438f, 3.5f, 1.438f)
                reflectiveCurveToRelative(2.597f, -0.551f, 3.5f, -1.438f)
                curveToRelative(0.903f, 0.887f, 2.137f, 1.438f, 3.5f, 1.438f)
                curveToRelative(0.712f, 0.0f, 1.386f, -0.154f, 2.0f, -0.424f)
                verticalLineToRelative(5.424f)
                horizontalLineTo(3.0f)
                close()
                moveTo(9.879f, 3.879f)
                lineToRelative(2.121f, -2.379f)
                lineToRelative(2.121f, 2.379f)
                curveToRelative(1.172f, 1.172f, 1.172f, 3.071f, 0.0f, 4.243f)
                curveToRelative(-0.586f, 0.586f, -1.353f, 0.879f, -2.121f, 0.879f)
                curveToRelative(-0.768f, 0.0f, -1.536f, -0.293f, -2.121f, -0.879f)
                curveToRelative(-1.172f, -1.172f, -1.172f, -3.071f, 0.0f, -4.243f)
                close()
            }
        }
        .build()
        return _tankWater!!
    }

private var _tankWater: ImageVector? = null
