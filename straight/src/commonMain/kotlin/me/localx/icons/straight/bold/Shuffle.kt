package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.657f, 17.1637f)
                    lineTo(20.03f, 13.5367f)
                    verticalLineTo(16.4757f)
                    curveTo(17.6596f, 16.3197f, 15.4442f, 15.2431f, 13.857f, 13.4757f)
                    curveTo(13.657f, 13.7047f, 13.457f, 13.9317f, 13.249f, 14.1757f)
                    curveTo(12.81f, 14.6837f, 12.349f, 15.2097f, 11.874f, 15.7347f)
                    curveTo(14.0059f, 17.9909f, 16.9292f, 19.3333f, 20.03f, 19.4797f)
                    verticalLineTo(22.3487f)
                    lineTo(23.657f, 18.7217f)
                    curveTo(23.7595f, 18.6195f, 23.8408f, 18.4981f, 23.8963f, 18.3644f)
                    curveTo(23.9518f, 18.2307f, 23.9803f, 18.0874f, 23.9803f, 17.9427f)
                    curveTo(23.9803f, 17.798f, 23.9518f, 17.6547f, 23.8963f, 17.521f)
                    curveTo(23.8408f, 17.3873f, 23.7595f, 17.2659f, 23.657f, 17.1637f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.012f, 7.5148f)
                    verticalLineTo(10.4148f)
                    lineTo(23.654f, 6.7728f)
                    curveTo(23.8614f, 6.5654f, 23.9779f, 6.2841f, 23.9779f, 5.9908f)
                    curveTo(23.9779f, 5.6975f, 23.8614f, 5.4162f, 23.654f, 5.2088f)
                    lineTo(20.012f, 1.5658f)
                    verticalLineTo(4.5108f)
                    curveTo(15.486f, 4.7208f, 12.759f, 7.1848f, 10.489f, 9.7208f)
                    curveTo(8.066f, 7.0398f, 5.12f, 4.4868f, -0.021f, 4.4868f)
                    verticalLineTo(7.4918f)
                    curveTo(4.068f, 7.4918f, 6.269f, 9.4858f, 8.499f, 12.0008f)
                    curveTo(6.269f, 14.5158f, 4.068f, 16.5078f, -0.021f, 16.5078f)
                    verticalLineTo(19.5128f)
                    curveTo(6.026f, 19.5128f, 9.04f, 15.9798f, 11.733f, 12.8618f)
                    curveTo(14.1f, 10.1258f, 16.161f, 7.7478f, 20.012f, 7.5148f)
                    close()
                }
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
