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

public val Icons.Bold.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 0.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0418f, 0.0016f, 2.6438f, 0.5816f, 1.6127f, 1.6127f)
                    curveTo(0.5816f, 2.6438f, 0.0016f, 4.0418f, 0.0f, 5.5f)
                    lineTo(0.0f, 18.5f)
                    curveTo(0.0016f, 19.9582f, 0.5816f, 21.3562f, 1.6127f, 22.3873f)
                    curveTo(2.6438f, 23.4184f, 4.0418f, 23.9984f, 5.5f, 24.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9582f, 23.9984f, 21.3562f, 23.4184f, 22.3873f, 22.3873f)
                    curveTo(23.4184f, 21.3562f, 23.9984f, 19.9582f, 24.0f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(23.9984f, 4.0418f, 23.4184f, 2.6438f, 22.3873f, 1.6127f)
                    curveTo(21.3562f, 0.5816f, 19.9582f, 0.0016f, 18.5f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(3.0f, 10.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(16.0f, 10.5f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(8.0f, 13.5f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(13.5f)
                    close()
                    moveTo(19.0f, 10.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(21.0f, 5.5f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(3.051f)
                    curveTo(19.5645f, 3.1662f, 20.0719f, 3.4729f, 20.4363f, 3.9192f)
                    curveTo(20.8008f, 4.3654f, 20.9999f, 4.9239f, 21.0f, 5.5f)
                    close()
                    moveTo(5.0f, 3.051f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(5.5f)
                    curveTo(3.0001f, 4.9239f, 3.1992f, 4.3654f, 3.5637f, 3.9192f)
                    curveTo(3.9281f, 3.4729f, 4.4355f, 3.1662f, 5.0f, 3.051f)
                    close()
                    moveTo(3.0f, 18.5f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(20.949f)
                    curveTo(4.4355f, 20.8338f, 3.9281f, 20.5271f, 3.5637f, 20.0808f)
                    curveTo(3.1992f, 19.6346f, 3.0001f, 19.0762f, 3.0f, 18.5f)
                    close()
                    moveTo(19.0f, 20.949f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(18.5f)
                    curveTo(20.9999f, 19.0762f, 20.8008f, 19.6346f, 20.4363f, 20.0808f)
                    curveTo(20.0719f, 20.5271f, 19.5645f, 20.8338f, 19.0f, 20.949f)
                    close()
                }
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
