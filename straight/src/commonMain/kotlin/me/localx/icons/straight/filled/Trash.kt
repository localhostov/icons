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

public val Icons.Filled.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 4.0f)
                    verticalLineTo(2.0f)
                    curveTo(17.0002f, 1.4696f, 16.7894f, 0.9609f, 16.4144f, 0.5858f)
                    curveTo(16.0393f, 0.2107f, 15.5306f, 0.0f, 15.0002f, 0.0f)
                    lineTo(9.0001f, 0.0f)
                    curveTo(8.4697f, 0.0f, 7.961f, 0.2107f, 7.5859f, 0.5858f)
                    curveTo(7.2109f, 0.9609f, 7.0002f, 1.4696f, 7.0002f, 2.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(4.0002f)
                    verticalLineTo(21.0f)
                    curveTo(4.0002f, 21.7956f, 4.3162f, 22.5587f, 4.8788f, 23.1213f)
                    curveTo(5.4414f, 23.6839f, 6.2045f, 24.0f, 7.0002f, 24.0f)
                    horizontalLineTo(17.0002f)
                    curveTo(17.7958f, 24.0f, 18.5589f, 23.6839f, 19.1215f, 23.1213f)
                    curveTo(19.6841f, 22.5587f, 20.0002f, 21.7956f, 20.0002f, 21.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(17.0002f)
                    close()
                    moveTo(11.0002f, 17.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(17.0f)
                    close()
                    moveTo(15.0002f, 17.0f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(17.0f)
                    close()
                    moveTo(15.0002f, 4.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(4.0f)
                    close()
                }
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
