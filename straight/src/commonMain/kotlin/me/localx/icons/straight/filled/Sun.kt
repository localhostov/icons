package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.92f, 13.0f)
                    curveTo(18.8418f, 13.5526f, 18.6974f, 14.0938f, 18.49f, 14.612f)
                    lineTo(22.875f, 17.165f)
                    lineTo(21.875f, 18.894f)
                    lineTo(17.487f, 16.339f)
                    curveTo(17.1571f, 16.7561f, 16.7806f, 17.1342f, 16.365f, 17.466f)
                    lineTo(18.923f, 21.866f)
                    lineTo(17.19f, 22.871f)
                    lineTo(14.637f, 18.48f)
                    curveTo(14.1114f, 18.6933f, 13.5616f, 18.841f, 13.0f, 18.92f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(18.92f)
                    curveTo(10.4433f, 18.8418f, 9.8982f, 18.6957f, 9.377f, 18.485f)
                    lineTo(6.827f, 22.871f)
                    lineTo(5.1f, 21.865f)
                    lineTo(7.653f, 17.475f)
                    curveTo(7.2352f, 17.1429f, 6.8567f, 16.7641f, 6.525f, 16.346f)
                    lineTo(2.147f, 18.894f)
                    lineTo(1.141f, 17.165f)
                    lineTo(5.513f, 14.619f)
                    curveTo(5.3039f, 14.0988f, 5.1585f, 13.5552f, 5.08f, 13.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(5.08f)
                    curveTo(5.159f, 10.442f, 5.3054f, 9.8957f, 5.516f, 9.373f)
                    lineTo(1.134f, 6.822f)
                    lineTo(2.14f, 5.094f)
                    lineTo(6.527f, 7.648f)
                    curveTo(6.8642f, 7.2251f, 7.2491f, 6.8426f, 7.674f, 6.508f)
                    lineTo(5.126f, 2.127f)
                    lineTo(6.854f, 1.121f)
                    lineTo(9.4f, 5.505f)
                    curveTo(9.9144f, 5.2998f, 10.4516f, 5.1571f, 11.0f, 5.08f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(5.08f)
                    curveTo(13.552f, 5.1582f, 14.0925f, 5.3026f, 14.61f, 5.51f)
                    lineTo(17.162f, 1.121f)
                    lineTo(18.89f, 2.127f)
                    lineTo(16.338f, 6.517f)
                    curveTo(16.76f, 6.8515f, 17.1424f, 7.2329f, 17.478f, 7.654f)
                    lineTo(21.878f, 5.094f)
                    lineTo(22.884f, 6.822f)
                    lineTo(18.484f, 9.381f)
                    curveTo(18.6941f, 9.9011f, 18.8405f, 10.4447f, 18.92f, 11.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(18.92f)
                    close()
                }
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
