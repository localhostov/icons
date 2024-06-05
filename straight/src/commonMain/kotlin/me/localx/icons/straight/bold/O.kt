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

public val Icons.Bold.O: ImageVector
    get() {
        if (_o != null) {
            return _o!!
        }
        _o = Builder(name = "O", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.021f, 24.0f)
                curveToRelative(-5.525f, 0.0f, -10.021f, -4.526f, -10.021f, -10.091f)
                verticalLineToRelative(-3.818f)
                curveTo(2.0f, 4.527f, 6.495f, 0.0f, 12.021f, 0.0f)
                reflectiveCurveToRelative(9.979f, 4.527f, 9.979f, 10.091f)
                verticalLineToRelative(3.818f)
                curveToRelative(0.0f, 5.564f, -4.477f, 10.091f, -9.979f, 10.091f)
                close()
                moveTo(12.021f, 3.0f)
                curveToRelative(-3.871f, 0.0f, -7.021f, 3.181f, -7.021f, 7.091f)
                verticalLineToRelative(3.818f)
                curveToRelative(0.0f, 3.91f, 3.149f, 7.091f, 7.021f, 7.091f)
                curveToRelative(3.914f, 0.0f, 6.979f, -3.114f, 6.979f, -7.091f)
                verticalLineToRelative(-3.818f)
                curveToRelative(0.0f, -3.976f, -3.065f, -7.091f, -6.979f, -7.091f)
                close()
            }
        }
        .build()
        return _o!!
    }

private var _o: ImageVector? = null
