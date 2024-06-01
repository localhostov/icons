package me.localx.icons.straight.outline

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

public val Icons.Outline.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.5831f, 20.5297f)
                    curveTo(9.636f, 21.4514f, 8.3641f, 21.9633f, 7.0425f, 21.9544f)
                    curveTo(5.7209f, 21.9455f, 4.456f, 21.4167f, 3.5214f, 20.4824f)
                    curveTo(2.5867f, 19.548f, 2.0575f, 18.2832f, 2.0483f, 16.9616f)
                    curveTo(2.0391f, 15.6401f, 2.5505f, 14.368f, 3.472f, 13.4207f)
                    lineTo(7.734f, 9.1557f)
                    lineTo(6.319f, 7.7417f)
                    lineTo(2.058f, 12.0067f)
                    curveTo(0.7403f, 13.3251f, 3.0E-4f, 15.1129f, 8.0E-4f, 16.9769f)
                    curveTo(0.0012f, 18.841f, 0.7422f, 20.6284f, 2.0605f, 21.9462f)
                    curveTo(3.3789f, 23.2639f, 5.1668f, 24.0039f, 7.0308f, 24.0035f)
                    curveTo(8.8948f, 24.003f, 10.6823f, 23.2621f, 12.0001f, 21.9437f)
                    lineTo(16.2621f, 17.6817f)
                    lineTo(14.8481f, 16.2677f)
                    lineTo(10.5831f, 20.5297f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9439f, 2.0614f)
                    curveTo(21.2932f, 1.4062f, 20.5189f, 0.8867f, 19.666f, 0.5329f)
                    curveTo(18.813f, 0.1791f, 17.8983f, -0.0019f, 16.9749f, 4.0E-4f)
                    curveTo(16.052f, -0.0021f, 15.1377f, 0.1785f, 14.285f, 0.5315f)
                    curveTo(13.4322f, 0.8846f, 12.658f, 1.4032f, 12.0069f, 2.0574f)
                    lineTo(7.7399f, 6.3204f)
                    lineTo(9.1539f, 7.7354f)
                    lineTo(13.4189f, 3.4734f)
                    curveTo(13.8845f, 3.005f, 14.4383f, 2.6337f, 15.0483f, 2.3809f)
                    curveTo(15.6584f, 2.128f, 16.3125f, 1.9987f, 16.9729f, 2.0004f)
                    curveTo(17.9672f, 2.0007f, 18.939f, 2.2958f, 19.7656f, 2.8484f)
                    curveTo(20.5922f, 3.401f, 21.2364f, 4.1862f, 21.6167f, 5.1048f)
                    curveTo(21.9971f, 6.0234f, 22.0966f, 7.0342f, 21.9026f, 8.0094f)
                    curveTo(21.7086f, 8.9845f, 21.2299f, 9.8803f, 20.5269f, 10.5834f)
                    lineTo(16.2649f, 14.8454f)
                    lineTo(17.6799f, 16.2604f)
                    lineTo(21.9419f, 12.0004f)
                    curveTo(23.2579f, 10.6815f, 23.9972f, 8.8945f, 23.9976f, 7.0313f)
                    curveTo(23.998f, 5.1681f, 23.2594f, 3.3808f, 21.9439f, 2.0614f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.8452f, 7.7419f)
                    lineTo(7.7409f, 14.8462f)
                    lineTo(9.1551f, 16.2604f)
                    lineTo(16.2594f, 9.1561f)
                    lineTo(14.8452f, 7.7419f)
                    close()
                }
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
