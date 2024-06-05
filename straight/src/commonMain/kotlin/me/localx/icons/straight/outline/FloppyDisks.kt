package me.localx.icons.straight.outline

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

public val Icons.Outline.FloppyDisks: ImageVector
    get() {
        if (_floppyDisks != null) {
            return _floppyDisks!!
        }
        _floppyDisks = Builder(name = "FloppyDisks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 9.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(13.5f, 14.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.121f, 3.985f)
                lineToRelative(-3.105f, -3.106f)
                curveToRelative(-0.566f, -0.567f, -1.32f, -0.879f, -2.121f, -0.879f)
                lineTo(7.0f, -0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(20.0f)
                lineTo(24.0f, 6.106f)
                curveToRelative(0.0f, -0.801f, -0.313f, -1.555f, -0.879f, -2.121f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(22.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                lineTo(6.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(10.0f)
                lineTo(18.0f, 2.006f)
                curveToRelative(0.225f, 0.024f, 0.44f, 0.126f, 0.602f, 0.287f)
                lineToRelative(3.105f, 3.106f)
                curveToRelative(0.187f, 0.187f, 0.293f, 0.444f, 0.293f, 0.707f)
                verticalLineToRelative(11.894f)
                close()
                moveTo(2.0f, 22.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 8.0f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                verticalLineToRelative(16.816f)
                close()
            }
        }
        .build()
        return _floppyDisks!!
    }

private var _floppyDisks: ImageVector? = null
