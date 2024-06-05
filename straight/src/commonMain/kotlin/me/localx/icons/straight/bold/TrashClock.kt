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

public val Icons.Bold.TrashClock: ImageVector
    get() {
        if (_trashClock != null) {
            return _trashClock!!
        }
        _trashClock = Builder(name = "TrashClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.03f, 24.0f)
                horizontalLineToRelative(-5.69f)
                curveToRelative(-1.807f, 0.0f, -3.338f, -1.41f, -3.487f, -3.21f)
                lineTo(1.62f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-0.284f, 3.406f)
                curveToRelative(-0.819f, -0.263f, -1.691f, -0.406f, -2.597f, -0.406f)
                curveToRelative(-0.128f, 0.0f, -0.255f, 0.003f, -0.381f, 0.009f)
                lineToRelative(0.251f, -3.009f)
                lineTo(4.631f, 6.0f)
                lineToRelative(1.212f, 14.541f)
                curveToRelative(0.021f, 0.262f, 0.235f, 0.459f, 0.497f, 0.459f)
                horizontalLineToRelative(3.415f)
                curveToRelative(0.528f, 1.163f, 1.31f, 2.187f, 2.275f, 3.0f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(20.904f, 18.783f)
                lineToRelative(-1.904f, -1.904f)
                verticalLineToRelative(-2.879f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.121f)
                lineToRelative(2.783f, 2.783f)
                lineToRelative(2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _trashClock!!
    }

private var _trashClock: ImageVector? = null
