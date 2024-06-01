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

public val Icons.Bold.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.543f, 7.0007f)
                    lineTo(15.725f, 5.9287f)
                    curveTo(15.8195f, 5.4452f, 15.8076f, 4.947f, 15.69f, 4.4687f)
                    curveTo(15.5204f, 3.7778f, 15.1415f, 3.1562f, 14.605f, 2.6889f)
                    curveTo(14.0686f, 2.2217f, 13.4008f, 1.9317f, 12.6932f, 1.8586f)
                    curveTo(11.9856f, 1.7854f, 11.2727f, 1.9328f, 10.652f, 2.2804f)
                    curveTo(10.0313f, 2.6281f, 9.5333f, 3.1591f, 9.226f, 3.8007f)
                    lineTo(7.59f, 7.0007f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 7.0007f, 1.4413f, 7.3167f, 0.8787f, 7.8794f)
                    curveTo(0.3161f, 8.442f, 0.0f, 9.205f, 0.0f, 10.0007f)
                    lineTo(0.0f, 19.0007f)
                    curveTo(0.0f, 19.7963f, 0.3161f, 20.5594f, 0.8787f, 21.122f)
                    curveTo(1.4413f, 21.6846f, 2.2043f, 22.0007f, 3.0f, 22.0007f)
                    horizontalLineTo(22.02f)
                    lineTo(24.0f, 11.3457f)
                    lineTo(24.025f, 7.0007f)
                    horizontalLineTo(15.543f)
                    close()
                    moveTo(3.0f, 10.0007f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(19.0007f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(10.0007f)
                    close()
                    moveTo(21.0f, 10.9347f)
                    lineTo(19.5f, 19.0007f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(8.8617f)
                    lineTo(11.919f, 5.1007f)
                    curveTo(11.9566f, 5.0271f, 12.0139f, 4.9654f, 12.0846f, 4.9225f)
                    curveTo(12.1552f, 4.8796f, 12.2364f, 4.8571f, 12.319f, 4.8577f)
                    curveTo(12.3837f, 4.8578f, 12.4477f, 4.872f, 12.5063f, 4.8993f)
                    curveTo(12.565f, 4.9267f, 12.617f, 4.9665f, 12.6587f, 5.016f)
                    curveTo(12.7004f, 5.0655f, 12.7308f, 5.1235f, 12.7478f, 5.186f)
                    curveTo(12.7648f, 5.2484f, 12.7679f, 5.3139f, 12.757f, 5.3777f)
                    lineTo(11.974f, 10.0007f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(10.9347f)
                    close()
                }
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
