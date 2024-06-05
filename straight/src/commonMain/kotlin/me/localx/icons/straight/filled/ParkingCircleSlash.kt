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

public val Icons.Filled.ParkingCircleSlash: ImageVector
    get() {
        if (_parkingCircleSlash != null) {
            return _parkingCircleSlash!!
        }
        _parkingCircleSlash = Builder(name = "ParkingCircleSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.245f)
                verticalLineToRelative(7.755f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(0.755f)
                lineToRelative(8.327f, 8.327f)
                curveToRelative(-1.786f, 1.056f, -3.861f, 1.673f, -6.081f, 1.673f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -2.221f, 0.617f, -4.295f, 1.673f, -6.081f)
                moveToRelative(22.327f, 6.081f)
                curveToRelative(0.0f, 3.669f, -1.659f, 6.953f, -4.261f, 9.156f)
                lineTo(2.844f, 4.261f)
                curveTo(5.047f, 1.659f, 8.331f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(16.0f, 9.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.086f)
                lineToRelative(1.691f, 1.691f)
                curveToRelative(1.688f, -0.649f, 2.895f, -2.277f, 2.895f, -4.191f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.977f, 0.0f, -1.837f, 0.476f, -2.385f, 1.201f)
                lineToRelative(1.455f, 1.455f)
                curveToRelative(0.141f, -0.381f, 0.501f, -0.656f, 0.93f, -0.656f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _parkingCircleSlash!!
    }

private var _parkingCircleSlash: ImageVector? = null
