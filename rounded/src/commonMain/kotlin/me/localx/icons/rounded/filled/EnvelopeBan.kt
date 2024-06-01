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

public val Icons.Filled.EnvelopeBan: ImageVector
    get() {
        if (_envelopeBan != null) {
            return _envelopeBan!!
        }
        _envelopeBan = Builder(name = "EnvelopeBan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 11.0f)
                    curveTo(25.769f, 10.769f, 25.767f, 0.23f, 18.5f, 0.0f)
                    curveTo(11.231f, 0.231f, 11.233f, 10.77f, 18.5f, 11.0f)
                    close()
                    moveTo(18.5f, 9.0f)
                    curveTo(17.9217f, 8.9961f, 17.3536f, 8.8469f, 16.848f, 8.566f)
                    lineTo(21.566f, 3.848f)
                    curveTo(21.8507f, 4.3798f, 21.9932f, 4.9762f, 21.9795f, 5.5792f)
                    curveTo(21.9659f, 6.1823f, 21.7966f, 6.7716f, 21.4881f, 7.29f)
                    curveTo(21.1796f, 7.8083f, 20.7424f, 8.2382f, 20.2189f, 8.5378f)
                    curveTo(19.6953f, 8.8374f, 19.1032f, 8.9966f, 18.5f, 9.0f)
                    close()
                    moveTo(18.5f, 2.0f)
                    curveTo(19.0783f, 2.0039f, 19.6464f, 2.1531f, 20.152f, 2.434f)
                    lineTo(15.434f, 7.152f)
                    curveTo(15.1493f, 6.6202f, 15.0068f, 6.0238f, 15.0205f, 5.4208f)
                    curveTo(15.0341f, 4.8177f, 15.2034f, 4.2284f, 15.5119f, 3.71f)
                    curveTo(15.8204f, 3.1917f, 16.2576f, 2.7618f, 16.7811f, 2.4622f)
                    curveTo(17.3047f, 2.1626f, 17.8968f, 2.0034f, 18.5f, 2.0f)
                    close()
                    moveTo(18.5f, 13.0f)
                    curveTo(19.5338f, 13.0f, 20.5564f, 12.7856f, 21.503f, 12.3703f)
                    curveTo(22.4497f, 11.9549f, 23.3f, 11.3477f, 24.0f, 10.587f)
                    verticalLineTo(19.0f)
                    curveTo(23.9984f, 20.3256f, 23.4711f, 21.5964f, 22.5338f, 22.5338f)
                    curveTo(21.5964f, 23.4711f, 20.3256f, 23.9984f, 19.0f, 24.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 23.9984f, 2.4036f, 23.4711f, 1.4662f, 22.5338f)
                    curveTo(0.5289f, 21.5964f, 0.0016f, 20.3256f, 0.0f, 19.0f)
                    lineTo(0.0f, 8.0f)
                    curveTo(0.0f, 7.843f, 0.032f, 7.7f, 0.046f, 7.542f)
                    lineTo(8.464f, 15.96f)
                    curveTo(9.4028f, 16.896f, 10.6743f, 17.4216f, 12.0f, 17.4216f)
                    curveTo(13.3257f, 17.4216f, 14.5972f, 16.896f, 15.536f, 15.96f)
                    lineTo(18.5f, 13.0f)
                    close()
                    moveTo(9.878f, 14.546f)
                    lineTo(0.744f, 5.411f)
                    curveTo(1.1865f, 4.6773f, 1.8105f, 4.07f, 2.556f, 3.6477f)
                    curveTo(3.3015f, 3.2254f, 4.1432f, 3.0023f, 5.0f, 3.0f)
                    horizontalLineTo(11.436f)
                    curveTo(11.1105f, 3.9345f, 10.9723f, 4.9239f, 11.0294f, 5.9118f)
                    curveTo(11.0865f, 6.8997f, 11.3376f, 7.8666f, 11.7685f, 8.7574f)
                    curveTo(12.1994f, 9.6482f, 12.8016f, 10.4453f, 13.5407f, 11.1033f)
                    curveTo(14.2798f, 11.7613f, 15.1413f, 12.2671f, 16.076f, 12.592f)
                    lineTo(14.122f, 14.546f)
                    curveTo(13.5583f, 15.1071f, 12.7953f, 15.4221f, 12.0f, 15.4221f)
                    curveTo(11.2047f, 15.4221f, 10.4417f, 15.1071f, 9.878f, 14.546f)
                    close()
                }
            }
        }
        .build()
        return _envelopeBan!!
    }

private var _envelopeBan: ImageVector? = null
