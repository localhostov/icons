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

public val Icons.Bold.HardHat: ImageVector
    get() {
        if (_hardHat != null) {
            return _hardHat!!
        }
        _hardHat = Builder(name = "HardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 15.092f)
                verticalLineToRelative(-2.143f)
                curveToRelative(0.0f, -4.735f, -3.18f, -8.912f, -7.771f, -10.292f)
                curveToRelative(-0.728f, -0.999f, -1.899f, -1.657f, -3.229f, -1.657f)
                reflectiveCurveToRelative(-2.501f, 0.658f, -3.229f, 1.656f)
                curveTo(4.18f, 4.037f, 1.0f, 8.214f, 1.0f, 12.949f)
                verticalLineToRelative(2.143f)
                curveToRelative(-0.581f, 0.207f, -1.0f, 0.756f, -1.0f, 1.408f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.27f)
                lineToRelative(0.392f, 0.5f)
                curveToRelative(2.355f, 3.028f, 5.573f, 4.5f, 9.837f, 4.5f)
                reflectiveCurveToRelative(7.482f, -1.472f, 9.833f, -4.495f)
                lineToRelative(0.396f, -0.505f)
                horizontalLineToRelative(0.271f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.652f, -0.419f, -1.201f, -1.0f, -1.408f)
                close()
                moveTo(20.0f, 12.949f)
                verticalLineToRelative(2.051f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 6.245f)
                curveToRelative(2.418f, 1.367f, 4.0f, 3.892f, 4.0f, 6.705f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.445f, 1.0f, 0.992f)
                verticalLineToRelative(10.008f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 4.992f)
                curveToRelative(0.0f, -0.547f, 0.449f, -0.992f, 1.0f, -0.992f)
                close()
                moveTo(8.0f, 6.245f)
                verticalLineToRelative(8.755f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.051f)
                curveToRelative(0.0f, -2.813f, 1.582f, -5.338f, 4.0f, -6.704f)
                close()
                moveTo(5.823f, 18.0f)
                horizontalLineToRelative(12.355f)
                curveToRelative(-1.599f, 1.352f, -3.6f, 2.0f, -6.178f, 2.0f)
                reflectiveCurveToRelative(-4.577f, -0.648f, -6.177f, -2.0f)
                close()
            }
        }
        .build()
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
