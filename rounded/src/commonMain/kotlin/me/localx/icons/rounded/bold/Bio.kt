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
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
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
                moveTo(13.0f, 8.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0.0f, 0.442f, -0.358f, 0.8f, -0.8f, 0.8f)
                reflectiveCurveToRelative(-0.8f, -0.358f, -0.8f, -0.8f)
                verticalLineToRelative(-6.4f)
                curveToRelative(0.0f, -0.442f, 0.358f, -0.8f, 0.8f, -0.8f)
                reflectiveCurveToRelative(0.8f, 0.358f, 0.8f, 0.8f)
                close()
                moveTo(9.999f, 10.234f)
                curveToRelative(-0.036f, -1.268f, -1.171f, -2.234f, -2.439f, -2.234f)
                horizontalLineToRelative(-1.06f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.374f)
                curveToRelative(1.249f, 0.0f, 2.395f, -0.86f, 2.593f, -2.094f)
                curveToRelative(0.15f, -0.932f, -0.227f, -1.774f, -0.868f, -2.312f)
                curveToRelative(0.264f, -0.386f, 0.414f, -0.855f, 0.4f, -1.36f)
                close()
                moveTo(7.1f, 9.599f)
                horizontalLineToRelative(0.6f)
                curveToRelative(0.386f, 0.0f, 0.7f, 0.314f, 0.7f, 0.7f)
                reflectiveCurveToRelative(-0.314f, 0.7f, -0.7f, 0.7f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(-1.4f)
                close()
                moveTo(8.0f, 14.399f)
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
