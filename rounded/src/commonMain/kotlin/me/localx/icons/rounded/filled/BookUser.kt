package me.localx.icons.rounded.filled

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

public val Icons.Filled.BookUser: ImageVector
    get() {
        if (_bookUser != null) {
            return _bookUser!!
        }
        _bookUser = Builder(name = "BookUser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 18.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 0.1f)
                curveTo(3.672f, 0.575f, 2.0f, 2.624f, 2.0f, 5.0f)
                verticalLineToRelative(12.025f)
                curveToRelative(0.699f, -0.527f, 1.525f, -0.86f, 2.395f, -0.964f)
                curveToRelative(0.199f, -0.041f, 0.402f, -0.061f, 0.605f, -0.061f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-14.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(12.923f, 5.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                close()
                moveTo(19.856f, 11.482f)
                curveToRelative(-0.928f, -1.531f, -2.626f, -2.482f, -4.433f, -2.482f)
                reflectiveCurveToRelative(-3.505f, 0.951f, -4.433f, 2.482f)
                curveToRelative(-0.286f, 0.472f, -0.135f, 1.087f, 0.337f, 1.374f)
                curveToRelative(0.472f, 0.285f, 1.087f, 0.136f, 1.374f, -0.337f)
                curveToRelative(0.559f, -0.922f, 1.627f, -1.518f, 2.722f, -1.518f)
                reflectiveCurveToRelative(2.163f, 0.596f, 2.722f, 1.518f)
                curveToRelative(0.188f, 0.311f, 0.519f, 0.482f, 0.856f, 0.482f)
                curveToRelative(0.177f, 0.0f, 0.355f, -0.046f, 0.518f, -0.145f)
                curveToRelative(0.472f, -0.287f, 0.623f, -0.901f, 0.337f, -1.374f)
                close()
            }
        }
        .build()
        return _bookUser!!
    }

private var _bookUser: ImageVector? = null
