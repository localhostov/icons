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

public val Icons.Filled.ComputerSpeaker: ImageVector
    get() {
        if (_computerSpeaker != null) {
            return _computerSpeaker!!
        }
        _computerSpeaker = Builder(name = "ComputerSpeaker", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 6.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(18.0f, 9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(18.0f, 22.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(21.0f, 4.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 17.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.343f, 1.343f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.5f, 18.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _computerSpeaker!!
    }

private var _computerSpeaker: ImageVector? = null
