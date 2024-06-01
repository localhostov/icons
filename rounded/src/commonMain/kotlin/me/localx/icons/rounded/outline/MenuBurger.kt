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

public val Icons.Outline.MenuBurger: ImageVector
    get() {
        if (_menuBurger != null) {
            return _menuBurger!!
        }
        _menuBurger = Builder(name = "MenuBurger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 10.9997f)
                    horizontalLineTo(1.0f)
                    curveTo(0.4477f, 10.9997f, 0.0f, 11.4474f, 0.0f, 11.9997f)
                    curveTo(0.0f, 12.552f, 0.4477f, 12.9997f, 1.0f, 12.9997f)
                    horizontalLineTo(23.0f)
                    curveTo(23.5523f, 12.9997f, 24.0f, 12.552f, 24.0f, 11.9997f)
                    curveTo(24.0f, 11.4474f, 23.5523f, 10.9997f, 23.0f, 10.9997f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 4.0003f)
                    horizontalLineTo(1.0f)
                    curveTo(0.4477f, 4.0003f, 0.0f, 4.448f, 0.0f, 5.0003f)
                    curveTo(0.0f, 5.5526f, 0.4477f, 6.0003f, 1.0f, 6.0003f)
                    horizontalLineTo(23.0f)
                    curveTo(23.5523f, 6.0003f, 24.0f, 5.5526f, 24.0f, 5.0003f)
                    curveTo(24.0f, 4.448f, 23.5523f, 4.0003f, 23.0f, 4.0003f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 18.0f)
                    horizontalLineTo(1.0f)
                    curveTo(0.4477f, 18.0f, 0.0f, 18.4477f, 0.0f, 19.0f)
                    curveTo(0.0f, 19.5523f, 0.4477f, 20.0f, 1.0f, 20.0f)
                    horizontalLineTo(23.0f)
                    curveTo(23.5523f, 20.0f, 24.0f, 19.5523f, 24.0f, 19.0f)
                    curveTo(24.0f, 18.4477f, 23.5523f, 18.0f, 23.0f, 18.0f)
                    close()
                }
            }
        }
        .build()
        return _menuBurger!!
    }

private var _menuBurger: ImageVector? = null
