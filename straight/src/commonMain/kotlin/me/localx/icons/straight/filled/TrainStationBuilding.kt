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
                moveToRelative(1.0f, 14.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                lineTo(1.0f, 24.0f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(24.0f, 10.456f)
                verticalLineToRelative(1.544f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(-1.544f)
                lineToRelative(3.049f, -3.456f)
                horizontalLineToRelative(3.951f)
                curveToRelative(0.0f, -2.414f, 1.721f, -4.435f, 4.0f, -4.899f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.101f)
                curveToRelative(2.279f, 0.465f, 4.0f, 2.485f, 4.0f, 4.899f)
                horizontalLineToRelative(3.951f)
                lineToRelative(3.049f, 3.456f)
                close()
                moveTo(14.0f, 7.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _trainStationBuilding!!
    }

private var _trainStationBuilding: ImageVector? = null
