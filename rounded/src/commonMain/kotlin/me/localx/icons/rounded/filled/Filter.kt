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

public val Icons.Filled.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 24.0f)
                    curveTo(13.7836f, 24.0f, 13.5731f, 23.9298f, 13.4f, 23.8f)
                    lineTo(9.4f, 20.8f)
                    curveTo(9.2758f, 20.7069f, 9.175f, 20.5861f, 9.1055f, 20.4472f)
                    curveTo(9.0361f, 20.3084f, 9.0f, 20.1552f, 9.0f, 20.0f)
                    verticalLineTo(14.38f)
                    lineTo(1.984f, 6.487f)
                    curveTo(1.4857f, 5.9249f, 1.1604f, 5.2308f, 1.0471f, 4.4882f)
                    curveTo(0.9338f, 3.7457f, 1.0373f, 2.9862f, 1.3453f, 2.301f)
                    curveTo(1.6533f, 1.6159f, 2.1526f, 1.0343f, 2.7832f, 0.6261f)
                    curveTo(3.4137f, 0.2179f, 4.1488f, 5.0E-4f, 4.9f, 0.0f)
                    lineTo(19.1f, 0.0f)
                    curveTo(19.8511f, 9.0E-4f, 20.586f, 0.2186f, 21.2163f, 0.6271f)
                    curveTo(21.8466f, 1.0356f, 22.3456f, 1.6174f, 22.6533f, 2.3026f)
                    curveTo(22.9609f, 2.9878f, 23.0641f, 3.7473f, 22.9506f, 4.4897f)
                    curveTo(22.837f, 5.2322f, 22.5114f, 5.9261f, 22.013f, 6.488f)
                    lineTo(15.0f, 14.38f)
                    verticalLineTo(23.0f)
                    curveTo(15.0f, 23.2652f, 14.8946f, 23.5196f, 14.7071f, 23.7071f)
                    curveTo(14.5196f, 23.8946f, 14.2652f, 24.0f, 14.0f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
