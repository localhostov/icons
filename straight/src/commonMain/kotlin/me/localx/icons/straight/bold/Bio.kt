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

public val Icons.Bold.Bio: ImageVector
    get() {
        if (_bio != null) {
            return _bio!!
        }
        _bio = Builder(name = "Bio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.7f, 8.0f)
                curveToRelative(-1.269f, 0.0f, -2.3f, 1.031f, -2.3f, 2.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0.0f, 1.269f, 1.031f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.031f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -1.269f, -1.031f, -2.3f, -2.3f, -2.3f)
                close()
                moveTo(17.4f, 13.7f)
                curveToRelative(0.0f, 0.386f, -0.314f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.314f, -0.7f, -0.7f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -0.386f, 0.314f, -0.7f, 0.7f, -0.7f)
                reflectiveCurveToRelative(0.7f, 0.314f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                close()
                moveTo(11.4f, 8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(10.0f, 10.3f)
                curveToRelative(0.0f, -1.269f, -1.031f, -2.3f, -2.3f, -2.3f)
                horizontalLineToRelative(-2.2f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.768f, -0.355f, -1.447f, -0.901f, -1.906f)
                curveToRelative(0.252f, -0.369f, 0.401f, -0.814f, 0.401f, -1.294f)
                close()
                moveTo(7.1f, 9.6f)
                horizontalLineToRelative(0.6f)
                curveToRelative(0.386f, 0.0f, 0.7f, 0.314f, 0.7f, 0.7f)
                reflectiveCurveToRelative(-0.314f, 0.7f, -0.7f, 0.7f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(-1.4f)
                close()
                moveTo(8.0f, 14.4f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.496f, 0.0f, 0.9f, 0.404f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.404f, 0.9f, -0.9f, 0.9f)
                close()
            }
        }
        .build()
        return _bio!!
    }

private var _bio: ImageVector? = null
