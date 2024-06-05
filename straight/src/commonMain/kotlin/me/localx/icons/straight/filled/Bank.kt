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

public val Icons.Filled.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.0f)
                verticalLineToRelative(-2.091f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.563f, -2.634f)
                lineToRelative(-9.0f, -4.909f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, -2.874f, 0.0f)
                lineToRelative(-9.0f, 4.909f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.563f, 2.634f)
                verticalLineToRelative(2.091f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(14.0f, 10.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
