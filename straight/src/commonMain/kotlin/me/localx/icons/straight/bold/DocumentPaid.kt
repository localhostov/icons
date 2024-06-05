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

public val Icons.Bold.DocumentPaid: ImageVector
    get() {
        if (_documentPaid != null) {
            return _documentPaid!!
        }
        _documentPaid = Builder(name = "DocumentPaid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.1f, 11.0f)
                horizontalLineToRelative(-2.1f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(8.1f, 14.4f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.496f, 0.0f, 0.9f, 0.404f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.404f, 0.9f, -0.9f, 0.9f)
                close()
                moveTo(16.801f, 11.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(12.244f, 17.526f)
                horizontalLineToRelative(2.006f)
                lineToRelative(0.262f, 1.474f)
                horizontalLineToRelative(1.488f)
                lineToRelative(-1.397f, -6.807f)
                curveToRelative(-0.12f, -0.668f, -0.589f, -1.192f, -1.346f, -1.192f)
                reflectiveCurveToRelative(-1.281f, 0.587f, -1.385f, 1.167f)
                lineToRelative(-1.372f, 6.833f)
                horizontalLineToRelative(1.469f)
                lineToRelative(0.275f, -1.474f)
                close()
                moveTo(13.236f, 12.706f)
                lineToRelative(0.638f, 3.295f)
                horizontalLineToRelative(-1.261f)
                lineToRelative(0.624f, -3.295f)
                close()
                moveTo(21.701f, 11.0f)
                horizontalLineToRelative(-2.3f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.269f, 0.0f, 2.3f, -1.031f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -1.269f, -1.031f, -2.3f, -2.3f, -2.3f)
                close()
                moveTo(22.401f, 16.7f)
                curveToRelative(0.0f, 0.386f, -0.314f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, 0.0f, -0.7f, 0.0f)
                verticalLineToRelative(-4.802f)
                reflectiveCurveToRelative(0.314f, 0.0f, 0.7f, 0.0f)
                reflectiveCurveToRelative(0.7f, 0.314f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 2.993f)
                curveTo(0.0f, 1.339f, 1.346f, -0.007f, 3.0f, -0.007f)
                horizontalLineToRelative(11.382f)
                lineToRelative(5.618f, 5.665f)
                verticalLineToRelative(3.342f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.007f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 2.993f)
                lineTo(3.0f, 2.993f)
                verticalLineToRelative(18.007f)
                close()
            }
        }
        .build()
        return _documentPaid!!
    }

private var _documentPaid: ImageVector? = null
