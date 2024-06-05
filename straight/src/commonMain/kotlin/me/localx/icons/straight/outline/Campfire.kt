package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.067f, 19.006f)
                lineToRelative(8.837f, 3.048f)
                lineToRelative(-0.652f, 1.891f)
                lineToRelative(-11.251f, -3.881f)
                lineTo(0.749f, 23.945f)
                lineToRelative(-0.652f, -1.891f)
                lineToRelative(8.837f, -3.048f)
                lineTo(0.097f, 15.958f)
                lineToRelative(0.652f, -1.891f)
                lineToRelative(11.251f, 3.881f)
                lineToRelative(11.251f, -3.881f)
                lineToRelative(0.652f, 1.891f)
                lineToRelative(-8.837f, 3.048f)
                close()
                moveTo(5.0f, 9.0f)
                curveToRelative(0.0f, -2.181f, 1.3f, -3.774f, 2.277f, -4.783f)
                lineToRelative(1.152f, -1.189f)
                lineToRelative(0.516f, 1.575f)
                curveToRelative(0.128f, 0.389f, 0.306f, 0.81f, 0.463f, 1.115f)
                curveToRelative(0.091f, -0.292f, 0.186f, -0.74f, 0.256f, -1.073f)
                curveToRelative(0.245f, -1.163f, 0.551f, -2.611f, 1.58f, -3.799f)
                lineToRelative(0.703f, -0.812f)
                lineToRelative(0.76f, 0.76f)
                curveToRelative(0.432f, 0.432f, 1.021f, 0.902f, 1.644f, 1.4f)
                curveToRelative(2.071f, 1.655f, 4.649f, 3.716f, 4.649f, 6.807f)
                curveToRelative(0.0f, 3.86f, -3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                close()
                moveTo(13.06f, 11.451f)
                lineToRelative(-1.06f, -1.061f)
                lineToRelative(-1.062f, 1.061f)
                curveToRelative(-0.584f, 0.585f, -0.584f, 1.537f, 0.0f, 2.123f)
                curveToRelative(0.584f, 0.584f, 1.535f, 0.584f, 2.121f, 0.0f)
                curveToRelative(0.584f, -0.584f, 0.584f, -1.537f, 0.0f, -2.123f)
                close()
                moveTo(7.0f, 9.0f)
                curveToRelative(0.0f, 1.394f, 0.582f, 2.649f, 1.506f, 3.557f)
                curveToRelative(-0.011f, -0.911f, 0.326f, -1.826f, 1.019f, -2.52f)
                lineToRelative(2.476f, -2.476f)
                lineToRelative(2.475f, 2.476f)
                curveToRelative(0.695f, 0.695f, 1.031f, 1.612f, 1.018f, 2.525f)
                curveToRelative(0.926f, -0.908f, 1.507f, -2.166f, 1.507f, -3.563f)
                curveToRelative(0.0f, -2.129f, -2.071f, -3.785f, -3.898f, -5.245f)
                curveToRelative(-0.309f, -0.247f, -0.609f, -0.487f, -0.895f, -0.725f)
                curveToRelative(-0.294f, 0.644f, -0.446f, 1.366f, -0.586f, 2.028f)
                curveToRelative(-0.263f, 1.242f, -0.621f, 2.942f, -2.339f, 2.942f)
                curveToRelative(-0.248f, 0.0f, -0.878f, 0.0f, -1.561f, -1.187f)
                curveToRelative(-0.493f, 0.744f, -0.722f, 1.448f, -0.722f, 2.186f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
