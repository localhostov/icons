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

public val Icons.Bold.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.5f, 10.9998f)
                    verticalLineTo(13.6357f)
                    curveTo(15.4995f, 13.9973f, 15.3556f, 14.344f, 15.0999f, 14.5997f)
                    curveTo(14.8442f, 14.8553f, 14.4976f, 14.9992f, 14.136f, 14.9997f)
                    horizontalLineTo(9.864f)
                    curveTo(9.5024f, 14.9992f, 9.1558f, 14.8553f, 8.9001f, 14.5997f)
                    curveTo(8.6444f, 14.344f, 8.5005f, 13.9973f, 8.5f, 13.6357f)
                    verticalLineTo(10.9998f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.9997f)
                    curveTo(0.0f, 21.7954f, 0.3161f, 22.5584f, 0.8787f, 23.121f)
                    curveTo(1.4413f, 23.6837f, 2.2043f, 23.9997f, 3.0f, 23.9997f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 23.9997f, 22.5587f, 23.6837f, 23.1213f, 23.121f)
                    curveTo(23.6839f, 22.5584f, 24.0f, 21.7954f, 24.0f, 20.9997f)
                    verticalLineTo(10.9998f)
                    horizontalLineTo(15.5f)
                    close()
                    moveTo(21.0f, 20.9997f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(13.9997f)
                    horizontalLineTo(5.515f)
                    curveTo(5.6076f, 15.0898f, 6.1058f, 16.1056f, 6.911f, 16.8462f)
                    curveTo(7.7162f, 17.5868f, 8.77f, 17.9984f, 9.864f, 17.9997f)
                    horizontalLineTo(14.136f)
                    curveTo(15.23f, 17.9984f, 16.2838f, 17.5868f, 17.089f, 16.8462f)
                    curveTo(17.8942f, 16.1056f, 18.3924f, 15.0898f, 18.485f, 13.9997f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(20.9997f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9999f, 6.0f)
                    horizontalLineTo(1.9999f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9999f, 1.0002f)
                    horizontalLineTo(1.9999f)
                    verticalLineTo(4.0002f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(1.0002f)
                    close()
                }
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
