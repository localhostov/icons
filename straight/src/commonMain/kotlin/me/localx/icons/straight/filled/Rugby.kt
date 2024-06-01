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

public val Icons.Filled.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(name = "Rugby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.3222f, 23.7362f)
                    curveTo(9.4454f, 23.8907f, 8.5574f, 23.9723f, 7.6672f, 23.9802f)
                    curveTo(5.574f, 24.1235f, 3.5068f, 23.4496f, 1.9002f, 22.1002f)
                    curveTo(0.1542f, 20.3492f, -0.3178f, 17.0802f, 0.2562f, 13.6712f)
                    lineTo(10.3222f, 23.7362f)
                    close()
                    moveTo(23.2072f, 12.6212f)
                    curveTo(22.4803f, 15.1411f, 21.1565f, 17.4487f, 19.3482f, 19.3482f)
                    curveTo(17.4458f, 21.1549f, 15.1359f, 22.4763f, 12.6142f, 23.2002f)
                    lineTo(0.7932f, 11.3792f)
                    curveTo(1.5201f, 8.8593f, 2.8438f, 6.5518f, 4.6522f, 4.6522f)
                    curveTo(6.5517f, 2.8438f, 8.8593f, 1.5201f, 11.3792f, 0.7932f)
                    lineTo(23.2072f, 12.6212f)
                    close()
                    moveTo(17.7072f, 10.2932f)
                    lineTo(13.7072f, 6.2932f)
                    lineTo(12.2932f, 7.7072f)
                    lineTo(13.5862f, 9.0002f)
                    lineTo(12.0002f, 10.5862f)
                    lineTo(10.7072f, 9.2932f)
                    lineTo(9.2932f, 10.7072f)
                    lineTo(10.5862f, 12.0002f)
                    lineTo(9.0002f, 13.5862f)
                    lineTo(7.7072f, 12.2932f)
                    lineTo(6.2932f, 13.7072f)
                    lineTo(10.2932f, 17.7072f)
                    lineTo(11.7072f, 16.2932f)
                    lineTo(10.4142f, 15.0002f)
                    lineTo(12.0002f, 13.4142f)
                    lineTo(13.2932f, 14.7072f)
                    lineTo(14.7072f, 13.2932f)
                    lineTo(13.4142f, 12.0002f)
                    lineTo(15.0002f, 10.4142f)
                    lineTo(16.2932f, 11.7072f)
                    lineTo(17.7072f, 10.2932f)
                    close()
                    moveTo(23.7442f, 10.3292f)
                    curveTo(24.3182f, 6.9202f, 23.8442f, 3.6512f, 22.0982f, 1.9022f)
                    curveTo(20.3522f, 0.1532f, 17.0802f, -0.3188f, 13.6702f, 0.2562f)
                    lineTo(23.7442f, 10.3292f)
                    close()
                }
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
