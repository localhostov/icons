package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.581f, 2.1407f)
                    lineTo(12.316f, 0.0517f)
                    curveTo(12.1109f, -0.0167f, 11.8891f, -0.0167f, 11.684f, 0.0517f)
                    lineTo(5.419f, 2.1407f)
                    curveTo(4.4229f, 2.4715f, 3.5564f, 3.1079f, 2.9427f, 3.9594f)
                    curveTo(2.3289f, 4.8108f, 1.999f, 5.8341f, 2.0f, 6.8837f)
                    verticalLineTo(12.0007f)
                    curveTo(2.0f, 19.5637f, 11.2f, 23.7407f, 11.594f, 23.9147f)
                    curveTo(11.7218f, 23.9715f, 11.8601f, 24.0008f, 12.0f, 24.0008f)
                    curveTo(12.1399f, 24.0008f, 12.2782f, 23.9715f, 12.406f, 23.9147f)
                    curveTo(12.8f, 23.7407f, 22.0f, 19.5637f, 22.0f, 12.0007f)
                    verticalLineTo(6.8837f)
                    curveTo(22.001f, 5.8341f, 21.6711f, 4.8108f, 21.0574f, 3.9594f)
                    curveTo(20.4436f, 3.1079f, 19.5771f, 2.4715f, 18.581f, 2.1407f)
                    close()
                    moveTo(16.718f, 9.7177f)
                    lineTo(12.446f, 13.9897f)
                    curveTo(12.2712f, 14.1657f, 12.0632f, 14.3052f, 11.834f, 14.4001f)
                    curveTo(11.6048f, 14.495f, 11.3591f, 14.5435f, 11.111f, 14.5427f)
                    horizontalLineTo(11.078f)
                    curveTo(10.8249f, 14.5388f, 10.5752f, 14.4836f, 10.344f, 14.3805f)
                    curveTo(10.1128f, 14.2774f, 9.905f, 14.1284f, 9.733f, 13.9427f)
                    lineTo(7.427f, 11.5427f)
                    curveTo(7.3271f, 11.45f, 7.2473f, 11.3379f, 7.1923f, 11.2133f)
                    curveTo(7.1373f, 11.0887f, 7.1083f, 10.9541f, 7.1072f, 10.8179f)
                    curveTo(7.1061f, 10.6816f, 7.1328f, 10.5466f, 7.1857f, 10.4211f)
                    curveTo(7.2386f, 10.2956f, 7.3166f, 10.1822f, 7.415f, 10.0879f)
                    curveTo(7.5133f, 9.9936f, 7.6298f, 9.9204f, 7.7575f, 9.8727f)
                    curveTo(7.8851f, 9.8251f, 8.0211f, 9.804f, 8.1572f, 9.8109f)
                    curveTo(8.2933f, 9.8177f, 8.4265f, 9.8522f, 8.5487f, 9.9124f)
                    curveTo(8.6709f, 9.9725f, 8.7796f, 10.057f, 8.868f, 10.1607f)
                    lineTo(11.112f, 12.5007f)
                    lineTo(15.3f, 8.3007f)
                    curveTo(15.4886f, 8.1185f, 15.7412f, 8.0177f, 16.0034f, 8.02f)
                    curveTo(16.2656f, 8.0223f, 16.5164f, 8.1274f, 16.7018f, 8.3128f)
                    curveTo(16.8872f, 8.4983f, 16.9924f, 8.7491f, 16.9947f, 9.0113f)
                    curveTo(16.997f, 9.2735f, 16.8962f, 9.5261f, 16.714f, 9.7147f)
                    lineTo(16.718f, 9.7177f)
                    close()
                }
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
