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

public val Icons.Filled.WheelchairMove: ImageVector
    get() {
        if (_wheelchairMove != null) {
            return _wheelchairMove!!
        }
        _wheelchairMove = Builder(name = "WheelchairMove", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22.7f, 15.95f)
                curveToRelative(-0.37f, -0.59f, -1.0f, -0.95f, -1.7f, -0.95f)
                horizontalLineToRelative(-5.06f)
                lineToRelative(2.76f, -5.97f)
                curveToRelative(0.41f, -0.88f, 0.34f, -1.9f, -0.18f, -2.72f)
                curveToRelative(-0.52f, -0.82f, -1.42f, -1.31f, -2.39f, -1.31f)
                horizontalLineToRelative(-5.3f)
                lineToRelative(-1.48f, 3.03f)
                curveToRelative(-4.11f, 0.33f, -7.34f, 3.78f, -7.34f, 7.97f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                curveToRelative(3.36f, 0.0f, 6.24f, -2.07f, 7.42f, -5.01f)
                horizontalLineToRelative(-3.68f)
                curveToRelative(-1.63f, 0.0f, -3.13f, -0.81f, -4.01f, -2.19f)
                curveToRelative(-0.68f, -1.07f, -0.9f, -2.33f, -0.64f, -3.53f)
                lineToRelative(2.98f, -6.27f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-2.83f, 6.1f)
                curveToRelative(-0.4f, 0.85f, -0.33f, 1.84f, 0.18f, 2.63f)
                reflectiveCurveToRelative(1.37f, 1.27f, 2.32f, 1.27f)
                horizontalLineToRelative(7.27f)
                lineToRelative(-2.89f, 5.54f)
                lineToRelative(1.77f, 0.92f)
                lineToRelative(2.9f, -5.57f)
                curveToRelative(0.31f, -0.62f, 0.28f, -1.35f, -0.09f, -1.95f)
                close()
            }
        }
        .build()
        return _wheelchairMove!!
    }

private var _wheelchairMove: ImageVector? = null
