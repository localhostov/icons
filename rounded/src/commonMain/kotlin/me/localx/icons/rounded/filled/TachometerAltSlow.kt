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

public val Icons.Filled.TachometerAltSlow: ImageVector
    get() {
        if (_tachometerAltSlow != null) {
            return _tachometerAltSlow!!
        }
        _tachometerAltSlow = Builder(name = "TachometerAltSlow", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.611f, 21.552f)
                arcTo(4.994f, 4.994f, 0.0f, false, false, 7.12f, 22.98f)
                horizontalLineToRelative(9.766f)
                arcToRelative(4.842f, 4.842f, 0.0f, false, false, 3.355f, -1.288f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 10.617f, 1.057f)
                arcToRelative(11.994f, 11.994f, 0.0f, false, false, -7.006f, 20.5f)
                close()
                moveTo(16.618f, 18.229f)
                curveTo(21.45f, 14.081f, 18.362f, 5.914f, 12.0f, 5.98f)
                curveToRelative(-0.994f, -0.138f, -2.538f, 0.867f, -2.968f, -0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.72f, -1.218f)
                curveToRelative(9.1f, -2.314f, 15.231f, 9.249f, 8.189f, 15.468f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.322f, -1.5f)
                close()
                moveTo(10.0f, 12.98f)
                arcToRelative(1.959f, 1.959f, 0.0f, false, true, 0.074f, -0.511f)
                lineTo(6.293f, 8.687f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.707f, 7.273f)
                lineToRelative(3.781f, 3.782f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 10.0f, 12.98f)
                close()
                moveTo(3.0f, 12.98f)
                arcToRelative(9.053f, 9.053f, 0.0f, false, true, 0.283f, -2.248f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.937f, 0.5f)
                arcToRelative(7.015f, 7.015f, 0.0f, false, false, 2.161f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.322f, 1.5f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 12.98f)
                close()
            }
        }
        .build()
        return _tachometerAltSlow!!
    }

private var _tachometerAltSlow: ImageVector? = null
