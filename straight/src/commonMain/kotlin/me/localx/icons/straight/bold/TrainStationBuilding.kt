package me.localx.icons.straight.bold

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

public val Icons.Bold.TrainStationBuilding: ImageVector
    get() {
        if (_trainStationBuilding != null) {
            return _trainStationBuilding!!
        }
        _trainStationBuilding = Builder(name = "TrainStationBuilding", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.986f, 12.0f)
                lineToRelative(-3.486f, -5.0f)
                horizontalLineToRelative(-3.55f)
                curveToRelative(0.017f, -0.167f, 0.05f, -0.329f, 0.05f, -0.5f)
                curveToRelative(0.0f, -2.239f, -1.471f, -4.134f, -3.5f, -4.771f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.729f)
                curveToRelative(-2.029f, 0.637f, -3.5f, 2.532f, -3.5f, 4.771f)
                curveToRelative(0.0f, 0.171f, 0.034f, 0.333f, 0.05f, 0.5f)
                horizontalLineToRelative(-3.55f)
                lineTo(0.014f, 12.0f)
                horizontalLineToRelative(-0.014f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-0.014f)
                close()
                moveTo(12.0f, 4.5f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _trainStationBuilding!!
    }

private var _trainStationBuilding: ImageVector? = null
