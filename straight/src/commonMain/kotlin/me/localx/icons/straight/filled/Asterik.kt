package me.localx.icons.straight.filled

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
                moveToRelative(23.58f, 8.536f)
                lineToRelative(-3.362f, -5.4f)
                lineToRelative(-4.945f, 3.08f)
                verticalLineToRelative(-6.216f)
                horizontalLineToRelative(-6.546f)
                verticalLineToRelative(6.216f)
                lineToRelative(-4.945f, -3.08f)
                lineToRelative(-3.362f, 5.4f)
                lineToRelative(5.563f, 3.464f)
                lineToRelative(-5.563f, 3.464f)
                lineToRelative(3.362f, 5.4f)
                lineToRelative(4.945f, -3.08f)
                verticalLineToRelative(6.216f)
                horizontalLineToRelative(6.546f)
                verticalLineToRelative(-6.216f)
                lineToRelative(4.945f, 3.08f)
                lineToRelative(3.362f, -5.4f)
                lineToRelative(-5.563f, -3.464f)
                close()
            }
        }
        .build()
        return _asterik!!
    }

private var _asterik: ImageVector? = null
