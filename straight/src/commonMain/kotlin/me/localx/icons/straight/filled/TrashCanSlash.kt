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

public val Icons.Filled.TrashCanSlash: ImageVector
    get() {
        if (_trashCanSlash != null) {
            return _trashCanSlash!!
        }
        _trashCanSlash = Builder(name = "TrashCanSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 14.242f)
                lineToRelative(8.988f, 8.987f)
                curveToRelative(-0.531f, 0.473f, -1.222f, 0.77f, -1.988f, 0.77f)
                lineTo(7.0f, 23.999f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-12.757f)
                lineToRelative(4.0f, 4.0f)
                verticalLineToRelative(6.758f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.758f)
                close()
                moveTo(2.586f, 4.0f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.957f, 3.957f)
                horizontalLineToRelative(1.586f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-0.086f)
                lineToRelative(4.043f, 4.043f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(4.586f, 6.0f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 12.586f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(-5.586f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.586f)
                close()
            }
        }
        .build()
        return _trashCanSlash!!
    }

private var _trashCanSlash: ImageVector? = null
