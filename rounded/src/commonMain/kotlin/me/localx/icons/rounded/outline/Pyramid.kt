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

public val Icons.Outline.Pyramid: ImageVector
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
                    moveTo(20.036f, 23.9994f)
                    horizontalLineTo(3.9639f)
                    curveTo(3.2881f, 24.0009f, 2.6232f, 23.8293f, 2.0326f, 23.5008f)
                    curveTo(1.4419f, 23.1724f, 0.9453f, 22.6981f, 0.5901f, 22.1231f)
                    curveTo(0.2349f, 21.5482f, 0.033f, 20.8918f, 0.0035f, 20.2167f)
                    curveTo(-0.0259f, 19.5415f, 0.1181f, 18.87f, 0.422f, 18.2664f)
                    lineTo(8.459f, 2.1884f)
                    curveTo(8.7653f, 1.5689f, 9.2296f, 1.0411f, 9.8049f, 0.6583f)
                    curveTo(10.3802f, 0.2754f, 11.0462f, 0.0509f, 11.736f, 0.0074f)
                    curveTo(12.5142f, -0.0422f, 13.2897f, 0.1382f, 13.9663f, 0.526f)
                    curveTo(14.6428f, 0.9137f, 15.1904f, 1.4918f, 15.541f, 2.1884f)
                    lineTo(23.578f, 18.2664f)
                    curveTo(23.88f, 18.8702f, 24.0227f, 19.5413f, 23.9924f, 20.2158f)
                    curveTo(23.9622f, 20.8903f, 23.76f, 21.5459f, 23.4052f, 22.1203f)
                    curveTo(23.0503f, 22.6947f, 22.5545f, 23.1688f, 21.9648f, 23.4977f)
                    curveTo(21.3751f, 23.8266f, 20.7111f, 23.9993f, 20.036f, 23.9994f)
                    close()
                    moveTo(2.0f, 20.0424f)
                    curveTo(2.0042f, 20.5613f, 2.2127f, 21.0577f, 2.5803f, 21.424f)
                    curveTo(2.9479f, 21.7903f, 3.445f, 21.997f, 3.9639f, 21.9994f)
                    horizontalLineTo(20.036f)
                    curveTo(20.5549f, 21.997f, 21.052f, 21.7903f, 21.4196f, 21.424f)
                    curveTo(21.7873f, 21.0577f, 21.9957f, 20.5613f, 22.0f, 20.0424f)
                    curveTo(21.9994f, 19.7361f, 21.9268f, 19.4343f, 21.788f, 19.1614f)
                    lineTo(13.753f, 3.0824f)
                    curveTo(13.5904f, 2.7565f, 13.3403f, 2.4824f, 13.0306f, 2.2909f)
                    curveTo(12.721f, 2.0993f, 12.3641f, 1.9978f, 12.0f, 1.9978f)
                    curveTo(11.6358f, 1.9978f, 11.2789f, 2.0993f, 10.9693f, 2.2909f)
                    curveTo(10.6596f, 2.4824f, 10.4095f, 2.7565f, 10.247f, 3.0824f)
                    lineTo(2.2099f, 19.1614f)
                    curveTo(2.0718f, 19.4345f, 1.9998f, 19.7363f, 2.0f, 20.0424f)
                    close()
                }
            }
        }
        .build()
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
