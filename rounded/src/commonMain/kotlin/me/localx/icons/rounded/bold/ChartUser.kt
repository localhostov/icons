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

public val Icons.Bold.ChartUser: ImageVector
    get() {
        if (_chartUser != null) {
            return _chartUser!!
        }
        _chartUser = Builder(name = "ChartUser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(6.5f, 16.0f)
                curveToRelative(-3.58f, 0.0f, -6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(18.5f, 0.0f)
                lineTo(9.96f, 0.0f)
                curveToRelative(-1.96f, 0.0f, -3.78f, 1.05f, -4.76f, 2.75f)
                curveToRelative(-0.41f, 0.72f, -0.17f, 1.63f, 0.55f, 2.05f)
                curveToRelative(0.71f, 0.41f, 1.63f, 0.17f, 2.05f, -0.55f)
                curveToRelative(0.45f, -0.77f, 1.28f, -1.25f, 2.17f, -1.25f)
                horizontalLineToRelative(8.54f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(24.01f, 5.5f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(12.44f, 12.56f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(2.15f, -2.15f)
                lineToRelative(0.84f, 0.84f)
                curveToRelative(0.54f, 0.54f, 1.45f, 0.16f, 1.45f, -0.6f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0.0f, -0.47f, -0.38f, -0.85f, -0.85f, -0.85f)
                horizontalLineToRelative(-3.8f)
                curveToRelative(-0.76f, 0.0f, -1.14f, 0.91f, -0.6f, 1.45f)
                lineToRelative(0.84f, 0.84f)
                lineToRelative(-2.15f, 2.15f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                close()
            }
        }
        .build()
        return _chartUser!!
    }

private var _chartUser: ImageVector? = null
