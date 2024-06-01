package me.localx.icons.rounded.filled

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

public val Icons.Filled.MenuBurger: ImageVector
    get() {
        if (_menuBurger != null) {
            return _menuBurger!!
        }
        _menuBurger = Builder(name = "MenuBurger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.9565f, 10.9572f)
                horizontalLineTo(1.0435f)
                curveTo(0.4672f, 10.9572f, 0.0f, 11.4243f, 0.0f, 12.0006f)
                curveTo(0.0f, 12.5769f, 0.4672f, 13.0441f, 1.0435f, 13.0441f)
                horizontalLineTo(22.9565f)
                curveTo(23.5328f, 13.0441f, 24.0f, 12.5769f, 24.0f, 12.0006f)
                curveTo(24.0f, 11.4243f, 23.5328f, 10.9572f, 22.9565f, 10.9572f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0435f, 5.7393f)
                horizontalLineTo(22.9565f)
                curveTo(23.5328f, 5.7393f, 24.0f, 5.2722f, 24.0f, 4.6959f)
                curveTo(24.0f, 4.1196f, 23.5328f, 3.6524f, 22.9565f, 3.6524f)
                horizontalLineTo(1.0435f)
                curveTo(0.4672f, 3.6524f, 0.0f, 4.1196f, 0.0f, 4.6959f)
                curveTo(0.0f, 5.2722f, 0.4672f, 5.7393f, 1.0435f, 5.7393f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.9565f, 18.261f)
                horizontalLineTo(1.0435f)
                curveTo(0.4672f, 18.261f, 0.0f, 18.7282f, 0.0f, 19.3045f)
                curveTo(0.0f, 19.8808f, 0.4672f, 20.348f, 1.0435f, 20.348f)
                horizontalLineTo(22.9565f)
                curveTo(23.5328f, 20.348f, 24.0f, 19.8808f, 24.0f, 19.3045f)
                curveTo(24.0f, 18.7282f, 23.5328f, 18.261f, 22.9565f, 18.261f)
                close()
            }
        }
        .build()
        return _menuBurger!!
    }

private var _menuBurger: ImageVector? = null
