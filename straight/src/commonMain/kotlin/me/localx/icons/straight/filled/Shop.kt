package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.9998f, 16.9992f)
                    curveTo(17.9464f, 16.9988f, 16.9116f, 16.7208f, 15.9998f, 16.1932f)
                    curveTo(15.088f, 16.7208f, 14.0533f, 16.9988f, 12.9998f, 16.9992f)
                    horizontalLineTo(10.9998f)
                    curveTo(9.9449f, 16.9979f, 8.9094f, 16.7155f, 7.9998f, 16.1812f)
                    curveTo(7.0903f, 16.7156f, 6.0548f, 16.998f, 4.9998f, 16.9992f)
                    horizontalLineTo(3.9999f)
                    curveTo(2.9455f, 16.9989f, 1.9101f, 16.7183f, 0.9998f, 16.1862f)
                    verticalLineTo(20.9992f)
                    curveTo(0.9998f, 21.7948f, 1.3159f, 22.5579f, 1.8785f, 23.1205f)
                    curveTo(2.4411f, 23.6831f, 3.2042f, 23.9992f, 3.9999f, 23.9992f)
                    horizontalLineTo(19.9998f)
                    curveTo(20.7955f, 23.9992f, 21.5586f, 23.6831f, 22.1212f, 23.1205f)
                    curveTo(22.6838f, 22.5579f, 22.9998f, 21.7948f, 22.9998f, 20.9992f)
                    verticalLineTo(16.1872f)
                    curveTo(22.0893f, 16.7185f, 21.0541f, 16.9987f, 19.9998f, 16.9992f)
                    horizontalLineTo(18.9998f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0f, 0.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(2.2f)
                    lineTo(0.024f, 9.783f)
                    lineTo(0.0f, 11.0f)
                    curveTo(0.0f, 12.0609f, 0.4214f, 13.0783f, 1.1716f, 13.8284f)
                    curveTo(1.9217f, 14.5786f, 2.9391f, 15.0f, 4.0f, 15.0f)
                    horizontalLineTo(5.0f)
                    curveTo(5.5699f, 14.9982f, 6.1327f, 14.8738f, 6.6503f, 14.6354f)
                    curveTo(7.168f, 14.3969f, 7.6282f, 14.0499f, 8.0f, 13.618f)
                    curveTo(8.3718f, 14.0499f, 8.8321f, 14.3969f, 9.3497f, 14.6354f)
                    curveTo(9.8673f, 14.8738f, 10.4301f, 14.9982f, 11.0f, 15.0f)
                    horizontalLineTo(13.0f)
                    curveTo(13.5678f, 15.0003f, 14.1292f, 14.8794f, 14.6465f, 14.6454f)
                    curveTo(15.1639f, 14.4114f, 15.6253f, 14.0696f, 16.0f, 13.643f)
                    curveTo(16.3747f, 14.0696f, 16.8361f, 14.4114f, 17.3535f, 14.6454f)
                    curveTo(17.8708f, 14.8794f, 18.4322f, 15.0003f, 19.0f, 15.0f)
                    horizontalLineTo(20.0f)
                    curveTo(21.0609f, 15.0f, 22.0783f, 14.5786f, 22.8284f, 13.8284f)
                    curveTo(23.5786f, 13.0783f, 24.0f, 12.0609f, 24.0f, 11.0f)
                    verticalLineTo(10.0f)
                    lineTo(21.8f, 0.0f)
                    horizontalLineTo(17.0f)
                    close()
                }
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
