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

public val Icons.Filled.Bio: ImageVector
    get() {
        if (_bio != null) {
            return _bio!!
        }
        _bio = Builder(name = "Bio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.9f, 13.5f)
                curveToRelative(0.0f, 0.496f, -0.404f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.496f, 0.0f, 0.9f, 0.404f, 0.9f, 0.9f)
                close()
                moveTo(8.4f, 10.3f)
                curveToRelative(0.0f, -0.386f, -0.314f, -0.7f, -0.7f, -0.7f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(0.6f)
                curveToRelative(0.386f, 0.0f, 0.7f, -0.314f, 0.7f, -0.7f)
                close()
                moveTo(16.7f, 9.6f)
                curveToRelative(-0.386f, 0.0f, -0.7f, 0.314f, -0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                curveToRelative(0.0f, 0.386f, 0.314f, 0.7f, 0.7f, 0.7f)
                reflectiveCurveToRelative(0.7f, -0.314f, 0.7f, -0.7f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -0.386f, -0.314f, -0.7f, -0.7f, -0.7f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(10.5f, 13.5f)
                curveToRelative(0.0f, -0.768f, -0.355f, -1.447f, -0.901f, -1.906f)
                curveToRelative(0.252f, -0.369f, 0.401f, -0.814f, 0.401f, -1.294f)
                curveToRelative(0.0f, -1.269f, -1.031f, -2.3f, -2.3f, -2.3f)
                horizontalLineToRelative(-2.2f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(19.0f, 10.3f)
                curveToRelative(0.0f, -1.269f, -1.031f, -2.3f, -2.3f, -2.3f)
                reflectiveCurveToRelative(-2.3f, 1.031f, -2.3f, 2.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0.0f, 1.269f, 1.031f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.031f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                close()
            }
        }
        .build()
        return _bio!!
    }

private var _bio: ImageVector? = null
