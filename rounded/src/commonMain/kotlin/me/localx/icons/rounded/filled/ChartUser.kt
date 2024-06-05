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

public val Icons.Filled.ChartUser: ImageVector
    get() {
        if (_chartUser != null) {
            return _chartUser!!
        }
        _chartUser = Builder(name = "ChartUser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 23.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(0.0f, 23.0f)
                curveToRelative(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f)
                close()
                moveTo(11.0f, 10.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                close()
                moveTo(19.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                curveToRelative(-2.69f, 0.0f, -4.87f, 2.14f, -4.98f, 4.8f)
                curveToRelative(0.88f, -0.51f, 1.89f, -0.8f, 2.98f, -0.8f)
                curveToRelative(2.74f, 0.0f, 5.04f, 1.84f, 5.76f, 4.35f)
                lineToRelative(2.24f, 2.24f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-1.59f)
                lineToRelative(-3.59f, 3.59f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f)
                lineToRelative(-0.72f, -0.72f)
                reflectiveCurveToRelative(0.0f, 0.01f, 0.0f, 0.02f)
                curveToRelative(-0.31f, 1.41f, -1.12f, 2.63f, -2.23f, 3.47f)
                curveToRelative(1.57f, 0.69f, 2.9f, 1.82f, 3.85f, 3.23f)
                horizontalLineToRelative(4.53f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(24.01f, 5.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _chartUser!!
    }

private var _chartUser: ImageVector? = null
