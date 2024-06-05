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

public val Icons.Filled.CopyAlt: ImageVector
    get() {
        if (_copyAlt != null) {
            return _copyAlt!!
        }
        _copyAlt = Builder(name = "CopyAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.86f, 5.0f)
                horizontalLineToRelative(-4.86f)
                verticalLineToRelative(-4.984f)
                close()
                moveTo(10.0f, 7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(19.0f, 7.01f)
                verticalLineToRelative(14.028f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(2.962f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-14.0f)
                close()
            }
        }
        .build()
        return _copyAlt!!
    }

private var _copyAlt: ImageVector? = null
