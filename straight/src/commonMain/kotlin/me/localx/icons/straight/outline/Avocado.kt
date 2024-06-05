package me.localx.icons.straight.outline

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

public val Icons.Outline.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                arcToRelative(3.913f, 3.913f, 0.0f, false, true, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.972f, 2.019f, -6.0f, 4.0f, -6.0f)
                reflectiveCurveToRelative(4.0f, 3.028f, 4.0f, 6.0f)
                arcTo(3.913f, 3.913f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-0.469f, 0.0f, -2.0f, 1.705f, -2.0f, 4.0f)
                arcToRelative(1.913f, 1.913f, 0.0f, false, false, 2.0f, 2.0f)
                arcToRelative(1.913f, 1.913f, 0.0f, false, false, 2.0f, -2.0f)
                curveTo(14.0f, 13.705f, 12.469f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 24.0f)
                curveTo(6.486f, 24.0f, 2.0f, 19.881f, 2.0f, 14.818f)
                curveTo(2.0f, 5.23f, 8.606f, 0.0f, 12.0f, 0.0f)
                arcToRelative(5.762f, 5.762f, 0.0f, false, true, 5.589f, 4.355f)
                arcTo(14.989f, 14.989f, 0.0f, false, false, 20.037f, 9.11f)
                arcTo(8.27f, 8.27f, 0.0f, false, true, 22.0f, 14.818f)
                curveTo(22.0f, 19.881f, 17.514f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(9.678f, 2.0f, 4.0f, 6.492f, 4.0f, 14.818f)
                curveTo(4.0f, 18.778f, 7.589f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(8.0f, -3.222f, 8.0f, -7.182f)
                arcToRelative(6.373f, 6.373f, 0.0f, false, false, -1.555f, -4.5f)
                arcToRelative(16.967f, 16.967f, 0.0f, false, true, -2.772f, -5.39f)
                arcTo(3.779f, 3.779f, 0.0f, false, false, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
