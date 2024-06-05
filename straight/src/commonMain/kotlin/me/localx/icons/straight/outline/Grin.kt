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

public val Icons.Outline.Grin: ImageVector
    get() {
        if (_grin != null) {
            return _grin!!
        }
        _grin = Builder(name = "Grin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(7.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 9.5f)
                close()
                moveTo(14.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 15.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 9.5f)
                close()
                moveTo(11.993f, 15.0f)
                arcTo(21.923f, 21.923f, 0.0f, false, false, 18.0f, 14.0f)
                curveToRelative(-0.615f, 2.28f, -2.664f, 5.0f, -6.0f, 5.0f)
                reflectiveCurveToRelative(-5.392f, -2.72f, -6.007f, -5.0f)
                arcTo(21.841f, 21.841f, 0.0f, false, false, 11.993f, 15.0f)
                close()
            }
        }
        .build()
        return _grin!!
    }

private var _grin: ImageVector? = null
