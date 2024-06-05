package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                arcToRelative(12.792f, 12.792f, 0.0f, false, false, -3.915f, 0.615f)
                arcToRelative(7.037f, 7.037f, 0.0f, false, true, -2.085f, 0.385f)
                arcToRelative(7.037f, 7.037f, 0.0f, false, true, -2.085f, -0.385f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, false, -3.915f, -0.615f)
                arcToRelative(5.785f, 5.785f, 0.0f, false, false, -6.0f, 6.0f)
                curveToRelative(0.0f, 7.061f, 4.029f, 14.0f, 6.433f, 18.0f)
                horizontalLineToRelative(3.567f)
                verticalLineToRelative(-8.893f)
                arcToRelative(2.075f, 2.075f, 0.0f, false, true, 1.664f, -2.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.336f, 1.973f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.567f)
                curveToRelative(2.405f, -4.0f, 6.433f, -10.94f, 6.433f, -18.0f)
                arcToRelative(5.785f, 5.785f, 0.0f, false, false, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
