package me.localx.icons.straight.bold

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
                moveTo(18.05f, 1.0f)
                lineTo(5.97f, 1.0f)
                lineTo(0.0f, 12.0f)
                lineToRelative(5.96f, 11.0f)
                horizontalLineToRelative(12.08f)
                lineToRelative(5.96f, -11.0f)
                lineTo(18.05f, 1.0f)
                close()
                moveTo(16.26f, 20.0f)
                lineTo(7.75f, 20.0f)
                lineTo(3.42f, 12.0f)
                lineTo(7.75f, 4.0f)
                horizontalLineToRelative(8.51f)
                lineToRelative(4.34f, 8.0f)
                lineToRelative(-4.34f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.65f, 12.62f)
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
                moveTo(13.41f, 13.0f)
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
