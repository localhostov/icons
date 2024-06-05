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

public val Icons.Filled.UserKey: ImageVector
    get() {
        if (_userKey != null) {
            return _userKey!!
        }
        _userKey = Builder(name = "UserKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 10.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                curveToRelative(0.0f, 0.572f, 0.116f, 1.112f, 0.293f, 1.624f)
                lineToRelative(-0.315f, 0.304f)
                verticalLineToRelative(2.072f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.978f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.604f)
                reflectiveCurveToRelative(4.412f, -4.413f, 4.412f, -4.413f)
                curveToRelative(0.609f, 0.264f, 1.278f, 0.413f, 1.983f, 0.413f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.239f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(20.0f, 12.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 2.691f, 5.691f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(8.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(7.08f)
                curveToRelative(-0.047f, 0.328f, -0.08f, 0.66f, -0.08f, 1.0f)
                curveToRelative(0.0f, 0.328f, -0.021f, 2.0f, -0.021f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.979f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _userKey!!
    }

private var _userKey: ImageVector? = null
