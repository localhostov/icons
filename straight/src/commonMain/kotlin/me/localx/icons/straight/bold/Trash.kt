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

public val Icons.Bold.Trash: ImageVector
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
                    moveTo(23.0001f, 3.0f)
                    horizontalLineTo(18.0001f)
                    verticalLineTo(2.5f)
                    curveTo(18.0001f, 1.837f, 17.7367f, 1.2011f, 17.2678f, 0.7322f)
                    curveTo(16.799f, 0.2634f, 16.1631f, 0.0f, 15.5001f, 0.0f)
                    lineTo(8.5001f, 0.0f)
                    curveTo(7.837f, 0.0f, 7.2011f, 0.2634f, 6.7323f, 0.7322f)
                    curveTo(6.2635f, 1.2011f, 6.0001f, 1.837f, 6.0001f, 2.5f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(1.0001f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(3.0001f)
                    verticalLineTo(21.0f)
                    curveTo(3.0001f, 21.7956f, 3.3161f, 22.5587f, 3.8788f, 23.1213f)
                    curveTo(4.4414f, 23.6839f, 5.2044f, 24.0f, 6.0001f, 24.0f)
                    horizontalLineTo(18.0001f)
                    curveTo(18.7957f, 24.0f, 19.5588f, 23.6839f, 20.1214f, 23.1213f)
                    curveTo(20.684f, 22.5587f, 21.0001f, 21.7956f, 21.0001f, 21.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(23.0001f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(18.0001f, 21.0f)
                    horizontalLineTo(6.0001f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(18.0001f)
                    verticalLineTo(21.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.9999f, 9.0f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(10.9999f)
                    verticalLineTo(9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0001f, 9.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(9.0f)
                    close()
                }
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
