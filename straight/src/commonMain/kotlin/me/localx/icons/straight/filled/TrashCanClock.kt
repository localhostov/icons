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

public val Icons.Filled.TrashCanClock: ImageVector
    get() {
        if (_trashCanClock != null) {
            return _trashCanClock!!
        }
        _trashCanClock = Builder(name = "TrashCanClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.709f)
                curveToRelative(-1.661f, -1.466f, -2.709f, -3.61f, -2.709f, -6.0f)
                curveToRelative(0.0f, -4.418f, 3.582f, -8.0f, 8.0f, -8.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.308f, 0.0f, -6.0f, 2.692f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.692f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.692f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.692f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.293f, 20.707f)
                lineToRelative(-2.293f, -2.293f)
                verticalLineToRelative(-3.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.707f, 1.707f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _trashCanClock!!
    }

private var _trashCanClock: ImageVector? = null
