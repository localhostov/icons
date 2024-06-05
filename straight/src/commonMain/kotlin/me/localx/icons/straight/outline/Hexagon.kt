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

public val Icons.Outline.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-0.5f, 0.0f, -1.0f, -0.12f, -1.46f, -0.37f)
                lineToRelative(-7.97f, -4.27f)
                curveToRelative(-0.98f, -0.52f, -1.58f, -1.54f, -1.58f, -2.64f)
                lineTo(0.99f, 7.26f)
                curveToRelative(0.0f, -1.11f, 0.61f, -2.12f, 1.59f, -2.65f)
                lineTo(10.55f, 0.36f)
                curveToRelative(0.91f, -0.49f, 1.99f, -0.49f, 2.9f, 0.0f)
                lineToRelative(7.96f, 4.25f)
                curveToRelative(0.98f, 0.52f, 1.59f, 1.54f, 1.59f, 2.65f)
                verticalLineToRelative(9.46f)
                curveToRelative(0.0f, 1.11f, -0.61f, 2.12f, -1.58f, 2.64f)
                lineToRelative(-7.96f, 4.27f)
                curveToRelative(-0.46f, 0.24f, -0.96f, 0.37f, -1.46f, 0.37f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(-0.17f, 0.0f, -0.35f, 0.04f, -0.51f, 0.13f)
                lineTo(3.53f, 6.38f)
                curveToRelative(-0.33f, 0.17f, -0.53f, 0.51f, -0.53f, 0.88f)
                verticalLineToRelative(9.46f)
                curveToRelative(0.0f, 0.37f, 0.2f, 0.71f, 0.53f, 0.88f)
                lineToRelative(7.97f, 4.27f)
                curveToRelative(0.32f, 0.17f, 0.7f, 0.17f, 1.02f, 0.0f)
                lineToRelative(7.96f, -4.27f)
                curveToRelative(0.33f, -0.17f, 0.53f, -0.51f, 0.53f, -0.88f)
                lineTo(21.01f, 7.26f)
                curveToRelative(0.0f, -0.37f, -0.2f, -0.71f, -0.53f, -0.88f)
                horizontalLineToRelative(0.0f)
                lineTo(12.51f, 2.13f)
                curveToRelative(-0.16f, -0.08f, -0.33f, -0.13f, -0.51f, -0.13f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
