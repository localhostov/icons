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

public val Icons.Bold.FishingRod: ImageVector
    get() {
        if (_fishingRod != null) {
            return _fishingRod!!
        }
        _fishingRod = Builder(name = "FishingRod", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                curveToRelative(-0.483f, 0.0f, -0.946f, 0.086f, -1.375f, 0.244f)
                curveToRelative(1.543f, -5.195f, 5.959f, -7.896f, 13.375f, -8.212f)
                verticalLineToRelative(2.469f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(21.0f, 2.518f)
                curveToRelative(0.0f, -0.673f, -0.277f, -1.328f, -0.761f, -1.798f)
                curveToRelative(-0.487f, -0.474f, -1.111f, -0.728f, -1.802f, -0.705f)
                curveTo(8.045f, 0.298f, 2.116f, 4.911f, 1.143f, 13.402f)
                curveToRelative(-0.687f, 0.446f, -1.143f, 1.219f, -1.143f, 2.098f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-2.627f)
                curveToRelative(0.32f, 0.083f, 0.655f, 0.127f, 1.0f, 0.127f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(6.0f, 16.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(22.492f, 22.875f)
                curveToRelative(0.043f, 0.341f, -0.092f, 0.681f, -0.358f, 0.898f)
                curveToRelative(-0.181f, 0.148f, -0.406f, 0.227f, -0.634f, 0.227f)
                curveToRelative(-0.106f, 0.0f, -0.213f, -0.017f, -0.316f, -0.052f)
                lineToRelative(-1.684f, -0.562f)
                lineToRelative(-1.684f, 0.562f)
                curveToRelative(-0.327f, 0.11f, -0.685f, 0.042f, -0.951f, -0.175f)
                curveToRelative(-0.266f, -0.218f, -0.401f, -0.558f, -0.358f, -0.898f)
                lineToRelative(0.095f, -0.753f)
                curveToRelative(0.195f, -1.55f, 1.344f, -2.648f, 1.772f, -3.009f)
                curveToRelative(-1.023f, -1.051f, -2.374f, -2.816f, -2.374f, -4.818f)
                reflectiveCurveToRelative(1.353f, -3.771f, 2.377f, -4.821f)
                curveToRelative(0.616f, -0.632f, 1.63f, -0.632f, 2.246f, 0.0f)
                curveToRelative(1.024f, 1.05f, 2.377f, 2.818f, 2.377f, 4.821f)
                reflectiveCurveToRelative(-1.351f, 3.767f, -2.374f, 4.818f)
                curveToRelative(0.428f, 0.361f, 1.576f, 1.46f, 1.772f, 3.009f)
                lineToRelative(0.095f, 0.753f)
                close()
            }
        }
        .build()
        return _fishingRod!!
    }

private var _fishingRod: ImageVector? = null
