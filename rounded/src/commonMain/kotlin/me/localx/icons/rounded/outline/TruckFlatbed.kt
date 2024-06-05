package me.localx.icons.rounded.outline

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

public val Icons.Outline.TruckFlatbed: ImageVector
    get() {
        if (_truckFlatbed != null) {
            return _truckFlatbed!!
        }
        _truckFlatbed = Builder(name = "TruckFlatbed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.159f, 11.317f)
                lineToRelative(-1.526f, -4.582f)
                curveToRelative(-0.546f, -1.636f, -2.07f, -2.735f, -3.795f, -2.735f)
                horizontalLineToRelative(-0.838f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                lineTo(1.0f, 17.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.896f, -1.178f, -3.521f, -2.841f, -4.183f)
                close()
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(0.838f)
                curveToRelative(0.862f, 0.0f, 1.624f, 0.55f, 1.897f, 1.368f)
                lineToRelative(1.211f, 3.632f)
                horizontalLineToRelative(-4.946f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(7.0f, 19.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(20.0f, 19.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(22.0f, 17.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _truckFlatbed!!
    }

private var _truckFlatbed: ImageVector? = null
