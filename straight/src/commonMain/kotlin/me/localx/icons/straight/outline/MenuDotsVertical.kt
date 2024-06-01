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

public val Icons.Outline.MenuDotsVertical: ImageVector
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
                    moveTo(11.9998f, 4.0f)
                    curveTo(13.1044f, 4.0f, 13.9998f, 3.1046f, 13.9998f, 2.0f)
                    curveTo(13.9998f, 0.8954f, 13.1044f, 0.0f, 11.9998f, 0.0f)
                    curveTo(10.8952f, 0.0f, 9.9998f, 0.8954f, 9.9998f, 2.0f)
                    curveTo(9.9998f, 3.1046f, 10.8952f, 4.0f, 11.9998f, 4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9998f, 14.0003f)
                    curveTo(13.1044f, 14.0003f, 13.9998f, 13.1049f, 13.9998f, 12.0003f)
                    curveTo(13.9998f, 10.8957f, 13.1044f, 10.0003f, 11.9998f, 10.0003f)
                    curveTo(10.8952f, 10.0003f, 9.9998f, 10.8957f, 9.9998f, 12.0003f)
                    curveTo(9.9998f, 13.1049f, 10.8952f, 14.0003f, 11.9998f, 14.0003f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9998f, 23.9997f)
                    curveTo(13.1044f, 23.9997f, 13.9998f, 23.1043f, 13.9998f, 21.9997f)
                    curveTo(13.9998f, 20.8951f, 13.1044f, 19.9997f, 11.9998f, 19.9997f)
                    curveTo(10.8952f, 19.9997f, 9.9998f, 20.8951f, 9.9998f, 21.9997f)
                    curveTo(9.9998f, 23.1043f, 10.8952f, 23.9997f, 11.9998f, 23.9997f)
                    close()
                }
            }
        }
        .build()
        return _menuDotsVertical!!
    }

private var _menuDotsVertical: ImageVector? = null
