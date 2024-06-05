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

public val Icons.Filled.FloppyDisks: ImageVector
    get() {
        if (_floppyDisks != null) {
            return _floppyDisks!!
        }
        _floppyDisks = Builder(name = "FloppyDisks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 8.0f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                verticalLineToRelative(16.816f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(17.0f, 0.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.0f)
                lineTo(17.0f, 0.0f)
                close()
                moveTo(24.0f, 4.989f)
                verticalLineToRelative(15.011f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(11.0f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(0.011f)
                lineToRelative(4.989f, 4.989f)
                close()
                moveTo(18.0f, 13.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(14.5f, 12.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _floppyDisks!!
    }

private var _floppyDisks: ImageVector? = null
