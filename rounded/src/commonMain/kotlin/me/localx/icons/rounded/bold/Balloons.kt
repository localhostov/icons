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

public val Icons.Bold.Balloons: ImageVector
    get() {
        if (_balloons != null) {
            return _balloons!!
        }
        _balloons = Builder(name = "Balloons", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.154f, 16.83f)
                arcTo(2.02f, 2.02f, 0.0f, false, false, 5.0f, 17.6f)
                curveToRelative(0.0f, 1.866f, 1.738f, 2.641f, 2.889f, 3.154f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, 1.027f, 0.512f)
                curveToRelative(-0.051f, 0.091f, -0.129f, 0.219f, -0.247f, 0.394f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.49f, 1.674f)
                arcTo(3.972f, 3.972f, 0.0f, false, false, 12.0f, 21.173f)
                curveToRelative(0.0f, -1.866f, -1.738f, -2.642f, -2.889f, -3.155f)
                arcToRelative(9.922f, 9.922f, 0.0f, false, true, -0.971f, -0.476f)
                curveToRelative(0.07f, -0.117f, 0.157f, -0.251f, 0.249f, -0.387f)
                arcToRelative(7.844f, 7.844f, 0.0f, false, false, 4.6f, -4.186f)
                arcToRelative(6.913f, 6.913f, 0.0f, false, false, 3.156f, 3.058f)
                curveToRelative(-0.612f, 2.546f, 1.121f, 3.724f, 2.043f, 4.348f)
                curveToRelative(0.981f, 0.664f, 0.981f, 0.664f, 0.6f, 1.506f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.748f, 1.986f)
                arcToRelative(1.485f, 1.485f, 0.0f, false, false, 0.617f, 0.133f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.368f, -0.881f)
                curveToRelative(1.423f, -3.147f, -0.654f, -4.553f, -1.652f, -5.229f)
                curveToRelative(-0.928f, -0.628f, -1.13f, -0.775f, -0.564f, -1.857f)
                curveTo(22.071f, 14.89f, 24.0f, 10.881f, 24.0f, 7.227f)
                arcTo(6.067f, 6.067f, 0.0f, false, false, 17.728f, 0.955f)
                arcToRelative(6.212f, 6.212f, 0.0f, false, false, -4.694f, 1.988f)
                arcTo(7.218f, 7.218f, 0.0f, false, false, 0.0f, 7.227f)
                curveTo(0.0f, 11.062f, 2.135f, 15.4f, 5.154f, 16.83f)
                close()
                moveTo(17.728f, 3.955f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 21.0f, 7.227f)
                curveToRelative(0.0f, 3.161f, -1.844f, 6.137f, -3.272f, 6.137f)
                reflectiveCurveToRelative(-3.274f, -2.976f, -3.274f, -6.137f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 17.728f, 3.955f)
                close()
                moveTo(7.228f, 3.0f)
                arcToRelative(4.231f, 4.231f, 0.0f, false, true, 4.226f, 4.227f)
                curveToRelative(0.0f, 3.314f, -2.252f, 7.091f, -4.226f, 7.091f)
                reflectiveCurveTo(3.0f, 10.541f, 3.0f, 7.227f)
                arcTo(4.232f, 4.232f, 0.0f, false, true, 7.228f, 3.0f)
                close()
            }
        }
        .build()
        return _balloons!!
    }

private var _balloons: ImageVector? = null
