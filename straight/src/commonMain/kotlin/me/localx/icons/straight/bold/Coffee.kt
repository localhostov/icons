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

public val Icons.Bold.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 5.5f)
                    curveTo(23.9991f, 4.7941f, 23.7852f, 4.1049f, 23.3862f, 3.5226f)
                    curveTo(22.9873f, 2.9402f, 22.4219f, 2.4918f, 21.764f, 2.236f)
                    curveTo(21.5082f, 1.5781f, 21.0598f, 1.0127f, 20.4774f, 0.6138f)
                    curveTo(19.8951f, 0.2148f, 19.2059f, 9.0E-4f, 18.5f, 0.0f)
                    lineTo(5.5f, 0.0f)
                    curveTo(4.7941f, 9.0E-4f, 4.1049f, 0.2148f, 3.5226f, 0.6138f)
                    curveTo(2.9402f, 1.0127f, 2.4918f, 1.5781f, 2.236f, 2.236f)
                    curveTo(1.5781f, 2.4918f, 1.0127f, 2.9402f, 0.6138f, 3.5226f)
                    curveTo(0.2148f, 4.1049f, 9.0E-4f, 4.7941f, 0.0f, 5.5f)
                    lineTo(0.0f, 8.0f)
                    horizontalLineTo(1.616f)
                    lineTo(3.681f, 24.0f)
                    horizontalLineTo(20.319f)
                    lineTo(22.383f, 8.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.5f)
                    close()
                    moveTo(5.0f, 3.5f)
                    curveTo(5.0f, 3.3674f, 5.0527f, 3.2402f, 5.1465f, 3.1465f)
                    curveTo(5.2402f, 3.0527f, 5.3674f, 3.0f, 5.5f, 3.0f)
                    horizontalLineTo(18.5f)
                    curveTo(18.6326f, 3.0f, 18.7598f, 3.0527f, 18.8536f, 3.1465f)
                    curveTo(18.9473f, 3.2402f, 19.0f, 3.3674f, 19.0f, 3.5f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(3.5f)
                    close()
                    moveTo(6.319f, 21.0f)
                    lineTo(5.674f, 16.0f)
                    horizontalLineTo(9.184f)
                    curveTo(10.084f, 19.959f, 13.917f, 19.957f, 14.816f, 16.0f)
                    horizontalLineTo(18.326f)
                    lineTo(17.681f, 21.0f)
                    horizontalLineTo(6.319f)
                    close()
                    moveTo(18.713f, 13.0f)
                    horizontalLineTo(14.813f)
                    curveTo(13.913f, 9.041f, 10.08f, 9.043f, 9.181f, 13.0f)
                    horizontalLineTo(5.281f)
                    lineTo(4.642f, 8.0f)
                    horizontalLineTo(19.359f)
                    lineTo(18.713f, 13.0f)
                    close()
                }
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
