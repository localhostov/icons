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

public val Icons.Filled.TrashList: ImageVector
    get() {
        if (_trashList != null) {
            return _trashList!!
        }
        _trashList = Builder(name = "TrashList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 12.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(20.0f, 21.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(15.656f, 23.668f)
                curveToRelative(-0.558f, 0.213f, -1.162f, 0.332f, -1.795f, 0.332f)
                horizontalLineToRelative(-5.728f)
                curveToRelative(-2.589f, 0.0f, -4.729f, -1.943f, -4.977f, -4.521f)
                lineTo(1.86f, 6.0f)
                horizontalLineToRelative(-0.86f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.101f)
                curveTo(5.566f, 1.721f, 7.586f, 0.0f, 10.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.414f, 0.0f, 4.434f, 1.721f, 4.899f, 4.0f)
                horizontalLineToRelative(4.101f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.886f)
                lineToRelative(-0.19f, 2.0f)
                horizontalLineToRelative(-2.925f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.044f, 0.537f, 1.962f, 1.348f, 2.5f)
                curveToRelative(-0.811f, 0.538f, -1.348f, 1.456f, -1.348f, 2.5f)
                reflectiveCurveToRelative(0.537f, 1.962f, 1.348f, 2.5f)
                curveToRelative(-0.811f, 0.538f, -1.348f, 1.456f, -1.348f, 2.5f)
                curveToRelative(0.0f, 1.169f, 0.678f, 2.173f, 1.656f, 2.668f)
                close()
                moveTo(14.816f, 4.0f)
                curveToRelative(-0.414f, -1.161f, -1.514f, -2.0f, -2.816f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.302f, 0.0f, -2.402f, 0.839f, -2.816f, 2.0f)
                horizontalLineToRelative(7.631f)
                close()
            }
        }
        .build()
        return _trashList!!
    }

private var _trashList: ImageVector? = null
