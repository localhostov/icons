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

public val Icons.Bold.Hastag: ImageVector
    get() {
        if (_hastag != null) {
            return _hastag!!
        }
        _hastag = Builder(name = "Hastag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.317f, 9.0f)
                    horizontalLineTo(23.647f)
                    lineTo(24.0f, 6.0f)
                    horizontalLineTo(18.677f)
                    lineTo(19.4f, 0.0f)
                    horizontalLineTo(16.379f)
                    lineTo(15.659f, 6.0f)
                    horizontalLineTo(9.783f)
                    lineTo(10.503f, 0.0f)
                    horizontalLineTo(7.485f)
                    lineTo(6.764f, 6.0f)
                    horizontalLineTo(0.353f)
                    lineTo(0.0f, 9.0f)
                    horizontalLineTo(6.4f)
                    lineTo(5.679f, 15.0f)
                    horizontalLineTo(0.353f)
                    lineTo(0.0f, 18.0f)
                    horizontalLineTo(5.323f)
                    lineTo(4.6f, 24.0f)
                    horizontalLineTo(7.621f)
                    lineTo(8.341f, 18.0f)
                    horizontalLineTo(14.217f)
                    lineTo(13.497f, 24.0f)
                    horizontalLineTo(16.515f)
                    lineTo(17.236f, 18.0f)
                    horizontalLineTo(23.647f)
                    lineTo(24.0f, 15.0f)
                    horizontalLineTo(17.6f)
                    lineTo(18.317f, 9.0f)
                    close()
                    moveTo(8.7f, 15.0f)
                    lineTo(9.42f, 9.0f)
                    horizontalLineTo(15.3f)
                    lineTo(14.58f, 15.0f)
                    horizontalLineTo(8.7f)
                    close()
                }
            }
        }
        .build()
        return _hastag!!
    }

private var _hastag: ImageVector? = null
