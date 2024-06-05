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

public val Icons.Bold.DrumstickBite: ImageVector
    get() {
        if (_drumstickBite != null) {
            return _drumstickBite!!
        }
        _drumstickBite = Builder(name = "DrumstickBite", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.49f, 2.509f)
                curveToRelative(-3.34f, -3.34f, -8.775f, -3.342f, -12.115f, 0.0f)
                curveToRelative(-2.238f, 2.239f, -3.063f, 7.032f, -3.36f, 10.66f)
                curveToRelative(-0.065f, 0.792f, 0.103f, 1.564f, 0.432f, 2.263f)
                lineToRelative(-3.099f, 3.099f)
                curveToRelative(-0.356f, -0.327f, -0.827f, -0.531f, -1.348f, -0.531f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.521f, -0.204f, -0.992f, -0.531f, -1.348f)
                lineToRelative(3.093f, -3.092f)
                curveToRelative(0.591f, 0.278f, 1.233f, 0.44f, 1.897f, 0.44f)
                curveToRelative(0.123f, 0.0f, 0.247f, -0.005f, 0.372f, -0.015f)
                curveToRelative(1.02f, -0.084f, 2.578f, -0.252f, 4.215f, -0.579f)
                curveToRelative(0.415f, -0.083f, 0.776f, -0.338f, 0.994f, -0.702f)
                curveToRelative(0.217f, -0.364f, 0.271f, -0.803f, 0.146f, -1.208f)
                curveToRelative(-0.124f, -0.404f, -0.187f, -0.823f, -0.187f, -1.246f)
                curveToRelative(0.0f, -2.343f, 1.906f, -4.25f, 4.25f, -4.25f)
                curveToRelative(0.572f, 0.0f, 1.127f, 0.111f, 1.647f, 0.332f)
                curveToRelative(0.449f, 0.189f, 0.963f, 0.149f, 1.379f, -0.11f)
                curveToRelative(0.414f, -0.259f, 0.677f, -0.703f, 0.703f, -1.191f)
                curveToRelative(0.131f, -2.432f, -0.776f, -4.809f, -2.489f, -6.521f)
                close()
                moveTo(20.25f, 7.0f)
                curveToRelative(-3.998f, 0.0f, -7.25f, 3.252f, -7.25f, 7.25f)
                curveToRelative(0.0f, 0.155f, 0.005f, 0.311f, 0.015f, 0.465f)
                curveToRelative(-0.944f, 0.142f, -1.799f, 0.228f, -2.43f, 0.28f)
                curveToRelative(-0.443f, 0.033f, -0.856f, -0.118f, -1.159f, -0.421f)
                reflectiveCurveToRelative(-0.457f, -0.726f, -0.421f, -1.16f)
                curveToRelative(0.352f, -4.292f, 1.283f, -7.575f, 2.491f, -8.784f)
                curveToRelative(1.085f, -1.085f, 2.511f, -1.628f, 3.937f, -1.628f)
                reflectiveCurveToRelative(2.852f, 0.543f, 3.937f, 1.628f)
                curveToRelative(0.668f, 0.668f, 1.147f, 1.493f, 1.404f, 2.388f)
                curveToRelative(-0.173f, -0.012f, -0.348f, -0.019f, -0.523f, -0.019f)
                close()
            }
        }
        .build()
        return _drumstickBite!!
    }

private var _drumstickBite: ImageVector? = null
