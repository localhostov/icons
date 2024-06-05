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

public val Icons.Bold.Banner: ImageVector
    get() {
        if (_banner != null) {
            return _banner!!
        }
        _banner = Builder(name = "Banner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.919f, 13.827f)
                lineToRelative(-2.01f, -1.882f)
                lineToRelative(2.237f, -1.485f)
                curveToRelative(0.097f, -0.064f, 0.187f, -0.14f, 0.266f, -0.224f)
                curveToRelative(0.56f, -0.598f, 0.736f, -1.448f, 0.46f, -2.218f)
                curveToRelative(-0.275f, -0.767f, -0.948f, -1.308f, -1.756f, -1.412f)
                curveToRelative(-2.501f, -0.323f, -7.228f, -0.606f, -10.116f, -0.606f)
                reflectiveCurveToRelative(-7.615f, 0.283f, -10.115f, 0.606f)
                curveToRelative(-0.809f, 0.104f, -1.481f, 0.645f, -1.757f, 1.412f)
                curveToRelative(-0.276f, 0.77f, -0.1f, 1.62f, 0.46f, 2.218f)
                curveToRelative(0.079f, 0.084f, 0.169f, 0.16f, 0.266f, 0.224f)
                lineToRelative(2.237f, 1.485f)
                lineToRelative(-2.01f, 1.882f)
                curveToRelative(-0.063f, 0.06f, -0.122f, 0.125f, -0.175f, 0.195f)
                curveToRelative(-0.521f, 0.695f, -0.577f, 1.629f, -0.145f, 2.381f)
                curveToRelative(0.433f, 0.751f, 1.269f, 1.167f, 2.131f, 1.068f)
                curveToRelative(2.222f, -0.264f, 6.307f, -0.479f, 9.107f, -0.479f)
                reflectiveCurveToRelative(6.886f, 0.214f, 9.108f, 0.479f)
                curveToRelative(0.085f, 0.01f, 0.171f, 0.015f, 0.256f, 0.015f)
                curveToRelative(0.768f, 0.0f, 1.484f, -0.407f, 1.874f, -1.083f)
                curveToRelative(0.433f, -0.751f, 0.376f, -1.686f, -0.145f, -2.381f)
                curveToRelative(-0.053f, -0.07f, -0.111f, -0.136f, -0.175f, -0.195f)
                close()
                moveTo(17.475f, 12.838f)
                lineToRelative(1.524f, 1.427f)
                curveToRelative(-2.229f, -0.163f, -4.916f, -0.272f, -6.999f, -0.272f)
                reflectiveCurveToRelative(-4.77f, 0.109f, -6.999f, 0.272f)
                lineToRelative(1.524f, -1.427f)
                curveToRelative(0.335f, -0.313f, 0.508f, -0.763f, 0.47f, -1.22f)
                reflectiveCurveToRelative(-0.283f, -0.871f, -0.666f, -1.125f)
                lineToRelative(-1.729f, -1.148f)
                curveToRelative(2.272f, -0.189f, 5.202f, -0.345f, 7.4f, -0.345f)
                reflectiveCurveToRelative(5.128f, 0.156f, 7.4f, 0.345f)
                lineToRelative(-1.729f, 1.148f)
                curveToRelative(-0.383f, 0.254f, -0.628f, 0.668f, -0.666f, 1.125f)
                reflectiveCurveToRelative(0.135f, 0.906f, 0.47f, 1.22f)
                close()
            }
        }
        .build()
        return _banner!!
    }

private var _banner: ImageVector? = null
