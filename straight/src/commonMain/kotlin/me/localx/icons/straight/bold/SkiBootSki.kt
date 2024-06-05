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

public val Icons.Bold.SkiBootSki: ImageVector
    get() {
        if (_skiBootSki != null) {
            return _skiBootSki!!
        }
        _skiBootSki = Builder(name = "SkiBootSki", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(0.0f, 19.0f)
                lineToRelative(0.031f, -3.304f)
                lineTo(3.279f, -0.003f)
                reflectiveCurveToRelative(9.513f, 0.026f, 10.463f, 0.026f)
                reflectiveCurveToRelative(1.283f, 0.473f, 1.283f, 0.473f)
                curveToRelative(0.371f, 0.379f, 0.527f, 0.913f, 0.418f, 1.431f)
                lineToRelative(-1.428f, 6.791f)
                lineToRelative(0.051f, 0.017f)
                curveToRelative(2.864f, 0.616f, 4.934f, 3.171f, 4.934f, 6.109f)
                verticalLineToRelative(4.156f)
                close()
                moveTo(16.0f, 14.844f)
                curveToRelative(0.0f, -1.544f, -1.099f, -2.884f, -2.612f, -3.187f)
                lineToRelative(-2.864f, -0.914f)
                lineToRelative(0.577f, -2.743f)
                horizontalLineToRelative(-3.101f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.732f)
                lineToRelative(0.417f, -1.98f)
                lineToRelative(-6.428f, -0.017f)
                lineToRelative(-2.688f, 12.997f)
                horizontalLineToRelative(12.968f)
                verticalLineToRelative(-1.156f)
                close()
                moveTo(6.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _skiBootSki!!
    }

private var _skiBootSki: ImageVector? = null
