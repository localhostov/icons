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

public val Icons.Filled.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.612f, 23.0f)
                horizontalLineTo(2.388f)
                lineToRelative(7.302f, -8.914f)
                curveToRelative(0.577f, -0.692f, 1.417f, -1.086f, 2.31f, -1.086f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.893f, 0.0f, 1.733f, 0.394f, 2.304f, 1.08f)
                lineToRelative(7.308f, 8.92f)
                close()
                moveTo(3.079f, 19.0f)
                lineToRelative(5.063f, -6.182f)
                curveToRelative(0.967f, -1.16f, 2.37f, -1.818f, 3.857f, -1.818f)
                reflectiveCurveToRelative(2.89f, 0.656f, 3.842f, 1.801f)
                lineToRelative(5.079f, 6.199f)
                horizontalLineToRelative(3.08f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(3.079f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
