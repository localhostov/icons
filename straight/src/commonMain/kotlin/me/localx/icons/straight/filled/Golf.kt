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

public val Icons.Filled.Golf: ImageVector
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
                    curveTo(11.315f, 9.9996f, 10.651f, 10.0396f, 10.0f, 10.0996f)
                    verticalLineTo(16.9996f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(8.0526f)
                    lineTo(14.915f, 4.5586f)
                    lineTo(8.9f, 0.2116f)
                    curveTo(8.5949f, 0.0579f, 8.2556f, -0.0151f, 7.9143f, -5.0E-4f)
                    curveTo(7.573f, 0.0142f, 7.2411f, 0.116f, 6.9504f, 0.2953f)
                    curveTo(6.6596f, 0.4745f, 6.4196f, 0.7253f, 6.2532f, 1.0237f)
                    curveTo(6.0868f, 1.322f, 5.9997f, 1.658f, 6.0f, 1.9996f)
                    verticalLineTo(10.9216f)
                    curveTo(2.392f, 12.1146f, 0.0f, 14.3606f, 0.0f, 16.9996f)
                    curveTo(0.0f, 20.9246f, 5.271f, 23.9996f, 12.0f, 23.9996f)
                    curveTo(18.729f, 23.9996f, 24.0f, 20.9246f, 24.0f, 16.9996f)
                    curveTo(24.0f, 13.0746f, 18.729f, 9.9996f, 12.0f, 9.9996f)
                    close()
                    moveTo(15.0f, 18.9996f)
                    curveTo(14.6044f, 18.9996f, 14.2178f, 18.8823f, 13.8889f, 18.6626f)
                    curveTo(13.56f, 18.4428f, 13.3036f, 18.1304f, 13.1522f, 17.765f)
                    curveTo(13.0009f, 17.3995f, 12.9613f, 16.9974f, 13.0384f, 16.6094f)
                    curveTo(13.1156f, 16.2215f, 13.3061f, 15.8651f, 13.5858f, 15.5854f)
                    curveTo(13.8655f, 15.3057f, 14.2219f, 15.1152f, 14.6098f, 15.0381f)
                    curveTo(14.9978f, 14.9609f, 15.3999f, 15.0005f, 15.7654f, 15.1519f)
                    curveTo(16.1308f, 15.3032f, 16.4432f, 15.5596f, 16.6629f, 15.8885f)
                    curveTo(16.8827f, 16.2174f, 17.0f, 16.6041f, 17.0f, 16.9996f)
                    curveTo(17.0f, 17.5301f, 16.7893f, 18.0388f, 16.4142f, 18.4138f)
                    curveTo(16.0391f, 18.7889f, 15.5304f, 18.9996f, 15.0f, 18.9996f)
                    close()
                }
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
