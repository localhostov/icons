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

public val Icons.Bold.Desk: ImageVector
    get() {
        if (_desk != null) {
            return _desk!!
        }
        _desk = Builder(name = "Desk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.5f)
                lineTo(19.0f, 2.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 0.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 15.0f)
                lineTo(14.0f, 15.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(10.0f)
                lineTo(24.0f, 12.0f)
                lineTo(13.5f, 12.0f)
                close()
                moveTo(8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 7.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _desk!!
    }

private var _desk: ImageVector? = null
