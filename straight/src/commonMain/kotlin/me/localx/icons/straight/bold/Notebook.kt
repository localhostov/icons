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

public val Icons.Bold.Notebook: ImageVector
    get() {
        if (_notebook != null) {
            return _notebook!!
        }
        _notebook = Builder(name = "Notebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0001f, 2.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(13.5001f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(10.5001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(5.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(20.5f)
                    curveTo(2.0001f, 21.4283f, 2.3689f, 22.3185f, 3.0252f, 22.9749f)
                    curveTo(3.6816f, 23.6313f, 4.5719f, 24.0f, 5.5001f, 24.0f)
                    horizontalLineTo(18.5001f)
                    curveTo(19.4284f, 24.0f, 20.3186f, 23.6313f, 20.975f, 22.9749f)
                    curveTo(21.6314f, 22.3185f, 22.0001f, 21.4283f, 22.0001f, 20.5f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(19.0001f)
                    close()
                    moveTo(19.0001f, 20.5f)
                    curveTo(19.0001f, 20.6326f, 18.9474f, 20.7598f, 18.8537f, 20.8536f)
                    curveTo(18.7599f, 20.9473f, 18.6327f, 21.0f, 18.5001f, 21.0f)
                    horizontalLineTo(5.5001f)
                    curveTo(5.3675f, 21.0f, 5.2403f, 20.9473f, 5.1466f, 20.8536f)
                    curveTo(5.0528f, 20.7598f, 5.0001f, 20.6326f, 5.0001f, 20.5f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(19.0001f)
                    verticalLineTo(20.5f)
                    close()
                    moveTo(17.0001f, 10.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(17.0001f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(13.0001f, 15.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(15.0f)
                    close()
                }
            }
        }
        .build()
        return _notebook!!
    }

private var _notebook: ImageVector? = null
