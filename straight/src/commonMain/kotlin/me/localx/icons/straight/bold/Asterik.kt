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

public val Icons.Bold.Asterik: ImageVector
    get() {
        if (_asterik != null) {
            return _asterik!!
        }
        _asterik = Builder(name = "Asterik", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.9999f, 24.0f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(19.337f)
                    lineTo(4.3609f, 21.682f)
                    lineTo(0.0269f, 14.958f)
                    lineTo(4.6169f, 12.0f)
                    lineTo(0.0269f, 9.042f)
                    lineTo(4.3609f, 2.318f)
                    lineTo(7.9999f, 4.663f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(4.663f)
                    lineTo(19.6389f, 2.318f)
                    lineTo(23.9729f, 9.042f)
                    lineTo(19.3829f, 12.0f)
                    lineTo(23.9729f, 14.958f)
                    lineTo(19.6389f, 21.682f)
                    lineTo(15.9999f, 19.337f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(10.9999f, 21.0f)
                    horizontalLineTo(12.9999f)
                    verticalLineTo(13.834f)
                    lineTo(18.7419f, 17.534f)
                    lineTo(19.8259f, 15.852f)
                    lineTo(13.8459f, 12.0f)
                    lineTo(19.8259f, 8.146f)
                    lineTo(18.7419f, 6.464f)
                    lineTo(12.9999f, 10.166f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(10.9999f)
                    verticalLineTo(10.166f)
                    lineTo(5.2579f, 6.466f)
                    lineTo(4.1739f, 8.146f)
                    lineTo(10.1539f, 12.0f)
                    lineTo(4.1739f, 15.854f)
                    lineTo(5.2579f, 17.536f)
                    lineTo(10.9999f, 13.834f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _asterik!!
    }

private var _asterik: ImageVector? = null
