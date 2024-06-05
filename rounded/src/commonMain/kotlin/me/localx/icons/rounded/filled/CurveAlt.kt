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

public val Icons.Filled.CurveAlt: ImageVector
    get() {
        if (_curveAlt != null) {
            return _curveAlt!!
        }
        _curveAlt = Builder(name = "CurveAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(5.075f, 0.0f, 9.377f, -4.346f, 10.006f, -10.108f)
                curveTo(11.746f, 5.112f, 16.902f, 0.0f, 23.0f, 0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-5.075f, 0.0f, -9.377f, 4.346f, -10.006f, 10.108f)
                curveToRelative(-0.74f, 6.779f, -5.896f, 11.892f, -11.994f, 11.892f)
                close()
            }
        }
        .build()
        return _curveAlt!!
    }

private var _curveAlt: ImageVector? = null
