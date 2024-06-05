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

public val Icons.Filled.BowlSpoon: ImageVector
    get() {
        if (_bowlSpoon != null) {
            return _bowlSpoon!!
        }
        _bowlSpoon = Builder(name = "BowlSpoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.255f, 12.082f)
                curveToRelative(0.594f, 0.697f, 0.851f, 1.62f, 0.704f, 2.53f)
                curveToRelative(-0.808f, 5.004f, -4.743f, 7.914f, -7.725f, 9.388f)
                horizontalLineTo(7.766f)
                curveTo(4.783f, 22.526f, 0.848f, 19.616f, 0.04f, 14.612f)
                curveToRelative(-0.146f, -0.911f, 0.11f, -1.833f, 0.704f, -2.531f)
                curveToRelative(0.573f, -0.672f, 1.398f, -1.058f, 2.265f, -1.058f)
                horizontalLineToRelative(17.981f)
                curveToRelative(0.867f, 0.0f, 1.692f, 0.386f, 2.265f, 1.059f)
                close()
                moveTo(10.409f, 3.0f)
                curveToRelative(-0.473f, -1.724f, -2.139f, -3.0f, -4.116f, -3.0f)
                curveTo(4.132f, 0.0f, 0.0f, 1.558f, 0.0f, 4.0f)
                reflectiveCurveToRelative(4.132f, 4.0f, 6.293f, 4.0f)
                curveToRelative(1.977f, 0.0f, 3.643f, -1.276f, 4.116f, -3.0f)
                horizontalLineToRelative(13.634f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-13.634f)
                close()
            }
        }
        .build()
        return _bowlSpoon!!
    }

private var _bowlSpoon: ImageVector? = null
