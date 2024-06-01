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

public val Icons.Outline.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.1371f, 24.0f)
                    curveTo(19.7672f, 23.999f, 19.4011f, 23.9247f, 19.0601f, 23.7813f)
                    curveTo(18.719f, 23.638f, 18.4097f, 23.4285f, 18.1501f, 23.165f)
                    lineTo(12.0001f, 17.051f)
                    lineTo(5.8501f, 23.169f)
                    curveTo(5.4552f, 23.5697f, 4.9486f, 23.8422f, 4.3965f, 23.9508f)
                    curveTo(3.8445f, 24.0594f, 3.2725f, 23.9992f, 2.7551f, 23.778f)
                    curveTo(2.2326f, 23.5678f, 1.7857f, 23.205f, 1.4726f, 22.7369f)
                    curveTo(1.1595f, 22.2688f, 0.9948f, 21.7171f, 1.0001f, 21.154f)
                    verticalLineTo(5.0f)
                    curveTo(1.0001f, 3.6739f, 1.5269f, 2.4021f, 2.4646f, 1.4645f)
                    curveTo(3.4023f, 0.5268f, 4.674f, 0.0f, 6.0001f, 0.0f)
                    lineTo(18.0001f, 0.0f)
                    curveTo(18.6567f, 0.0f, 19.3069f, 0.1293f, 19.9135f, 0.3806f)
                    curveTo(20.5202f, 0.6319f, 21.0714f, 1.0002f, 21.5357f, 1.4645f)
                    curveTo(22.0f, 1.9288f, 22.3683f, 2.48f, 22.6195f, 3.0866f)
                    curveTo(22.8708f, 3.6932f, 23.0001f, 4.3434f, 23.0001f, 5.0f)
                    verticalLineTo(21.154f)
                    curveTo(23.0057f, 21.7167f, 22.8417f, 22.268f, 22.5293f, 22.7361f)
                    curveTo(22.217f, 23.2041f, 21.7709f, 23.5672f, 21.2491f, 23.778f)
                    curveTo(20.8969f, 23.9253f, 20.5189f, 24.0008f, 20.1371f, 24.0f)
                    close()
                    moveTo(6.0001f, 2.0f)
                    curveTo(5.2045f, 2.0f, 4.4414f, 2.3161f, 3.8788f, 2.8787f)
                    curveTo(3.3162f, 3.4413f, 3.0001f, 4.2043f, 3.0001f, 5.0f)
                    verticalLineTo(21.154f)
                    curveTo(2.9998f, 21.3206f, 3.0488f, 21.4836f, 3.141f, 21.6224f)
                    curveTo(3.2332f, 21.7612f, 3.3646f, 21.8695f, 3.5183f, 21.9337f)
                    curveTo(3.6721f, 21.9979f, 3.8414f, 22.0151f, 4.005f, 21.9831f)
                    curveTo(4.1685f, 21.9512f, 4.3189f, 21.8714f, 4.4371f, 21.754f)
                    lineTo(11.3001f, 14.933f)
                    curveTo(11.4875f, 14.7468f, 11.7409f, 14.6422f, 12.0051f, 14.6422f)
                    curveTo(12.2693f, 14.6422f, 12.5228f, 14.7468f, 12.7101f, 14.933f)
                    lineTo(19.5651f, 21.752f)
                    curveTo(19.6834f, 21.8694f, 19.8338f, 21.9492f, 19.9973f, 21.9811f)
                    curveTo(20.1608f, 22.0131f, 20.3302f, 21.9959f, 20.4839f, 21.9317f)
                    curveTo(20.6377f, 21.8675f, 20.769f, 21.7592f, 20.8612f, 21.6204f)
                    curveTo(20.9535f, 21.4816f, 21.0025f, 21.3186f, 21.0021f, 21.152f)
                    verticalLineTo(5.0f)
                    curveTo(21.0021f, 4.2043f, 20.6861f, 3.4413f, 20.1234f, 2.8787f)
                    curveTo(19.5608f, 2.3161f, 18.7978f, 2.0f, 18.0021f, 2.0f)
                    horizontalLineTo(6.0001f)
                    close()
                }
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
