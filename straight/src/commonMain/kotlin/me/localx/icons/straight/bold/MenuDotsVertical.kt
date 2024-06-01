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

public val Icons.Bold.MenuDotsVertical: ImageVector
    get() {
        if (_menuDotsVertical != null) {
            return _menuDotsVertical!!
        }
        _menuDotsVertical = Builder(name = "MenuDotsVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 5.0f)
                    curveTo(13.3806f, 5.0f, 14.4999f, 3.8807f, 14.4999f, 2.5f)
                    curveTo(14.4999f, 1.1193f, 13.3806f, 0.0f, 11.9999f, 0.0f)
                    curveTo(10.6192f, 0.0f, 9.4999f, 1.1193f, 9.4999f, 2.5f)
                    curveTo(9.4999f, 3.8807f, 10.6192f, 5.0f, 11.9999f, 5.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 14.4997f)
                    curveTo(13.3806f, 14.4997f, 14.4999f, 13.3804f, 14.4999f, 11.9997f)
                    curveTo(14.4999f, 10.619f, 13.3806f, 9.4997f, 11.9999f, 9.4997f)
                    curveTo(10.6192f, 9.4997f, 9.4999f, 10.619f, 9.4999f, 11.9997f)
                    curveTo(9.4999f, 13.3804f, 10.6192f, 14.4997f, 11.9999f, 14.4997f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 24.0003f)
                    curveTo(13.3806f, 24.0003f, 14.4999f, 22.881f, 14.4999f, 21.5003f)
                    curveTo(14.4999f, 20.1196f, 13.3806f, 19.0003f, 11.9999f, 19.0003f)
                    curveTo(10.6192f, 19.0003f, 9.4999f, 20.1196f, 9.4999f, 21.5003f)
                    curveTo(9.4999f, 22.881f, 10.6192f, 24.0003f, 11.9999f, 24.0003f)
                    close()
                }
            }
        }
        .build()
        return _menuDotsVertical!!
    }

private var _menuDotsVertical: ImageVector? = null
