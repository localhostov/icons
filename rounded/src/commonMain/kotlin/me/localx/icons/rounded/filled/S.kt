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

public val Icons.Filled.S: ImageVector
    get() {
        if (_s != null) {
            return _s!!
        }
        _s = Builder(name = "S", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.151f, 24.0f)
                horizontalLineTo(7.917f)
                curveToRelative(-3.263f, 0.0f, -5.917f, -2.654f, -5.917f, -5.917f)
                verticalLineToRelative(-1.083f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.083f)
                curveToRelative(0.0f, 2.16f, 1.757f, 3.917f, 3.917f, 3.917f)
                horizontalLineToRelative(8.234f)
                curveToRelative(2.122f, 0.0f, 3.849f, -1.727f, 3.849f, -3.849f)
                curveToRelative(0.0f, -1.732f, -1.168f, -3.26f, -2.839f, -3.714f)
                lineToRelative(-10.846f, -2.945f)
                curveToRelative(-2.541f, -0.689f, -4.315f, -3.011f, -4.315f, -5.644f)
                curveTo(2.0f, 2.624f, 4.624f, 0.0f, 7.849f, 0.0f)
                horizontalLineToRelative(8.234f)
                curveToRelative(3.263f, 0.0f, 5.917f, 2.654f, 5.917f, 5.917f)
                verticalLineToRelative(1.083f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.083f)
                curveToRelative(0.0f, -2.16f, -1.757f, -3.917f, -3.917f, -3.917f)
                horizontalLineTo(7.849f)
                curveToRelative(-2.122f, 0.0f, -3.849f, 1.727f, -3.849f, 3.849f)
                curveToRelative(0.0f, 1.732f, 1.168f, 3.26f, 2.839f, 3.714f)
                lineToRelative(10.846f, 2.945f)
                curveToRelative(2.541f, 0.689f, 4.315f, 3.011f, 4.315f, 5.644f)
                curveToRelative(0.0f, 3.225f, -2.624f, 5.849f, -5.849f, 5.849f)
                close()
            }
        }
        .build()
        return _s!!
    }

private var _s: ImageVector? = null
