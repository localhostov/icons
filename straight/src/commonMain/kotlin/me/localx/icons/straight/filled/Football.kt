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

public val Icons.Filled.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.3629f, 4.8805f)
                    lineTo(3.7149f, 9.2555f)
                    lineTo(0.0069f, 11.8685f)
                    curveTo(0.0335f, 9.3486f, 0.8584f, 6.902f, 2.3629f, 4.8805f)
                    close()
                    moveTo(6.8729f, 19.0005f)
                    lineTo(2.2619f, 18.9895f)
                    curveTo(3.7503f, 21.0635f, 5.8601f, 22.6101f, 8.2859f, 23.4055f)
                    lineTo(6.8729f, 19.0005f)
                    close()
                    moveTo(11.9999f, 3.2525f)
                    lineTo(15.6759f, 0.5815f)
                    curveTo(13.2865f, -0.1932f, 10.7134f, -0.1932f, 8.3239f, 0.5815f)
                    lineTo(11.9999f, 3.2525f)
                    close()
                    moveTo(21.6279f, 4.8685f)
                    lineTo(20.2719f, 9.2555f)
                    lineTo(23.9939f, 11.8775f)
                    curveTo(23.9683f, 9.3494f, 23.1397f, 6.8949f, 21.6279f, 4.8685f)
                    close()
                    moveTo(17.1149f, 19.0005f)
                    lineTo(15.6999f, 23.4105f)
                    curveTo(18.1322f, 22.6151f, 20.2476f, 21.065f, 21.7389f, 18.9855f)
                    lineTo(17.1149f, 19.0005f)
                    close()
                    moveTo(13.4409f, 23.9095f)
                    curveTo(12.9628f, 23.9686f, 12.4816f, 23.999f, 11.9999f, 24.0005f)
                    curveTo(11.5137f, 23.9965f, 11.0281f, 23.9631f, 10.5459f, 23.9005f)
                    lineTo(8.3329f, 17.0005f)
                    lineTo(1.0999f, 16.9825f)
                    curveTo(0.6879f, 16.087f, 0.3889f, 15.1438f, 0.2099f, 14.1745f)
                    lineTo(6.0579f, 10.0535f)
                    lineTo(3.9249f, 3.1535f)
                    curveTo(4.6144f, 2.5179f, 5.3759f, 1.9651f, 6.1939f, 1.5065f)
                    lineTo(11.9999f, 5.7245f)
                    lineTo(17.8059f, 1.5065f)
                    curveTo(18.6209f, 1.9625f, 19.38f, 2.5119f, 20.0679f, 3.1435f)
                    lineTo(17.9329f, 10.0535f)
                    lineTo(23.7919f, 14.1825f)
                    curveTo(23.6121f, 15.1489f, 23.3135f, 16.0893f, 22.9029f, 16.9825f)
                    lineTo(15.6549f, 17.0005f)
                    lineTo(13.4409f, 23.9095f)
                    close()
                    moveTo(8.3489f, 17.0005f)
                    horizontalLineTo(15.6489f)
                    lineTo(17.9049f, 10.0565f)
                    lineTo(11.9999f, 5.7645f)
                    lineTo(6.0929f, 10.0565f)
                    lineTo(8.3489f, 17.0005f)
                    close()
                    moveTo(8.4489f, 10.8195f)
                    lineTo(9.7999f, 15.0005f)
                    horizontalLineTo(14.1999f)
                    lineTo(15.5579f, 10.8195f)
                    lineTo(11.9999f, 8.2365f)
                    lineTo(8.4489f, 10.8195f)
                    close()
                }
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
