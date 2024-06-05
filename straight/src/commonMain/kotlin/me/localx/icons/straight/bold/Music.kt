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

public val Icons.Bold.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(11.0f, 1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 4.0f)
                verticalLineToRelative(8.607f)
                arcTo(5.5f, 5.5f, 0.0f, true, false, 11.0f, 17.5f)
                verticalLineToRelative(-0.087f)
                horizontalLineToRelative(0.0f)
                lineTo(11.0f, 4.0f)
                lineTo(21.0f, 4.0f)
                verticalLineToRelative(8.607f)
                arcTo(5.5f, 5.5f, 0.0f, true, false, 24.0f, 17.5f)
                verticalLineToRelative(-0.063f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(5.5f, 20.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 8.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 20.0f)
                close()
                moveTo(18.5f, 20.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 21.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 20.0f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
