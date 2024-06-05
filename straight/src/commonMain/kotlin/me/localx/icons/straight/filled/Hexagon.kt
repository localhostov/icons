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

public val Icons.Filled.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.02f)
                curveToRelative(0.0f, -0.5f, 0.12f, -1.0f, 0.37f, -1.46f)
                lineTo(4.64f, 2.59f)
                curveToRelative(0.52f, -0.97f, 1.54f, -1.58f, 2.64f, -1.58f)
                horizontalLineToRelative(9.46f)
                curveToRelative(1.11f, 0.0f, 2.12f, 0.61f, 2.65f, 1.59f)
                lineToRelative(4.25f, 7.96f)
                curveToRelative(0.48f, 0.91f, 0.48f, 1.99f, 0.0f, 2.9f)
                lineToRelative(-4.25f, 7.96f)
                curveToRelative(-0.52f, 0.98f, -1.54f, 1.59f, -2.65f, 1.59f)
                horizontalLineTo(7.28f)
                curveToRelative(-1.11f, 0.0f, -2.12f, -0.61f, -2.64f, -1.58f)
                lineTo(0.37f, 13.47f)
                curveTo(0.12f, 13.02f, 0.0f, 12.52f, 0.0f, 12.02f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
