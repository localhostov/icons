package me.localx.icons.rounded.filled

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

public val Icons.Filled.Asterik: ImageVector
    get() {
        if (_asterik != null) {
            return _asterik!!
        }
        _asterik = Builder(name = "Asterik", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 14.119f)
                lineToRelative(-3.483f, -2.119f)
                lineToRelative(3.483f, -2.119f)
                arcToRelative(3.181f, 3.181f, 0.0f, true, false, -3.362f, -5.4f)
                lineToRelative(-3.138f, 2.009f)
                verticalLineToRelative(-3.49f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                verticalLineToRelative(3.588f)
                lineToRelative(-3.138f, -2.107f)
                arcToRelative(3.181f, 3.181f, 0.0f, false, false, -3.362f, 5.4f)
                lineToRelative(3.483f, 2.119f)
                lineToRelative(-3.483f, 2.119f)
                arcToRelative(3.181f, 3.181f, 0.0f, false, false, 3.362f, 5.4f)
                lineToRelative(3.138f, -2.038f)
                verticalLineToRelative(3.519f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                verticalLineToRelative(-3.58f)
                lineToRelative(3.138f, 2.1f)
                arcToRelative(3.181f, 3.181f, 0.0f, false, false, 3.362f, -5.4f)
                close()
            }
        }
        .build()
        return _asterik!!
    }

private var _asterik: ImageVector? = null
