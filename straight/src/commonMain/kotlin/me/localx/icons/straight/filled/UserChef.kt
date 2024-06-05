package me.localx.icons.straight.filled

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

public val Icons.Filled.UserChef: ImageVector
    get() {
        if (_userChef != null) {
            return _userChef!!
        }
        _userChef = Builder(name = "UserChef", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 9.0f)
                horizontalLineToRelative(11.99f)
                curveToRelative(-0.105f, 3.086f, -2.437f, 5.689f, -5.404f, 5.972f)
                curveToRelative(-0.191f, 0.019f, -0.383f, 0.027f, -0.573f, 0.027f)
                curveToRelative(-1.492f, 0.0f, -2.942f, -0.553f, -4.049f, -1.559f)
                curveToRelative(-1.249f, -1.136f, -1.964f, -2.754f, -1.964f, -4.44f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                close()
                moveTo(21.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(16.0f, 20.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(6.001f, 4.95f)
                curveToRelative(0.0f, 0.973f, 0.0f, 2.049f, 0.0f, 2.049f)
                horizontalLineToRelative(12.0f)
                reflectiveCurveToRelative(0.0f, -1.076f, 0.0f, -2.049f)
                curveToRelative(1.141f, -0.232f, 2.001f, -1.24f, 2.001f, -2.45f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.599f, 0.0f, -1.62f, 0.211f, -2.584f, 0.563f)
                curveToRelative(-0.004f, -0.004f, -0.008f, -0.006f, -0.012f, -0.01f)
                curveToRelative(-0.618f, -0.22f, -1.747f, -0.553f, -2.904f, -0.553f)
                reflectiveCurveToRelative(-2.286f, 0.333f, -2.905f, 0.553f)
                curveToRelative(-0.004f, 0.004f, -0.007f, 0.006f, -0.011f, 0.01f)
                curveToRelative(-0.964f, -0.352f, -1.985f, -0.563f, -2.584f, -0.563f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.21f, 0.859f, 2.218f, 2.001f, 2.45f)
                close()
            }
        }
        .build()
        return _userChef!!
    }

private var _userChef: ImageVector? = null
