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

public val Icons.Filled.DrumSteelpan: ImageVector
    get() {
        if (_drumSteelpan != null) {
            return _drumSteelpan!!
        }
        _drumSteelpan = Builder(name = "DrumSteelpan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.527f, 12.048f)
                curveToRelative(-2.193f, 1.792f, -5.639f, 2.952f, -9.527f, 2.952f)
                reflectiveCurveToRelative(-7.334f, -1.161f, -9.527f, -2.952f)
                curveToRelative(2.458f, -0.074f, 5.932f, -0.544f, 7.163f, -2.518f)
                lineToRelative(0.054f, -0.098f)
                curveToRelative(0.292f, -0.611f, 0.359f, -1.309f, 0.268f, -2.077f)
                curveToRelative(0.633f, 0.409f, 1.308f, 0.646f, 2.041f, 0.646f)
                curveToRelative(0.741f, 0.0f, 1.41f, -0.24f, 2.03f, -0.658f)
                curveToRelative(-0.073f, 0.776f, 0.004f, 1.478f, 0.296f, 2.089f)
                lineToRelative(0.054f, 0.098f)
                curveToRelative(1.229f, 1.974f, 4.694f, 2.445f, 7.148f, 2.519f)
                close()
                moveTo(16.108f, 8.519f)
                curveToRelative(0.872f, 1.267f, 4.498f, 1.642f, 7.171f, 1.523f)
                curveToRelative(0.459f, -0.795f, 0.722f, -1.648f, 0.722f, -2.541f)
                curveToRelative(0.0f, -2.653f, -2.21f, -4.979f, -5.537f, -6.313f)
                curveToRelative(-1.391f, 2.858f, -2.902f, 6.021f, -2.356f, 7.331f)
                close()
                moveTo(12.001f, 6.0f)
                curveToRelative(1.501f, 0.0f, 2.962f, -2.642f, 4.382f, -5.477f)
                curveToRelative(-1.359f, -0.334f, -2.833f, -0.523f, -4.382f, -0.523f)
                curveToRelative(-1.624f, 0.0f, -3.171f, 0.204f, -4.584f, 0.569f)
                curveToRelative(1.475f, 2.839f, 3.061f, 5.431f, 4.584f, 5.431f)
                close()
                moveTo(7.909f, 8.519f)
                curveToRelative(0.498f, -1.209f, -1.001f, -4.177f, -2.326f, -6.799f)
                curveToRelative(-0.077f, -0.152f, -0.152f, -0.309f, -0.229f, -0.462f)
                curveTo(2.127f, 2.602f, 0.0f, 4.895f, 0.0f, 7.5f)
                curveToRelative(0.0f, 0.894f, 0.263f, 1.747f, 0.722f, 2.541f)
                curveToRelative(2.68f, 0.12f, 6.312f, -0.254f, 7.187f, -1.523f)
                close()
                moveTo(12.001f, 17.0f)
                curveToRelative(-5.161f, 0.0f, -9.573f, -1.81f, -12.0f, -4.559f)
                verticalLineToRelative(3.202f)
                curveToRelative(0.0f, 4.608f, 5.383f, 8.357f, 12.0f, 8.357f)
                reflectiveCurveToRelative(12.0f, -3.749f, 12.0f, -8.357f)
                verticalLineToRelative(-3.202f)
                curveToRelative(-2.427f, 2.749f, -6.839f, 4.559f, -12.0f, 4.559f)
                close()
            }
        }
        .build()
        return _drumSteelpan!!
    }

private var _drumSteelpan: ImageVector? = null
