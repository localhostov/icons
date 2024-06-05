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

public val Icons.Outline.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 2.0f, 14.0f)
                curveTo(2.0f, 8.493f, 6.294f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(22.0f, 8.493f, 22.0f, 14.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(7.739f, 2.0f, 4.0f, 9.479f, 4.0f, 14.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                curveTo(20.0f, 9.479f, 16.261f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 15.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 11.5f)
                close()
                moveTo(13.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 7.0f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
