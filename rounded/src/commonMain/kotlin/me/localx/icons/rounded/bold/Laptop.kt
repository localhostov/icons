package me.localx.icons.rounded.bold

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

public val Icons.Bold.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 15.0f)
                    verticalLineTo(8.5f)
                    curveTo(21.9984f, 7.0418f, 21.4184f, 5.6438f, 20.3873f, 4.6127f)
                    curveTo(19.3562f, 3.5816f, 17.9582f, 3.0016f, 16.5f, 3.0f)
                    horizontalLineTo(7.5f)
                    curveTo(6.0418f, 3.0016f, 4.6438f, 3.5816f, 3.6127f, 4.6127f)
                    curveTo(2.5816f, 5.6438f, 2.0016f, 7.0418f, 2.0f, 8.5f)
                    verticalLineTo(15.0f)
                    curveTo(1.4696f, 15.0f, 0.9609f, 15.2107f, 0.5858f, 15.5858f)
                    curveTo(0.2107f, 15.9609f, 0.0f, 16.4696f, 0.0f, 17.0f)
                    lineTo(0.0f, 18.154f)
                    curveTo(3.0E-4f, 18.6435f, 0.1948f, 19.1129f, 0.541f, 19.459f)
                    curveTo(0.8871f, 19.8052f, 1.3565f, 19.9997f, 1.846f, 20.0f)
                    horizontalLineTo(22.154f)
                    curveTo(22.6435f, 19.9997f, 23.1129f, 19.8052f, 23.459f, 19.459f)
                    curveTo(23.8052f, 19.1129f, 23.9997f, 18.6435f, 24.0f, 18.154f)
                    verticalLineTo(17.0f)
                    curveTo(24.0f, 16.4696f, 23.7893f, 15.9609f, 23.4142f, 15.5858f)
                    curveTo(23.0391f, 15.2107f, 22.5304f, 15.0f, 22.0f, 15.0f)
                    close()
                    moveTo(14.769f, 16.0f)
                    horizontalLineTo(9.231f)
                    lineTo(8.308f, 15.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(8.5f)
                    curveTo(5.0f, 7.837f, 5.2634f, 7.2011f, 5.7322f, 6.7322f)
                    curveTo(6.2011f, 6.2634f, 6.837f, 6.0f, 7.5f, 6.0f)
                    horizontalLineTo(16.5f)
                    curveTo(17.163f, 6.0f, 17.7989f, 6.2634f, 18.2678f, 6.7322f)
                    curveTo(18.7366f, 7.2011f, 19.0f, 7.837f, 19.0f, 8.5f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(15.692f)
                    lineTo(14.769f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
