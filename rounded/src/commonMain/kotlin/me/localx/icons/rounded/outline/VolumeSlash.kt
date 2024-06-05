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

public val Icons.Outline.VolumeSlash: ImageVector
    get() {
        if (_volumeSlash != null) {
            return _volumeSlash!!
        }
        _volumeSlash = Builder(name = "VolumeSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.004f, 20.004f)
                verticalLineToRelative(2.812f)
                curveToRelative(0.0f, 0.297f, -0.132f, 0.579f, -0.36f, 0.769f)
                curveToRelative(-0.181f, 0.151f, -0.407f, 0.231f, -0.64f, 0.231f)
                curveToRelative(-0.061f, 0.0f, -0.121f, -0.005f, -0.181f, -0.017f)
                curveToRelative(-2.999f, -0.551f, -5.752f, -2.299f, -7.554f, -4.794f)
                horizontalLineToRelative(-1.27f)
                curveTo(2.242f, 19.004f, -0.002f, 16.761f, -0.002f, 14.002f)
                verticalLineToRelative(-4.001f)
                curveTo(-0.002f, 8.885f, 0.359f, 7.828f, 1.043f, 6.944f)
                curveToRelative(0.34f, -0.437f, 0.966f, -0.516f, 1.403f, -0.179f)
                curveToRelative(0.437f, 0.338f, 0.517f, 0.966f, 0.179f, 1.403f)
                curveToRelative(-0.41f, 0.529f, -0.627f, 1.163f, -0.627f, 1.832f)
                verticalLineToRelative(4.001f)
                curveToRelative(0.0f, 1.655f, 1.347f, 3.002f, 3.002f, 3.002f)
                horizontalLineToRelative(1.78f)
                curveToRelative(0.321f, 0.0f, 0.622f, 0.154f, 0.811f, 0.414f)
                lineToRelative(0.3f, 0.415f)
                curveToRelative(1.263f, 1.749f, 3.083f, 3.057f, 5.113f, 3.703f)
                verticalLineToRelative(-1.532f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(4.623f, 4.623f)
                curveTo(8.131f, 2.468f, 10.855f, 0.753f, 13.822f, 0.205f)
                curveToRelative(0.293f, -0.053f, 0.594f, 0.025f, 0.821f, 0.215f)
                curveToRelative(0.229f, 0.19f, 0.36f, 0.472f, 0.36f, 0.769f)
                verticalLineToRelative(12.402f)
                lineToRelative(1.686f, 1.686f)
                curveToRelative(0.846f, -0.887f, 1.31f, -2.046f, 1.31f, -3.276f)
                curveToRelative(0.0f, -1.269f, -0.494f, -2.461f, -1.392f, -3.359f)
                curveToRelative(-0.391f, -0.39f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                curveToRelative(1.275f, 1.275f, 1.978f, 2.97f, 1.978f, 4.773f)
                curveToRelative(0.0f, 1.764f, -0.673f, 3.425f, -1.896f, 4.69f)
                lineToRelative(1.415f, 1.415f)
                curveToRelative(3.33f, -3.418f, 3.304f, -8.908f, -0.081f, -12.292f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                curveToRelative(4.164f, 4.164f, 4.191f, 10.922f, 0.081f, 15.12f)
                lineToRelative(2.774f, 2.774f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(7.762f, 6.348f)
                lineToRelative(5.242f, 5.242f)
                lineTo(13.004f, 2.468f)
                curveToRelative(-2.032f, 0.647f, -3.854f, 1.955f, -5.114f, 3.702f)
                lineToRelative(-0.128f, 0.178f)
                close()
            }
        }
        .build()
        return _volumeSlash!!
    }

private var _volumeSlash: ImageVector? = null
