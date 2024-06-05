package me.localx.icons.straight.outline

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
                moveToRelative(21.247f, 2.733f)
                curveTo(17.042f, -1.471f, 9.465f, -0.745f, 4.362f, 4.361f)
                curveTo(-0.743f, 9.465f, -1.473f, 17.039f, 2.733f, 21.246f)
                curveToRelative(1.838f, 1.838f, 4.318f, 2.733f, 6.954f, 2.733f)
                curveToRelative(3.398f, 0.0f, 7.057f, -1.488f, 9.931f, -4.362f)
                curveToRelative(5.104f, -5.104f, 5.835f, -12.678f, 1.629f, -16.884f)
                close()
                moveTo(5.776f, 5.775f)
                curveToRelative(2.489f, -2.489f, 5.635f, -3.787f, 8.51f, -3.787f)
                curveToRelative(1.933f, 0.0f, 3.738f, 0.593f, 5.145f, 1.798f)
                curveToRelative(-0.264f, 1.272f, -1.577f, 5.323f, -7.738f, 7.249f)
                curveToRelative(-5.622f, 1.757f, -7.817f, 5.14f, -8.669f, 7.327f)
                curveToRelative(-2.05f, -3.561f, -1.01f, -8.823f, 2.753f, -12.586f)
                close()
                moveTo(18.204f, 18.203f)
                curveToRelative(-4.161f, 4.159f, -10.154f, 4.992f, -13.656f, 1.996f)
                curveToRelative(0.261f, -1.264f, 1.566f, -5.326f, 7.74f, -7.256f)
                curveToRelative(5.621f, -1.756f, 7.817f, -5.139f, 8.669f, -7.326f)
                curveToRelative(2.051f, 3.56f, 1.01f, 8.823f, -2.753f, 12.586f)
                close()
            }
        }
        .build()
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
