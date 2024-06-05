package me.localx.icons.rounded.outline

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

public val Icons.Outline.ChartRadar: ImageVector
    get() {
        if (_chartRadar != null) {
            return _chartRadar!!
        }
        _chartRadar = Builder(name = "ChartRadar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.3f, 9.49f)
                lineToRelative(-3.48f, -6.0f)
                curveToRelative(-0.89f, -1.54f, -2.55f, -2.49f, -4.32f, -2.49f)
                horizontalLineToRelative(-7.01f)
                curveToRelative(-1.78f, 0.0f, -3.43f, 0.95f, -4.32f, 2.49f)
                lineTo(0.68f, 9.49f)
                curveToRelative(-0.9f, 1.55f, -0.9f, 3.47f, 0.0f, 5.02f)
                lineToRelative(3.48f, 6.0f)
                curveToRelative(0.89f, 1.54f, 2.55f, 2.49f, 4.32f, 2.49f)
                horizontalLineToRelative(7.01f)
                curveToRelative(1.78f, 0.0f, 3.43f, -0.95f, 4.32f, -2.49f)
                lineToRelative(3.48f, -6.0f)
                curveToRelative(0.9f, -1.55f, 0.9f, -3.47f, 0.0f, -5.02f)
                close()
                moveTo(21.57f, 13.51f)
                lineToRelative(-3.48f, 6.0f)
                curveToRelative(-0.54f, 0.92f, -1.53f, 1.49f, -2.59f, 1.49f)
                horizontalLineToRelative(-7.01f)
                curveToRelative(-1.07f, 0.0f, -2.06f, -0.57f, -2.59f, -1.49f)
                lineToRelative(-3.48f, -6.0f)
                curveToRelative(-0.54f, -0.93f, -0.54f, -2.08f, 0.0f, -3.01f)
                lineToRelative(3.48f, -6.0f)
                curveToRelative(0.54f, -0.92f, 1.53f, -1.49f, 2.59f, -1.49f)
                horizontalLineToRelative(7.01f)
                curveToRelative(1.06f, 0.0f, 2.06f, 0.57f, 2.59f, 1.49f)
                lineToRelative(3.48f, 6.0f)
                curveToRelative(0.54f, 0.93f, 0.54f, 2.08f, 0.0f, 3.01f)
                close()
                moveTo(16.01f, 13.0f)
                lineToRelative(-2.28f, -3.99f)
                curveToRelative(0.17f, -0.3f, 0.27f, -0.64f, 0.27f, -1.01f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.37f, 0.1f, 0.71f, 0.27f, 1.01f)
                lineToRelative(-2.28f, 3.99f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.74f, 0.0f, 1.39f, -0.4f, 1.73f, -1.0f)
                horizontalLineToRelative(4.54f)
                curveToRelative(0.35f, 0.6f, 0.99f, 1.0f, 1.73f, 1.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.89f, -1.99f, -1.99f, -2.0f)
                close()
                moveTo(9.73f, 13.99f)
                lineToRelative(2.27f, -3.98f)
                lineToRelative(2.27f, 3.98f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(-4.54f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chartRadar!!
    }

private var _chartRadar: ImageVector? = null
