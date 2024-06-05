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

public val Icons.Filled.Pending: ImageVector
    get() {
        if (_pending != null) {
            return _pending!!
        }
        _pending = Builder(name = "Pending", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.931f, 11.0f)
                horizontalLineToRelative(-2.931f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-4.406f)
                curveToRelative(-1.467f, -0.599f, -3.145f, -0.785f, -4.903f, -0.371f)
                curveToRelative(-3.012f, 0.709f, -5.388f, 3.199f, -5.954f, 6.241f)
                curveToRelative(-0.947f, 5.093f, 2.936f, 9.536f, 7.857f, 9.536f)
                curveToRelative(4.418f, 0.0f, 8.0f, -3.582f, 8.0f, -8.0f)
                curveToRelative(0.0f, -0.339f, -0.028f, -0.672f, -0.069f, -1.0f)
                close()
                moveTo(15.439f, 15.195f)
                lineToRelative(-4.438f, -2.763f)
                verticalLineToRelative(-6.433f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.325f)
                lineToRelative(3.5f, 2.175f)
                lineToRelative(-1.062f, 1.695f)
                close()
                moveTo(24.0f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.636f)
                curveToRelative(-2.126f, -3.671f, -6.318f, -5.679f, -10.701f, -4.791f)
                curveToRelative(-3.959f, 0.802f, -7.099f, 4.045f, -7.784f, 8.027f)
                curveToRelative(-1.081f, 6.289f, 3.756f, 11.764f, 9.848f, 11.764f)
                curveToRelative(0.388f, 0.0f, 0.78f, -0.022f, 1.167f, -0.067f)
                lineToRelative(0.23f, 1.986f)
                curveToRelative(-0.463f, 0.054f, -0.933f, 0.081f, -1.397f, 0.081f)
                curveTo(4.719f, 24.0f, -1.068f, 17.482f, 0.167f, 9.975f)
                curveTo(0.946f, 5.239f, 4.598f, 1.338f, 9.284f, 0.3f)
                curveToRelative(5.088f, -1.127f, 10.022f, 0.999f, 12.716f, 5.073f)
                verticalLineToRelative(-3.374f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.62f, 20.871f)
                lineToRelative(0.926f, 1.773f)
                curveToRelative(-0.645f, 0.337f, -1.323f, 0.615f, -2.016f, 0.828f)
                lineToRelative(-0.588f, -1.912f)
                curveToRelative(0.576f, -0.177f, 1.141f, -0.408f, 1.678f, -0.689f)
                close()
                moveTo(22.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.728f, -0.066f, 1.458f, -0.196f, 2.169f)
                lineToRelative(-1.967f, -0.359f)
                curveToRelative(0.108f, -0.594f, 0.163f, -1.202f, 0.163f, -1.81f)
                close()
                moveTo(19.472f, 18.646f)
                lineToRelative(1.494f, 1.33f)
                curveToRelative(-0.483f, 0.543f, -1.019f, 1.044f, -1.59f, 1.489f)
                lineToRelative(-1.229f, -1.578f)
                curveToRelative(0.476f, -0.37f, 0.921f, -0.788f, 1.324f, -1.241f)
                close()
                moveTo(21.35f, 15.554f)
                lineToRelative(1.869f, 0.713f)
                curveToRelative(-0.257f, 0.674f, -0.579f, 1.333f, -0.957f, 1.957f)
                lineToRelative(-1.711f, -1.037f)
                curveToRelative(0.316f, -0.521f, 0.585f, -1.07f, 0.799f, -1.633f)
                close()
            }
        }
        .build()
        return _pending!!
    }

private var _pending: ImageVector? = null
