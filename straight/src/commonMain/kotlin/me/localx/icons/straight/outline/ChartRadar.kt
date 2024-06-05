package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.01f, 23.0f)
                lineTo(5.96f, 23.0f)
                lineTo(-0.01f, 12.0f)
                lineTo(5.96f, 1.0f)
                horizontalLineToRelative(12.05f)
                lineToRelative(5.98f, 11.0f)
                lineToRelative(-5.98f, 11.0f)
                close()
                moveTo(7.15f, 21.0f)
                horizontalLineToRelative(9.68f)
                lineToRelative(4.89f, -9.0f)
                lineTo(16.82f, 3.0f)
                lineTo(7.15f, 3.0f)
                lineTo(2.26f, 12.0f)
                lineToRelative(4.89f, 9.0f)
                close()
            }
        }
        .build()
        return _chartRadar!!
    }

private var _chartRadar: ImageVector? = null
