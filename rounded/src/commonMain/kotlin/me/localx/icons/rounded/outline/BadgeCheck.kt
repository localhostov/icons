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

public val Icons.Outline.BadgeCheck: ImageVector
    get() {
        if (_badgeCheck != null) {
            return _badgeCheck!!
        }
        _badgeCheck = Builder(name = "BadgeCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-1.626f, 0.0f, -3.16f, -0.714f, -4.208f, -1.959f)
                curveToRelative(-1.54f, 0.176f, -3.127f, -0.405f, -4.277f, -1.555f)
                curveToRelative(-1.149f, -1.15f, -1.729f, -2.74f, -1.59f, -4.362f)
                curveToRelative(-1.211f, -0.964f, -1.925f, -2.498f, -1.925f, -4.124f)
                reflectiveCurveToRelative(0.714f, -3.16f, 1.96f, -4.208f)
                curveToRelative(-0.175f, -1.537f, 0.405f, -3.127f, 1.555f, -4.277f)
                curveToRelative(1.15f, -1.15f, 2.737f, -1.733f, 4.361f, -1.59f)
                curveToRelative(0.964f, -1.21f, 2.498f, -1.925f, 4.124f, -1.925f)
                reflectiveCurveToRelative(3.16f, 0.714f, 4.208f, 1.959f)
                curveToRelative(1.542f, -0.173f, 3.127f, 0.405f, 4.277f, 1.555f)
                curveToRelative(1.149f, 1.15f, 1.729f, 2.74f, 1.59f, 4.362f)
                curveToRelative(1.211f, 0.964f, 1.925f, 2.498f, 1.925f, 4.124f)
                reflectiveCurveToRelative(-0.714f, 3.16f, -1.96f, 4.208f)
                curveToRelative(0.175f, 1.537f, -0.405f, 3.127f, -1.555f, 4.277f)
                curveToRelative(-1.151f, 1.15f, -2.741f, 1.726f, -4.361f, 1.59f)
                curveToRelative(-0.964f, 1.21f, -2.498f, 1.925f, -4.124f, 1.925f)
                close()
                moveTo(7.873f, 20.076f)
                curveToRelative(0.561f, 0.0f, 1.081f, 0.241f, 1.448f, 0.676f)
                curveToRelative(0.668f, 0.793f, 1.644f, 1.248f, 2.679f, 1.248f)
                reflectiveCurveToRelative(2.011f, -0.455f, 2.679f, -1.248f)
                curveToRelative(0.403f, -0.479f, 0.99f, -0.721f, 1.616f, -0.67f)
                curveToRelative(1.034f, 0.087f, 2.044f, -0.28f, 2.776f, -1.012f)
                curveToRelative(0.731f, -0.731f, 1.1f, -1.743f, 1.012f, -2.776f)
                curveToRelative(-0.054f, -0.624f, 0.19f, -1.213f, 0.67f, -1.617f)
                curveToRelative(0.792f, -0.667f, 1.247f, -1.644f, 1.247f, -2.678f)
                reflectiveCurveToRelative(-0.455f, -2.011f, -1.247f, -2.678f)
                curveToRelative(-0.479f, -0.403f, -0.724f, -0.993f, -0.67f, -1.617f)
                curveToRelative(0.088f, -1.033f, -0.28f, -2.045f, -1.012f, -2.776f)
                reflectiveCurveToRelative(-1.748f, -1.094f, -2.775f, -1.012f)
                curveToRelative(-0.626f, 0.056f, -1.214f, -0.191f, -1.617f, -0.669f)
                curveToRelative(-0.668f, -0.793f, -1.644f, -1.248f, -2.679f, -1.248f)
                reflectiveCurveToRelative(-2.011f, 0.455f, -2.679f, 1.248f)
                curveToRelative(-0.404f, 0.479f, -0.993f, 0.719f, -1.616f, 0.67f)
                curveToRelative(-1.039f, -0.09f, -2.044f, 0.28f, -2.776f, 1.012f)
                curveToRelative(-0.731f, 0.731f, -1.1f, 1.743f, -1.012f, 2.776f)
                curveToRelative(0.054f, 0.624f, -0.19f, 1.213f, -0.67f, 1.617f)
                curveToRelative(-0.792f, 0.667f, -1.247f, 1.644f, -1.247f, 2.678f)
                reflectiveCurveToRelative(0.455f, 2.011f, 1.247f, 2.678f)
                curveToRelative(0.479f, 0.403f, 0.724f, 0.993f, 0.67f, 1.617f)
                curveToRelative(-0.088f, 1.033f, 0.28f, 2.045f, 1.012f, 2.776f)
                curveToRelative(0.732f, 0.731f, 1.753f, 1.095f, 2.775f, 1.012f)
                curveToRelative(0.057f, -0.005f, 0.113f, -0.007f, 0.169f, -0.007f)
                close()
                moveTo(12.801f, 15.135f)
                lineToRelative(4.739f, -4.568f)
                curveToRelative(0.397f, -0.383f, 0.409f, -1.017f, 0.025f, -1.414f)
                curveToRelative(-0.383f, -0.397f, -1.016f, -0.409f, -1.414f, -0.026f)
                lineToRelative(-4.752f, 4.581f)
                curveToRelative(-0.391f, 0.391f, -1.022f, 0.391f, -1.44f, -0.025f)
                lineToRelative(-2.278f, -2.117f)
                curveToRelative(-0.402f, -0.375f, -1.036f, -0.353f, -1.413f, 0.052f)
                curveToRelative(-0.376f, 0.404f, -0.353f, 1.037f, 0.052f, 1.413f)
                lineToRelative(2.252f, 2.092f)
                curveToRelative(0.586f, 0.586f, 1.357f, 0.879f, 2.126f, 0.879f)
                curveToRelative(0.765f, 0.0f, 1.526f, -0.289f, 2.104f, -0.866f)
                close()
            }
        }
        .build()
        return _badgeCheck!!
    }

private var _badgeCheck: ImageVector? = null
