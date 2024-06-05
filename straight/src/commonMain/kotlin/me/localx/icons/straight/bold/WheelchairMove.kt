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

public val Icons.Bold.WheelchairMove: ImageVector
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
                moveTo(22.63f, 15.19f)
                curveToRelative(-0.46f, -0.74f, -1.25f, -1.19f, -2.13f, -1.19f)
                horizontalLineToRelative(-3.11f)
                lineToRelative(2.31f, -4.97f)
                curveToRelative(0.41f, -0.88f, 0.34f, -1.9f, -0.18f, -2.72f)
                curveToRelative(-0.52f, -0.82f, -1.42f, -1.31f, -2.39f, -1.31f)
                horizontalLineToRelative(-6.56f)
                lineToRelative(-2.86f, 5.84f)
                lineToRelative(2.69f, 1.32f)
                lineToRelative(2.04f, -4.16f)
                horizontalLineToRelative(2.19f)
                lineToRelative(-2.37f, 5.1f)
                curveToRelative(-0.4f, 0.85f, -0.33f, 1.84f, 0.18f, 2.63f)
                curveToRelative(0.35f, 0.55f, 0.88f, 0.95f, 1.49f, 1.14f)
                curveToRelative(-0.41f, 2.34f, -2.46f, 4.13f, -4.92f, 4.13f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.34f, 0.04f, -0.68f, 0.1f, -1.0f)
                lineToRelative(2.88f, -6.73f)
                curveToRelative(-3.44f, 0.9f, -5.98f, 4.02f, -5.98f, 7.73f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                curveToRelative(4.07f, 0.0f, 7.44f, -3.06f, 7.94f, -7.0f)
                horizontalLineToRelative(2.74f)
                lineToRelative(-2.5f, 4.81f)
                lineToRelative(2.66f, 1.39f)
                lineToRelative(2.91f, -5.58f)
                curveToRelative(0.39f, -0.78f, 0.35f, -1.69f, -0.11f, -2.43f)
                close()
            }
        }
        .build()
        return _wheelchairMove!!
    }

private var _wheelchairMove: ImageVector? = null
