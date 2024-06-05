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

public val Icons.Bold.DropDown: ImageVector
    get() {
        if (_dropDown != null) {
            return _dropDown!!
        }
        _dropDown = Builder(name = "DropDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(16.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.343f, 1.343f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(13.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(22.0f, 3.0f)
                horizontalLineToRelative(-6.909f)
                lineToRelative(2.756f, 2.71f)
                curveToRelative(0.386f, 0.386f, 1.012f, 0.386f, 1.398f, 0.0f)
                lineToRelative(2.756f, -2.71f)
                close()
            }
        }
        .build()
        return _dropDown!!
    }

private var _dropDown: ImageVector? = null
