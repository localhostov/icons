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

public val Icons.Bold.Banner4: ImageVector
    get() {
        if (_banner4 != null) {
            return _banner4!!
        }
        _banner4 = Builder(name = "Banner4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 6.0f)
                lineToRelative(3.111f, 4.0f)
                lineTo(0.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-3.111f, -4.0f)
                lineToRelative(3.111f, -4.0f)
                close()
                moveTo(17.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _banner4!!
    }

private var _banner4: ImageVector? = null
