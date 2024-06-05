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

public val Icons.Bold.ParkingSlash: ImageVector
    get() {
        if (_parkingSlash != null) {
            return _parkingSlash!!
        }
        _parkingSlash = Builder(name = "ParkingSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 3.5f)
                verticalLineToRelative(15.379f)
                lineToRelative(-4.935f, -4.935f)
                curveToRelative(1.182f, -0.924f, 1.935f, -2.364f, 1.935f, -3.944f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.934f, 0.0f, -1.784f, 0.368f, -2.412f, 0.967f)
                lineToRelative(-2.967f, -2.967f)
                horizontalLineToRelative(15.379f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                close()
                moveTo(13.904f, 11.783f)
                lineToRelative(-3.692f, -3.692f)
                curveToRelative(0.081f, -0.057f, 0.18f, -0.092f, 0.287f, -0.092f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.766f, -0.442f, 1.449f, -1.096f, 1.783f)
                close()
                moveTo(3.0f, 5.121f)
                lineToRelative(15.879f, 15.879f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 5.121f)
                close()
                moveTo(10.051f, 15.0f)
                horizontalLineToRelative(-0.051f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.051f)
                lineToRelative(3.051f, 3.051f)
                close()
            }
        }
        .build()
        return _parkingSlash!!
    }

private var _parkingSlash: ImageVector? = null
