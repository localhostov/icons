package me.localx.icons.straight.outline

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

public val Icons.Outline.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.769f, 14.813f)
                    curveTo(20.769f, 13.91f, 22.0f, 12.562f, 22.0f, 11.0f)
                    curveTo(22.0f, 8.62f, 19.149f, 6.734f, 15.058f, 6.175f)
                    curveTo(15.6448f, 5.6014f, 15.983f, 4.8204f, 16.0f, 4.0f)
                    curveTo(16.0f, 1.757f, 13.364f, 0.0f, 10.0f, 0.0f)
                    curveTo(6.636f, 0.0f, 4.0f, 1.757f, 4.0f, 4.0f)
                    curveTo(4.0507f, 4.6871f, 4.2916f, 5.3466f, 4.6957f, 5.9046f)
                    curveTo(5.0997f, 6.4627f, 5.6511f, 6.8973f, 6.288f, 7.16f)
                    curveTo(4.254f, 8.063f, 3.0f, 9.423f, 3.0f, 11.0f)
                    curveTo(3.0f, 12.47f, 4.092f, 13.751f, 5.888f, 14.649f)
                    curveTo(2.511f, 15.424f, 0.0f, 16.885f, 0.0f, 19.0f)
                    curveTo(0.0f, 22.283f, 6.037f, 24.0f, 12.0f, 24.0f)
                    curveTo(17.963f, 24.0f, 24.0f, 22.283f, 24.0f, 19.0f)
                    curveTo(24.0f, 17.025f, 21.809f, 15.621f, 18.769f, 14.813f)
                    close()
                    moveTo(10.0f, 2.0f)
                    curveTo(12.29f, 2.0f, 14.0f, 3.056f, 14.0f, 4.0f)
                    curveTo(14.0f, 4.944f, 12.29f, 6.0f, 10.0f, 6.0f)
                    curveTo(7.71f, 6.0f, 6.0f, 4.944f, 6.0f, 4.0f)
                    curveTo(6.0f, 3.056f, 7.71f, 2.0f, 10.0f, 2.0f)
                    close()
                    moveTo(5.0f, 11.0f)
                    curveTo(5.0f, 9.747f, 7.853f, 8.0f, 12.5f, 8.0f)
                    curveTo(17.147f, 8.0f, 20.0f, 9.747f, 20.0f, 11.0f)
                    curveTo(20.0f, 12.253f, 17.146f, 14.0f, 12.5f, 14.0f)
                    curveTo(7.854f, 14.0f, 5.0f, 12.253f, 5.0f, 11.0f)
                    close()
                    moveTo(12.0f, 22.0f)
                    curveTo(5.988f, 22.0f, 2.0f, 20.194f, 2.0f, 19.0f)
                    curveTo(2.0f, 17.806f, 5.988f, 16.0f, 12.0f, 16.0f)
                    curveTo(18.012f, 16.0f, 22.0f, 17.806f, 22.0f, 19.0f)
                    curveTo(22.0f, 20.194f, 18.012f, 22.0f, 12.0f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
