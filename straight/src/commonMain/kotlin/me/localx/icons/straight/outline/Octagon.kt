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

public val Icons.Outline.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.02f, 24.0f)
                lineTo(7.08f, 24.0f)
                lineTo(0.05f, 16.97f)
                lineTo(0.05f, 7.03f)
                lineTo(7.08f, 0.0f)
                horizontalLineToRelative(9.94f)
                lineToRelative(7.03f, 7.03f)
                verticalLineToRelative(9.94f)
                lineToRelative(-7.03f, 7.03f)
                close()
                moveTo(7.91f, 22.0f)
                horizontalLineToRelative(8.28f)
                lineToRelative(5.86f, -5.86f)
                lineTo(22.05f, 7.86f)
                lineToRelative(-5.86f, -5.86f)
                lineTo(7.91f, 2.0f)
                lineTo(2.05f, 7.86f)
                verticalLineToRelative(8.28f)
                lineToRelative(5.86f, 5.86f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
