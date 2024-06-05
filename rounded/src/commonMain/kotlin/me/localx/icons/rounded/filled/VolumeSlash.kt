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

public val Icons.Filled.VolumeSlash: ImageVector
    get() {
        if (_volumeSlash != null) {
            return _volumeSlash!!
        }
        _volumeSlash = Builder(name = "VolumeSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(4.628f, 4.628f)
                curveTo(8.142f, 2.461f, 10.839f, 0.757f, 13.828f, 0.207f)
                curveToRelative(0.288f, -0.056f, 0.593f, 0.025f, 0.82f, 0.215f)
                curveToRelative(0.229f, 0.19f, 0.36f, 0.472f, 0.36f, 0.769f)
                verticalLineToRelative(12.404f)
                lineToRelative(1.688f, 1.688f)
                curveToRelative(1.806f, -1.817f, 1.803f, -4.763f, -0.01f, -6.576f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                curveToRelative(2.592f, 2.592f, 2.596f, 6.808f, 0.01f, 9.404f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(3.316f, -3.481f, 3.266f, -9.011f, -0.152f, -12.43f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                curveToRelative(4.198f, 4.198f, 4.249f, 10.997f, 0.152f, 15.258f)
                lineToRelative(2.742f, 2.742f)
                close()
                moveTo(0.009f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(1.269f)
                curveToRelative(1.807f, 2.502f, 4.53f, 4.237f, 7.551f, 4.793f)
                curveToRelative(0.06f, 0.011f, 0.12f, 0.017f, 0.181f, 0.017f)
                curveToRelative(0.232f, 0.0f, 0.459f, -0.081f, 0.64f, -0.231f)
                curveToRelative(0.229f, -0.19f, 0.36f, -0.472f, 0.36f, -0.769f)
                verticalLineToRelative(-3.579f)
                lineTo(1.881f, 6.103f)
                curveTo(0.74f, 7.02f, 0.009f, 8.426f, 0.009f, 10.0f)
                close()
            }
        }
        .build()
        return _volumeSlash!!
    }

private var _volumeSlash: ImageVector? = null
