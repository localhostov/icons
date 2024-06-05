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

public val Icons.Outline.TruckCheck: ImageVector
    get() {
        if (_truckCheck != null) {
            return _truckCheck!!
        }
        _truckCheck = Builder(name = "TruckCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.936f, 6.801f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-4.198f, 4.199f)
                curveToRelative(-0.39f, 0.39f, -0.902f, 0.585f, -1.414f, 0.585f)
                reflectiveCurveToRelative(-1.024f, -0.195f, -1.414f, -0.585f)
                lineToRelative(-2.673f, -2.673f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.673f, 2.673f)
                lineToRelative(4.198f, -4.199f)
                close()
                moveTo(24.0f, 19.0f)
                horizontalLineToRelative(-2.041f)
                curveToRelative(0.024f, 0.165f, 0.041f, 0.331f, 0.041f, 0.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, 0.017f, -0.335f, 0.041f, -0.5f)
                horizontalLineToRelative(-6.082f)
                curveToRelative(0.024f, 0.165f, 0.041f, 0.331f, 0.041f, 0.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, 0.017f, -0.335f, 0.041f, -0.5f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 2.346f, 1.346f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(17.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(6.907f, 19.0f)
                horizontalLineToRelative(-2.814f)
                curveToRelative(-0.054f, 0.144f, -0.093f, 0.31f, -0.093f, 0.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.19f, -0.039f, -0.356f, -0.093f, -0.5f)
                close()
                moveTo(15.0f, 4.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(13.0f)
                lineTo(15.0f, 4.0f)
                close()
                moveTo(19.907f, 19.0f)
                horizontalLineToRelative(-2.814f)
                curveToRelative(-0.054f, 0.144f, -0.093f, 0.31f, -0.093f, 0.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.19f, -0.039f, -0.356f, -0.093f, -0.5f)
                close()
                moveTo(22.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _truckCheck!!
    }

private var _truckCheck: ImageVector? = null
