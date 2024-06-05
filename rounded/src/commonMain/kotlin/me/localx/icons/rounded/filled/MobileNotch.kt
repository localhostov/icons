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

public val Icons.Filled.MobileNotch: ImageVector
    get() {
        if (_mobileNotch != null) {
            return _mobileNotch!!
        }
        _mobileNotch = Builder(name = "MobileNotch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6f, 0.036f)
                lineToRelative(-0.706f, 1.411f)
                curveToRelative(-0.169f, 0.339f, -0.516f, 0.553f, -0.895f, 0.553f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.379f, 0.0f, -0.725f, -0.214f, -0.895f, -0.553f)
                lineTo(8.4f, 0.036f)
                curveToRelative(-2.475f, 0.297f, -4.4f, 2.41f, -4.4f, 4.964f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(20.0f, 5.0f)
                curveTo(20.0f, 2.446f, 18.075f, 0.334f, 15.6f, 0.036f)
                close()
                moveTo(13.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _mobileNotch!!
    }

private var _mobileNotch: ImageVector? = null
