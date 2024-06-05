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

public val Icons.Outline.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.467f, 23.316f)
                lineTo(12.0f, 17.828f)
                lineTo(4.533f, 23.316f)
                lineTo(7.4f, 14.453f)
                lineTo(-0.063f, 9.0f)
                horizontalLineTo(9.151f)
                lineTo(12.0f, 0.122f)
                lineTo(14.849f, 9.0f)
                horizontalLineToRelative(9.213f)
                lineTo(16.6f, 14.453f)
                close()
                moveTo(12.0f, 15.346f)
                lineToRelative(3.658f, 2.689f)
                lineToRelative(-1.4f, -4.344f)
                lineTo(17.937f, 11.0f)
                horizontalLineTo(13.39f)
                lineTo(12.0f, 6.669f)
                lineTo(10.61f, 11.0f)
                horizontalLineTo(6.062f)
                lineToRelative(3.683f, 2.691f)
                lineToRelative(-1.4f, 4.344f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
