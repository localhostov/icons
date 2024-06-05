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
                moveToRelative(4.0f, 8.255f)
                lineToRelative(14.212f, 14.283f)
                reflectiveCurveToRelative(-0.365f, 0.481f, -0.975f, 0.885f)
                curveToRelative(-0.673f, 0.447f, -1.521f, 0.576f, -2.333f, 0.576f)
                horizontalLineToRelative(-5.904f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-10.745f)
                close()
                moveTo(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(3.707f, 3.707f)
                horizontalLineToRelative(0.591f)
                curveToRelative(0.465f, -2.279f, 2.484f, -4.0f, 4.899f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.414f, 0.0f, 4.434f, 1.721f, 4.899f, 4.0f)
                horizontalLineToRelative(3.101f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(12.49f)
                lineToRelative(3.803f, 3.803f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(15.72f, 4.0f)
                curveToRelative(-0.414f, -1.161f, -1.514f, -2.0f, -2.816f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.302f, 0.0f, -2.402f, 0.839f, -2.816f, 2.0f)
                horizontalLineToRelative(7.631f)
                close()
            }
        }
        .build()
        return _trashCanSlash!!
    }

private var _trashCanSlash: ImageVector? = null
