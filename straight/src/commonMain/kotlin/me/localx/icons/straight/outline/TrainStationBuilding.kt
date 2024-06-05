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

public val Icons.Outline.TrainStationBuilding: ImageVector
    get() {
        if (_trainStationBuilding != null) {
            return _trainStationBuilding!!
        }
        _trainStationBuilding = Builder(name = "TrainStationBuilding", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.536f)
                lineToRelative(-2.958f, -4.536f)
                horizontalLineToRelative(-4.042f)
                curveToRelative(0.0f, -2.414f, -1.721f, -4.435f, -4.0f, -4.899f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.101f)
                curveToRelative(-2.279f, 0.465f, -4.0f, 2.485f, -4.0f, 4.899f)
                lineTo(2.958f, 7.0f)
                lineTo(0.0f, 11.536f)
                verticalLineToRelative(1.464f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.464f)
                close()
                moveTo(4.042f, 9.0f)
                horizontalLineToRelative(4.958f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.958f)
                lineToRelative(1.305f, 2.0f)
                lineTo(2.737f, 11.0f)
                lineToRelative(1.305f, -2.0f)
                close()
                moveTo(21.0f, 22.0f)
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
                moveTo(13.5f, 7.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _trainStationBuilding!!
    }

private var _trainStationBuilding: ImageVector? = null
