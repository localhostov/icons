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

public val Icons.Filled.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.39f, 3.068f)
                arcToRelative(5.023f, 5.023f, 0.0f, false, true, 9.22f, 0.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 12.0f, 6.051f)
                arcTo(6.515f, 6.515f, 0.0f, false, false, 7.39f, 3.068f)
                close()
                moveTo(11.0f, 9.5f)
                curveToRelative(-0.246f, -6.289f, -9.467f, -5.743f, -8.965f, 0.524f)
                arcToRelative(53.989f, 53.989f, 0.0f, false, false, 8.706f, 0.937f)
                arcTo(4.427f, 4.427f, 0.0f, false, false, 11.0f, 9.5f)
                close()
                moveTo(17.5f, 5.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.24f, 5.964f)
                arcToRelative(52.563f, 52.563f, 0.0f, false, false, 8.705f, -0.934f)
                arcTo(4.506f, 4.506f, 0.0f, false, false, 17.5f, 5.0f)
                close()
                moveTo(2.736f, 12.19f)
                curveToRelative(0.014f, 0.029f, 6.283f, 10.143f, 6.283f, 10.143f)
                arcToRelative(3.521f, 3.521f, 0.0f, false, false, 5.96f, 0.0f)
                reflectiveCurveTo(21.248f, 12.224f, 21.261f, 12.2f)
                arcTo(54.989f, 54.989f, 0.0f, false, true, 12.0f, 13.0f)
                arcTo(55.474f, 55.474f, 0.0f, false, true, 2.736f, 12.19f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
