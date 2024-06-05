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

public val Icons.Outline.UfoBeam: ImageVector
    get() {
        if (_ufoBeam != null) {
            return _ufoBeam!!
        }
        _ufoBeam = Builder(name = "UfoBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.95f, 5.227f)
                curveToRelative(-0.38f, -2.945f, -2.904f, -5.227f, -5.95f, -5.227f)
                reflectiveCurveToRelative(-5.57f, 2.282f, -5.95f, 5.227f)
                curveTo(2.192f, 6.014f, 0.0f, 7.492f, 0.0f, 9.333f)
                curveToRelative(0.0f, 3.063f, 6.037f, 4.667f, 12.0f, 4.667f)
                reflectiveCurveToRelative(12.0f, -1.604f, 12.0f, -4.667f)
                curveToRelative(0.0f, -1.841f, -2.192f, -3.319f, -6.05f, -4.106f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(0.049f)
                reflectiveCurveToRelative(0.0f, 0.006f, 0.0f, 0.009f)
                verticalLineToRelative(0.148f)
                curveToRelative(-0.475f, 0.285f, -1.652f, 0.795f, -4.0f, 0.795f)
                curveToRelative(-2.365f, 0.0f, -3.542f, -0.517f, -4.0f, -0.79f)
                verticalLineToRelative(-0.152f)
                reflectiveCurveToRelative(0.0f, -0.006f, 0.0f, -0.009f)
                verticalLineToRelative(-0.049f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-6.204f, 0.0f, -10.0f, -1.727f, -10.0f, -2.667f)
                curveToRelative(0.0f, -0.398f, 1.074f, -1.41f, 4.168f, -2.087f)
                curveToRelative(0.022f, 0.032f, 0.044f, 0.064f, 0.07f, 0.094f)
                curveToRelative(0.236f, 0.277f, 1.621f, 1.66f, 5.762f, 1.66f)
                reflectiveCurveToRelative(5.526f, -1.383f, 5.762f, -1.66f)
                curveToRelative(0.025f, -0.03f, 0.048f, -0.062f, 0.07f, -0.094f)
                curveToRelative(3.094f, 0.677f, 4.168f, 1.689f, 4.168f, 2.087f)
                curveToRelative(0.0f, 0.94f, -3.796f, 2.667f, -10.0f, 2.667f)
                close()
                moveTo(6.919f, 16.394f)
                lineToRelative(-3.0f, 7.0f)
                curveToRelative(-0.162f, 0.38f, -0.531f, 0.606f, -0.919f, 0.606f)
                curveToRelative(-0.131f, 0.0f, -0.265f, -0.025f, -0.394f, -0.081f)
                curveToRelative(-0.507f, -0.218f, -0.743f, -0.806f, -0.525f, -1.312f)
                lineToRelative(3.0f, -7.0f)
                curveToRelative(0.217f, -0.509f, 0.803f, -0.747f, 1.313f, -0.525f)
                curveToRelative(0.507f, 0.218f, 0.743f, 0.806f, 0.525f, 1.312f)
                close()
                moveTo(21.919f, 22.607f)
                curveToRelative(0.218f, 0.507f, -0.018f, 1.095f, -0.525f, 1.312f)
                curveToRelative(-0.128f, 0.056f, -0.262f, 0.081f, -0.394f, 0.081f)
                curveToRelative(-0.388f, 0.0f, -0.757f, -0.227f, -0.919f, -0.606f)
                lineToRelative(-3.0f, -7.0f)
                curveToRelative(-0.218f, -0.507f, 0.018f, -1.095f, 0.525f, -1.312f)
                curveToRelative(0.509f, -0.221f, 1.096f, 0.018f, 1.313f, 0.525f)
                lineToRelative(3.0f, 7.0f)
                close()
            }
        }
        .build()
        return _ufoBeam!!
    }

private var _ufoBeam: ImageVector? = null
