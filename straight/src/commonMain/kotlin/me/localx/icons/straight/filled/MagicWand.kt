package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.MagicWand: ImageVector
    get() {
        if (_magicWand != null) {
            return _magicWand!!
        }
        _magicWand = Builder(name = "MagicWand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.247f, 9.752f)
                    lineTo(14.434f, 5.566f)
                    lineTo(18.434f, 9.566f)
                    lineTo(14.248f, 13.753f)
                    lineTo(10.247f, 9.752f)
                    close()
                    moveTo(8.833f, 11.166f)
                    lineTo(0.833f, 19.166f)
                    curveTo(0.4375f, 19.5616f, 0.1682f, 20.0656f, 0.0591f, 20.6143f)
                    curveTo(-0.05f, 21.163f, 0.0061f, 21.7317f, 0.2201f, 22.2485f)
                    curveTo(0.4342f, 22.7653f, 0.7967f, 23.2071f, 1.2617f, 23.518f)
                    curveTo(1.7268f, 23.8288f, 2.2736f, 23.9948f, 2.833f, 23.995f)
                    curveTo(3.2047f, 23.9962f, 3.5728f, 23.9235f, 3.9162f, 23.7812f)
                    curveTo(4.2595f, 23.6388f, 4.5712f, 23.4297f, 4.833f, 23.166f)
                    lineTo(12.833f, 15.166f)
                    lineTo(8.833f, 11.166f)
                    close()
                    moveTo(18.667f, 17.3f)
                    lineTo(20.0f, 19.962f)
                    lineTo(21.333f, 17.3f)
                    lineTo(24.0f, 15.962f)
                    lineTo(21.333f, 14.628f)
                    lineTo(20.0f, 11.962f)
                    lineTo(18.667f, 14.628f)
                    lineTo(16.0f, 15.962f)
                    lineTo(18.667f, 17.3f)
                    close()
                    moveTo(6.667f, 5.338f)
                    lineTo(8.0f, 8.0f)
                    lineTo(9.333f, 5.333f)
                    lineTo(12.0f, 4.0f)
                    lineTo(9.333f, 2.667f)
                    lineTo(8.0f, 0.0f)
                    lineTo(6.667f, 2.667f)
                    lineTo(4.0f, 4.0f)
                    lineTo(6.667f, 5.338f)
                    close()
                    moveTo(19.333f, 4.672f)
                    lineTo(20.5f, 7.0f)
                    lineTo(21.667f, 4.667f)
                    lineTo(24.0f, 3.5f)
                    lineTo(21.667f, 2.333f)
                    lineTo(20.5f, 0.0f)
                    lineTo(19.333f, 2.333f)
                    lineTo(17.0f, 3.5f)
                    lineTo(19.333f, 4.672f)
                    close()
                }
            }
        }
        .build()
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
