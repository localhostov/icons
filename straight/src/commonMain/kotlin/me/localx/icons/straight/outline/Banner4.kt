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

public val Icons.Outline.Banner4: ImageVector
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
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(0.068f)
                lineToRelative(3.111f, 3.932f)
                lineToRelative(-3.111f, 3.932f)
                verticalLineToRelative(0.068f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-0.068f)
                lineToRelative(-3.111f, -3.932f)
                lineToRelative(3.111f, -3.932f)
                verticalLineToRelative(-0.068f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _banner4!!
    }

private var _banner4: ImageVector? = null
