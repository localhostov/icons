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

public val Icons.Filled.FaceTissue: ImageVector
    get() {
        if (_faceTissue != null) {
            return _faceTissue!!
        }
        _faceTissue = Builder(name = "FaceTissue", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 0.657f, 0.067f, 1.298f, 0.169f, 1.926f)
                lineToRelative(12.128f, -2.226f)
                lineToRelative(-0.649f, 3.554f)
                lineToRelative(0.352f, 0.35f)
                lineToRelative(2.024f, -2.015f)
                lineToRelative(1.996f, 1.997f)
                lineToRelative(1.652f, -1.653f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.066f, 3.067f)
                lineToRelative(-2.004f, -2.003f)
                lineToRelative(-2.017f, 2.001f)
                lineToRelative(-0.786f, -0.78f)
                lineToRelative(-1.132f, 6.201f)
                curveToRelative(0.626f, 0.101f, 1.263f, 0.167f, 1.918f, 0.167f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(7.625f, 11.781f)
                lineToRelative(-1.25f, -1.562f)
                lineToRelative(1.524f, -1.219f)
                lineToRelative(-1.524f, -1.219f)
                lineToRelative(1.25f, -1.562f)
                lineToRelative(3.476f, 2.781f)
                lineToRelative(-3.476f, 2.781f)
                close()
                moveTo(17.625f, 10.219f)
                lineToRelative(-1.25f, 1.562f)
                lineToRelative(-3.476f, -2.781f)
                lineToRelative(3.476f, -2.781f)
                lineToRelative(1.25f, 1.562f)
                lineToRelative(-1.524f, 1.219f)
                lineToRelative(1.524f, 1.219f)
                close()
                moveTo(8.029f, 23.942f)
                lineToRelative(-2.735f, -2.188f)
                lineToRelative(-4.361f, 1.307f)
                lineToRelative(1.35f, -4.362f)
                lineTo(0.1f, 15.972f)
                lineToRelative(9.709f, -1.782f)
                lineToRelative(-1.78f, 9.752f)
                close()
            }
        }
        .build()
        return _faceTissue!!
    }

private var _faceTissue: ImageVector? = null
