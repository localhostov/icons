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

public val Icons.Outline.Filter: ImageVector
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
                    moveTo(14.0001f, 24.0f)
                    curveTo(13.7837f, 24.0f, 13.5732f, 23.9298f, 13.4001f, 23.8f)
                    lineTo(9.4001f, 20.8f)
                    curveTo(9.2759f, 20.7069f, 9.1751f, 20.5861f, 9.1057f, 20.4472f)
                    curveTo(9.0363f, 20.3084f, 9.0001f, 20.1552f, 9.0001f, 20.0f)
                    verticalLineTo(14.38f)
                    lineTo(1.9841f, 6.487f)
                    curveTo(1.4858f, 5.9249f, 1.1605f, 5.2308f, 1.0472f, 4.4882f)
                    curveTo(0.9339f, 3.7457f, 1.0374f, 2.9862f, 1.3454f, 2.301f)
                    curveTo(1.6534f, 1.6159f, 2.1527f, 1.0343f, 2.7833f, 0.6261f)
                    curveTo(3.4139f, 0.2179f, 4.1489f, 5.0E-4f, 4.9001f, 0.0f)
                    lineTo(19.1001f, 0.0f)
                    curveTo(19.8512f, 9.0E-4f, 20.5861f, 0.2186f, 21.2164f, 0.6271f)
                    curveTo(21.8468f, 1.0356f, 22.3457f, 1.6174f, 22.6534f, 2.3026f)
                    curveTo(22.961f, 2.9878f, 23.0643f, 3.7473f, 22.9507f, 4.4897f)
                    curveTo(22.8371f, 5.2322f, 22.5115f, 5.9261f, 22.0131f, 6.488f)
                    lineTo(15.0001f, 14.38f)
                    verticalLineTo(23.0f)
                    curveTo(15.0001f, 23.2652f, 14.8947f, 23.5196f, 14.7072f, 23.7071f)
                    curveTo(14.5197f, 23.8946f, 14.2653f, 24.0f, 14.0001f, 24.0f)
                    close()
                    moveTo(11.0001f, 19.5f)
                    lineTo(13.0001f, 21.0f)
                    verticalLineTo(14.0f)
                    curveTo(13.0003f, 13.7552f, 13.0903f, 13.5189f, 13.2531f, 13.336f)
                    lineTo(20.5211f, 5.159f)
                    curveTo(20.7635f, 4.8851f, 20.9216f, 4.547f, 20.9765f, 4.1855f)
                    curveTo(21.0315f, 3.8239f, 20.9809f, 3.4541f, 20.8309f, 3.1206f)
                    curveTo(20.6808f, 2.787f, 20.4377f, 2.5039f, 20.1307f, 2.3051f)
                    curveTo(19.8237f, 2.1063f, 19.4658f, 2.0004f, 19.1001f, 2.0f)
                    horizontalLineTo(4.9001f)
                    curveTo(4.5346f, 2.0006f, 4.1769f, 2.1065f, 3.8701f, 2.3053f)
                    curveTo(3.5633f, 2.504f, 3.3203f, 2.787f, 3.1703f, 3.1203f)
                    curveTo(3.0203f, 3.4537f, 2.9697f, 3.8233f, 3.0244f, 4.1847f)
                    curveTo(3.0792f, 4.5461f, 3.2371f, 4.884f, 3.4791f, 5.158f)
                    lineTo(10.7481f, 13.336f)
                    curveTo(10.9105f, 13.519f, 11.0002f, 13.7553f, 11.0001f, 14.0f)
                    verticalLineTo(19.5f)
                    close()
                }
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
