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

public val Icons.Outline.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = Builder(name = "Mountain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.625f, 19.29f)
                lineTo(14.476f, 1.493f)
                curveToRelative(-0.488f, -0.921f, -1.437f, -1.493f, -2.476f, -1.493f)
                reflectiveCurveToRelative(-1.988f, 0.572f, -2.481f, 1.503f)
                lineTo(0.377f, 19.285f)
                curveToRelative(-0.535f, 1.016f, -0.501f, 2.208f, 0.091f, 3.192f)
                curveToRelative(0.591f, 0.981f, 1.626f, 1.567f, 2.769f, 1.567f)
                horizontalLineToRelative(17.524f)
                curveToRelative(1.143f, 0.0f, 2.178f, -0.586f, 2.769f, -1.567f)
                curveToRelative(0.594f, -0.986f, 0.626f, -2.182f, 0.093f, -3.188f)
                close()
                moveTo(11.292f, 2.428f)
                curveToRelative(0.205f, -0.387f, 0.563f, -0.428f, 0.708f, -0.428f)
                reflectiveCurveToRelative(0.504f, 0.042f, 0.703f, 0.417f)
                lineToRelative(3.575f, 6.954f)
                lineToRelative(-1.475f, 2.521f)
                lineToRelative(-0.947f, -1.563f)
                curveToRelative(-0.18f, -0.297f, -0.501f, -0.479f, -0.849f, -0.482f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-0.345f, 0.0f, -0.665f, 0.177f, -0.848f, 0.47f)
                lineToRelative(-1.625f, 2.7f)
                lineToRelative(-2.579f, -4.084f)
                lineToRelative(3.344f, -6.504f)
                close()
                moveTo(21.818f, 21.446f)
                curveToRelative(-0.229f, 0.38f, -0.614f, 0.599f, -1.056f, 0.599f)
                lineTo(3.238f, 22.045f)
                curveToRelative(-0.442f, 0.0f, -0.827f, -0.218f, -1.056f, -0.599f)
                curveToRelative(-0.232f, -0.385f, -0.244f, -0.834f, -0.034f, -1.231f)
                curveToRelative(0.002f, -0.003f, 0.004f, -0.007f, 0.005f, -0.011f)
                lineToRelative(4.732f, -9.206f)
                lineToRelative(1.95f, 3.087f)
                curveToRelative(0.362f, 0.573f, 0.982f, 0.915f, 1.659f, 0.915f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.679f, -0.001f, 1.3f, -0.347f, 1.66f, -0.922f)
                lineToRelative(0.827f, -1.323f)
                lineToRelative(0.198f, 0.328f)
                curveToRelative(0.349f, 0.576f, 0.948f, 0.87f, 1.633f, 0.913f)
                curveToRelative(0.674f, -0.005f, 1.279f, -0.355f, 1.62f, -0.937f)
                lineToRelative(0.924f, -1.578f)
                lineToRelative(4.49f, 8.735f)
                curveToRelative(0.21f, 0.397f, 0.198f, 0.846f, -0.034f, 1.231f)
                close()
            }
        }
        .build()
        return _mountain!!
    }

private var _mountain: ImageVector? = null
