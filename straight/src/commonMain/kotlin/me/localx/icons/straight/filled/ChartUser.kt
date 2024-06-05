package me.localx.icons.straight.filled

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
                moveTo(7.0f, 14.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(14.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                lineTo(11.0f, 16.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(21.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(1.35f)
                curveToRelative(0.63f, -0.22f, 1.3f, -0.35f, 2.0f, -0.35f)
                curveToRelative(2.74f, 0.0f, 5.05f, 1.84f, 5.77f, 4.35f)
                lineToRelative(2.23f, 2.23f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(-2.59f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.59f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(-2.15f, -2.15f)
                curveToRelative(-0.23f, 1.06f, -0.74f, 2.01f, -1.44f, 2.78f)
                curveToRelative(2.23f, 0.18f, 4.05f, 1.81f, 4.49f, 3.96f)
                horizontalLineToRelative(8.1f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _chartUser!!
    }

private var _chartUser: ImageVector? = null
