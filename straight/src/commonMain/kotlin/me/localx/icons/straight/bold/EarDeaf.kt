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

public val Icons.Bold.EarDeaf: ImageVector
    get() {
        if (_earDeaf != null) {
            return _earDeaf!!
        }
        _earDeaf = Builder(name = "EarDeaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.44f, 12.44f)
                lineToRelative(2.12f, 2.12f)
                lineTo(2.16f, 23.96f)
                lineTo(0.04f, 21.84f)
                lineTo(9.44f, 12.44f)
                close()
                moveTo(15.75f, 13.31f)
                curveToRelative(0.81f, -0.91f, 1.25f, -2.09f, 1.25f, -3.31f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.49f, -0.18f, 0.96f, -0.5f, 1.32f)
                lineToRelative(2.25f, 1.98f)
                close()
                moveTo(23.96f, 2.16f)
                lineTo(21.84f, 0.04f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-1.81f, -1.78f, -4.28f, -2.87f, -7.01f, -2.87f)
                curveTo(6.49f, 0.0f, 2.0f, 4.49f, 2.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.66f, -0.59f, 3.27f, -1.67f, 4.53f)
                curveToRelative(-0.4f, 0.45f, -1.32f, 1.5f, -1.36f, 2.94f)
                curveToRelative(-0.04f, 1.92f, -1.86f, 3.53f, -3.98f, 3.53f)
                verticalLineToRelative(3.0f)
                curveToRelative(3.77f, 0.0f, 6.9f, -2.9f, 6.98f, -6.47f)
                curveToRelative(0.0f, -0.32f, 0.35f, -0.73f, 0.64f, -1.06f)
                curveToRelative(1.54f, -1.8f, 2.38f, -4.1f, 2.38f, -6.47f)
                curveToRelative(0.0f, -1.7f, -0.43f, -3.3f, -1.18f, -4.7f)
                lineToRelative(3.14f, -3.14f)
                close()
            }
        }
        .build()
        return _earDeaf!!
    }

private var _earDeaf: ImageVector? = null
