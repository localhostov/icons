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

public val Icons.Bold.CameraViewfinder: ImageVector
    get() {
        if (_cameraViewfinder != null) {
            return _cameraViewfinder!!
        }
        _cameraViewfinder = Builder(name = "CameraViewfinder", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.5f, 24.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(21.5f, 0.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(8.0f, 0.0f)
                lineTo(2.5f, 0.0f)
                curveTo(1.121f, 0.0f, 0.0f, 1.121f, 0.0f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.5f, 6.0f)
                horizontalLineToRelative(0.196f)
                lineToRelative(1.33f, -2.0f)
                horizontalLineToRelative(3.947f)
                lineToRelative(1.33f, 2.0f)
                horizontalLineToRelative(0.196f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(15.5f, 9.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _cameraViewfinder!!
    }

private var _cameraViewfinder: ImageVector? = null
