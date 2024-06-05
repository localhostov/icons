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

public val Icons.Filled.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.037f, 9.11f)
                arcToRelative(14.989f, 14.989f, 0.0f, false, true, -2.448f, -4.755f)
                arcTo(5.762f, 5.762f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(8.606f, 0.0f, 2.0f, 5.23f, 2.0f, 14.818f)
                curveTo(2.0f, 19.881f, 6.486f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(10.0f, -4.119f, 10.0f, -9.182f)
                arcTo(8.27f, 8.27f, 0.0f, false, false, 20.037f, 9.11f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(3.913f, 3.913f, 0.0f, false, true, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.972f, 2.019f, -6.0f, 4.0f, -6.0f)
                reflectiveCurveToRelative(4.0f, 3.028f, 4.0f, 6.0f)
                arcTo(3.913f, 3.913f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(14.0f, 16.0f)
                arcToRelative(1.913f, 1.913f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(1.913f, 1.913f, 0.0f, false, true, -2.0f, -2.0f)
                curveToRelative(0.0f, -2.295f, 1.531f, -4.0f, 2.0f, -4.0f)
                reflectiveCurveTo(14.0f, 13.705f, 14.0f, 16.0f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
