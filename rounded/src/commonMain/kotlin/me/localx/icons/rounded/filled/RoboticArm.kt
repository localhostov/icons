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

public val Icons.Filled.RoboticArm: ImageVector
    get() {
        if (_roboticArm != null) {
            return _roboticArm!!
        }
        _roboticArm = Builder(name = "RoboticArm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 10.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(9.566f, 4.02f)
                lineToRelative(-2.98f, 2.98f)
                horizontalLineToRelative(-1.929f)
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
                verticalLineToRelative(-1.929f)
                lineToRelative(2.98f, -2.98f)
                curveToRelative(-0.585f, -0.345f, -1.069f, -0.829f, -1.414f, -1.414f)
                close()
                moveTo(18.462f, 8.004f)
                lineToRelative(-2.062f, -3.93f)
                curveToRelative(-0.715f, 1.17f, -1.999f, 1.931f, -3.451f, 1.912f)
                lineToRelative(2.008f, 3.771f)
                curveToRelative(0.816f, -1.052f, 2.074f, -1.74f, 3.505f, -1.752f)
                close()
                moveTo(15.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(23.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.703f)
                curveToRelative(-0.825f, 1.03f, -2.078f, 1.703f, -3.5f, 1.703f)
                reflectiveCurveToRelative(-2.675f, -0.673f, -3.5f, -1.703f)
                verticalLineToRelative(6.703f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _roboticArm!!
    }

private var _roboticArm: ImageVector? = null
