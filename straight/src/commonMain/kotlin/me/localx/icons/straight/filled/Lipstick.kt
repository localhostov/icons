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

public val Icons.Filled.Lipstick: ImageVector
    get() {
        if (_lipstick != null) {
            return _lipstick!!
        }
        _lipstick = Builder(name = "Lipstick", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 7.0f)
                verticalLineToRelative(-3.381f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.106f, -1.789f)
                lineToRelative(3.447f, -1.723f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.447f, 0.893f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(17.0f, 9.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _lipstick!!
    }

private var _lipstick: ImageVector? = null
