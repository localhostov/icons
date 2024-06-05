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

public val Icons.Outline.Seedling: ImageVector
    get() {
        if (_seedling != null) {
            return _seedling!!
        }
        _seedling = Builder(name = "Seedling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.25f, 0.601f)
                curveToRelative(-0.49f, -0.448f, -1.147f, -0.663f, -1.802f, -0.586f)
                curveToRelative(-5.656f, 0.654f, -8.256f, 4.435f, -9.448f, 7.57f)
                curveTo(10.808f, 4.45f, 8.208f, 0.669f, 2.552f, 0.015f)
                curveTo(1.902f, -0.061f, 1.24f, 0.153f, 0.75f, 0.601f)
                curveTo(0.265f, 1.046f, -0.004f, 1.674f, 0.013f, 2.323f)
                curveToRelative(0.087f, 3.27f, 1.156f, 5.867f, 3.179f, 7.72f)
                curveToRelative(2.607f, 2.388f, 6.082f, 2.863f, 7.809f, 2.943f)
                verticalLineToRelative(10.014f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-10.014f)
                curveToRelative(1.727f, -0.08f, 5.202f, -0.555f, 7.809f, -2.943f)
                curveToRelative(2.022f, -1.853f, 3.092f, -4.45f, 3.179f, -7.72f)
                curveToRelative(0.017f, -0.649f, -0.252f, -1.277f, -0.737f, -1.722f)
                close()
                moveTo(4.532f, 8.559f)
                curveToRelative(-1.601f, -1.472f, -2.448f, -3.588f, -2.52f, -6.289f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.003f, -0.096f, 0.054f, -0.163f, 0.088f, -0.194f)
                curveToRelative(0.033f, -0.03f, 0.099f, -0.076f, 0.189f, -0.076f)
                curveToRelative(6.564f, 0.759f, 8.204f, 6.539f, 8.591f, 8.973f)
                curveToRelative(-1.509f, -0.099f, -4.317f, -0.545f, -6.349f, -2.414f)
                close()
                moveTo(21.987f, 2.271f)
                curveToRelative(-0.071f, 2.701f, -0.919f, 4.817f, -2.52f, 6.289f)
                curveToRelative(-2.033f, 1.87f, -4.845f, 2.315f, -6.353f, 2.414f)
                curveToRelative(0.379f, -2.432f, 2.003f, -8.21f, 8.595f, -8.973f)
                curveToRelative(0.091f, 0.0f, 0.156f, 0.046f, 0.189f, 0.076f)
                curveToRelative(0.034f, 0.031f, 0.091f, 0.098f, 0.088f, 0.193f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _seedling!!
    }

private var _seedling: ImageVector? = null
