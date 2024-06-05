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

public val Icons.Bold.SwipeLeft: ImageVector
    get() {
        if (_swipeLeft != null) {
            return _swipeLeft!!
        }
        _swipeLeft = Builder(name = "SwipeLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.231f, 11.382f)
                lineToRelative(-8.212f, -2.053f)
                lineTo(9.019f, 3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(13.512f)
                curveToRelative(0.0f, 0.039f, 0.0f, 0.105f, -0.097f, 0.146f)
                curveToRelative(-0.094f, 0.038f, -0.144f, -0.006f, -0.167f, -0.03f)
                curveToRelative(0.0f, 0.0f, -2.482f, -2.49f, -2.561f, -2.543f)
                curveToRelative(-0.703f, -0.48f, -1.818f, -0.555f, -2.596f, 0.223f)
                curveToRelative(-0.802f, 0.801f, -0.688f, 1.939f, -0.163f, 2.65f)
                curveToRelative(0.034f, 0.046f, 3.427f, 3.682f, 3.427f, 3.682f)
                curveToRelative(0.458f, 0.606f, 2.445f, 2.861f, 6.656f, 2.861f)
                horizontalLineToRelative(5.5f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-2.768f)
                curveToRelative(0.0f, -2.298f, -1.558f, -4.293f, -3.788f, -4.851f)
                close()
                moveTo(18.019f, 19.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.806f, 0.0f, -2.946f, -0.556f, -3.585f, -1.019f)
                curveToRelative(0.046f, -0.017f, 0.091f, -0.034f, 0.136f, -0.053f)
                curveToRelative(1.185f, -0.49f, 1.949f, -1.636f, 1.949f, -2.917f)
                verticalLineToRelative(-4.591f)
                lineToRelative(7.484f, 1.871f)
                curveToRelative(0.893f, 0.224f, 1.516f, 1.021f, 1.516f, 1.94f)
                verticalLineToRelative(2.768f)
                close()
                moveTo(23.999f, 4.513f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.501f)
                verticalLineToRelative(1.525f)
                curveToRelative(0.0f, 0.856f, -1.043f, 1.284f, -1.653f, 0.679f)
                lineToRelative(-3.063f, -3.038f)
                curveToRelative(-0.378f, -0.375f, -0.378f, -0.983f, 0.0f, -1.358f)
                lineToRelative(3.063f, -3.038f)
                curveToRelative(0.61f, -0.605f, 1.653f, -0.176f, 1.653f, 0.679f)
                verticalLineToRelative(1.551f)
                horizontalLineToRelative(4.501f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _swipeLeft!!
    }

private var _swipeLeft: ImageVector? = null
