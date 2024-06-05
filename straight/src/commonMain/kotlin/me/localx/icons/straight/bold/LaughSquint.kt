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

public val Icons.Bold.LaughSquint: ImageVector
    get() {
        if (_laughSquint != null) {
            return _laughSquint!!
        }
        _laughSquint = Builder(name = "LaughSquint", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.993f, 14.0f)
                curveToRelative(0.0f, 2.0f, -2.0f, 5.0f, -4.993f, 5.0f)
                reflectiveCurveToRelative(-4.956f, -3.0f, -5.007f, -5.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(-3.9f, 23.4f, -3.893f, 0.6f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, false, -9.0f, -9.0f)
                curveTo(0.077f, 3.453f, 0.08f, 20.549f, 12.0f, 21.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 21.0f, 12.0f)
                close()
                moveTo(13.0f, 9.0f)
                curveToRelative(0.0f, 2.267f, 3.369f, 3.0f, 5.0f, 3.0f)
                curveToRelative(-2.607f, -2.759f, -2.59f, -3.254f, 0.0f, -6.0f)
                curveTo(16.369f, 6.0f, 13.0f, 6.733f, 13.0f, 9.0f)
                close()
                moveTo(11.0f, 9.0f)
                curveToRelative(0.0f, -2.267f, -3.369f, -3.0f, -5.0f, -3.0f)
                curveToRelative(2.607f, 2.759f, 2.59f, 3.254f, 0.0f, 6.0f)
                curveTo(7.631f, 12.0f, 11.0f, 11.267f, 11.0f, 9.0f)
                close()
            }
        }
        .build()
        return _laughSquint!!
    }

private var _laughSquint: ImageVector? = null
