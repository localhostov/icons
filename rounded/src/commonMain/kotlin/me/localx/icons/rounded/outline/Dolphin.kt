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

public val Icons.Outline.Dolphin: ImageVector
    get() {
        if (_dolphin != null) {
            return _dolphin!!
        }
        _dolphin = Builder(name = "Dolphin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.938f, 7.0f)
                curveToRelative(-0.448f, -3.623f, -3.327f, -7.0f, -8.438f, -7.0f)
                curveToRelative(-2.004f, 0.0f, -4.134f, 0.486f, -6.01f, 1.607f)
                curveTo(5.991f, 0.906f, 3.951f, 0.248f, 1.313f, 0.004f)
                curveTo(0.394f, -0.081f, -0.451f, 1.127f, 0.273f, 1.699f)
                curveToRelative(1.591f, 1.259f, 2.661f, 2.666f, 3.379f, 3.935f)
                curveToRelative(-1.025f, 1.889f, -1.652f, 4.314f, -1.652f, 7.365f)
                curveToRelative(0.0f, 2.43f, 0.61f, 4.695f, 1.075f, 6.066f)
                curveToRelative(-1.491f, 0.723f, -2.647f, 2.076f, -3.045f, 3.677f)
                curveToRelative(-0.169f, 0.68f, 0.397f, 1.349f, 1.09f, 1.246f)
                curveToRelative(3.191f, -0.477f, 4.38f, -2.737f, 4.38f, -2.737f)
                curveToRelative(0.0f, 0.0f, 1.227f, 2.256f, 4.38f, 2.737f)
                curveToRelative(0.693f, 0.106f, 1.26f, -0.565f, 1.09f, -1.245f)
                curveToRelative(-0.43f, -1.726f, -1.74f, -3.164f, -3.401f, -3.835f)
                curveToRelative(0.206f, -1.705f, 0.859f, -3.543f, 1.754f, -4.841f)
                curveToRelative(0.79f, -1.145f, 1.814f, -1.881f, 2.897f, -2.344f)
                curveToRelative(0.373f, 0.565f, 0.764f, 1.455f, 1.064f, 2.862f)
                curveToRelative(0.138f, 0.646f, 1.181f, 0.486f, 1.418f, -0.13f)
                curveToRelative(0.553f, -1.441f, 0.83f, -2.574f, 0.952f, -3.447f)
                curveToRelative(0.152f, -0.005f, 6.346f, -0.008f, 6.346f, -0.008f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.958f, -2.0f, -2.062f, -2.0f)
                close()
                moveTo(16.101f, 9.0f)
                curveToRelative(-3.737f, 0.0f, -6.65f, 1.359f, -8.424f, 3.933f)
                curveToRelative(-1.052f, 1.525f, -1.807f, 3.592f, -2.072f, 5.571f)
                curveToRelative(-0.035f, 0.0f, -0.435f, 0.007f, -0.598f, 0.022f)
                curveToRelative(-0.417f, -1.215f, -1.006f, -3.32f, -1.006f, -5.525f)
                curveTo(4.0f, 2.53f, 11.914f, 2.0f, 13.5f, 2.0f)
                curveToRelative(4.466f, 0.0f, 6.5f, 3.11f, 6.5f, 6.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(-4.899f)
                close()
            }
        }
        .build()
        return _dolphin!!
    }

private var _dolphin: ImageVector? = null
