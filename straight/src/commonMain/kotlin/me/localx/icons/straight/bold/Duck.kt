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

public val Icons.Bold.Duck: ImageVector
    get() {
        if (_duck != null) {
            return _duck!!
        }
        _duck = Builder(name = "Duck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.5f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-2.158f, -0.925f)
                curveToRelative(-0.651f, -2.901f, -3.248f, -5.075f, -6.342f, -5.075f)
                curveToRelative(-3.584f, 0.0f, -6.5f, 2.916f, -6.5f, 6.5f)
                curveToRelative(0.0f, 1.164f, 0.308f, 2.257f, 0.846f, 3.203f)
                curveToRelative(-1.476f, 1.486f, -3.964f, 3.414f, -4.856f, 3.414f)
                curveToRelative(-0.19f, -0.063f, -0.682f, -0.715f, -1.007f, -1.146f)
                lineToRelative(-1.788f, -2.281f)
                lineToRelative(-1.061f, 2.19f)
                curveToRelative(-1.504f, 3.108f, -1.522f, 6.112f, -0.052f, 8.458f)
                curveToRelative(1.459f, 2.327f, 4.267f, 3.661f, 7.702f, 3.661f)
                horizontalLineToRelative(6.613f)
                curveToRelative(2.767f, 0.0f, 5.281f, -1.432f, 6.564f, -3.735f)
                curveToRelative(0.66f, -1.185f, 1.01f, -2.441f, 1.038f, -3.731f)
                curveToRelative(0.051f, -2.305f, -1.242f, -4.505f, -2.448f, -5.949f)
                curveToRelative(0.498f, -0.615f, 0.887f, -1.323f, 1.135f, -2.093f)
                lineToRelative(2.312f, -0.991f)
                close()
                moveTo(15.5f, 3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(20.0f, 16.467f)
                curveToRelative(-0.017f, 0.797f, -0.239f, 1.583f, -0.659f, 2.337f)
                curveToRelative(-0.754f, 1.354f, -2.265f, 2.195f, -3.943f, 2.195f)
                horizontalLineToRelative(-6.613f)
                curveToRelative(-2.416f, 0.0f, -4.249f, -0.801f, -5.16f, -2.255f)
                curveToRelative(-0.573f, -0.914f, -0.752f, -2.042f, -0.539f, -3.298f)
                curveToRelative(0.521f, 0.403f, 1.134f, 0.67f, 1.915f, 0.67f)
                curveToRelative(2.142f, 0.0f, 5.112f, -2.445f, 6.876f, -4.224f)
                curveToRelative(1.036f, 0.698f, 2.283f, 1.106f, 3.624f, 1.106f)
                curveToRelative(0.954f, 0.0f, 1.861f, -0.207f, 2.678f, -0.578f)
                curveToRelative(0.893f, 1.048f, 1.854f, 2.639f, 1.822f, 4.045f)
                close()
                moveTo(16.25f, 16.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-3.25f, 0.0f, -5.25f, -1.5f, -5.25f, -1.5f)
                curveToRelative(0.0f, 0.0f, 3.0f, -3.5f, 5.25f, -3.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _duck!!
    }

private var _duck: ImageVector? = null
