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

public val Icons.Bold.Q: ImageVector
    get() {
        if (_q != null) {
            return _q!!
        }
        _q = Builder(name = "Q", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.971f, 21.85f)
                lineToRelative(-2.532f, -2.532f)
                curveToRelative(0.988f, -1.564f, 1.561f, -3.42f, 1.561f, -5.409f)
                verticalLineToRelative(-3.818f)
                curveTo(22.0f, 4.526f, 17.514f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(2.0f, 4.526f, 2.0f, 10.091f)
                verticalLineToRelative(3.818f)
                curveToRelative(0.0f, 5.564f, 4.486f, 10.091f, 10.0f, 10.091f)
                curveToRelative(2.467f, 0.0f, 4.727f, -0.906f, 6.473f, -2.406f)
                lineToRelative(2.377f, 2.377f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.181f, -7.0f, -7.091f)
                verticalLineToRelative(-3.818f)
                curveToRelative(0.0f, -3.91f, 3.14f, -7.091f, 7.0f, -7.091f)
                reflectiveCurveToRelative(7.0f, 3.181f, 7.0f, 7.091f)
                verticalLineToRelative(3.818f)
                curveToRelative(0.0f, 1.155f, -0.274f, 2.246f, -0.759f, 3.21f)
                lineToRelative(-2.065f, -2.065f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.289f, 2.289f)
                curveToRelative(-1.194f, 0.96f, -2.704f, 1.535f, -4.344f, 1.535f)
                close()
            }
        }
        .build()
        return _q!!
    }

private var _q: ImageVector? = null
