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

public val Icons.Bold.SocialNetwork: ImageVector
    get() {
        if (_socialNetwork != null) {
            return _socialNetwork!!
        }
        _socialNetwork = Builder(name = "SocialNetwork", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(485.379f, 170.88f)
                curveToRelative(-22.148f, -27.445f, -55.547f, -43.367f, -90.815f, -43.293f)
                horizontalLineTo(351.25f)
                lineToRelative(1.913f, -11.222f)
                curveToRelative(7.798f, -45.716f, -22.94f, -89.097f, -68.656f, -96.895f)
                curveToRelative(-5.03f, -0.858f, -10.128f, -1.256f, -15.23f, -1.188f)
                curveToRelative(-32.056f, -0.167f, -61.464f, 17.761f, -76.001f, 46.332f)
                lineToRelative(-32.135f, 62.973f)
                horizontalLineToRelative(-44.249f)
                curveTo(52.364f, 127.658f, 0.07f, 179.951f, 0.0f, 244.48f)
                verticalLineToRelative(106.266f)
                curveToRelative(0.07f, 64.529f, 52.364f, 116.822f, 116.892f, 116.892f)
                horizontalLineTo(372.1f)
                curveToRelative(55.158f, -0.2f, 102.743f, -38.764f, 114.363f, -92.685f)
                lineToRelative(22.465f, -106.266f)
                curveTo(516.299f, 234.201f, 507.639f, 198.232f, 485.379f, 170.88f)
                close()
                moveTo(63.759f, 350.745f)
                verticalLineTo(244.48f)
                curveToRelative(0.0f, -29.344f, 23.788f, -53.133f, 53.133f, -53.133f)
                horizontalLineToRelative(31.88f)
                verticalLineToRelative(212.531f)
                horizontalLineToRelative(-31.88f)
                curveTo(87.548f, 403.878f, 63.759f, 380.09f, 63.759f, 350.745f)
                close()
                moveTo(446.549f, 255.489f)
                lineToRelative(-22.486f, 106.266f)
                curveToRelative(-5.273f, 24.506f, -26.897f, 42.035f, -51.964f, 42.124f)
                horizontalLineTo(212.531f)
                verticalLineTo(167.139f)
                lineToRelative(37.533f, -73.557f)
                curveToRelative(3.978f, -7.446f, 11.886f, -11.937f, 20.318f, -11.54f)
                curveToRelative(11.174f, 0.007f, 20.227f, 9.072f, 20.22f, 20.246f)
                curveToRelative(-0.001f, 1.128f, -0.096f, 2.254f, -0.284f, 3.366f)
                lineToRelative(-14.601f, 85.693f)
                horizontalLineToRelative(118.847f)
                curveToRelative(29.344f, -0.003f, 53.135f, 23.783f, 53.138f, 53.127f)
                curveTo(447.703f, 248.176f, 447.316f, 251.867f, 446.549f, 255.489f)
                lineTo(446.549f, 255.489f)
                close()
            }
        }
        .build()
        return _socialNetwork!!
    }

private var _socialNetwork: ImageVector? = null
