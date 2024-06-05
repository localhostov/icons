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

public val Icons.Outline.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 23.957f)
                lineToRelative(-0.54f, -0.346f)
                curveToRelative(-0.386f, -0.248f, -9.46f, -6.15f, -9.46f, -13.611f)
                curveTo(2.0f, 4.486f, 6.486f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 7.461f, -9.074f, 13.363f, -9.46f, 13.611f)
                lineToRelative(-0.54f, 0.346f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                curveToRelative(0.0f, 5.417f, 6.123f, 10.212f, 8.0f, 11.555f)
                curveToRelative(1.877f, -1.343f, 8.0f, -6.138f, 8.0f, -11.555f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(17.98f, 8.02f)
                reflectiveCurveToRelative(-2.728f, -0.248f, -3.968f, 0.992f)
                reflectiveCurveToRelative(-0.992f, 3.968f, -0.992f, 3.968f)
                curveToRelative(0.0f, 0.0f, 2.728f, 0.248f, 3.968f, -0.992f)
                reflectiveCurveToRelative(0.992f, -3.968f, 0.992f, -3.968f)
                close()
                moveTo(7.012f, 11.988f)
                curveToRelative(1.24f, 1.24f, 3.968f, 0.992f, 3.968f, 0.992f)
                curveToRelative(0.0f, 0.0f, 0.248f, -2.728f, -0.992f, -3.968f)
                reflectiveCurveToRelative(-3.968f, -0.992f, -3.968f, -0.992f)
                curveToRelative(0.0f, 0.0f, -0.248f, 2.728f, 0.992f, 3.968f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
