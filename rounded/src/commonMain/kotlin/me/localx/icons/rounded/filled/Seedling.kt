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

public val Icons.Filled.Seedling: ImageVector
    get() {
        if (_seedling != null) {
            return _seedling!!
        }
        _seedling = Builder(name = "Seedling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.987f, 2.323f)
                curveToRelative(0.017f, -0.649f, -0.252f, -1.277f, -0.737f, -1.722f)
                curveToRelative(-0.49f, -0.448f, -1.147f, -0.663f, -1.802f, -0.586f)
                curveToRelative(-5.656f, 0.654f, -8.256f, 4.435f, -9.448f, 7.57f)
                curveTo(10.808f, 4.45f, 8.208f, 0.669f, 2.552f, 0.015f)
                curveTo(1.902f, -0.061f, 1.24f, 0.153f, 0.75f, 0.601f)
                curveTo(0.265f, 1.046f, -0.004f, 1.674f, 0.013f, 2.323f)
                curveToRelative(0.087f, 3.27f, 1.156f, 5.867f, 3.179f, 7.72f)
                curveToRelative(2.607f, 2.388f, 6.082f, 2.863f, 7.809f, 2.943f)
                verticalLineToRelative(10.014f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-10.014f)
                curveToRelative(1.727f, -0.08f, 5.202f, -0.555f, 7.809f, -2.943f)
                curveToRelative(2.022f, -1.853f, 3.092f, -4.45f, 3.179f, -7.72f)
                close()
            }
        }
        .build()
        return _seedling!!
    }

private var _seedling: ImageVector? = null
