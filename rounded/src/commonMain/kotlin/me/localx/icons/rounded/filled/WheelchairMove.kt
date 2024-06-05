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
                moveTo(22.79f, 17.89f)
                lineToRelative(-2.9f, 5.57f)
                curveToRelative(-0.18f, 0.34f, -0.53f, 0.54f, -0.89f, 0.54f)
                curveToRelative(-0.16f, 0.0f, -0.31f, -0.04f, -0.46f, -0.11f)
                curveToRelative(-0.49f, -0.26f, -0.68f, -0.86f, -0.42f, -1.35f)
                lineToRelative(2.89f, -5.54f)
                horizontalLineToRelative(-7.27f)
                curveToRelative(-0.94f, 0.0f, -1.81f, -0.47f, -2.32f, -1.27f)
                reflectiveCurveToRelative(-0.57f, -1.78f, -0.18f, -2.63f)
                lineToRelative(2.83f, -6.1f)
                horizontalLineToRelative(-0.76f)
                curveToRelative(-0.76f, 0.0f, -1.46f, 0.44f, -1.8f, 1.12f)
                lineToRelative(-2.07f, 4.08f)
                curveToRelative(-0.49f, 1.05f, -0.6f, 2.21f, -0.32f, 3.25f)
                curveToRelative(0.58f, 2.12f, 2.42f, 3.55f, 4.6f, 3.55f)
                horizontalLineToRelative(3.68f)
                curveToRelative(-1.19f, 2.93f, -4.06f, 5.0f, -7.42f, 5.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.23f, -7.64f, 7.34f, -7.97f)
                lineToRelative(0.39f, -0.79f)
                curveToRelative(0.67f, -1.36f, 2.08f, -2.24f, 3.59f, -2.24f)
                horizontalLineToRelative(3.8f)
                curveToRelative(0.97f, 0.0f, 1.87f, 0.49f, 2.39f, 1.31f)
                curveToRelative(0.52f, 0.82f, 0.59f, 1.84f, 0.18f, 2.72f)
                lineToRelative(-2.76f, 5.97f)
                horizontalLineToRelative(4.06f)
                curveToRelative(0.7f, 0.0f, 1.33f, 0.35f, 1.7f, 0.95f)
                reflectiveCurveToRelative(0.4f, 1.32f, 0.09f, 1.95f)
                close()
                moveTo(20.5f, 5.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _wheelchairMove!!
    }

private var _wheelchairMove: ImageVector? = null
