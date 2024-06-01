package me.localx.icons.straight.filled

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

public val Icons.Filled.MenuDots: ImageVector
    get() {
        if (_menuDots != null) {
            return _menuDots!!
        }
        _menuDots = Builder(name = "MenuDots", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 14.0003f)
                    curveTo(3.1046f, 14.0003f, 4.0f, 13.1049f, 4.0f, 12.0003f)
                    curveTo(4.0f, 10.8957f, 3.1046f, 10.0003f, 2.0f, 10.0003f)
                    curveTo(0.8954f, 10.0003f, 0.0f, 10.8957f, 0.0f, 12.0003f)
                    curveTo(0.0f, 13.1049f, 0.8954f, 14.0003f, 2.0f, 14.0003f)
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
                    moveTo(22.0002f, 14.0003f)
                    curveTo(23.1047f, 14.0003f, 24.0002f, 13.1049f, 24.0002f, 12.0003f)
                    curveTo(24.0002f, 10.8957f, 23.1047f, 10.0003f, 22.0002f, 10.0003f)
                    curveTo(20.8956f, 10.0003f, 20.0002f, 10.8957f, 20.0002f, 12.0003f)
                    curveTo(20.0002f, 13.1049f, 20.8956f, 14.0003f, 22.0002f, 14.0003f)
                    close()
                }
            }
        }
        .build()
        return _menuDots!!
    }

private var _menuDots: ImageVector? = null
