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

public val Icons.Bold.RegionPin: ImageVector
    get() {
        if (_regionPin != null) {
            return _regionPin!!
        }
        _regionPin = Builder(name = "RegionPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.965f, 18.383f)
                lineToRelative(-0.935f, -7.941f)
                curveToRelative(-0.205f, -1.735f, -1.319f, -3.264f, -2.908f, -3.988f)
                curveToRelative(-0.752f, -0.346f, -1.643f, -0.012f, -1.987f, 0.742f)
                curveToRelative(-0.344f, 0.753f, -0.012f, 1.643f, 0.742f, 1.986f)
                curveToRelative(0.642f, 0.293f, 1.091f, 0.91f, 1.174f, 1.611f)
                lineToRelative(0.055f, 0.471f)
                lineToRelative(-9.455f, 4.503f)
                lineToRelative(-6.452f, -5.708f)
                curveToRelative(0.206f, -0.377f, 0.517f, -0.691f, 0.924f, -0.877f)
                curveToRelative(0.753f, -0.345f, 1.085f, -1.234f, 0.741f, -1.988f)
                curveToRelative(-0.344f, -0.753f, -1.234f, -1.087f, -1.988f, -0.74f)
                curveToRelative(-1.589f, 0.727f, -2.703f, 2.255f, -2.907f, 3.989f)
                lineTo(0.036f, 18.383f)
                curveToRelative(-0.168f, 1.425f, 0.283f, 2.857f, 1.236f, 3.93f)
                curveToRelative(0.953f, 1.072f, 2.323f, 1.688f, 3.758f, 1.688f)
                horizontalLineToRelative(13.94f)
                curveToRelative(1.435f, 0.0f, 2.805f, -0.615f, 3.758f, -1.688f)
                reflectiveCurveToRelative(1.404f, -2.504f, 1.237f, -3.93f)
                close()
                moveTo(3.513f, 20.32f)
                curveToRelative(-0.39f, -0.439f, -0.567f, -1.002f, -0.499f, -1.586f)
                lineToRelative(0.609f, -5.179f)
                lineToRelative(8.417f, 7.446f)
                horizontalLineToRelative(-7.011f)
                curveToRelative(-0.587f, 0.0f, -1.126f, -0.242f, -1.517f, -0.681f)
                close()
                moveTo(20.486f, 20.32f)
                curveToRelative(-0.391f, 0.438f, -0.929f, 0.681f, -1.517f, 0.681f)
                horizontalLineToRelative(-2.403f)
                lineToRelative(-3.474f, -3.073f)
                lineToRelative(7.384f, -3.516f)
                lineToRelative(0.509f, 4.323f)
                curveToRelative(0.068f, 0.584f, -0.109f, 1.146f, -0.499f, 1.586f)
                close()
                moveTo(11.112f, 11.126f)
                curveToRelative(0.493f, 0.482f, 1.281f, 0.482f, 1.774f, 0.0f)
                lineToRelative(2.648f, -2.59f)
                curveToRelative(1.953f, -1.953f, 1.953f, -5.118f, 0.0f, -7.071f)
                curveTo(14.559f, 0.488f, 13.28f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-1.28f, 0.0f, -2.559f, 0.488f, -3.536f, 1.464f)
                curveToRelative(-1.953f, 1.953f, -1.953f, 5.118f, 0.0f, 7.071f)
                lineToRelative(2.648f, 2.59f)
                close()
                moveTo(11.999f, 3.554f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _regionPin!!
    }

private var _regionPin: ImageVector? = null
