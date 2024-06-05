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

public val Icons.Bold.GrinHearts: ImageVector
    get() {
        if (_grinHearts != null) {
            return _grinHearts!!
        }
        _grinHearts = Builder(name = "GrinHearts", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -9.0f, -9.0f)
                curveTo(3.452f, 0.077f, 20.549f, 0.08f, 21.0f, 12.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(11.993f, 15.0f)
                arcTo(21.923f, 21.923f, 0.0f, false, false, 18.0f, 14.0f)
                curveToRelative(-0.615f, 2.28f, -2.664f, 5.0f, -6.0f, 5.0f)
                reflectiveCurveToRelative(-5.392f, -2.72f, -6.007f, -5.0f)
                arcTo(21.841f, 21.841f, 0.0f, false, false, 11.993f, 15.0f)
                close()
                moveTo(5.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                curveToRelative(0.446f, -3.382f, 6.459f, -0.619f, 0.0f, 3.75f)
                curveTo(8.0f, 12.25f, 5.0f, 10.25f, 5.0f, 8.5f)
                close()
                moveTo(19.0f, 8.5f)
                curveToRelative(0.0f, 1.75f, -3.0f, 3.75f, -3.0f, 3.75f)
                curveToRelative(-6.452f, -4.357f, -0.457f, -7.139f, 0.0f, -3.75f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 8.5f)
                close()
            }
        }
        .build()
        return _grinHearts!!
    }

private var _grinHearts: ImageVector? = null
