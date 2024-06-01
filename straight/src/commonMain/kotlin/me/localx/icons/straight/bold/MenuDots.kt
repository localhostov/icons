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

public val Icons.Bold.MenuDots: ImageVector
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
                    moveTo(21.517f, 14.5664f)
                    curveTo(22.8977f, 14.5664f, 24.017f, 13.4471f, 24.017f, 12.0664f)
                    curveTo(24.017f, 10.6857f, 22.8977f, 9.5664f, 21.517f, 9.5664f)
                    curveTo(20.1363f, 9.5664f, 19.017f, 10.6857f, 19.017f, 12.0664f)
                    curveTo(19.017f, 13.4471f, 20.1363f, 14.5664f, 21.517f, 14.5664f)
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
                    moveTo(2.5f, 14.4997f)
                    curveTo(3.8807f, 14.4997f, 5.0f, 13.3804f, 5.0f, 11.9997f)
                    curveTo(5.0f, 10.619f, 3.8807f, 9.4997f, 2.5f, 9.4997f)
                    curveTo(1.1193f, 9.4997f, 0.0f, 10.619f, 0.0f, 11.9997f)
                    curveTo(0.0f, 13.3804f, 1.1193f, 14.4997f, 2.5f, 14.4997f)
                    close()
                }
            }
        }
        .build()
        return _menuDots!!
    }

private var _menuDots: ImageVector? = null
