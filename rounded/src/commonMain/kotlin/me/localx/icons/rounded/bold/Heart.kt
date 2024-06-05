package me.localx.icons.rounded.bold

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

public val Icons.Bold.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 1.851f)
                arcTo(6.568f, 6.568f, 0.0f, false, false, 12.0f, 4.558f)
                arcTo(6.568f, 6.568f, 0.0f, false, false, 6.75f, 1.851f)
                arcTo(7.035f, 7.035f, 0.0f, false, false, 0.0f, 9.126f)
                curveToRelative(0.0f, 4.552f, 4.674f, 9.425f, 8.6f, 12.712f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, false, 6.809f, 0.0f)
                curveToRelative(3.922f, -3.287f, 8.6f, -8.16f, 8.6f, -12.712f)
                arcTo(7.035f, 7.035f, 0.0f, false, false, 17.25f, 1.851f)
                close()
                moveTo(13.477f, 19.539f)
                arcToRelative(2.294f, 2.294f, 0.0f, false, true, -2.955f, 0.0f)
                curveTo(5.742f, 15.531f, 3.0f, 11.736f, 3.0f, 9.126f)
                arcTo(4.043f, 4.043f, 0.0f, false, true, 6.75f, 4.851f)
                arcTo(4.043f, 4.043f, 0.0f, false, true, 10.5f, 9.126f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcToRelative(4.043f, 4.043f, 0.0f, false, true, 3.75f, -4.275f)
                arcTo(4.043f, 4.043f, 0.0f, false, true, 21.0f, 9.126f)
                curveTo(21.0f, 11.736f, 18.258f, 15.531f, 13.477f, 19.539f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
