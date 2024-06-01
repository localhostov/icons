package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

public val Icons.Outline.MenuDots: ImageVector
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
                    moveTo(12.0001f, 14.0003f)
                    curveTo(13.1046f, 14.0003f, 14.0001f, 13.1049f, 14.0001f, 12.0003f)
                    curveTo(14.0001f, 10.8957f, 13.1046f, 10.0003f, 12.0001f, 10.0003f)
                    curveTo(10.8955f, 10.0003f, 10.0001f, 10.8957f, 10.0001f, 12.0003f)
                    curveTo(10.0001f, 13.1049f, 10.8955f, 14.0003f, 12.0001f, 14.0003f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 14.0003f)
                    curveTo(23.1045f, 14.0003f, 24.0f, 13.1049f, 24.0f, 12.0003f)
                    curveTo(24.0f, 10.8957f, 23.1045f, 10.0003f, 22.0f, 10.0003f)
                    curveTo(20.8954f, 10.0003f, 19.9999f, 10.8957f, 19.9999f, 12.0003f)
                    curveTo(19.9999f, 13.1049f, 20.8954f, 14.0003f, 22.0f, 14.0003f)
                    close()
                }
            }
        }
        .build()
        return _menuDots!!
    }

private var _menuDots: ImageVector? = null
