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

public val Icons.Filled.Mountains: ImageVector
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
                    moveTo(11.0f, 24.0f)
                    verticalLineTo(22.781f)
                    lineTo(15.277f, 13.438f)
                    curveTo(15.477f, 13.0178f, 15.792f, 12.663f, 16.1854f, 12.4145f)
                    curveTo(16.5789f, 12.166f, 17.0347f, 12.0342f, 17.5f, 12.0342f)
                    curveTo(17.9653f, 12.0342f, 18.4211f, 12.166f, 18.8146f, 12.4145f)
                    curveTo(19.208f, 12.663f, 19.523f, 13.0178f, 19.723f, 13.438f)
                    lineTo(24.0f, 22.737f)
                    verticalLineTo(23.956f)
                    lineTo(11.0f, 24.0f)
                    close()
                    moveTo(12.248f, 6.541f)
                    curveTo(12.0321f, 6.0859f, 11.6915f, 5.7015f, 11.2658f, 5.4323f)
                    curveTo(10.84f, 5.1631f, 10.3467f, 5.0202f, 9.843f, 5.0202f)
                    curveTo(9.3393f, 5.0202f, 8.846f, 5.1631f, 8.4202f, 5.4323f)
                    curveTo(7.9945f, 5.7015f, 7.6539f, 6.0859f, 7.438f, 6.541f)
                    lineTo(0.0f, 22.781f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(22.0f)
                    lineTo(13.46f, 12.6f)
                    curveTo(13.6939f, 12.0969f, 14.0191f, 11.6415f, 14.419f, 11.257f)
                    lineTo(12.248f, 6.541f)
                    close()
                }
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
