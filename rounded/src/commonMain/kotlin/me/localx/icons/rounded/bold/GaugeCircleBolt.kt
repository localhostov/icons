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

public val Icons.Bold.GaugeCircleBolt: ImageVector
    get() {
        if (_gaugeCircleBolt != null) {
            return _gaugeCircleBolt!!
        }
        _gaugeCircleBolt = Builder(name = "GaugeCircleBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.504f, 0.193f, -0.959f, 0.5f, -1.31f)
                verticalLineToRelative(-4.19f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(4.19f)
                curveToRelative(0.307f, 0.352f, 0.5f, 0.806f, 0.5f, 1.31f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(7.582f, 16.313f)
                lineToRelative(-1.554f, 1.204f)
                curveToRelative(-0.165f, 0.136f, -0.412f, 0.115f, -0.574f, -0.048f)
                curveToRelative(-1.848f, -1.87f, -2.717f, -4.452f, -2.383f, -7.083f)
                curveToRelative(0.485f, -3.816f, 3.614f, -6.897f, 7.44f, -7.326f)
                curveToRelative(4.43f, -0.493f, 8.437f, 2.401f, 9.319f, 6.74f)
                curveToRelative(0.165f, 0.812f, 0.961f, 1.338f, 1.769f, 1.171f)
                curveToRelative(0.812f, -0.165f, 1.336f, -0.957f, 1.171f, -1.769f)
                curveTo(21.575f, 3.329f, 16.155f, -0.59f, 10.177f, 0.078f)
                curveTo(4.992f, 0.659f, 0.752f, 4.835f, 0.095f, 10.007f)
                curveToRelative(-0.451f, 3.552f, 0.725f, 7.04f, 3.225f, 9.57f)
                curveToRelative(0.683f, 0.691f, 1.578f, 1.041f, 2.467f, 1.041f)
                curveToRelative(0.754f, 0.0f, 1.504f, -0.251f, 2.116f, -0.759f)
                lineToRelative(1.515f, -1.172f)
                curveToRelative(0.655f, -0.507f, 0.775f, -1.449f, 0.269f, -2.104f)
                curveToRelative(-0.508f, -0.655f, -1.449f, -0.775f, -2.104f, -0.269f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(20.809f, 17.847f)
                curveToRelative(-0.28f, -0.521f, -0.821f, -0.846f, -1.413f, -0.846f)
                horizontalLineToRelative(-2.029f)
                lineToRelative(1.303f, -1.998f)
                curveToRelative(0.3f, -0.46f, 0.174f, -1.075f, -0.283f, -1.38f)
                curveToRelative(-0.463f, -0.308f, -1.088f, -0.181f, -1.393f, 0.284f)
                lineToRelative(-1.925f, 3.01f)
                curveToRelative(-0.147f, 0.487f, -0.055f, 1.022f, 0.249f, 1.431f)
                curveToRelative(0.303f, 0.408f, 0.788f, 0.652f, 1.297f, 0.652f)
                horizontalLineToRelative(2.035f)
                lineToRelative(-1.385f, 1.991f)
                curveToRelative(-0.318f, 0.458f, -0.2f, 1.087f, 0.262f, 1.398f)
                curveToRelative(0.454f, 0.305f, 1.068f, 0.189f, 1.379f, -0.26f)
                lineToRelative(1.824f, -2.639f)
                curveToRelative(0.327f, -0.493f, 0.357f, -1.123f, 0.077f, -1.645f)
                close()
            }
        }
        .build()
        return _gaugeCircleBolt!!
    }

private var _gaugeCircleBolt: ImageVector? = null
