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

public val Icons.Bold.MenuDots: ImageVector
    get() {
        if (_menuDots != null) {
            return _menuDots!!
        }
        _menuDots = Builder(name = "MenuDots", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 14.5f)
                curveTo(22.8807f, 14.5f, 24.0f, 13.3807f, 24.0f, 12.0f)
                curveTo(24.0f, 10.6193f, 22.8807f, 9.5f, 21.5f, 9.5f)
                curveTo(20.1193f, 9.5f, 19.0001f, 10.6193f, 19.0001f, 12.0f)
                curveTo(19.0001f, 13.3807f, 20.1193f, 14.5f, 21.5f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.5f)
                curveTo(13.3807f, 14.5f, 14.5f, 13.3807f, 14.5f, 12.0f)
                curveTo(14.5f, 10.6193f, 13.3807f, 9.5f, 12.0f, 9.5f)
                curveTo(10.6193f, 9.5f, 9.5f, 10.6193f, 9.5f, 12.0f)
                curveTo(9.5f, 13.3807f, 10.6193f, 14.5f, 12.0f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 14.5f)
                curveTo(3.8807f, 14.5f, 5.0f, 13.3807f, 5.0f, 12.0f)
                curveTo(5.0f, 10.6193f, 3.8807f, 9.5f, 2.5f, 9.5f)
                curveTo(1.1193f, 9.5f, 0.0f, 10.6193f, 0.0f, 12.0f)
                curveTo(0.0f, 13.3807f, 1.1193f, 14.5f, 2.5f, 14.5f)
                close()
            }
        }
        .build()
        return _menuDots!!
    }

private var _menuDots: ImageVector? = null
