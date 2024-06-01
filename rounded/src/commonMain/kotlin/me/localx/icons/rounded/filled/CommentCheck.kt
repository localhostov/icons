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

public val Icons.Filled.CommentCheck: ImageVector
    get() {
        if (_commentCheck != null) {
            return _commentCheck!!
        }
        _commentCheck = Builder(name = "CommentCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.836f, 0.0278f)
                    curveTo(11.1216f, -0.0922f, 9.4014f, 0.1575f, 7.7918f, 0.76f)
                    curveTo(6.1822f, 1.3625f, 4.7208f, 2.3037f, 3.5065f, 3.5199f)
                    curveTo(2.2922f, 4.7361f, 1.3533f, 6.1989f, 0.7533f, 7.8095f)
                    curveTo(0.1534f, 9.42f, -0.0936f, 11.1406f, 0.029f, 12.8548f)
                    curveTo(0.47f, 19.2078f, 6.082f, 23.9998f, 13.083f, 23.9998f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9982f, 21.5964f, 23.4709f, 22.5338f, 22.5336f)
                    curveTo(23.4711f, 21.5962f, 23.9984f, 20.3254f, 24.0f, 18.9998f)
                    verticalLineTo(12.3398f)
                    curveTo(24.0373f, 9.2572f, 22.9071f, 6.2747f, 20.8363f, 3.991f)
                    curveTo(18.7655f, 1.7072f, 15.9075f, 0.2914f, 12.836f, 0.0278f)
                    close()
                    moveTo(18.7f, 9.7118f)
                    lineTo(11.907f, 16.4188f)
                    curveTo(11.5322f, 16.7922f, 11.0246f, 17.0019f, 10.4955f, 17.0019f)
                    curveTo(9.9664f, 17.0019f, 9.4588f, 16.7922f, 9.084f, 16.4188f)
                    lineTo(5.3f, 12.7148f)
                    curveTo(5.1104f, 12.5292f, 5.0023f, 12.2758f, 4.9995f, 12.0104f)
                    curveTo(4.9966f, 11.745f, 5.0993f, 11.4894f, 5.285f, 11.2998f)
                    curveTo(5.4707f, 11.1102f, 5.724f, 11.0021f, 5.9894f, 10.9992f)
                    curveTo(6.2548f, 10.9964f, 6.5104f, 11.0992f, 6.7f, 11.2848f)
                    lineTo(10.493f, 14.9918f)
                    lineTo(17.299f, 8.2918f)
                    curveTo(17.4909f, 8.1229f, 17.7403f, 8.034f, 17.9957f, 8.0432f)
                    curveTo(18.2512f, 8.0525f, 18.4935f, 8.1592f, 18.6727f, 8.3415f)
                    curveTo(18.8519f, 8.5238f, 18.9545f, 8.7678f, 18.9594f, 9.0234f)
                    curveTo(18.9643f, 9.279f, 18.8711f, 9.5268f, 18.699f, 9.7158f)
                    lineTo(18.7f, 9.7118f)
                    close()
                }
            }
        }
        .build()
        return _commentCheck!!
    }

private var _commentCheck: ImageVector? = null
