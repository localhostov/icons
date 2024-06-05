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

public val Icons.Outline.RoboticArm: ImageVector
    get() {
        if (_roboticArm != null) {
            return _roboticArm!!
        }
        _roboticArm = Builder(name = "RoboticArm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 22.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.227f, -0.638f, -2.305f, -1.597f, -2.93f)
                lineTo(15.576f, 1.488f)
                curveToRelative(-0.522f, -0.886f, -1.476f, -1.488f, -2.576f, -1.488f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.365f, 0.075f, 0.711f, 0.195f, 1.036f)
                lineToRelative(-3.557f, 2.964f)
                lineTo(2.586f, 7.0f)
                lineTo(0.017f, 9.569f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.983f, -1.983f)
                horizontalLineToRelative(2.586f)
                verticalLineToRelative(2.586f)
                lineToRelative(-1.983f, 1.983f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.569f, -2.569f)
                verticalLineToRelative(-3.946f)
                lineToRelative(3.266f, -2.722f)
                lineToRelative(3.758f, 5.514f)
                curveToRelative(-0.006f, 0.081f, -0.024f, 0.157f, -0.024f, 0.239f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(13.779f, 5.884f)
                curveToRelative(0.658f, -0.178f, 1.225f, -0.571f, 1.621f, -1.104f)
                lineToRelative(2.269f, 3.33f)
                curveToRelative(-0.661f, 0.162f, -1.247f, 0.508f, -1.701f, 0.986f)
                lineToRelative(-2.189f, -3.212f)
                close()
                moveTo(20.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.351f)
                curveToRelative(0.456f, 0.219f, 0.961f, 0.351f, 1.5f, 0.351f)
                reflectiveCurveToRelative(1.044f, -0.133f, 1.5f, -0.351f)
                verticalLineToRelative(7.351f)
                close()
                moveTo(18.5f, 13.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _roboticArm!!
    }

private var _roboticArm: ImageVector? = null
