package me.localx.icons.rounded.outline

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

public val Icons.Outline.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 11.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(22.717f, 0.334f)
                curveToRelative(-0.81f, -0.461f, -1.773f, -0.449f, -2.575f, 0.028f)
                curveToRelative(-1.333f, 0.793f, -4.795f, 2.638f, -8.142f, 2.638f)
                reflectiveCurveTo(5.191f, 1.155f, 3.858f, 0.362f)
                curveToRelative(-0.802f, -0.478f, -1.765f, -0.488f, -2.575f, -0.028f)
                curveTo(0.479f, 0.791f, 0.0f, 1.616f, 0.0f, 2.542f)
                verticalLineToRelative(18.913f)
                curveToRelative(0.0f, 0.926f, 0.479f, 1.751f, 1.283f, 2.208f)
                curveToRelative(0.81f, 0.46f, 1.772f, 0.45f, 2.575f, -0.028f)
                curveToRelative(1.332f, -0.792f, 4.79f, -2.635f, 8.142f, -2.635f)
                reflectiveCurveToRelative(6.811f, 1.843f, 8.142f, 2.635f)
                curveToRelative(0.41f, 0.244f, 0.861f, 0.366f, 1.312f, 0.366f)
                curveToRelative(0.433f, 0.0f, 0.866f, -0.112f, 1.263f, -0.338f)
                curveToRelative(0.803f, -0.457f, 1.283f, -1.282f, 1.283f, -2.208f)
                lineTo(24.0f, 2.542f)
                curveToRelative(0.0f, -0.926f, -0.479f, -1.751f, -1.283f, -2.208f)
                close()
                moveTo(2.271f, 2.072f)
                curveToRelative(0.084f, -0.047f, 0.308f, -0.144f, 0.564f, 0.009f)
                curveToRelative(1.475f, 0.878f, 5.321f, 2.919f, 9.165f, 2.919f)
                reflectiveCurveToRelative(7.689f, -2.041f, 9.165f, -2.919f)
                curveToRelative(0.256f, -0.152f, 0.479f, -0.056f, 0.564f, -0.009f)
                curveToRelative(0.102f, 0.058f, 0.271f, 0.195f, 0.271f, 0.47f)
                verticalLineToRelative(18.913f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, -0.001f, 0.031f)
                lineToRelative(-10.313f, -10.314f)
                curveToRelative(-1.51f, -1.511f, -4.146f, -1.513f, -5.657f, 0.0f)
                lineToRelative(-4.029f, 4.028f)
                lineTo(2.0f, 2.542f)
                curveToRelative(0.0f, -0.274f, 0.17f, -0.412f, 0.271f, -0.47f)
                close()
                moveTo(2.835f, 21.916f)
                curveToRelative(-0.256f, 0.151f, -0.479f, 0.057f, -0.564f, 0.009f)
                curveToRelative(-0.102f, -0.058f, -0.271f, -0.195f, -0.271f, -0.47f)
                verticalLineToRelative(-3.427f)
                lineToRelative(5.443f, -5.442f)
                curveToRelative(0.756f, -0.757f, 2.073f, -0.755f, 2.829f, 0.0f)
                lineToRelative(7.768f, 7.768f)
                curveToRelative(-1.736f, -0.716f, -3.886f, -1.354f, -6.039f, -1.354f)
                curveToRelative(-3.848f, 0.0f, -7.691f, 2.039f, -9.165f, 2.916f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
