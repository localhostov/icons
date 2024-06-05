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

public val Icons.Bold.Up: ImageVector
    get() {
        if (_up != null) {
            return _up!!
        }
        _up = Builder(name = "Up", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 24.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-1.64f)
                curveToRelative(-1.37f, 0.0f, -2.59f, -0.82f, -3.1f, -2.08f)
                reflectiveCurveToRelative(-0.23f, -2.7f, 0.73f, -3.66f)
                lineTo(8.96f, 1.26f)
                curveToRelative(1.68f, -1.67f, 4.4f, -1.68f, 6.08f, 0.0f)
                curveToRelative(0.0f, 0.0f, 5.97f, 6.0f, 5.97f, 6.0f)
                curveToRelative(0.96f, 0.96f, 1.25f, 2.4f, 0.73f, 3.66f)
                curveToRelative(-0.52f, 1.26f, -1.73f, 2.08f, -3.1f, 2.08f)
                horizontalLineToRelative(-1.65f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(8.5f, 10.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.27f, 0.0f, 0.5f, -0.23f, 0.5f, -0.5f)
                lineTo(14.0f, 11.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.14f)
                curveToRelative(0.15f, 0.0f, 0.27f, -0.08f, 0.33f, -0.23f)
                reflectiveCurveToRelative(0.03f, -0.28f, -0.08f, -0.4f)
                lineTo(12.92f, 3.38f)
                curveToRelative(-0.51f, -0.5f, -1.33f, -0.5f, -1.83f, 0.0f)
                lineToRelative(-5.97f, 6.0f)
                curveToRelative(-0.12f, 0.12f, -0.14f, 0.25f, -0.08f, 0.4f)
                curveToRelative(0.06f, 0.15f, 0.17f, 0.22f, 0.34f, 0.23f)
                horizontalLineToRelative(3.13f)
                close()
            }
        }
        .build()
        return _up!!
    }

private var _up: ImageVector? = null
