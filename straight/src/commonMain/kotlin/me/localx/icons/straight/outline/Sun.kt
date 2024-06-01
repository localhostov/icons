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

public val Icons.Outline.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 13.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(18.928f)
                    curveTo(18.8483f, 10.4439f, 18.7012f, 9.8996f, 18.49f, 9.379f)
                    lineTo(22.882f, 6.822f)
                    lineTo(21.876f, 5.094f)
                    lineTo(17.482f, 7.652f)
                    curveTo(17.146f, 7.2297f, 16.7629f, 6.8472f, 16.34f, 6.512f)
                    lineTo(18.89f, 2.127f)
                    lineTo(17.162f, 1.121f)
                    lineTo(14.612f, 5.506f)
                    curveTo(14.0942f, 5.2967f, 13.5529f, 5.151f, 13.0f, 5.072f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(5.072f)
                    curveTo(10.4514f, 5.15f, 9.9142f, 5.2937f, 9.4f, 5.5f)
                    lineTo(6.854f, 1.121f)
                    lineTo(5.126f, 2.127f)
                    lineTo(7.671f, 6.5f)
                    curveTo(7.2458f, 6.8366f, 6.861f, 7.2211f, 6.524f, 7.646f)
                    lineTo(2.14f, 5.094f)
                    lineTo(1.134f, 6.822f)
                    lineTo(5.513f, 9.371f)
                    curveTo(5.2999f, 9.8939f, 5.1518f, 10.441f, 5.072f, 11.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(5.072f)
                    curveTo(5.1519f, 13.5564f, 5.2989f, 14.101f, 5.51f, 14.622f)
                    lineTo(1.141f, 17.165f)
                    lineTo(2.147f, 18.894f)
                    lineTo(6.519f, 16.348f)
                    curveTo(6.8514f, 16.7668f, 7.2305f, 17.1462f, 7.649f, 17.479f)
                    lineTo(5.1f, 21.865f)
                    lineTo(6.829f, 22.871f)
                    lineTo(9.377f, 18.489f)
                    curveTo(9.8981f, 18.7008f, 10.4432f, 18.8483f, 11.0f, 18.928f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(18.928f)
                    curveTo(13.5622f, 18.8475f, 14.1123f, 18.698f, 14.638f, 18.483f)
                    lineTo(17.19f, 22.871f)
                    lineTo(18.918f, 21.865f)
                    lineTo(16.362f, 17.47f)
                    curveTo(16.7784f, 17.1376f, 17.1558f, 16.7592f, 17.487f, 16.342f)
                    lineTo(21.87f, 18.894f)
                    lineTo(22.87f, 17.165f)
                    lineTo(18.488f, 14.614f)
                    curveTo(18.6993f, 14.0957f, 18.8471f, 13.5538f, 18.928f, 13.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(17.0f, 12.0f)
                    curveTo(16.79f, 18.608f, 7.209f, 18.606f, 7.0f, 12.0f)
                    curveTo(7.21f, 5.392f, 16.791f, 5.394f, 17.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
