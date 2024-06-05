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

public val Icons.Bold.ChartRadar: ImageVector
    get() {
        if (_chartRadar != null) {
            return _chartRadar!!
        }
        _chartRadar = Builder(name = "ChartRadar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.23f, 9.22f)
                lineToRelative(-3.22f, -5.5f)
                curveToRelative(-0.98f, -1.68f, -2.8f, -2.72f, -4.75f, -2.72f)
                horizontalLineToRelative(-6.55f)
                curveToRelative(-1.94f, 0.0f, -3.76f, 1.04f, -4.75f, 2.72f)
                lineTo(0.74f, 9.22f)
                curveToRelative(-1.01f, 1.72f, -1.01f, 3.85f, 0.0f, 5.56f)
                lineToRelative(3.22f, 5.5f)
                curveToRelative(0.98f, 1.68f, 2.8f, 2.72f, 4.75f, 2.72f)
                horizontalLineToRelative(6.55f)
                curveToRelative(1.94f, 0.0f, 3.76f, -1.04f, 4.75f, -2.72f)
                lineToRelative(3.22f, -5.5f)
                curveToRelative(1.01f, -1.72f, 1.01f, -3.85f, 0.0f, -5.56f)
                close()
                moveTo(20.64f, 13.26f)
                lineToRelative(-3.22f, 5.5f)
                curveToRelative(-0.45f, 0.76f, -1.27f, 1.24f, -2.16f, 1.24f)
                horizontalLineToRelative(-6.55f)
                curveToRelative(-0.88f, 0.0f, -1.71f, -0.47f, -2.16f, -1.24f)
                lineToRelative(-3.22f, -5.5f)
                curveToRelative(-0.46f, -0.78f, -0.46f, -1.75f, 0.0f, -2.53f)
                lineToRelative(3.22f, -5.5f)
                curveToRelative(0.45f, -0.76f, 1.27f, -1.24f, 2.16f, -1.24f)
                horizontalLineToRelative(6.55f)
                curveToRelative(0.88f, 0.0f, 1.71f, 0.47f, 2.16f, 1.24f)
                lineToRelative(3.22f, 5.5f)
                curveToRelative(0.46f, 0.78f, 0.46f, 1.75f, 0.0f, 2.53f)
                close()
                moveTo(16.65f, 12.61f)
                lineToRelative(-2.69f, -4.71f)
                curveToRelative(0.03f, -0.13f, 0.04f, -0.27f, 0.04f, -0.4f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.14f, 0.01f, 0.27f, 0.04f, 0.4f)
                lineToRelative(-2.69f, 4.71f)
                curveToRelative(-0.78f, 0.27f, -1.35f, 1.01f, -1.35f, 1.88f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.5f, 0.0f, 0.96f, -0.19f, 1.31f, -0.5f)
                horizontalLineToRelative(5.38f)
                curveToRelative(0.35f, 0.31f, 0.81f, 0.5f, 1.31f, 0.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.88f, -0.57f, -1.61f, -1.35f, -1.88f)
                close()
                moveTo(13.41f, 12.99f)
                horizontalLineToRelative(-2.83f)
                lineToRelative(1.42f, -2.48f)
                lineToRelative(1.42f, 2.48f)
                close()
            }
        }
        .build()
        return _chartRadar!!
    }

private var _chartRadar: ImageVector? = null
