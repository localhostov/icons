package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 1.0f)
                lineTo(13.0f, 1.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 8.0f, 6.0f)
                verticalLineToRelative(8.026f)
                arcTo(4.948f, 4.948f, 0.0f, false, false, 5.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                lineTo(10.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(8.026f)
                arcTo(4.948f, 4.948f, 0.0f, false, false, 19.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                lineTo(24.0f, 6.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 1.0f)
                close()
                moveTo(5.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 21.0f)
                close()
                moveTo(19.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 21.0f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
