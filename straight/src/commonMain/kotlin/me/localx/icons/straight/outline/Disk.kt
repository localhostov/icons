package me.localx.icons.straight.outline

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

public val Icons.Outline.Disk: ImageVector
    get() {
        if (_disk != null) {
            return _disk!!
        }
        _disk = Builder(name = "Disk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.0f)
                    lineTo(19.0f, 0.0f)
                    close()
                    moveTo(7.0f, 2.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(2.0f)
                    close()
                    moveTo(22.0f, 22.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(3.0f)
                    curveTo(2.0f, 2.7348f, 2.1054f, 2.4804f, 2.2929f, 2.2929f)
                    curveTo(2.4804f, 2.1054f, 2.7348f, 2.0f, 3.0f, 2.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(2.828f)
                    lineTo(22.0f, 5.828f)
                    verticalLineTo(22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 9.9999f)
                    curveTo(11.209f, 9.9999f, 10.4356f, 10.2345f, 9.7778f, 10.674f)
                    curveTo(9.1201f, 11.1135f, 8.6074f, 11.7382f, 8.3046f, 12.4691f)
                    curveTo(8.0019f, 13.2f, 7.9226f, 14.0043f, 8.077f, 14.7802f)
                    curveTo(8.2313f, 15.5562f, 8.6123f, 16.2689f, 9.1717f, 16.8283f)
                    curveTo(9.7311f, 17.3877f, 10.4438f, 17.7687f, 11.2198f, 17.923f)
                    curveTo(11.9957f, 18.0774f, 12.8f, 17.9981f, 13.5309f, 17.6954f)
                    curveTo(14.2618f, 17.3926f, 14.8865f, 16.88f, 15.326f, 16.2222f)
                    curveTo(15.7655f, 15.5644f, 16.0001f, 14.791f, 16.0001f, 13.9999f)
                    curveTo(16.0001f, 12.939f, 15.5787f, 11.9216f, 14.8286f, 11.1715f)
                    curveTo(14.0784f, 10.4213f, 13.061f, 9.9999f, 12.0001f, 9.9999f)
                    close()
                    moveTo(12.0001f, 15.9999f)
                    curveTo(11.6046f, 15.9999f, 11.2179f, 15.8826f, 10.889f, 15.6628f)
                    curveTo(10.5601f, 15.4431f, 10.3037f, 15.1307f, 10.1524f, 14.7652f)
                    curveTo(10.001f, 14.3998f, 9.9614f, 13.9977f, 10.0386f, 13.6097f)
                    curveTo(10.1157f, 13.2217f, 10.3062f, 12.8654f, 10.5859f, 12.5857f)
                    curveTo(10.8656f, 12.306f, 11.222f, 12.1155f, 11.6099f, 12.0383f)
                    curveTo(11.9979f, 11.9611f, 12.4f, 12.0007f, 12.7655f, 12.1521f)
                    curveTo(13.1309f, 12.3035f, 13.4433f, 12.5598f, 13.6631f, 12.8887f)
                    curveTo(13.8828f, 13.2176f, 14.0001f, 13.6043f, 14.0001f, 13.9999f)
                    curveTo(14.0001f, 14.5303f, 13.7894f, 15.039f, 13.4143f, 15.4141f)
                    curveTo(13.0393f, 15.7892f, 12.5306f, 15.9999f, 12.0001f, 15.9999f)
                    close()
                }
            }
        }
        .build()
        return _disk!!
    }

private var _disk: ImageVector? = null
