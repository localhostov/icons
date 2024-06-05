package me.localx.icons.rounded.bold

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

public val Icons.Bold.KeyboardLeft: ImageVector
    get() {
        if (_keyboardLeft != null) {
            return _keyboardLeft!!
        }
        _keyboardLeft = Builder(name = "KeyboardLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -3.033f, 2.467f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(22.5f, 13.0f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(2.745f, 8.902f)
                lineTo(0.371f, 11.075f)
                curveToRelative(-0.494f, 0.443f, -0.494f, 1.217f, 0.0f, 1.66f)
                lineToRelative(2.374f, 2.172f)
                curveToRelative(0.481f, 0.44f, 1.255f, 0.099f, 1.255f, -0.553f)
                verticalLineToRelative(-4.899f)
                curveToRelative(0.0f, -0.652f, -0.775f, -0.993f, -1.255f, -0.553f)
                close()
                moveTo(11.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(16.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(22.5f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _keyboardLeft!!
    }

private var _keyboardLeft: ImageVector? = null
