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

public val Icons.Outline.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 9.501f)
                curveToRelative(0.0f, 3.067f, -1.495f, 5.961f, -3.998f, 7.743f)
                curveToRelative(-0.999f, 0.71f, -1.835f, 1.798f, -2.632f, 3.425f)
                curveToRelative(-0.458f, 0.935f, -1.171f, 1.745f, -2.061f, 2.34f)
                curveToRelative(-0.984f, 0.659f, -2.144f, 0.985f, -3.303f, 0.985f)
                curveToRelative(-1.266f, 0.0f, -2.531f, -0.389f, -3.569f, -1.163f)
                curveToRelative(-1.553f, -1.157f, -2.437f, -2.92f, -2.426f, -4.837f)
                curveToRelative(0.003f, -0.55f, 0.45f, -0.994f, 1.0f, -0.994f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.552f, 0.003f, 0.997f, 0.454f, 0.994f, 1.006f)
                curveToRelative(-0.008f, 1.274f, 0.583f, 2.449f, 1.621f, 3.222f)
                curveToRelative(1.32f, 0.983f, 3.198f, 1.033f, 4.563f, 0.119f)
                curveToRelative(0.606f, -0.406f, 1.069f, -0.93f, 1.377f, -1.558f)
                curveToRelative(0.949f, -1.938f, 1.988f, -3.264f, 3.269f, -4.175f)
                curveToRelative(1.978f, -1.406f, 3.158f, -3.691f, 3.158f, -6.113f)
                curveToRelative(0.0f, -2.132f, -0.913f, -4.171f, -2.504f, -5.594f)
                curveToRelative(-1.614f, -1.441f, -3.693f, -2.099f, -5.87f, -1.857f)
                curveToRelative(-3.335f, 0.375f, -6.09f, 3.056f, -6.551f, 6.375f)
                curveToRelative(-0.07f, 0.505f, -0.091f, 1.016f, -0.062f, 1.517f)
                curveToRelative(0.032f, 0.551f, -0.389f, 1.024f, -0.94f, 1.056f)
                curveToRelative(-0.539f, 0.033f, -1.024f, -0.39f, -1.056f, -0.941f)
                curveToRelative(-0.037f, -0.631f, -0.011f, -1.273f, 0.078f, -1.908f)
                curveTo(3.68f, 3.94f, 7.174f, 0.539f, 11.403f, 0.063f)
                curveToRelative(2.708f, -0.308f, 5.412f, 0.554f, 7.426f, 2.353f)
                curveToRelative(2.015f, 1.801f, 3.171f, 4.384f, 3.171f, 7.085f)
                close()
                moveTo(12.5f, 6.001f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-2.823f, 0.0f, -5.186f, 2.102f, -5.494f, 4.889f)
                curveToRelative(-0.004f, 0.036f, -0.006f, 0.073f, -0.006f, 0.11f)
                curveToRelative(0.0f, 1.298f, 1.03f, 2.0f, 2.0f, 2.001f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.342f, -2.996f, -2.992f, -3.001f)
                curveToRelative(0.245f, -1.717f, 1.728f, -2.999f, 3.492f, -2.999f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
