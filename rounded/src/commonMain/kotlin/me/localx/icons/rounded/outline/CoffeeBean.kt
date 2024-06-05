package me.localx.icons.rounded.outline

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

public val Icons.Outline.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) {
            return _coffeeBean!!
        }
        _coffeeBean = Builder(name = "CoffeeBean", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.257f, 2.743f)
                curveTo(17.048f, -1.465f, 9.474f, -0.731f, 4.372f, 4.372f)
                curveTo(-0.732f, 9.477f, -1.463f, 17.051f, 2.743f, 21.257f)
                curveToRelative(1.838f, 1.838f, 4.318f, 2.733f, 6.954f, 2.733f)
                curveToRelative(3.398f, 0.0f, 7.057f, -1.488f, 9.931f, -4.362f)
                curveToRelative(5.104f, -5.104f, 5.835f, -12.679f, 1.629f, -16.885f)
                close()
                moveTo(5.786f, 5.786f)
                curveToRelative(2.49f, -2.489f, 5.636f, -3.788f, 8.512f, -3.788f)
                curveToRelative(1.93f, 0.0f, 3.739f, 0.586f, 5.145f, 1.79f)
                curveToRelative(-0.261f, 1.264f, -1.568f, 5.329f, -7.741f, 7.258f)
                curveToRelative(-5.622f, 1.757f, -7.818f, 5.141f, -8.669f, 7.328f)
                curveToRelative(-2.051f, -3.561f, -1.01f, -8.824f, 2.753f, -12.587f)
                close()
                moveTo(18.214f, 18.214f)
                curveToRelative(-4.161f, 4.159f, -10.155f, 4.995f, -13.657f, 1.998f)
                curveToRelative(0.261f, -1.265f, 1.569f, -5.328f, 7.741f, -7.258f)
                curveToRelative(5.622f, -1.757f, 7.818f, -5.141f, 8.669f, -7.328f)
                curveToRelative(2.051f, 3.561f, 1.01f, 8.824f, -2.753f, 12.587f)
                close()
            }
        }
        .build()
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
