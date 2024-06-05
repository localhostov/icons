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

public val Icons.Filled.FaceVomit: ImageVector
    get() {
        if (_faceVomit != null) {
            return _faceVomit!!
        }
        _faceVomit = Builder(name = "FaceVomit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.0f, 19.5f)
                verticalLineToRelative(-3.523f)
                curveToRelative(-0.902f, -0.53f, -1.964f, -0.977f, -3.0f, -0.977f)
                reflectiveCurveToRelative(-2.098f, 0.448f, -3.0f, 0.977f)
                verticalLineToRelative(3.523f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 3.078f, -1.169f, 5.876f, -3.074f, 8.0f)
                horizontalLineToRelative(-3.426f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-2.063f)
                curveToRelative(0.183f, 0.162f, -0.005f, -0.005f, 0.0f, 0.0f)
                lineToRelative(1.413f, -1.415f)
                curveToRelative(-0.134f, -0.135f, -3.038f, -3.022f, -6.413f, -3.022f)
                reflectiveCurveToRelative(-6.279f, 2.887f, -6.413f, 3.022f)
                lineToRelative(1.413f, 1.415f)
                verticalLineToRelative(2.063f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.55f)
                curveToRelative(0.024f, -0.165f, 0.05f, -0.329f, 0.05f, -0.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.265f, 0.0f, -0.521f, 0.035f, -0.768f, 0.091f)
                curveToRelative(-0.467f, -1.277f, -0.732f, -2.651f, -0.732f, -4.091f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(11.101f, 9.0f)
                lineToRelative(-3.476f, -2.781f)
                lineToRelative(-1.249f, 1.562f)
                lineToRelative(1.524f, 1.219f)
                lineToRelative(-1.524f, 1.219f)
                lineToRelative(1.249f, 1.562f)
                lineToRelative(3.476f, -2.781f)
                close()
                moveTo(16.101f, 9.0f)
                lineToRelative(1.524f, -1.219f)
                lineToRelative(-1.249f, -1.562f)
                lineToRelative(-3.476f, 2.781f)
                lineToRelative(3.476f, 2.781f)
                lineToRelative(1.249f, -1.562f)
                lineToRelative(-1.524f, -1.219f)
                close()
                moveTo(22.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _faceVomit!!
    }

private var _faceVomit: ImageVector? = null
