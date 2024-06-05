package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.SchoolBus: ImageVector
    get() {
        if (_schoolBus != null) {
            return _schoolBus!!
        }
        _schoolBus = Builder(name = "SchoolBus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.142f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.858f, -3.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.858f, 3.0f)
                close()
                moveTo(8.942f, 20.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, true, 0.058f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, true, 0.058f, -0.5f)
                close()
                moveTo(19.942f, 20.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, true, 0.058f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, true, 0.058f, -0.5f)
                close()
                moveTo(10.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(19.0f, 10.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(20.0f, 12.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(3.0f, 10.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _schoolBus!!
    }

private var _schoolBus: ImageVector? = null
