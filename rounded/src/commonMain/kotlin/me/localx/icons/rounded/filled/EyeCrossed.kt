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

public val Icons.Filled.EyeCrossed: ImageVector
    get() {
        if (_eyeCrossed != null) {
            return _eyeCrossed!!
        }
        _eyeCrossed = Builder(name = "EyeCrossed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.19f, viewportHeight = 512.19f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.543f, 200.771f)
                curveToRelative(-19.259f, -31.537f, -43.552f, -59.707f, -71.915f, -83.392f)
                lineToRelative(59.733f, -59.733f)
                curveToRelative(8.185f, -8.475f, 7.95f, -21.98f, -0.525f, -30.165f)
                curveToRelative(-8.267f, -7.985f, -21.374f, -7.985f, -29.641f, 0.0f)
                lineToRelative(-64.96f, 65.045f)
                curveToRelative(-40.269f, -23.918f, -86.306f, -36.385f, -133.141f, -36.053f)
                curveToRelative(-132.075f, 0.0f, -207.339f, 90.411f, -240.448f, 144.299f)
                curveToRelative(-20.862f, 33.743f, -20.862f, 76.379f, 0.0f, 110.123f)
                curveToRelative(19.259f, 31.537f, 43.552f, 59.707f, 71.915f, 83.392f)
                lineToRelative(-59.733f, 59.733f)
                curveToRelative(-8.475f, 8.185f, -8.71f, 21.691f, -0.525f, 30.165f)
                curveToRelative(8.185f, 8.475f, 21.691f, 8.71f, 30.165f, 0.525f)
                curveToRelative(0.178f, -0.172f, 0.353f, -0.347f, 0.525f, -0.525f)
                lineToRelative(65.109f, -65.109f)
                curveToRelative(40.219f, 23.915f, 86.201f, 36.402f, 132.992f, 36.117f)
                curveToRelative(132.075f, 0.0f, 207.339f, -90.411f, 240.448f, -144.299f)
                curveTo(517.405f, 277.151f, 517.405f, 234.515f, 496.543f, 200.771f)
                close()
                moveTo(128.095f, 255.833f)
                curveToRelative(-0.121f, -70.575f, 56.992f, -127.885f, 127.567f, -128.006f)
                curveToRelative(26.703f, -0.046f, 52.75f, 8.275f, 74.481f, 23.793f)
                lineToRelative(-30.976f, 30.976f)
                curveToRelative(-13.004f, -7.842f, -27.887f, -12.022f, -43.072f, -12.096f)
                curveToRelative(-47.128f, 0.0f, -85.333f, 38.205f, -85.333f, 85.333f)
                curveToRelative(0.074f, 15.185f, 4.254f, 30.068f, 12.096f, 43.072f)
                lineToRelative(-30.976f, 30.976f)
                curveTo(136.414f, 308.288f, 128.096f, 282.394f, 128.095f, 255.833f)
                close()
                moveTo(256.095f, 383.833f)
                curveToRelative(-26.561f, -0.001f, -52.455f, -8.319f, -74.048f, -23.787f)
                lineToRelative(30.976f, -30.976f)
                curveToRelative(13.004f, 7.842f, 27.887f, 12.022f, 43.072f, 12.096f)
                curveToRelative(47.128f, 0.0f, 85.333f, -38.205f, 85.333f, -85.333f)
                curveToRelative(-0.074f, -15.185f, -4.254f, -30.068f, -12.096f, -43.072f)
                lineToRelative(30.976f, -30.976f)
                curveToRelative(41.013f, 57.434f, 27.702f, 137.242f, -29.732f, 178.255f)
                curveTo(308.845f, 375.558f, 282.798f, 383.879f, 256.095f, 383.833f)
                close()
            }
        }
        .build()
        return _eyeCrossed!!
    }

private var _eyeCrossed: ImageVector? = null
