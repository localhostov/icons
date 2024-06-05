package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                curveToRelative(0.0f, 6.443f, 3.355f, 12.786f, 5.768f, 16.885f)
                arcToRelative(2.275f, 2.275f, 0.0f, false, false, 4.232f, -1.159f)
                verticalLineToRelative(-6.619f)
                arcToRelative(2.075f, 2.075f, 0.0f, false, true, 1.664f, -2.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.336f, 1.973f)
                verticalLineToRelative(6.726f)
                arcToRelative(2.275f, 2.275f, 0.0f, false, false, 4.232f, 1.159f)
                curveToRelative(2.414f, -4.1f, 5.768f, -10.443f, 5.768f, -16.885f)
                arcToRelative(5.785f, 5.785f, 0.0f, false, false, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
