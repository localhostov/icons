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
                moveToRelative(11.0f, 0.0f)
                verticalLineToRelative(23.94f)
                curveToRelative(-2.1f, -1.062f, -9.0f, -5.046f, -9.0f, -11.565f)
                verticalLineToRelative(-7.225f)
                curveToRelative(0.0f, -1.293f, 0.828f, -2.441f, 2.056f, -2.848f)
                lineTo(11.0f, 0.0f)
                close()
                moveTo(19.944f, 2.302f)
                lineTo(13.0f, 0.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(2.207f, -0.905f, 9.0f, -4.282f, 9.0f, -11.625f)
                verticalLineToRelative(-7.225f)
                curveToRelative(0.0f, -1.293f, -0.828f, -2.441f, -2.056f, -2.848f)
                close()
            }
        }
        .build()
        return _shieldAlt!!
    }

private var _shieldAlt: ImageVector? = null
