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

public val Icons.Bold.Process: ImageVector
    get() {
        if (_process != null) {
            return _process!!
        }
        _process = Builder(name = "Process", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-2.704f, 0.0f, -5.298f, -0.939f, -7.389f, -2.573f)
                lineToRelative(-2.573f, 2.573f)
                verticalLineToRelative(-6.021f)
                curveToRelative(0.0f, -0.527f, 0.428f, -0.954f, 0.955f, -0.955f)
                horizontalLineToRelative(6.021f)
                lineToRelative(-2.265f, 2.265f)
                curveToRelative(1.516f, 1.09f, 3.348f, 1.711f, 5.251f, 1.711f)
                curveToRelative(4.963f, 0.0f, 9.0f, -4.038f, 9.0f, -9.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.911f, 0.0f, 3.741f, 0.618f, 5.255f, 1.707f)
                lineToRelative(-2.269f, 2.269f)
                horizontalLineToRelative(5.83f)
                curveToRelative(0.633f, 0.0f, 1.146f, -0.513f, 1.146f, -1.146f)
                lineTo(21.962f, 0.0f)
                lineToRelative(-2.573f, 2.573f)
                curveToRelative(-2.088f, -1.635f, -4.675f, -2.573f, -7.389f, -2.573f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                curveTo(3.0f, 7.038f, 7.038f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(17.948f, 10.305f)
                lineToRelative(-1.53f, 0.882f)
                curveToRelative(0.049f, 0.265f, 0.082f, 0.535f, 0.082f, 0.814f)
                reflectiveCurveToRelative(-0.034f, 0.549f, -0.082f, 0.814f)
                lineToRelative(1.53f, 0.882f)
                lineToRelative(-1.498f, 2.6f)
                lineToRelative(-1.543f, -0.889f)
                curveToRelative(-0.413f, 0.353f, -0.885f, 0.631f, -1.407f, 0.817f)
                verticalLineToRelative(1.776f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.776f)
                curveToRelative(-0.522f, -0.186f, -0.994f, -0.464f, -1.407f, -0.818f)
                lineToRelative(-1.543f, 0.889f)
                lineToRelative(-1.497f, -2.6f)
                lineToRelative(1.53f, -0.881f)
                curveToRelative(-0.049f, -0.265f, -0.082f, -0.535f, -0.082f, -0.814f)
                reflectiveCurveToRelative(0.034f, -0.549f, 0.082f, -0.814f)
                lineToRelative(-1.53f, -0.881f)
                lineToRelative(1.497f, -2.6f)
                lineToRelative(1.543f, 0.889f)
                curveToRelative(0.413f, -0.353f, 0.885f, -0.632f, 1.407f, -0.818f)
                verticalLineToRelative(-1.776f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.776f)
                curveToRelative(0.522f, 0.186f, 0.994f, 0.464f, 1.407f, 0.817f)
                lineToRelative(1.543f, -0.889f)
                lineToRelative(1.498f, 2.6f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _process!!
    }

private var _process: ImageVector? = null
