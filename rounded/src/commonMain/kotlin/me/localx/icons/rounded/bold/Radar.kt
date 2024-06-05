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

public val Icons.Bold.Radar: ImageVector
    get() {
        if (_radar != null) {
            return _radar!!
        }
        _radar = Builder(name = "Radar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 6.778f, -5.647f, 12.26f, -12.483f, 11.99f)
                curveTo(5.353f, 23.747f, -0.031f, 18.107f, 0.0f, 11.938f)
                curveTo(0.037f, 4.589f, 6.714f, -1.218f, 14.326f, 0.22f)
                curveToRelative(1.972f, 0.373f, 3.788f, 1.301f, 5.339f, 2.57f)
                curveToRelative(1.038f, 0.849f, 1.081f, 2.427f, 0.143f, 3.384f)
                lineToRelative(-6.737f, 6.875f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.272f, 0.277f, -0.651f, 0.45f, -1.07f, 0.45f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.409f, 0.164f, -0.778f, 0.43f, -1.049f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.01f, -0.012f, 0.01f, -0.012f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(2.582f, -2.635f)
                curveToRelative(-0.138f, -0.057f, -1.021f, -0.304f, -1.521f, -0.304f)
                curveToRelative(-2.519f, 0.0f, -4.501f, 2.339f, -3.887f, 4.961f)
                curveToRelative(0.339f, 1.449f, 1.527f, 2.617f, 2.98f, 2.939f)
                curveToRelative(2.003f, 0.444f, 3.809f, -0.626f, 4.544f, -2.278f)
                curveToRelative(0.161f, -0.361f, 0.48f, -0.627f, 0.854f, -0.756f)
                curveToRelative(1.245f, -0.43f, 2.425f, 0.845f, 1.871f, 2.04f)
                curveToRelative(-0.823f, 1.774f, -2.374f, 3.142f, -4.265f, 3.741f)
                curveToRelative(-0.445f, -0.688f, -1.216f, -1.146f, -2.097f, -1.146f)
                reflectiveCurveToRelative(-1.652f, 0.458f, -2.097f, 1.146f)
                curveToRelative(-2.832f, -0.896f, -4.903f, -3.521f, -4.903f, -6.646f)
                curveToRelative(0.0f, -1.165f, 0.304f, -2.253f, 0.811f, -3.219f)
                curveToRelative(0.804f, 0.175f, 1.675f, -0.046f, 2.3f, -0.67f)
                reflectiveCurveToRelative(0.845f, -1.497f, 0.67f, -2.3f)
                curveToRelative(0.966f, -0.507f, 2.054f, -0.811f, 3.219f, -0.811f)
                curveToRelative(2.0f, 0.0f, 3.401f, 0.874f, 3.711f, 1.069f)
                lineToRelative(1.429f, -1.459f)
                curveToRelative(-1.499f, -1.046f, -3.279f, -1.61f, -5.141f, -1.61f)
                curveToRelative(-1.607f, 0.0f, -3.103f, 0.445f, -4.41f, 1.187f)
                curveToRelative(-0.956f, -0.553f, -2.196f, -0.43f, -3.015f, 0.388f)
                reflectiveCurveToRelative(-0.941f, 2.058f, -0.388f, 3.015f)
                curveToRelative(-0.742f, 1.307f, -1.187f, 2.803f, -1.187f, 4.41f)
                curveToRelative(0.0f, 4.132f, 2.801f, 7.616f, 6.602f, 8.669f)
                curveToRelative(0.294f, 1.054f, 1.251f, 1.831f, 2.398f, 1.831f)
                reflectiveCurveToRelative(2.104f, -0.778f, 2.398f, -1.831f)
                curveToRelative(3.801f, -1.053f, 6.602f, -4.537f, 6.602f, -8.669f)
                curveToRelative(0.0f, -0.93f, -0.146f, -1.825f, -0.411f, -2.669f)
                curveToRelative(-0.234f, -0.743f, 0.174f, -1.582f, 0.987f, -1.857f)
                curveToRelative(0.817f, -0.277f, 1.675f, 0.266f, 1.923f, 1.092f)
                curveToRelative(0.326f, 1.088f, 0.501f, 2.241f, 0.501f, 3.434f)
                close()
            }
        }
        .build()
        return _radar!!
    }

private var _radar: ImageVector? = null
