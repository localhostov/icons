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

public val Icons.Bold.PanFrying: ImageVector
    get() {
        if (_panFrying != null) {
            return _panFrying!!
        }
        _panFrying = Builder(name = "PanFrying", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.426f, 12.806f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.0f, 0.004f, 0.0f, 0.009f, 0.0f, 0.0f)
                close()
                moveTo(16.0f, 10.25f)
                curveToRelative(0.0f, 1.069f, -0.683f, 2.101f, -1.574f, 2.556f)
                curveToRelative(0.0f, -0.004f, 0.0f, -0.009f, 0.0f, 0.0f)
                curveToRelative(0.0f, 1.795f, -1.631f, 3.194f, -3.426f, 3.194f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
                curveToRelative(1.772f, 0.0f, 3.147f, 1.131f, 3.881f, 2.619f)
                curveToRelative(1.385f, 0.142f, 2.619f, 1.208f, 2.619f, 2.631f)
                close()
                moveTo(11.0f, 10.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(23.561f, 23.561f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-4.654f, -4.654f)
                curveToRelative(-1.753f, 1.314f, -3.93f, 2.094f, -6.285f, 2.094f)
                curveTo(4.71f, 21.0f, 0.0f, 16.29f, 0.0f, 10.5f)
                reflectiveCurveTo(4.71f, 0.0f, 10.5f, 0.0f)
                reflectiveCurveToRelative(10.5f, 4.71f, 10.5f, 10.5f)
                curveToRelative(0.0f, 2.355f, -0.78f, 4.531f, -2.094f, 6.285f)
                lineToRelative(4.654f, 4.654f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
                moveTo(18.0f, 10.5f)
                curveToRelative(0.0f, -4.136f, -3.364f, -7.5f, -7.5f, -7.5f)
                reflectiveCurveToRelative(-7.5f, 3.364f, -7.5f, 7.5f)
                reflectiveCurveToRelative(3.364f, 7.5f, 7.5f, 7.5f)
                reflectiveCurveToRelative(7.5f, -3.364f, 7.5f, -7.5f)
                close()
            }
        }
        .build()
        return _panFrying!!
    }

private var _panFrying: ImageVector? = null
