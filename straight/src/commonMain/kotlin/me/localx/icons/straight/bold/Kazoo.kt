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

public val Icons.Bold.Kazoo: ImageVector
    get() {
        if (_kazoo != null) {
            return _kazoo!!
        }
        _kazoo = Builder(name = "Kazoo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.096f, 2.058f)
                lineToRelative(-1.153f, -1.153f)
                curveToRelative(-1.037f, -1.039f, -2.679f, -1.199f, -3.958f, -0.342f)
                lineToRelative(-6.378f, 4.733f)
                lineToRelative(-1.355f, 1.337f)
                curveToRelative(-2.309f, 0.489f, -4.126f, 2.305f, -4.617f, 4.613f)
                lineTo(0.007f, 16.872f)
                lineToRelative(7.083f, 7.083f)
                lineToRelative(5.645f, -5.583f)
                curveToRelative(2.511f, -0.526f, 4.443f, -2.621f, 4.727f, -5.212f)
                lineToRelative(1.099f, -1.099f)
                lineToRelative(4.841f, -5.998f)
                lineToRelative(0.08f, -0.109f)
                curveToRelative(0.813f, -1.221f, 0.651f, -2.859f, -0.386f, -3.896f)
                close()
                moveTo(4.249f, 16.872f)
                lineToRelative(1.825f, -1.824f)
                curveToRelative(0.591f, 1.257f, 1.603f, 2.272f, 2.857f, 2.868f)
                lineToRelative(-1.829f, 1.809f)
                lineToRelative(-2.853f, -2.853f)
                close()
                moveTo(14.5f, 13.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.73f, 9.564f)
                curveToRelative(-0.589f, -1.047f, -1.484f, -1.896f, -2.564f, -2.434f)
                lineToRelative(5.544f, -4.116f)
                curveToRelative(0.034f, -0.023f, 0.082f, -0.018f, 0.111f, 0.011f)
                lineToRelative(1.153f, 1.153f)
                curveToRelative(0.023f, 0.023f, 0.031f, 0.058f, 0.021f, 0.088f)
                lineToRelative(-4.266f, 5.298f)
                close()
            }
        }
        .build()
        return _kazoo!!
    }

private var _kazoo: ImageVector? = null
