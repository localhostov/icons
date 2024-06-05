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

public val Icons.Filled.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                curveToRelative(-0.859f, 0.0f, -1.672f, -0.372f, -2.235f, -0.999f)
                curveToRelative(0.55f, -0.614f, 1.349f, -1.001f, 2.235f, -1.001f)
                lineTo(23.0f, 4.0f)
                curveToRelative(1.308f, -0.006f, 1.307f, -1.995f, 0.0f, -2.0f)
                lineTo(5.0f, 2.0f)
                curveTo(2.239f, 2.0f, 0.0f, 4.239f, 0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                lineTo(21.0f, 22.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                lineTo(24.0f, 9.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(20.0f, 15.0f)
                curveToRelative(-1.308f, -0.006f, -1.308f, -1.994f, 0.0f, -2.0f)
                curveToRelative(1.308f, 0.006f, 1.308f, 1.994f, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
