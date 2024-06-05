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

public val Icons.Filled.Expense: ImageVector
    get() {
        if (_expense != null) {
            return _expense!!
        }
        _expense = Builder(name = "Expense", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.338f, 12.345f)
                lineToRelative(-10.674f, 11.655f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.376f)
                curveToRelative(0.344f, 0.0f, 0.624f, -0.28f, 0.624f, -0.624f)
                curveToRelative(0.0f, -0.307f, -0.219f, -0.565f, -0.522f, -0.616f)
                lineToRelative(-3.285f, -0.547f)
                curveToRelative(-1.271f, -0.212f, -2.193f, -1.301f, -2.193f, -2.589f)
                curveToRelative(0.0f, -1.447f, 1.177f, -2.624f, 2.624f, -2.624f)
                horizontalLineToRelative(0.376f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.376f)
                curveToRelative(-0.344f, 0.0f, -0.624f, 0.28f, -0.624f, 0.624f)
                curveToRelative(0.0f, 0.307f, 0.219f, 0.565f, 0.522f, 0.616f)
                lineToRelative(3.285f, 0.547f)
                curveToRelative(1.271f, 0.212f, 2.193f, 1.301f, 2.193f, 2.589f)
                curveToRelative(0.0f, 1.447f, -1.177f, 2.624f, -2.624f, 2.624f)
                horizontalLineToRelative(-0.376f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.787f)
                curveToRelative(1.22f, 0.0f, 2.213f, 0.993f, 2.213f, 2.213f)
                curveToRelative(0.0f, 1.094f, -0.816f, 2.036f, -1.9f, 2.191f)
                lineToRelative(-4.241f, 0.606f)
                lineToRelative(0.283f, 1.979f)
                lineToRelative(4.241f, -0.606f)
                curveToRelative(2.062f, -0.294f, 3.617f, -2.087f, 3.617f, -4.17f)
                curveToRelative(0.0f, -0.219f, -0.032f, -0.429f, -0.065f, -0.638f)
                lineToRelative(3.541f, -3.737f)
                curveToRelative(0.455f, -0.5f, 1.097f, -0.803f, 1.794f, -0.835f)
                curveToRelative(0.692f, -0.034f, 1.363f, 0.209f, 1.878f, 0.678f)
                curveToRelative(1.052f, 0.958f, 1.138f, 2.602f, 0.189f, 3.665f)
                close()
                moveTo(16.48f, 6.546f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.49f, -2.49f)
                curveToRelative(0.397f, -0.397f, 0.616f, -0.925f, 0.616f, -1.487f)
                reflectiveCurveToRelative(-0.219f, -1.09f, -0.616f, -1.486f)
                lineTo(17.936f, 0.049f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.536f, 1.537f)
                horizontalLineToRelative(-4.058f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.026f)
                lineToRelative(-1.547f, 1.546f)
                close()
            }
        }
        .build()
        return _expense!!
    }

private var _expense: ImageVector? = null
