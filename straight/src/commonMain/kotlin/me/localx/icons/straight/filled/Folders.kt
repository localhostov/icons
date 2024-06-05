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

public val Icons.Filled.Folders: ImageVector
    get() {
        if (_folders != null) {
            return _folders!!
        }
        _folders = Builder(name = "Folders", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 21.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 23.0f)
                lineTo(0.0f, 8.0f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                verticalLineToRelative(15.816f)
                lineTo(20.0f, 21.0f)
                close()
                moveTo(4.0f, 9.0f)
                verticalLineToRelative(10.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-5.764f)
                lineTo(11.236f, 1.0f)
                lineTo(7.0f, 1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(24.0f, 7.0f)
                close()
            }
        }
        .build()
        return _folders!!
    }

private var _folders: ImageVector? = null
