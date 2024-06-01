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

public val Icons.Filled.UndoAlt: ImageVector
    get() {
        if (_undoAlt != null) {
            return _undoAlt!!
        }
        _undoAlt = Builder(name = "UndoAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.535f, 8.4601f)
                    curveTo(22.0715f, 7.9951f, 21.5205f, 7.6266f, 20.9137f, 7.376f)
                    curveTo(20.3069f, 7.1254f, 19.6565f, 6.9976f, 19.0f, 7.0001f)
                    horizontalLineTo(2.8f)
                    lineTo(7.1f, 2.7001f)
                    curveTo(7.2872f, 2.512f, 7.3921f, 2.2573f, 7.3915f, 1.9919f)
                    curveTo(7.391f, 1.7266f, 7.285f, 1.4723f, 7.097f, 1.2851f)
                    curveTo(6.9089f, 1.0978f, 6.6542f, 0.9929f, 6.3888f, 0.9935f)
                    curveTo(6.1235f, 0.9941f, 5.8692f, 1.1f, 5.682f, 1.2881f)
                    lineTo(0.732f, 6.2371f)
                    curveTo(0.2633f, 6.7059f, 0.0f, 7.3417f, 0.0f, 8.0046f)
                    curveTo(0.0f, 8.6675f, 0.2633f, 9.3032f, 0.732f, 9.7721f)
                    lineTo(5.682f, 14.7231f)
                    curveTo(5.7748f, 14.8162f, 5.8851f, 14.8901f, 6.0065f, 14.9406f)
                    curveTo(6.1279f, 14.9911f, 6.2581f, 15.0171f, 6.3896f, 15.0173f)
                    curveTo(6.521f, 15.0175f, 6.6513f, 14.9918f, 6.7728f, 14.9416f)
                    curveTo(6.8944f, 14.8915f, 7.0049f, 14.8179f, 7.098f, 14.7251f)
                    curveTo(7.1911f, 14.6322f, 7.265f, 14.5219f, 7.3155f, 14.4005f)
                    curveTo(7.366f, 14.2791f, 7.392f, 14.149f, 7.3922f, 14.0175f)
                    curveTo(7.3924f, 13.886f, 7.3667f, 13.7557f, 7.3165f, 13.6342f)
                    curveTo(7.2664f, 13.5126f, 7.1928f, 13.4022f, 7.1f, 13.3091f)
                    lineTo(2.788f, 9.0001f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 9.0001f, 20.5587f, 9.3161f, 21.1213f, 9.8787f)
                    curveTo(21.6839f, 10.4413f, 22.0f, 11.2044f, 22.0f, 12.0001f)
                    verticalLineTo(19.0001f)
                    curveTo(22.0f, 19.7957f, 21.6839f, 20.5588f, 21.1213f, 21.1214f)
                    curveTo(20.5587f, 21.684f, 19.7956f, 22.0001f, 19.0f, 22.0001f)
                    horizontalLineTo(5.0f)
                    curveTo(4.7347f, 22.0001f, 4.4804f, 22.1054f, 4.2929f, 22.2929f)
                    curveTo(4.1053f, 22.4805f, 4.0f, 22.7348f, 4.0f, 23.0001f)
                    curveTo(4.0f, 23.2653f, 4.1053f, 23.5196f, 4.2929f, 23.7072f)
                    curveTo(4.4804f, 23.8947f, 4.7347f, 24.0001f, 5.0f, 24.0001f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9985f, 21.5964f, 23.4712f, 22.5337f, 22.5338f)
                    curveTo(23.4711f, 21.5965f, 23.9984f, 20.3257f, 24.0f, 19.0001f)
                    verticalLineTo(12.0001f)
                    curveTo(24.0022f, 11.3424f, 23.8738f, 10.6909f, 23.6224f, 10.0832f)
                    curveTo(23.3709f, 9.4755f, 23.0013f, 8.9238f, 22.535f, 8.4601f)
                    close()
                }
            }
        }
        .build()
        return _undoAlt!!
    }

private var _undoAlt: ImageVector? = null
