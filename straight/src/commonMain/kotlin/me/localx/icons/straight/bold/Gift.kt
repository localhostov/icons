package me.localx.icons.straight.bold

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

public val Icons.Bold.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5f, 7.0f)
                    horizontalLineTo(18.328f)
                    curveTo(19.4299f, 5.5678f, 20.0188f, 3.807f, 20.0f, 2.0f)
                    horizontalLineTo(17.0f)
                    curveTo(17.0336f, 3.022f, 16.7399f, 4.028f, 16.1618f, 4.8715f)
                    curveTo(15.5837f, 5.7149f, 14.7513f, 6.3517f, 13.786f, 6.689f)
                    curveTo(14.4733f, 5.5711f, 14.8891f, 4.3076f, 15.0f, 3.0f)
                    curveTo(15.0f, 2.2043f, 14.6839f, 1.4413f, 14.1213f, 0.8787f)
                    curveTo(13.5587f, 0.3161f, 12.7956f, 0.0f, 12.0f, 0.0f)
                    curveTo(11.2044f, 0.0f, 10.4413f, 0.3161f, 9.8787f, 0.8787f)
                    curveTo(9.3161f, 1.4413f, 9.0f, 2.2043f, 9.0f, 3.0f)
                    curveTo(9.111f, 4.3076f, 9.5267f, 5.5711f, 10.214f, 6.689f)
                    curveTo(9.2487f, 6.3517f, 8.4163f, 5.7149f, 7.8382f, 4.8715f)
                    curveTo(7.2601f, 4.028f, 6.9664f, 3.022f, 7.0f, 2.0f)
                    horizontalLineTo(4.0f)
                    curveTo(3.9812f, 3.807f, 4.5701f, 5.5678f, 5.672f, 7.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 7.0f, 1.6815f, 7.3688f, 1.0251f, 8.0251f)
                    curveTo(0.3687f, 8.6815f, 0.0f, 9.5717f, 0.0f, 10.5f)
                    lineTo(0.0f, 15.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(10.5f)
                    curveTo(24.0f, 9.5717f, 23.6313f, 8.6815f, 22.9749f, 8.0251f)
                    curveTo(22.3185f, 7.3688f, 21.4283f, 7.0f, 20.5f, 7.0f)
                    close()
                    moveTo(21.0f, 10.5f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 10.0f, 20.7598f, 10.0527f, 20.8536f, 10.1464f)
                    curveTo(20.9473f, 10.2402f, 21.0f, 10.3674f, 21.0f, 10.5f)
                    close()
                    moveTo(3.0f, 10.5f)
                    curveTo(3.0f, 10.3674f, 3.0527f, 10.2402f, 3.1465f, 10.1464f)
                    curveTo(3.2402f, 10.0527f, 3.3674f, 10.0f, 3.5f, 10.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(5.0f, 15.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(19.0f, 21.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
