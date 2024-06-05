package me.localx.icons.straight.outline

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

public val Icons.Outline.General: ImageVector
    get() {
        if (_general != null) {
            return _general!!
        }
        _general = Builder(name = "General", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 6.054f)
                verticalLineToRelative(2.946f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-2.979f)
                curveToRelative(1.219f, -0.563f, 1.962f, -1.386f, 1.962f, -2.521f)
                curveToRelative(0.0f, -2.5f, -3.582f, -3.5f, -8.0f, -3.5f)
                reflectiveCurveTo(3.962f, 1.0f, 3.962f, 3.5f)
                curveToRelative(0.0f, 1.158f, 0.775f, 1.99f, 2.038f, 2.554f)
                close()
                moveTo(16.0f, 9.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-1.391f)
                curveToRelative(0.978f, 0.208f, 2.296f, 0.391f, 4.0f, 0.391f)
                reflectiveCurveToRelative(3.022f, -0.183f, 4.0f, -0.391f)
                verticalLineToRelative(1.391f)
                close()
                moveTo(9.5f, 3.0f)
                horizontalLineToRelative(1.812f)
                lineToRelative(0.491f, -1.875f)
                horizontalLineToRelative(0.404f)
                lineToRelative(0.49f, 1.875f)
                horizontalLineToRelative(1.802f)
                verticalLineToRelative(0.382f)
                lineToRelative(-1.375f, 0.796f)
                lineToRelative(0.552f, 1.679f)
                lineToRelative(-0.312f, 0.218f)
                lineToRelative(-1.359f, -1.051f)
                lineToRelative(-1.364f, 1.055f)
                lineToRelative(-0.301f, -0.226f)
                lineToRelative(0.543f, -1.698f)
                lineToRelative(-1.384f, -0.77f)
                verticalLineToRelative(-0.384f)
                close()
                moveTo(15.535f, 18.0f)
                lineToRelative(-2.667f, 4.0f)
                horizontalLineToRelative(6.132f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.132f)
                lineToRelative(-2.667f, -4.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.535f)
                lineToRelative(2.465f, 3.697f)
                lineToRelative(2.465f, -3.697f)
                horizontalLineToRelative(6.535f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.465f)
                close()
            }
        }
        .build()
        return _general!!
    }

private var _general: ImageVector? = null
