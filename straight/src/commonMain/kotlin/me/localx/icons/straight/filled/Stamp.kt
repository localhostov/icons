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

public val Icons.Filled.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(22.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 16.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.404f, 0.0f, -0.652f, -0.223f, -0.765f, -0.356f)
                curveToRelative(-0.112f, -0.133f, -0.289f, -0.416f, -0.22f, -0.814f)
                curveToRelative(0.579f, -3.331f, 0.984f, -6.55f, 0.984f, -7.829f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.277f, 0.405f, 4.497f, 0.985f, 7.829f)
                curveToRelative(0.069f, 0.398f, -0.108f, 0.681f, -0.22f, 0.814f)
                reflectiveCurveToRelative(-0.36f, 0.356f, -0.765f, 0.356f)
                lineTo(3.0f, 13.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(24.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
