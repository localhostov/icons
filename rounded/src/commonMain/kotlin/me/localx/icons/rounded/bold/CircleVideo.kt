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

public val Icons.Bold.CircleVideo: ImageVector
    get() {
        if (_circleVideo != null) {
            return _circleVideo!!
        }
        _circleVideo = Builder(name = "CircleVideo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.433f, 9.182f)
                lineToRelative(-1.528f, 1.069f)
                curveToRelative(-0.333f, -1.293f, -1.51f, -2.251f, -2.905f, -2.251f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.396f, 0.0f, 2.572f, -0.958f, 2.905f, -2.251f)
                lineToRelative(1.528f, 1.069f)
                curveToRelative(0.66f, 0.462f, 1.567f, -0.01f, 1.567f, -0.816f)
                verticalLineToRelative(-4.005f)
                curveToRelative(0.0f, -0.806f, -0.907f, -1.278f, -1.567f, -0.816f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(0.002f, 2.0f)
                horizontalLineToRelative(-3.002f)
                close()
            }
        }
        .build()
        return _circleVideo!!
    }

private var _circleVideo: ImageVector? = null
