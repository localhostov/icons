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

public val Icons.Bold.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) {
            return _swipeUp!!
        }
        _swipeUp = Builder(name = "SwipeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.212f, 11.382f)
                lineToRelative(-8.212f, -2.053f)
                lineTo(12.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(13.512f)
                curveToRelative(0.0f, 0.039f, 0.0f, 0.105f, -0.097f, 0.146f)
                curveToRelative(-0.095f, 0.039f, -0.142f, -0.006f, -0.167f, -0.03f)
                curveToRelative(0.0f, 0.0f, -2.483f, -2.49f, -2.561f, -2.543f)
                curveToRelative(-0.702f, -0.482f, -1.818f, -0.558f, -2.595f, 0.223f)
                curveToRelative(-0.801f, 0.801f, -0.689f, 1.938f, -0.164f, 2.649f)
                curveToRelative(0.034f, 0.046f, 3.427f, 3.683f, 3.427f, 3.683f)
                curveToRelative(0.458f, 0.606f, 2.446f, 2.861f, 6.657f, 2.861f)
                horizontalLineToRelative(5.5f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-2.768f)
                curveToRelative(0.0f, -2.299f, -1.558f, -4.293f, -3.788f, -4.851f)
                close()
                moveTo(21.0f, 19.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.806f, 0.0f, -2.946f, -0.556f, -3.584f, -1.019f)
                curveToRelative(0.045f, -0.017f, 0.091f, -0.034f, 0.136f, -0.053f)
                curveToRelative(1.184f, -0.49f, 1.949f, -1.636f, 1.949f, -2.917f)
                verticalLineToRelative(-4.591f)
                lineToRelative(7.485f, 1.871f)
                curveToRelative(0.892f, 0.224f, 1.515f, 1.021f, 1.515f, 1.94f)
                verticalLineToRelative(2.768f)
                close()
                moveTo(4.0f, 11.001f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-4.501f)
                lineTo(0.949f, 5.0f)
                curveTo(0.094f, 5.0f, -0.335f, 3.957f, 0.27f, 3.347f)
                lineTo(3.308f, 0.284f)
                curveToRelative(0.375f, -0.378f, 0.983f, -0.378f, 1.358f, 0.0f)
                lineToRelative(3.038f, 3.063f)
                curveToRelative(0.605f, 0.61f, 0.177f, 1.653f, -0.679f, 1.653f)
                horizontalLineToRelative(-1.525f)
                verticalLineToRelative(4.501f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
