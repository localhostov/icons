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

public val Icons.Outline.Tie: ImageVector
    get() {
        if (_tie != null) {
            return _tie!!
        }
        _tie = Builder(name = "Tie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.729f, 5.573f)
                lineToRelative(1.598f, -5.573f)
                lineTo(7.673f, 0.0f)
                lineToRelative(1.598f, 5.573f)
                lineToRelative(-3.917f, 12.429f)
                lineToRelative(6.646f, 6.042f)
                lineToRelative(6.646f, -6.042f)
                lineToRelative(-3.917f, -12.429f)
                close()
                moveTo(13.673f, 2.0f)
                lineToRelative(-0.573f, 2.0f)
                horizontalLineToRelative(-2.199f)
                lineToRelative(-0.573f, -2.0f)
                horizontalLineToRelative(3.346f)
                close()
                moveTo(7.646f, 17.383f)
                lineToRelative(3.587f, -11.383f)
                horizontalLineToRelative(1.533f)
                lineToRelative(3.587f, 11.383f)
                lineToRelative(-4.354f, 3.958f)
                lineToRelative(-4.354f, -3.958f)
                close()
            }
        }
        .build()
        return _tie!!
    }

private var _tie: ImageVector? = null
