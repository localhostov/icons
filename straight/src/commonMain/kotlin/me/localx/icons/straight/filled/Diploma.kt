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

public val Icons.Filled.Diploma: ImageVector
    get() {
        if (_diploma != null) {
            return _diploma!!
        }
        _diploma = Builder(name = "Diploma", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 20.444f)
                verticalLineToRelative(3.556f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-3.556f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, 0.0f)
                close()
                moveTo(14.0f, 21.463f)
                verticalLineToRelative(0.537f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(8.809f)
                arcToRelative(5.993f, 5.993f, 0.0f, false, false, -7.0f, 9.654f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _diploma!!
    }

private var _diploma: ImageVector? = null
