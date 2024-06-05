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

public val Icons.Bold.Circle2: ImageVector
    get() {
        if (_circle2 != null) {
            return _circle2!!
        }
        _circle2 = Builder(name = "Circle2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveTo(16.962f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(16.5f, 16.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.176f)
                curveToRelative(0.135f, -0.08f, 0.272f, -0.161f, 0.409f, -0.24f)
                curveToRelative(1.801f, -1.055f, 4.267f, -2.5f, 4.264f, -5.437f)
                curveToRelative(-0.003f, -2.384f, -2.02f, -4.323f, -4.496f, -4.323f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.81f, 0.0f, 1.495f, 0.607f, 1.496f, 1.327f)
                curveToRelative(0.001f, 1.133f, -1.049f, 1.83f, -2.78f, 2.844f)
                curveToRelative(-0.968f, 0.567f, -1.969f, 1.153f, -2.653f, 1.96f)
                curveToRelative(-0.603f, 0.71f, -0.735f, 1.674f, -0.345f, 2.517f)
                curveToRelative(0.386f, 0.834f, 1.198f, 1.353f, 2.12f, 1.353f)
                horizontalLineToRelative(5.162f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _circle2!!
    }

private var _circle2: ImageVector? = null
