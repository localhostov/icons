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

public val Icons.Bold.Egg: ImageVector
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
                arcTo(10.057f, 10.057f, 0.0f, false, true, 2.0f, 13.909f)
                curveTo(2.0f, 8.438f, 6.294f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(22.0f, 8.438f, 22.0f, 13.909f)
                arcTo(10.057f, 10.057f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(8.391f, 3.0f, 5.0f, 9.806f, 5.0f, 13.909f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 14.0f, 0.0f)
                curveTo(19.0f, 9.806f, 15.609f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(13.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 13.0f)
                close()
                moveTo(12.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 13.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 7.5f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
