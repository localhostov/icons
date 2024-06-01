package me.localx.icons.rounded.bold

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.MenuBurger: ImageVector
    get() {
        if (_menuBurger != null) {
            return _menuBurger!!
        }
        _menuBurger = Builder(name = "MenuBurger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 10.5f)
                horizontalLineTo(1.5f)
                curveTo(0.6716f, 10.5f, 0.0f, 11.1716f, 0.0f, 12.0f)
                curveTo(0.0f, 12.8284f, 0.6716f, 13.5f, 1.5f, 13.5f)
                horizontalLineTo(22.5f)
                curveTo(23.3284f, 13.5f, 24.0f, 12.8284f, 24.0f, 12.0f)
                curveTo(24.0f, 11.1716f, 23.3284f, 10.5f, 22.5f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 6.5f)
                horizontalLineTo(22.5f)
                curveTo(23.3284f, 6.5f, 24.0f, 5.8284f, 24.0f, 5.0f)
                curveTo(24.0f, 4.1716f, 23.3284f, 3.5f, 22.5f, 3.5f)
                horizontalLineTo(1.5f)
                curveTo(0.6716f, 3.5f, 0.0f, 4.1716f, 0.0f, 5.0f)
                curveTo(0.0f, 5.8284f, 0.6716f, 6.5f, 1.5f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 17.5f)
                horizontalLineTo(1.5f)
                curveTo(0.6716f, 17.5f, 0.0f, 18.1716f, 0.0f, 19.0f)
                curveTo(0.0f, 19.8284f, 0.6716f, 20.5f, 1.5f, 20.5f)
                horizontalLineTo(22.5f)
                curveTo(23.3284f, 20.5f, 24.0f, 19.8284f, 24.0f, 19.0f)
                curveTo(24.0f, 18.1716f, 23.3284f, 17.5f, 22.5f, 17.5f)
                close()
            }
        }
        .build()
        return _menuBurger!!
    }

private var _menuBurger: ImageVector? = null
