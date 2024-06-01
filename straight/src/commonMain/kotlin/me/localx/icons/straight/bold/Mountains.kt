package me.localx.icons.straight.bold

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

public val Icons.Bold.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 8.0f)
                    curveTo(18.9391f, 8.0f, 17.9217f, 7.5786f, 17.1716f, 6.8284f)
                    curveTo(16.4214f, 6.0783f, 16.0f, 5.0609f, 16.0f, 4.0f)
                    curveTo(16.0f, 2.9391f, 16.4214f, 1.9217f, 17.1716f, 1.1716f)
                    curveTo(17.9217f, 0.4214f, 18.9391f, 0.0f, 20.0f, 0.0f)
                    curveTo(21.0609f, 0.0f, 22.0783f, 0.4214f, 22.8284f, 1.1716f)
                    curveTo(23.5786f, 1.9217f, 24.0f, 2.9391f, 24.0f, 4.0f)
                    curveTo(24.0f, 5.0609f, 23.5786f, 6.0783f, 22.8284f, 6.8284f)
                    curveTo(22.0783f, 7.5786f, 21.0609f, 8.0f, 20.0f, 8.0f)
                    close()
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(21.656f)
                    lineTo(14.336f, 12.7f)
                    curveTo(14.5808f, 12.1988f, 14.962f, 11.7768f, 15.4358f, 11.4825f)
                    curveTo(15.9096f, 11.1882f, 16.4569f, 11.0335f, 17.0147f, 11.0362f)
                    curveTo(17.5724f, 11.0389f, 18.1181f, 11.1989f, 18.5891f, 11.4978f)
                    curveTo(19.06f, 11.7968f, 19.4371f, 12.2224f, 19.677f, 12.726f)
                    lineTo(24.0f, 21.656f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(13.638f, 21.0f)
                    horizontalLineTo(20.35f)
                    lineTo(16.965f, 14.01f)
                    lineTo(13.638f, 21.0f)
                    close()
                    moveTo(13.238f, 7.019f)
                    curveTo(12.9548f, 6.4234f, 12.5085f, 5.9203f, 11.951f, 5.5681f)
                    curveTo(11.3935f, 5.2158f, 10.7475f, 5.0289f, 10.088f, 5.0289f)
                    curveTo(9.4285f, 5.0289f, 8.7825f, 5.2158f, 8.225f, 5.5681f)
                    curveTo(7.6675f, 5.9203f, 7.2212f, 6.4234f, 6.938f, 7.019f)
                    lineTo(0.0f, 22.172f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.81f)
                    lineTo(9.665f, 8.272f)
                    curveTo(9.7f, 8.1882f, 9.7589f, 8.1167f, 9.8345f, 8.0664f)
                    curveTo(9.91f, 8.0161f, 9.9987f, 7.9892f, 10.0895f, 7.9892f)
                    curveTo(10.1803f, 7.9892f, 10.269f, 8.0161f, 10.3445f, 8.0664f)
                    curveTo(10.4201f, 8.1167f, 10.479f, 8.1882f, 10.514f, 8.272f)
                    lineTo(12.343f, 12.248f)
                    lineTo(12.506f, 11.894f)
                    curveTo(12.9243f, 10.9806f, 13.6121f, 10.217f, 14.477f, 9.706f)
                    lineTo(13.238f, 7.019f)
                    close()
                }
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
