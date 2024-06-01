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

public val Icons.Filled.RectabgleVertical: ImageVector
    get() {
        if (_rectabgleVertical != null) {
            return _rectabgleVertical!!
        }
        _rectabgleVertical = Builder(name = "RectabgleVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.5f, 0.0f)
                    horizontalLineTo(8.5f)
                    curveTo(7.0418f, 0.0016f, 5.6438f, 0.5816f, 4.6127f, 1.6127f)
                    curveTo(3.5816f, 2.6438f, 3.0016f, 4.0418f, 3.0f, 5.5f)
                    verticalLineTo(18.5f)
                    curveTo(3.0016f, 19.9582f, 3.5816f, 21.3562f, 4.6127f, 22.3873f)
                    curveTo(5.6438f, 23.4184f, 7.0418f, 23.9984f, 8.5f, 24.0f)
                    horizontalLineTo(15.5f)
                    curveTo(16.9582f, 23.9984f, 18.3562f, 23.4184f, 19.3873f, 22.3873f)
                    curveTo(20.4184f, 21.3562f, 20.9984f, 19.9582f, 21.0f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(20.9984f, 4.0418f, 20.4184f, 2.6438f, 19.3873f, 1.6127f)
                    curveTo(18.3562f, 0.5816f, 16.9582f, 0.0016f, 15.5f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(18.0f, 18.5f)
                    curveTo(18.0f, 19.163f, 17.7366f, 19.7989f, 17.2678f, 20.2678f)
                    curveTo(16.7989f, 20.7366f, 16.163f, 21.0f, 15.5f, 21.0f)
                    horizontalLineTo(8.5f)
                    curveTo(7.837f, 21.0f, 7.2011f, 20.7366f, 6.7322f, 20.2678f)
                    curveTo(6.2634f, 19.7989f, 6.0f, 19.163f, 6.0f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(6.0f, 4.837f, 6.2634f, 4.2011f, 6.7322f, 3.7322f)
                    curveTo(7.2011f, 3.2634f, 7.837f, 3.0f, 8.5f, 3.0f)
                    horizontalLineTo(15.5f)
                    curveTo(16.163f, 3.0f, 16.7989f, 3.2634f, 17.2678f, 3.7322f)
                    curveTo(17.7366f, 4.2011f, 18.0f, 4.837f, 18.0f, 5.5f)
                    verticalLineTo(18.5f)
                    close()
                }
            }
        }
        .build()
        return _rectabgleVertical!!
    }

private var _rectabgleVertical: ImageVector? = null
