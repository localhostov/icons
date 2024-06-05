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

public val Icons.Filled.PhoneRotary: ImageVector
    get() {
        if (_phoneRotary != null) {
            return _phoneRotary!!
        }
        _phoneRotary = Builder(name = "PhoneRotary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.251f)
                verticalLineToRelative(3.749f)
                horizontalLineToRelative(-2.057f)
                lineToRelative(-3.235f, -5.258f)
                reflectiveCurveToRelative(-3.357f, -1.742f, -6.708f, -1.742f)
                reflectiveCurveToRelative(-6.708f, 1.742f, -6.708f, 1.742f)
                lineToRelative(-3.235f, 5.258f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(-3.75f)
                curveToRelative(0.0f, -1.414f, 0.564f, -2.759f, 1.593f, -3.788f)
                curveTo(6.163f, -1.109f, 17.835f, -1.11f, 22.407f, 3.462f)
                curveToRelative(1.028f, 1.028f, 1.594f, 2.374f, 1.593f, 3.789f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(24.0f, 21.5f)
                verticalLineToRelative(2.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.977f, 0.529f, -3.93f, 1.617f, -5.971f)
                lineToRelative(2.829f, -4.529f)
                horizontalLineToRelative(-0.042f)
                lineToRelative(2.294f, -3.728f)
                curveToRelative(0.713f, -0.331f, 2.944f, -1.272f, 5.301f, -1.272f)
                reflectiveCurveToRelative(4.588f, 0.941f, 5.301f, 1.272f)
                lineToRelative(2.294f, 3.728f)
                horizontalLineToRelative(-0.042f)
                lineToRelative(2.829f, 4.529f)
                curveToRelative(1.088f, 2.041f, 1.617f, 3.994f, 1.617f, 5.971f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _phoneRotary!!
    }

private var _phoneRotary: ImageVector? = null
