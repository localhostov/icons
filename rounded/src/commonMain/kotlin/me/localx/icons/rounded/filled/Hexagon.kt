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
                moveTo(0.0f, 12.0f)
                curveToRelative(0.0f, -0.81f, 0.2f, -1.62f, 0.59f, -2.36f)
                lineTo(3.81f, 3.64f)
                curveToRelative(0.87f, -1.63f, 2.56f, -2.64f, 4.41f, -2.64f)
                horizontalLineToRelative(7.58f)
                curveToRelative(1.85f, 0.0f, 3.54f, 1.01f, 4.41f, 2.64f)
                lineToRelative(3.2f, 6.0f)
                curveToRelative(0.79f, 1.48f, 0.79f, 3.24f, 0.0f, 4.71f)
                lineToRelative(-3.2f, 6.0f)
                curveToRelative(-0.87f, 1.63f, -2.56f, 2.64f, -4.41f, 2.64f)
                horizontalLineToRelative(-7.58f)
                curveToRelative(-1.85f, 0.0f, -3.53f, -1.01f, -4.41f, -2.64f)
                lineTo(0.59f, 14.37f)
                curveTo(0.2f, 13.63f, 0.0f, 12.82f, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
