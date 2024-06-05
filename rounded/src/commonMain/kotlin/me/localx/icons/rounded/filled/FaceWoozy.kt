package me.localx.icons.rounded.filled

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

public val Icons.Filled.FaceWoozy: ImageVector
    get() {
        if (_faceWoozy != null) {
            return _faceWoozy!!
        }
        _faceWoozy = Builder(name = "FaceWoozy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.5f, 7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 1.343f, 1.5f, 3.0f)
                reflectiveCurveToRelative(-0.672f, 3.0f, -1.5f, 3.0f)
                reflectiveCurveToRelative(-1.5f, -1.343f, -1.5f, -3.0f)
                reflectiveCurveToRelative(0.672f, -3.0f, 1.5f, -3.0f)
                close()
                moveTo(11.895f, 9.553f)
                curveToRelative(0.247f, 0.494f, 0.047f, 1.095f, -0.447f, 1.342f)
                lineToRelative(-4.0f, 2.0f)
                curveToRelative(-0.144f, 0.072f, -0.296f, 0.105f, -0.446f, 0.105f)
                curveToRelative(-0.367f, 0.0f, -0.72f, -0.202f, -0.896f, -0.553f)
                curveToRelative(-0.247f, -0.494f, -0.047f, -1.095f, 0.447f, -1.342f)
                lineToRelative(4.0f, -2.0f)
                curveToRelative(0.494f, -0.247f, 1.094f, -0.047f, 1.342f, 0.447f)
                close()
                moveTo(5.0f, 10.001f)
                curveToRelative(-0.396f, 0.0f, -0.772f, -0.238f, -0.929f, -0.63f)
                curveToRelative(-0.205f, -0.513f, 0.045f, -1.095f, 0.558f, -1.299f)
                curveToRelative(1.213f, -0.484f, 2.777f, -1.484f, 3.539f, -2.626f)
                curveToRelative(0.305f, -0.46f, 0.928f, -0.585f, 1.387f, -0.277f)
                curveToRelative(0.46f, 0.307f, 0.584f, 0.927f, 0.277f, 1.387f)
                curveToRelative(-1.067f, 1.601f, -3.005f, 2.792f, -4.461f, 3.374f)
                curveToRelative(-0.122f, 0.048f, -0.247f, 0.072f, -0.371f, 0.072f)
                close()
                moveTo(18.837f, 16.548f)
                curveToRelative(-0.164f, 0.251f, -1.666f, 2.453f, -3.837f, 2.453f)
                curveToRelative(-1.161f, 0.0f, -2.03f, -0.768f, -2.729f, -1.386f)
                curveToRelative(-0.26f, -0.229f, -0.652f, -0.577f, -0.81f, -0.618f)
                curveToRelative(-0.15f, 0.003f, -0.339f, 0.124f, -0.657f, 0.335f)
                curveToRelative(-0.423f, 0.282f, -1.002f, 0.668f, -1.805f, 0.668f)
                curveToRelative(-1.423f, 0.0f, -2.592f, -1.173f, -2.721f, -1.307f)
                curveToRelative(-0.383f, -0.398f, -0.37f, -1.031f, 0.027f, -1.414f)
                curveToRelative(0.397f, -0.38f, 1.027f, -0.371f, 1.411f, 0.024f)
                curveToRelative(0.223f, 0.227f, 0.829f, 0.696f, 1.282f, 0.696f)
                curveToRelative(0.188f, 0.0f, 0.377f, -0.12f, 0.695f, -0.332f)
                curveToRelative(0.423f, -0.282f, 1.002f, -0.668f, 1.805f, -0.668f)
                curveToRelative(0.834f, 0.0f, 1.476f, 0.567f, 2.096f, 1.116f)
                curveToRelative(0.469f, 0.415f, 1.0f, 0.884f, 1.404f, 0.884f)
                curveToRelative(0.956f, 0.0f, 1.949f, -1.22f, 2.163f, -1.547f)
                curveToRelative(0.302f, -0.462f, 0.922f, -0.59f, 1.384f, -0.29f)
                curveToRelative(0.463f, 0.302f, 0.593f, 0.922f, 0.29f, 1.384f)
                close()
            }
        }
        .build()
        return _faceWoozy!!
    }

private var _faceWoozy: ImageVector? = null
