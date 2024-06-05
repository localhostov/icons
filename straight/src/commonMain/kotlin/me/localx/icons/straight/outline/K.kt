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

public val Icons.Outline.K: ImageVector
    get() {
        if (_k != null) {
            return _k!!
        }
        _k = Builder(name = "K", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.563f, 24.0f)
                lineToRelative(2.447f, 0.0f)
                lineToRelative(-7.816f, -11.038f)
                lineToRelative(7.786f, -12.962f)
                lineToRelative(-2.33f, 0.0f)
                lineToRelative(-7.216f, 12.0f)
                lineToRelative(-8.438f, 0.0f)
                lineToRelative(0.0f, -12.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -10.0f)
                lineToRelative(8.479f, 0.0f)
                lineToRelative(7.088f, 10.0f)
                close()
            }
        }
        .build()
        return _k!!
    }

private var _k: ImageVector? = null
