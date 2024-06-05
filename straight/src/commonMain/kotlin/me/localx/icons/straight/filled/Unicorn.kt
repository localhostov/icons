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

public val Icons.Filled.Unicorn: ImageVector
    get() {
        if (_unicorn != null) {
            return _unicorn!!
        }
        _unicorn = Builder(name = "Unicorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.916f)
                verticalLineToRelative(0.738f)
                lineToRelative(-5.0f, 0.5f)
                verticalLineToRelative(2.745f)
                curveToRelative(0.0f, 1.48f, -0.198f, 2.435f, -0.615f, 3.895f)
                lineToRelative(-0.385f, 1.811f)
                verticalLineToRelative(5.396f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(-0.694f, 5.0f)
                horizontalLineToRelative(-3.954f)
                lineToRelative(0.681f, -4.92f)
                curveToRelative(-0.112f, -0.36f, -0.251f, -0.755f, -0.396f, -1.173f)
                curveToRelative(-0.489f, -1.4f, -1.087f, -3.126f, -1.133f, -4.72f)
                curveToRelative(-1.323f, 1.082f, -2.003f, 3.02f, -2.003f, 5.812f)
                horizontalLineTo(0.0f)
                curveToRelative(0.0f, -5.683f, 2.546f, -7.73f, 4.682f, -8.448f)
                lineToRelative(0.155f, -0.052f)
                horizontalLineToRelative(0.062f)
                curveToRelative(0.734f, -0.907f, 1.842f, -1.5f, 3.096f, -1.5f)
                horizontalLineToRelative(4.006f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.871f, 0.916f, -5.121f, 4.079f, -6.162f)
                curveToRelative(0.302f, -1.337f, 1.493f, -2.338f, 2.921f, -2.338f)
                verticalLineToRelative(1.654f)
                lineTo(23.633f, 0.052f)
                curveToRelative(0.201f, 0.336f, 0.166f, 0.277f, 0.367f, 0.613f)
                lineToRelative(-4.177f, 3.443f)
                curveToRelative(0.594f, 0.994f, 1.548f, 1.973f, 2.764f, 2.556f)
                curveToRelative(0.858f, 0.413f, 1.413f, 1.296f, 1.413f, 2.252f)
                close()
            }
        }
        .build()
        return _unicorn!!
    }

private var _unicorn: ImageVector? = null
