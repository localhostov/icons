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
                    curveTo(10.0f, 17.2648f, 9.8946f, 17.5192f, 9.7071f, 17.7067f)
                    curveTo(9.5196f, 17.8943f, 9.2652f, 17.9996f, 9.0f, 17.9996f)
                    curveTo(8.7348f, 17.9996f, 8.4804f, 17.8943f, 8.2929f, 17.7067f)
                    curveTo(8.1054f, 17.5192f, 8.0f, 17.2648f, 8.0f, 16.9996f)
                    lineTo(7.978f, 8.1146f)
                    lineTo(12.987f, 6.0386f)
                    curveTo(13.2921f, 5.8836f, 13.5523f, 5.6529f, 13.7428f, 5.3685f)
                    curveTo(13.9332f, 5.0841f, 14.0475f, 4.7557f, 14.0747f, 4.4145f)
                    curveTo(14.1019f, 4.0734f, 14.041f, 3.7309f, 13.8981f, 3.42f)
                    curveTo(13.7551f, 3.1091f, 13.5347f, 2.84f, 13.258f, 2.6386f)
                    curveTo(13.226f, 2.6096f, 8.9f, 0.2116f, 8.9f, 0.2116f)
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
                    moveTo(16.0f, 18.9996f)
                    curveTo(15.6044f, 18.9996f, 15.2178f, 18.8823f, 14.8889f, 18.6626f)
                    curveTo(14.56f, 18.4428f, 14.3036f, 18.1304f, 14.1522f, 17.765f)
                    curveTo(14.0009f, 17.3995f, 13.9613f, 16.9974f, 14.0384f, 16.6094f)
                    curveTo(14.1156f, 16.2215f, 14.3061f, 15.8651f, 14.5858f, 15.5854f)
                    curveTo(14.8655f, 15.3057f, 15.2219f, 15.1152f, 15.6098f, 15.0381f)
                    curveTo(15.9978f, 14.9609f, 16.3999f, 15.0005f, 16.7654f, 15.1519f)
                    curveTo(17.1308f, 15.3032f, 17.4432f, 15.5596f, 17.6629f, 15.8885f)
                    curveTo(17.8827f, 16.2174f, 18.0f, 16.6041f, 18.0f, 16.9996f)
                    curveTo(18.0f, 17.5301f, 17.7893f, 18.0388f, 17.4142f, 18.4138f)
                    curveTo(17.0391f, 18.7889f, 16.5304f, 18.9996f, 16.0f, 18.9996f)
                    close()
                }
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
