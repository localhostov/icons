package me.localx.icons.rounded.bold

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

public val Icons.Bold.Hexagon: ImageVector
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
                curveToRelative(0.0f, -0.86f, 0.21f, -1.72f, 0.63f, -2.51f)
                lineTo(3.71f, 3.79f)
                curveToRelative(0.93f, -1.72f, 2.72f, -2.79f, 4.69f, -2.79f)
                horizontalLineToRelative(7.23f)
                curveToRelative(1.97f, 0.0f, 3.76f, 1.07f, 4.69f, 2.8f)
                lineToRelative(3.06f, 5.7f)
                curveToRelative(0.84f, 1.57f, 0.84f, 3.43f, 0.0f, 5.0f)
                lineToRelative(-3.06f, 5.7f)
                curveToRelative(-0.93f, 1.73f, -2.72f, 2.8f, -4.69f, 2.8f)
                horizontalLineToRelative(-7.23f)
                curveToRelative(-1.96f, 0.0f, -3.76f, -1.07f, -4.68f, -2.79f)
                lineTo(0.63f, 14.51f)
                curveTo(0.21f, 13.73f, 0.0f, 12.87f, 0.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -0.37f, -0.09f, -0.74f, -0.27f, -1.08f)
                lineToRelative(-3.06f, -5.7f)
                curveToRelative(-0.4f, -0.75f, -1.19f, -1.22f, -2.05f, -1.22f)
                horizontalLineToRelative(-7.23f)
                curveToRelative(-0.86f, 0.0f, -1.64f, 0.47f, -2.04f, 1.22f)
                lineToRelative(-3.07f, 5.7f)
                curveToRelative(-0.37f, 0.68f, -0.37f, 1.49f, 0.0f, 2.17f)
                lineToRelative(3.07f, 5.7f)
                curveToRelative(0.4f, 0.75f, 1.19f, 1.21f, 2.04f, 1.21f)
                horizontalLineToRelative(7.23f)
                curveToRelative(0.86f, 0.0f, 1.64f, -0.47f, 2.05f, -1.22f)
                reflectiveQuadToRelative(0.0f, 0.0f)
                lineToRelative(3.06f, -5.7f)
                curveToRelative(0.18f, -0.34f, 0.27f, -0.71f, 0.27f, -1.08f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
