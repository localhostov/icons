package me.localx.icons.rounded.outline

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

public val Icons.Outline.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 0.0f)
                    horizontalLineTo(7.0002f)
                    curveTo(5.6746f, 0.0016f, 4.4037f, 0.5289f, 3.4664f, 1.4662f)
                    curveTo(2.529f, 2.4036f, 2.0017f, 3.6744f, 2.0001f, 5.0f)
                    verticalLineTo(20.0f)
                    curveTo(2.0001f, 21.0609f, 2.4216f, 22.0783f, 3.1717f, 22.8284f)
                    curveTo(3.9219f, 23.5786f, 4.9393f, 24.0f, 6.0002f, 24.0f)
                    horizontalLineTo(17.0002f)
                    curveTo(18.3257f, 23.9984f, 19.5966f, 23.4711f, 20.5339f, 22.5338f)
                    curveTo(21.4713f, 21.5964f, 21.9986f, 20.3256f, 22.0002f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(21.9986f, 3.6744f, 21.4713f, 2.4036f, 20.5339f, 1.4662f)
                    curveTo(19.5966f, 0.5289f, 18.3257f, 0.0016f, 17.0002f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(20.0002f, 5.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(17.0002f)
                    curveTo(17.7958f, 2.0f, 18.5589f, 2.3161f, 19.1215f, 2.8787f)
                    curveTo(19.6841f, 3.4413f, 20.0002f, 4.2043f, 20.0002f, 5.0f)
                    close()
                    moveTo(6.0002f, 2.172f)
                    verticalLineTo(16.0f)
                    curveTo(5.2978f, 15.9994f, 4.6078f, 16.1847f, 4.0002f, 16.537f)
                    verticalLineTo(5.0f)
                    curveTo(4.0002f, 4.3797f, 4.1926f, 3.7747f, 4.5508f, 3.2682f)
                    curveTo(4.909f, 2.7617f, 5.4153f, 2.3788f, 6.0002f, 2.172f)
                    close()
                    moveTo(17.0002f, 22.0f)
                    horizontalLineTo(6.0002f)
                    curveTo(5.4697f, 22.0f, 4.961f, 21.7893f, 4.5859f, 21.4142f)
                    curveTo(4.2109f, 21.0391f, 4.0002f, 20.5304f, 4.0002f, 20.0f)
                    curveTo(4.0002f, 19.4696f, 4.2109f, 18.9609f, 4.5859f, 18.5858f)
                    curveTo(4.961f, 18.2107f, 5.4697f, 18.0f, 6.0002f, 18.0f)
                    horizontalLineTo(20.0002f)
                    verticalLineTo(19.0f)
                    curveTo(20.0002f, 19.7956f, 19.6841f, 20.5587f, 19.1215f, 21.1213f)
                    curveTo(18.5589f, 21.6839f, 17.7958f, 22.0f, 17.0002f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
