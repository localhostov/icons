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

public val Icons.Bold.AdminAlt: ImageVector
    get() {
        if (_adminAlt != null) {
            return _adminAlt!!
        }
        _adminAlt = Builder(name = "AdminAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(8.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(22.5f, 18.0f)
                curveToRelative(0.0f, -0.279f, -0.034f, -0.549f, -0.082f, -0.814f)
                lineToRelative(1.53f, -0.881f)
                lineToRelative(-1.497f, -2.6f)
                lineToRelative(-1.543f, 0.889f)
                curveToRelative(-0.413f, -0.353f, -0.885f, -0.632f, -1.407f, -0.818f)
                verticalLineToRelative(-1.776f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.776f)
                curveToRelative(-0.522f, 0.186f, -0.994f, 0.464f, -1.407f, 0.818f)
                lineToRelative(-1.543f, -0.889f)
                lineToRelative(-1.497f, 2.6f)
                lineToRelative(1.53f, 0.881f)
                curveToRelative(-0.049f, 0.265f, -0.082f, 0.535f, -0.082f, 0.814f)
                reflectiveCurveToRelative(0.034f, 0.549f, 0.082f, 0.814f)
                lineToRelative(-1.53f, 0.881f)
                lineToRelative(1.497f, 2.6f)
                lineToRelative(1.543f, -0.889f)
                curveToRelative(0.413f, 0.353f, 0.885f, 0.632f, 1.407f, 0.818f)
                verticalLineToRelative(1.776f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.776f)
                curveToRelative(0.522f, -0.186f, 0.994f, -0.464f, 1.407f, -0.818f)
                lineToRelative(1.543f, 0.889f)
                lineToRelative(1.497f, -2.6f)
                lineToRelative(-1.53f, -0.881f)
                curveToRelative(0.049f, -0.265f, 0.082f, -0.535f, 0.082f, -0.814f)
                close()
                moveTo(18.0f, 19.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _adminAlt!!
    }

private var _adminAlt: ImageVector? = null
