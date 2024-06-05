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

public val Icons.Bold.H4: ImageVector
    get() {
        if (_h4 != null) {
            return _h4!!
        }
        _h4 = Builder(name = "H4", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(21.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _h4!!
    }

private var _h4: ImageVector? = null
