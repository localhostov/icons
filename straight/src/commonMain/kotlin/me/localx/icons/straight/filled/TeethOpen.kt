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

public val Icons.Filled.TeethOpen: ImageVector
    get() {
        if (_teethOpen != null) {
            return _teethOpen!!
        }
        _teethOpen = Builder(name = "TeethOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(18.0f, 9.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.828f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.828f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 9.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.828f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(8.0f, 9.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.828f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(-8.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
                moveTo(21.0f, 15.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.828f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 15.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.828f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(6.0f, 15.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.828f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                reflectiveCurveToRelative(3.0f, 0.0f, 3.0f, 0.0f)
                close()
                moveTo(11.0f, 15.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.828f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                reflectiveCurveToRelative(3.0f, 0.0f, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _teethOpen!!
    }

private var _teethOpen: ImageVector? = null
