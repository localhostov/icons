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

public val Icons.Filled.Fog: ImageVector
    get() {
        if (_fog != null) {
            return _fog!!
        }
        _fog = Builder(name = "Fog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 22.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(16.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 20.0f)
                close()
                moveTo(14.0f, 14.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(19.0f, 14.0f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 12.5f)
                arcToRelative(7.49f, 7.49f, 0.0f, false, true, -3.0f, 6.0f)
                lineTo(21.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(5.038f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(5.417f)
                curveToRelative(-3.579f, -1.606f, -4.1f, -7.156f, -0.773f, -9.367f)
                curveTo(-0.07f, 0.2f, 13.616f, -4.039f, 17.441f, 5.059f)
                arcTo(7.461f, 7.461f, 0.0f, false, true, 24.0f, 12.5f)
                close()
            }
        }
        .build()
        return _fog!!
    }

private var _fog: ImageVector? = null
