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

public val Icons.Filled.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(6.486f, 0.0f, 2.0f, 4.486f, 2.0f, 10.0f)
                curveToRelative(0.0f, 7.461f, 9.074f, 13.363f, 9.46f, 13.611f)
                lineToRelative(0.54f, 0.346f)
                lineToRelative(0.54f, -0.346f)
                curveToRelative(0.386f, -0.248f, 9.46f, -6.15f, 9.46f, -13.611f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(10.98f, 12.98f)
                reflectiveCurveToRelative(-2.728f, 0.248f, -3.968f, -0.992f)
                reflectiveCurveToRelative(-0.992f, -3.968f, -0.992f, -3.968f)
                curveToRelative(0.0f, 0.0f, 2.728f, -0.248f, 3.968f, 0.992f)
                reflectiveCurveToRelative(0.992f, 3.968f, 0.992f, 3.968f)
                close()
                moveTo(16.988f, 11.988f)
                curveToRelative(-1.24f, 1.24f, -3.968f, 0.992f, -3.968f, 0.992f)
                curveToRelative(0.0f, 0.0f, -0.248f, -2.728f, 0.992f, -3.968f)
                reflectiveCurveToRelative(3.968f, -0.992f, 3.968f, -0.992f)
                curveToRelative(0.0f, 0.0f, 0.248f, 2.728f, -0.992f, 3.968f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
