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

public val Icons.Bold.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.012f, viewportHeight = 512.012f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(405.339f, 298.678f)
                curveToRelative(-31.546f, 0.117f, -61.402f, 14.278f, -81.451f, 38.635f)
                lineToRelative(-115.2f, -52.011f)
                curveToRelative(2.93f, -9.494f, 4.496f, -19.356f, 4.651f, -29.291f)
                curveToRelative(-0.138f, -9.827f, -1.653f, -19.586f, -4.501f, -28.992f)
                lineToRelative(115.072f, -52.267f)
                curveToRelative(37.932f, 44.641f, 104.871f, 50.08f, 149.512f, 12.149f)
                reflectiveCurveTo(523.502f, 82.031f, 485.57f, 37.39f)
                reflectiveCurveTo(380.7f, -12.691f, 336.059f, 25.241f)
                curveToRelative(-23.88f, 20.291f, -37.565f, 50.102f, -37.386f, 81.437f)
                curveToRelative(0.0f, 3.029f, 0.64f, 5.888f, 0.896f, 8.853f)
                lineToRelative(-126.763f, 57.536f)
                curveToRelative(-18.688f, -15.229f, -42.026f, -23.601f, -66.133f, -23.723f)
                curveToRelative(-58.91f, 0.0f, -106.667f, 47.756f, -106.667f, 106.667f)
                reflectiveCurveToRelative(47.756f, 106.667f, 106.667f, 106.667f)
                curveToRelative(24.003f, -0.098f, 47.255f, -8.376f, 65.92f, -23.467f)
                lineToRelative(126.976f, 57.323f)
                curveToRelative(-0.256f, 2.965f, -0.896f, 5.803f, -0.896f, 8.811f)
                curveToRelative(0.0f, 58.91f, 47.756f, 106.667f, 106.667f, 106.667f)
                reflectiveCurveToRelative(106.667f, -47.756f, 106.667f, -106.667f)
                reflectiveCurveTo(464.25f, 298.678f, 405.339f, 298.678f)
                close()
                moveTo(405.339f, 64.012f)
                curveToRelative(23.564f, 0.0f, 42.667f, 19.103f, 42.667f, 42.667f)
                reflectiveCurveToRelative(-19.103f, 42.667f, -42.667f, 42.667f)
                curveToRelative(-23.564f, 0.0f, -42.667f, -19.103f, -42.667f, -42.667f)
                reflectiveCurveTo(381.775f, 64.012f, 405.339f, 64.012f)
                close()
                moveTo(106.673f, 298.678f)
                curveToRelative(-23.564f, 0.0f, -42.667f, -19.103f, -42.667f, -42.667f)
                reflectiveCurveToRelative(19.103f, -42.667f, 42.667f, -42.667f)
                reflectiveCurveToRelative(42.667f, 19.103f, 42.667f, 42.667f)
                reflectiveCurveTo(130.237f, 298.678f, 106.673f, 298.678f)
                close()
                moveTo(405.339f, 448.012f)
                curveToRelative(-23.564f, 0.0f, -42.667f, -19.102f, -42.667f, -42.667f)
                reflectiveCurveToRelative(19.103f, -42.667f, 42.667f, -42.667f)
                curveToRelative(23.564f, 0.0f, 42.667f, 19.102f, 42.667f, 42.667f)
                reflectiveCurveTo(428.903f, 448.012f, 405.339f, 448.012f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
