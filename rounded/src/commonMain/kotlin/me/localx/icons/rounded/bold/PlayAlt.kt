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

public val Icons.Bold.PlayAlt: ImageVector
    get() {
        if (_playAlt != null) {
            return _playAlt!!
        }
        _playAlt = Builder(name = "PlayAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 24.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, -5.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, 5.5f, -5.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, 5.5f, 5.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, 5.5f)
                close()
                moveTo(5.5f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                close()
                moveTo(7.992f, 9.339f)
                verticalLineToRelative(5.322f)
                arcToRelative(1.337f, 1.337f, 0.0f, false, false, 2.0f, 1.161f)
                lineToRelative(5.327f, -2.661f)
                arcToRelative(1.337f, 1.337f, 0.0f, false, false, 0.0f, -2.322f)
                lineToRelative(-5.327f, -2.661f)
                arcToRelative(1.337f, 1.337f, 0.0f, false, false, -2.0f, 1.161f)
                close()
            }
        }
        .build()
        return _playAlt!!
    }

private var _playAlt: ImageVector? = null
