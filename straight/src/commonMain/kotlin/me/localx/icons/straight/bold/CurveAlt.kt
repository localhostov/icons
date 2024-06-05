package me.localx.icons.straight.bold

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

public val Icons.Bold.CurveAlt: ImageVector
    get() {
        if (_curveAlt != null) {
            return _curveAlt!!
        }
        _curveAlt = Builder(name = "CurveAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-5.339f, 0.0f, -9.858f, 3.949f, -10.512f, 9.186f)
                curveToRelative(-0.84f, 6.735f, -6.639f, 11.814f, -13.488f, 11.814f)
                verticalLineToRelative(-3.0f)
                curveToRelative(5.339f, 0.0f, 9.858f, -3.949f, 10.512f, -9.186f)
                curveTo(11.352f, 5.079f, 17.15f, 0.0f, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _curveAlt!!
    }

private var _curveAlt: ImageVector? = null
