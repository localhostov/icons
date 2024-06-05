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

public val Icons.Filled.HatWitch: ImageVector
    get() {
        if (_hatWitch != null) {
            return _hatWitch!!
        }
        _hatWitch = Builder(name = "HatWitch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-0.681f)
                lineToRelative(-5.245f, -14.19f)
                curveToRelative(-0.141f, -0.41f, -0.077f, -0.868f, 0.17f, -1.224f)
                curveToRelative(0.255f, -0.367f, 0.674f, -0.586f, 1.121f, -0.586f)
                horizontalLineToRelative(3.977f)
                curveToRelative(0.693f, 0.0f, 1.301f, -0.418f, 1.547f, -1.067f)
                curveToRelative(0.247f, -0.648f, 0.072f, -1.365f, -0.446f, -1.826f)
                curveToRelative(-0.028f, -0.024f, -0.057f, -0.048f, -0.087f, -0.069f)
                lineToRelative(-2.112f, -1.495f)
                curveToRelative(-0.028f, -0.02f, -0.057f, -0.038f, -0.086f, -0.055f)
                curveToRelative(-1.849f, -1.043f, -3.44f, -1.488f, -5.319f, -1.488f)
                horizontalLineToRelative(-0.927f)
                curveToRelative(-3.422f, 0.0f, -6.465f, 2.176f, -7.57f, 5.415f)
                lineTo(1.677f, 22.0f)
                horizontalLineToRelative(-0.677f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(16.0f, 19.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(14.0f, 18.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _hatWitch!!
    }

private var _hatWitch: ImageVector? = null
