package me.localx.icons.rounded.outline

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

public val Icons.Outline.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9998f, 0.0102f)
                    curveTo(16.1878f, 0.0102f, 11.8748f, 2.0482f, 8.4608f, 5.4612f)
                    curveTo(5.0275f, 8.8651f, 2.2666f, 12.8856f, 0.3228f, 17.3122f)
                    curveTo(0.0049f, 18.0475f, -0.0839f, 18.8615f, 0.0679f, 19.648f)
                    curveTo(0.2197f, 20.4346f, 0.6051f, 21.1571f, 1.1738f, 21.7212f)
                    lineTo(2.2798f, 22.8262f)
                    curveTo(2.8429f, 23.3936f, 3.5637f, 23.7783f, 4.3485f, 23.9302f)
                    curveTo(5.1333f, 24.0822f, 5.9456f, 23.9944f, 6.6798f, 23.6782f)
                    curveTo(11.1091f, 21.7372f, 15.1312f, 18.9757f, 18.5338f, 15.5392f)
                    curveTo(21.9518f, 12.1262f, 23.9898f, 7.8132f, 23.9898f, 4.0002f)
                    curveTo(24.046f, 3.4624f, 23.9814f, 2.9189f, 23.8008f, 2.4092f)
                    curveTo(23.6202f, 1.8996f, 23.328f, 1.4367f, 22.9457f, 1.0543f)
                    curveTo(22.5633f, 0.672f, 22.1004f, 0.3798f, 21.5908f, 0.1992f)
                    curveTo(21.0811f, 0.0186f, 20.5376f, -0.046f, 19.9998f, 0.0102f)
                    close()
                    moveTo(17.1248f, 14.1252f)
                    curveTo(13.9027f, 17.3812f, 10.0941f, 19.9989f, 5.8998f, 21.8402f)
                    curveTo(5.5663f, 21.9768f, 5.2021f, 22.0211f, 4.8456f, 21.9683f)
                    curveTo(4.4891f, 21.9155f, 4.1534f, 21.7676f, 3.8738f, 21.5402f)
                    lineTo(16.7068f, 8.7072f)
                    curveTo(16.8023f, 8.615f, 16.8785f, 8.5046f, 16.9309f, 8.3826f)
                    curveTo(16.9833f, 8.2606f, 17.0109f, 8.1294f, 17.012f, 7.9966f)
                    curveTo(17.0132f, 7.8639f, 16.9879f, 7.7322f, 16.9376f, 7.6093f)
                    curveTo(16.8873f, 7.4864f, 16.8131f, 7.3747f, 16.7192f, 7.2808f)
                    curveTo(16.6253f, 7.1869f, 16.5136f, 7.1127f, 16.3907f, 7.0624f)
                    curveTo(16.2678f, 7.0121f, 16.1361f, 6.9868f, 16.0034f, 6.988f)
                    curveTo(15.8706f, 6.9891f, 15.7394f, 7.0167f, 15.6174f, 7.0691f)
                    curveTo(15.4954f, 7.1215f, 15.385f, 7.1977f, 15.2928f, 7.2932f)
                    lineTo(2.4568f, 20.1292f)
                    curveTo(2.2291f, 19.8494f, 2.0811f, 19.5133f, 2.0283f, 19.1564f)
                    curveTo(1.9755f, 18.7995f, 2.0199f, 18.435f, 2.1568f, 18.1012f)
                    curveTo(4.0009f, 13.9073f, 6.6193f, 10.0988f, 9.8748f, 6.8752f)
                    curveTo(13.4628f, 3.2882f, 17.4578f, 2.0102f, 19.9998f, 2.0102f)
                    curveTo(21.4508f, 2.0102f, 21.9898f, 2.5492f, 21.9898f, 4.0002f)
                    curveTo(21.9898f, 6.5432f, 20.7118f, 10.5382f, 17.1248f, 14.1252f)
                    close()
                }
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
