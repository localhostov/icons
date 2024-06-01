package me.localx.icons.straight.outline

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

public val Icons.Outline.Inbox: ImageVector
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
                    moveTo(21.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 24.0f, 1.4413f, 23.6839f, 0.8787f, 23.1213f)
                    curveTo(0.3161f, 22.5587f, 0.0f, 21.7956f, 0.0f, 21.0f)
                    lineTo(0.0f, 12.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(14.0f)
                    curveTo(8.0f, 14.5304f, 8.2107f, 15.0391f, 8.5858f, 15.4142f)
                    curveTo(8.9609f, 15.7893f, 9.4696f, 16.0f, 10.0f, 16.0f)
                    horizontalLineTo(14.0f)
                    curveTo(14.5304f, 16.0f, 15.0391f, 15.7893f, 15.4142f, 15.4142f)
                    curveTo(15.7893f, 15.0391f, 16.0f, 14.5304f, 16.0f, 14.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(21.0f)
                    curveTo(24.0f, 21.7956f, 23.6839f, 22.5587f, 23.1213f, 23.1213f)
                    curveTo(22.5587f, 23.6839f, 21.7956f, 24.0f, 21.0f, 24.0f)
                    close()
                    moveTo(2.0f, 14.0f)
                    verticalLineTo(21.0f)
                    curveTo(2.0f, 21.2652f, 2.1054f, 21.5196f, 2.2929f, 21.7071f)
                    curveTo(2.4804f, 21.8946f, 2.7348f, 22.0f, 3.0f, 22.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 22.0f, 21.5196f, 21.8946f, 21.7071f, 21.7071f)
                    curveTo(21.8946f, 21.5196f, 22.0f, 21.2652f, 22.0f, 21.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.0f, 15.0609f, 17.5786f, 16.0783f, 16.8284f, 16.8284f)
                    curveTo(16.0783f, 17.5786f, 15.0609f, 18.0f, 14.0f, 18.0f)
                    horizontalLineTo(10.0f)
                    curveTo(8.9391f, 18.0f, 7.9217f, 17.5786f, 7.1716f, 16.8284f)
                    curveTo(6.4214f, 16.0783f, 6.0f, 15.0609f, 6.0f, 14.0f)
                    horizontalLineTo(2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0002f, 8.0005f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(10.0005f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(8.0005f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0002f, 4.0002f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(6.0002f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(4.0002f)
                    close()
                }
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
