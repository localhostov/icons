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
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.227f, -0.638f, -2.305f, -1.597f, -2.93f)
                lineTo(15.576f, 1.488f)
                curveToRelative(-0.522f, -0.886f, -1.476f, -1.488f, -2.576f, -1.488f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.365f, 0.075f, 0.711f, 0.195f, 1.036f)
                lineToRelative(-3.557f, 2.964f)
                horizontalLineToRelative(-1.981f)
                curveToRelative(-1.335f, 0.0f, -2.591f, 0.52f, -3.535f, 1.464f)
                lineToRelative(-0.829f, 0.829f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                reflectiveCurveToRelative(1.023f, 0.391f, 1.414f, 0.0f)
                lineToRelative(0.829f, -0.829f)
                curveToRelative(0.559f, -0.558f, 1.332f, -0.878f, 2.121f, -0.878f)
                horizontalLineToRelative(1.343f)
                verticalLineToRelative(1.343f)
                curveToRelative(0.0f, 0.79f, -0.32f, 1.562f, -0.878f, 2.121f)
                lineToRelative(-0.829f, 0.829f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(0.829f, -0.829f)
                curveToRelative(0.944f, -0.944f, 1.464f, -2.2f, 1.464f, -3.535f)
                verticalLineToRelative(-1.875f)
                lineToRelative(3.266f, -2.722f)
                lineToRelative(3.758f, 5.514f)
                curveToRelative(-0.006f, 0.081f, -0.024f, 0.157f, -0.024f, 0.239f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
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
