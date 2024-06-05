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
                moveToRelative(23.985f, 21.864f)
                lineToRelative(-5.079f, -5.079f)
                curveToRelative(1.314f, -1.753f, 2.094f, -3.93f, 2.094f, -6.285f)
                curveTo(21.0f, 4.71f, 16.29f, 0.0f, 10.5f, 0.0f)
                reflectiveCurveTo(0.0f, 4.71f, 0.0f, 10.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                curveToRelative(2.355f, 0.0f, 4.531f, -0.78f, 6.285f, -2.094f)
                lineToRelative(5.079f, 5.079f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(3.0f, 10.5f)
                curveToRelative(0.0f, -4.136f, 3.364f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 3.364f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-3.364f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveToRelative(-7.5f, -3.364f, -7.5f, -7.5f)
                close()
                moveTo(16.0f, 10.25f)
                curveToRelative(0.0f, -1.423f, -1.234f, -2.489f, -2.619f, -2.631f)
                curveToRelative(-0.734f, -1.488f, -2.109f, -2.619f, -3.881f, -2.619f)
                curveToRelative(-2.485f, 0.0f, -4.5f, 2.015f, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 3.314f, 2.686f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.795f, 0.0f, 3.429f, -1.348f, 3.429f, -3.143f)
                curveToRelative(0.0f, -0.017f, -0.002f, -0.034f, -0.003f, -0.051f)
                curveToRelative(0.891f, -0.455f, 1.574f, -1.487f, 1.574f, -2.556f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _panFrying!!
    }

private var _panFrying: ImageVector? = null
