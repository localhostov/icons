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

public val Icons.Outline.Massage: ImageVector
    get() {
        if (_massage != null) {
            return _massage!!
        }
        _massage = Builder(name = "Massage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.388f, 13.297f)
                curveToRelative(0.06f, 0.066f, -0.075f, -0.048f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(16.539f, 13.343f)
                curveToRelative(-0.058f, 0.063f, 0.072f, -0.046f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(23.972f, 11.729f)
                curveToRelative(-0.902f, 5.856f, -6.049f, 10.271f, -11.972f, 10.271f)
                reflectiveCurveTo(0.931f, 17.584f, 0.028f, 11.729f)
                curveToRelative(-0.116f, -0.756f, 0.126f, -1.498f, 0.664f, -2.037f)
                curveToRelative(0.539f, -0.538f, 1.28f, -0.78f, 2.036f, -0.664f)
                curveToRelative(1.557f, 0.24f, 3.013f, 0.78f, 4.311f, 1.555f)
                curveToRelative(0.256f, -2.731f, 1.334f, -5.527f, 3.001f, -7.64f)
                curveToRelative(0.473f, -0.6f, 1.188f, -0.944f, 1.962f, -0.944f)
                reflectiveCurveToRelative(1.489f, 0.344f, 1.962f, 0.944f)
                curveToRelative(1.665f, 2.11f, 2.742f, 4.906f, 2.997f, 7.639f)
                curveToRelative(1.297f, -0.775f, 2.753f, -1.315f, 4.31f, -1.555f)
                curveToRelative(0.756f, -0.116f, 1.498f, 0.126f, 2.037f, 0.664f)
                curveToRelative(0.538f, 0.539f, 0.78f, 1.281f, 0.664f, 2.036f)
                close()
                moveTo(10.944f, 19.944f)
                curveToRelative(-0.278f, -2.596f, -1.641f, -4.992f, -3.556f, -6.647f)
                curveToRelative(-1.359f, -1.115f, -3.142f, -2.011f, -4.964f, -2.292f)
                curveToRelative(-0.021f, -0.003f, -0.203f, 0.0f, -0.317f, 0.102f)
                curveToRelative(-0.052f, 0.046f, -0.127f, 0.155f, -0.102f, 0.318f)
                curveToRelative(0.699f, 4.537f, 4.45f, 8.039f, 8.939f, 8.519f)
                close()
                moveTo(12.0f, 16.223f)
                curveToRelative(0.697f, -1.6f, 1.732f, -3.033f, 3.018f, -4.199f)
                curveToRelative(0.056f, -2.727f, -0.93f, -5.695f, -2.623f, -7.842f)
                curveToRelative(-0.13f, -0.164f, -0.317f, -0.182f, -0.392f, -0.182f)
                curveToRelative(-0.075f, 0.0f, -0.262f, 0.018f, -0.392f, 0.182f)
                curveToRelative(-1.696f, 2.15f, -2.684f, 5.119f, -2.629f, 7.842f)
                curveToRelative(1.286f, 1.166f, 2.321f, 2.599f, 3.018f, 4.199f)
                close()
                moveTo(21.893f, 11.107f)
                curveToRelative(-0.124f, -0.132f, -0.296f, -0.105f, -0.318f, -0.102f)
                curveToRelative(-1.824f, 0.281f, -3.676f, 1.22f, -5.036f, 2.337f)
                curveToRelative(-1.916f, 1.655f, -3.205f, 4.005f, -3.483f, 6.602f)
                curveToRelative(4.489f, -0.48f, 8.24f, -3.982f, 8.939f, -8.52f)
                curveToRelative(0.025f, -0.163f, -0.055f, -0.267f, -0.102f, -0.317f)
                close()
            }
        }
        .build()
        return _massage!!
    }

private var _massage: ImageVector? = null
