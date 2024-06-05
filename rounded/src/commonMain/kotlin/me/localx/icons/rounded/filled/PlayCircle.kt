package me.localx.icons.rounded.filled

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

public val Icons.Filled.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = Builder(name = "PlayCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(16.404f, 13.873f)
                lineToRelative(-5.212f, 2.854f)
                curveToRelative(-0.325f, 0.183f, -0.683f, 0.274f, -1.041f, 0.274f)
                curveToRelative(-0.373f, 0.0f, -0.747f, -0.099f, -1.087f, -0.297f)
                curveToRelative(-0.667f, -0.39f, -1.064f, -1.083f, -1.064f, -1.855f)
                verticalLineToRelative(-5.699f)
                curveToRelative(0.0f, -0.772f, 0.397f, -1.465f, 1.064f, -1.855f)
                curveToRelative(0.665f, -0.389f, 1.465f, -0.396f, 2.138f, -0.017f)
                lineToRelative(5.192f, 2.843f)
                curveToRelative(0.696f, 0.391f, 1.105f, 1.091f, 1.105f, 1.878f)
                reflectiveCurveToRelative(-0.409f, 1.487f, -1.096f, 1.873f)
                close()
                moveTo(15.5f, 12.0f)
                curveToRelative(0.0f, 0.087f, -0.058f, 0.119f, -0.066f, 0.125f)
                lineToRelative(-5.212f, 2.855f)
                curveToRelative(-0.019f, 0.01f, -0.077f, 0.042f, -0.147f, -0.001f)
                curveToRelative(-0.074f, -0.043f, -0.074f, -0.107f, -0.074f, -0.128f)
                verticalLineToRelative(-5.699f)
                curveToRelative(0.0f, -0.021f, 0.0f, -0.085f, 0.074f, -0.128f)
                curveToRelative(0.027f, -0.016f, 0.052f, -0.021f, 0.074f, -0.021f)
                curveToRelative(0.036f, 0.0f, 0.065f, 0.016f, 0.083f, 0.026f)
                lineToRelative(5.192f, 2.844f)
                curveToRelative(0.019f, 0.011f, 0.076f, 0.043f, 0.076f, 0.13f)
                close()
            }
        }
        .build()
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
