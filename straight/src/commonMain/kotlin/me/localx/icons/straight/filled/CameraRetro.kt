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

public val Icons.Filled.CameraRetro: ImageVector
    get() {
        if (_cameraRetro != null) {
            return _cameraRetro!!
        }
        _cameraRetro = Builder(name = "CameraRetro", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 12.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(8.414f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-6.084f)
                curveToRelative(-0.477f, -2.834f, -2.948f, -5.0f, -5.916f, -5.0f)
                reflectiveCurveToRelative(-5.439f, 2.166f, -5.916f, 5.0f)
                lineTo(0.0f, 12.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
                moveTo(17.916f, 14.0f)
                curveToRelative(-0.477f, 2.834f, -2.948f, 5.0f, -5.916f, 5.0f)
                reflectiveCurveToRelative(-5.439f, -2.166f, -5.916f, -5.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-6.084f)
                close()
            }
        }
        .build()
        return _cameraRetro!!
    }

private var _cameraRetro: ImageVector? = null
