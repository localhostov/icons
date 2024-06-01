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

public val Icons.Filled.Pyramid: ImageVector
    get() {
        if (_pyramid != null) {
            return _pyramid!!
        }
        _pyramid = Builder(name = "Pyramid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.036f, 24.0003f)
                    horizontalLineTo(3.9639f)
                    curveTo(3.2881f, 24.0018f, 2.6232f, 23.8302f, 2.0326f, 23.5018f)
                    curveTo(1.4419f, 23.1733f, 0.9453f, 22.699f, 0.5901f, 22.124f)
                    curveTo(0.2349f, 21.5491f, 0.033f, 20.8927f, 0.0035f, 20.2176f)
                    curveTo(-0.0259f, 19.5424f, 0.1181f, 18.8709f, 0.422f, 18.2673f)
                    lineTo(8.459f, 2.1893f)
                    curveTo(8.7653f, 1.5698f, 9.2296f, 1.0421f, 9.8049f, 0.6592f)
                    curveTo(10.3802f, 0.2763f, 11.0462f, 0.0518f, 11.736f, 0.0083f)
                    curveTo(12.5142f, -0.0412f, 13.2897f, 0.1391f, 13.9663f, 0.5269f)
                    curveTo(14.6428f, 0.9146f, 15.1904f, 1.4928f, 15.541f, 2.1893f)
                    lineTo(23.578f, 18.2673f)
                    curveTo(23.88f, 18.8711f, 24.0227f, 19.5422f, 23.9924f, 20.2167f)
                    curveTo(23.9622f, 20.8912f, 23.76f, 21.5468f, 23.4052f, 22.1212f)
                    curveTo(23.0503f, 22.6956f, 22.5545f, 23.1697f, 21.9648f, 23.4986f)
                    curveTo(21.3751f, 23.8275f, 20.7111f, 24.0002f, 20.036f, 24.0003f)
                    close()
                }
            }
        }
        .build()
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
