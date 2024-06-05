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

public val Icons.Outline.ScannerImage: ImageVector
    get() {
        if (_scannerImage != null) {
            return _scannerImage!!
        }
        _scannerImage = Builder(name = "ScannerImage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.202f, 15.662f)
                lineTo(3.64f, 0.231f)
                curveToRelative(-0.428f, -0.353f, -1.057f, -0.294f, -1.408f, 0.13f)
                curveToRelative(-0.354f, 0.425f, -0.295f, 1.055f, 0.129f, 1.408f)
                lineToRelative(15.917f, 13.231f)
                lineTo(4.0f, 15.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.393f, -0.716f, -2.622f, -1.798f, -3.338f)
                close()
                moveTo(22.0f, 20.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                lineTo(4.0f, 22.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(10.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _scannerImage!!
    }

private var _scannerImage: ImageVector? = null
