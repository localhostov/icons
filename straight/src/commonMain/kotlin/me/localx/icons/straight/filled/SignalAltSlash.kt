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

public val Icons.Filled.SignalAltSlash: ImageVector
    get() {
        if (_signalAltSlash != null) {
            return _signalAltSlash!!
        }
        _signalAltSlash = Builder(name = "SignalAltSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.004f, 22.59f)
                lineToRelative(-1.413f, 1.416f)
                lineTo(0.003f, 1.458f)
                lineTo(1.416f, 0.042f)
                lineToRelative(11.584f, 11.563f)
                verticalLineToRelative(-6.105f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(10.098f)
                lineToRelative(2.0f, 1.996f)
                lineTo(19.0f, 1.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(20.088f)
                lineToRelative(1.004f, 1.002f)
                close()
                moveTo(3.5f, 17.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(7.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-8.739f)
                lineToRelative(-4.0f, -3.993f)
                verticalLineToRelative(12.731f)
                close()
                moveTo(13.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.749f)
                lineToRelative(-4.0f, -3.993f)
                verticalLineToRelative(6.742f)
                close()
            }
        }
        .build()
        return _signalAltSlash!!
    }

private var _signalAltSlash: ImageVector? = null
