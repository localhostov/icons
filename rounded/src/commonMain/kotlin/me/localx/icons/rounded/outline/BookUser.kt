package me.localx.icons.rounded.outline

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

public val Icons.Outline.BookUser: ImageVector
    get() {
        if (_bookUser != null) {
            return _bookUser!!
        }
        _bookUser = Builder(name = "BookUser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 6.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(9.904f, 13.855f)
                curveToRelative(0.472f, 0.287f, 1.088f, 0.136f, 1.374f, -0.336f)
                curveToRelative(0.559f, -0.922f, 1.627f, -1.519f, 2.722f, -1.519f)
                reflectiveCurveToRelative(2.163f, 0.596f, 2.722f, 1.519f)
                curveToRelative(0.188f, 0.31f, 0.519f, 0.481f, 0.856f, 0.481f)
                curveToRelative(0.177f, 0.0f, 0.355f, -0.047f, 0.518f, -0.145f)
                curveToRelative(0.472f, -0.286f, 0.623f, -0.901f, 0.337f, -1.374f)
                curveToRelative(-0.929f, -1.531f, -2.627f, -2.481f, -4.433f, -2.481f)
                reflectiveCurveToRelative(-3.504f, 0.951f, -4.433f, 2.481f)
                curveToRelative(-0.286f, 0.473f, -0.135f, 1.087f, 0.337f, 1.374f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(2.0f, 5.0f)
                curveTo(2.0f, 2.243f, 4.243f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                curveTo(19.757f, 0.0f, 22.0f, 2.243f, 22.0f, 5.0f)
                close()
                moveTo(17.0f, 2.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(12.0f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineToRelative(11.556f)
                curveToRelative(0.591f, -0.344f, 1.268f, -0.556f, 2.0f, -0.556f)
                lineTo(6.0f, 2.184f)
                curveToRelative(-1.161f, 0.414f, -2.0f, 1.514f, -2.0f, 2.816f)
                close()
                moveTo(20.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 18.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bookUser!!
    }

private var _bookUser: ImageVector? = null
