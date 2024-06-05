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

public val Icons.Filled.TrainStationBuilding: ImageVector
    get() {
        if (_trainStationBuilding != null) {
            return _trainStationBuilding!!
        }
        _trainStationBuilding = Builder(name = "TrainStationBuilding", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.266f, 8.352f)
                curveToRelative(-0.744f, -0.745f, -1.774f, -1.172f, -2.828f, -1.172f)
                lineToRelative(-2.44f, -0.18f)
                curveToRelative(0.0f, -1.405f, -0.597f, -2.754f, -1.637f, -3.7f)
                curveToRelative(-0.573f, -0.521f, -1.257f, -0.896f, -1.991f, -1.106f)
                curveToRelative(-0.119f, -0.035f, -0.247f, -0.046f, -0.37f, -0.072f)
                verticalLineToRelative(-1.122f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.122f)
                curveToRelative(-0.125f, 0.026f, -0.256f, 0.037f, -0.378f, 0.073f)
                curveToRelative(-0.731f, 0.209f, -1.413f, 0.584f, -1.985f, 1.104f)
                curveToRelative(-1.04f, 0.946f, -1.637f, 2.295f, -1.637f, 3.7f)
                horizontalLineToRelative(-2.408f)
                curveToRelative(-1.054f, 0.0f, -2.084f, 0.427f, -2.828f, 1.172f)
                lineToRelative(-1.262f, 1.155f)
                curveToRelative(-1.035f, 0.948f, -0.365f, 2.673f, 1.039f, 2.673f)
                lineToRelative(20.852f, 0.18f)
                curveToRelative(1.375f, 0.0f, 2.059f, -1.665f, 1.082f, -2.632f)
                lineToRelative(-1.209f, -1.196f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(23.0f, 15.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _trainStationBuilding!!
    }

private var _trainStationBuilding: ImageVector? = null
