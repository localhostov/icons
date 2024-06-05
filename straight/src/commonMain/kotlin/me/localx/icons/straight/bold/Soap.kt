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

public val Icons.Bold.Soap: ImageVector
    get() {
        if (_soap != null) {
            return _soap!!
        }
        _soap = Builder(name = "Soap", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(22.0f, 17.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 5.0f, -8.647f)
                verticalLineToRelative(-3.353f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.353f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 5.0f, 8.647f)
                close()
                moveTo(19.0f, 17.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -14.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _soap!!
    }

private var _soap: ImageVector? = null
