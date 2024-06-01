package me.localx.icons.straight.outline

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

public val Icons.Outline.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 9.9996f)
                    curveTo(10.657f, 9.9982f, 9.3172f, 10.1295f, 8.0f, 10.3916f)
                    verticalLineTo(8.0526f)
                    lineTo(14.915f, 4.5586f)
                    lineTo(9.034f, 0.2996f)
                    lineTo(8.9f, 0.2116f)
                    curveTo(8.5949f, 0.0579f, 8.2556f, -0.0151f, 7.9143f, -5.0E-4f)
                    curveTo(7.573f, 0.0142f, 7.2411f, 0.116f, 6.9504f, 0.2953f)
                    curveTo(6.6596f, 0.4745f, 6.4196f, 0.7253f, 6.2532f, 1.0237f)
                    curveTo(6.0868f, 1.322f, 5.9997f, 1.658f, 6.0f, 1.9996f)
                    verticalLineTo(10.9136f)
                    curveTo(2.391f, 12.1086f, 0.0f, 14.3596f, 0.0f, 16.9996f)
                    curveTo(0.0f, 20.9246f, 5.271f, 23.9996f, 12.0f, 23.9996f)
                    curveTo(18.729f, 23.9996f, 24.0f, 20.9246f, 24.0f, 16.9996f)
                    curveTo(24.0f, 13.0746f, 18.729f, 9.9996f, 12.0f, 9.9996f)
                    close()
                    moveTo(8.0f, 2.0176f)
                    lineTo(11.085f, 4.2526f)
                    lineTo(8.0f, 5.8116f)
                    verticalLineTo(2.0176f)
                    close()
                    moveTo(12.0f, 21.9996f)
                    curveTo(6.58f, 21.9996f, 2.0f, 19.7096f, 2.0f, 16.9996f)
                    curveTo(2.0f, 15.4056f, 3.591f, 13.9606f, 6.0f, 13.0376f)
                    verticalLineTo(16.9996f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(12.4366f)
                    curveTo(9.3132f, 12.1442f, 10.6546f, 11.9976f, 12.0f, 11.9996f)
                    curveTo(17.42f, 11.9996f, 22.0f, 14.2896f, 22.0f, 16.9996f)
                    curveTo(22.0f, 19.7096f, 17.42f, 21.9996f, 12.0f, 21.9996f)
                    close()
                    moveTo(17.0f, 16.9996f)
                    curveTo(17.0f, 17.3952f, 16.8827f, 17.7819f, 16.6629f, 18.1108f)
                    curveTo(16.4432f, 18.4397f, 16.1308f, 18.696f, 15.7654f, 18.8474f)
                    curveTo(15.3999f, 18.9988f, 14.9978f, 19.0384f, 14.6098f, 18.9612f)
                    curveTo(14.2219f, 18.884f, 13.8655f, 18.6935f, 13.5858f, 18.4138f)
                    curveTo(13.3061f, 18.1341f, 13.1156f, 17.7778f, 13.0384f, 17.3898f)
                    curveTo(12.9613f, 17.0018f, 13.0009f, 16.5997f, 13.1522f, 16.2343f)
                    curveTo(13.3036f, 15.8688f, 13.56f, 15.5564f, 13.8889f, 15.3367f)
                    curveTo(14.2178f, 15.1169f, 14.6044f, 14.9996f, 15.0f, 14.9996f)
                    curveTo(15.5304f, 14.9996f, 16.0391f, 15.2103f, 16.4142f, 15.5854f)
                    curveTo(16.7893f, 15.9605f, 17.0f, 16.4692f, 17.0f, 16.9996f)
                    close()
                }
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
