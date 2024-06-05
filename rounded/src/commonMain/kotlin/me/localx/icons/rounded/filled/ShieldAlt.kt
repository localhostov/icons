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

public val Icons.Filled.ShieldAlt: ImageVector
    get() {
        if (_shieldAlt != null) {
            return _shieldAlt!!
        }
        _shieldAlt = Builder(name = "ShieldAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 23.942f)
                curveToRelative(-2.307f, -1.178f, -9.0f, -5.158f, -9.0f, -11.573f)
                verticalLineToRelative(-5.774f)
                curveToRelative(0.0f, -2.159f, 1.377f, -4.066f, 3.427f, -4.746f)
                lineToRelative(5.573f, -1.848f)
                verticalLineToRelative(23.942f)
                close()
                moveTo(18.573f, 1.848f)
                lineToRelative(-5.573f, -1.848f)
                verticalLineToRelative(24.0f)
                curveToRelative(2.369f, -0.992f, 9.0f, -4.419f, 9.0f, -11.632f)
                verticalLineToRelative(-5.774f)
                curveToRelative(0.0f, -2.159f, -1.377f, -4.066f, -3.427f, -4.746f)
                close()
            }
        }
        .build()
        return _shieldAlt!!
    }

private var _shieldAlt: ImageVector? = null
