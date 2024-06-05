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

public val Icons.Outline.ShirtRunning: ImageVector
    get() {
        if (_shirtRunning != null) {
            return _shirtRunning!!
        }
        _shirtRunning = Builder(name = "ShirtRunning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.333f, 8.801f)
                curveToRelative(-1.396f, -0.494f, -2.333f, -1.82f, -2.333f, -3.301f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.481f, -0.938f, 2.808f, -2.333f, 3.301f)
                lineToRelative(-0.667f, 0.236f)
                verticalLineToRelative(14.963f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-14.963f)
                lineToRelative(-0.667f, -0.236f)
                close()
                moveTo(7.446f, 7.902f)
                curveToRelative(1.101f, 1.283f, 2.734f, 2.098f, 4.554f, 2.098f)
                reflectiveCurveToRelative(3.453f, -0.814f, 4.554f, -2.098f)
                curveToRelative(0.517f, 1.063f, 1.37f, 1.948f, 2.446f, 2.498f)
                verticalLineToRelative(0.087f)
                lineToRelative(-14.0f, 10.062f)
                verticalLineToRelative(-10.149f)
                curveToRelative(1.076f, -0.55f, 1.929f, -1.436f, 2.446f, -2.498f)
                close()
                moveTo(6.409f, 22.0f)
                lineToRelative(12.591f, -9.049f)
                verticalLineToRelative(9.049f)
                lineTo(6.409f, 22.0f)
                close()
            }
        }
        .build()
        return _shirtRunning!!
    }

private var _shirtRunning: ImageVector? = null
