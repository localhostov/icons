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

public val Icons.Bold.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.5f, 3.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(8.5f)
                    curveTo(7.0418f, 3.0016f, 5.6438f, 3.5816f, 4.6127f, 4.6127f)
                    curveTo(3.5816f, 5.6438f, 3.0016f, 7.0418f, 3.0f, 8.5f)
                    verticalLineTo(15.0f)
                    curveTo(3.0f, 17.3869f, 3.9482f, 19.6761f, 5.636f, 21.364f)
                    curveTo(7.3239f, 23.0518f, 9.6131f, 24.0f, 12.0f, 24.0f)
                    curveTo(14.3869f, 24.0f, 16.6761f, 23.0518f, 18.364f, 21.364f)
                    curveTo(20.0518f, 19.6761f, 21.0f, 17.3869f, 21.0f, 15.0f)
                    verticalLineTo(8.5f)
                    curveTo(20.9984f, 7.0418f, 20.4184f, 5.6438f, 19.3873f, 4.6127f)
                    curveTo(18.3562f, 3.5816f, 16.9582f, 3.0016f, 15.5f, 3.0f)
                    close()
                    moveTo(18.0f, 15.0f)
                    curveTo(18.0f, 16.5913f, 17.3679f, 18.1174f, 16.2426f, 19.2426f)
                    curveTo(15.1174f, 20.3679f, 13.5913f, 21.0f, 12.0f, 21.0f)
                    curveTo(10.4087f, 21.0f, 8.8826f, 20.3679f, 7.7574f, 19.2426f)
                    curveTo(6.6321f, 18.1174f, 6.0f, 16.5913f, 6.0f, 15.0f)
                    verticalLineTo(8.5f)
                    curveTo(6.0f, 7.837f, 6.2634f, 7.2011f, 6.7322f, 6.7322f)
                    curveTo(7.2011f, 6.2634f, 7.837f, 6.0f, 8.5f, 6.0f)
                    horizontalLineTo(15.5f)
                    curveTo(16.163f, 6.0f, 16.7989f, 6.2634f, 17.2678f, 6.7322f)
                    curveTo(17.7366f, 7.2011f, 18.0f, 7.837f, 18.0f, 8.5f)
                    verticalLineTo(15.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.5f, 7.9997f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(12.9997f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(7.9997f)
                    close()
                }
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
