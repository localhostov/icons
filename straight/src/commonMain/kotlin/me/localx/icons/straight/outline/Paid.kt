package me.localx.icons.straight.outline

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

public val Icons.Outline.Paid: ImageVector
    get() {
        if (_paid != null) {
            return _paid!!
        }
        _paid = Builder(name = "Paid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.873f, 13.001f)
                horizontalLineToRelative(-1.261f)
                lineToRelative(0.624f, -3.295f)
                lineToRelative(0.638f, 3.295f)
                close()
                moveTo(18.0f, 9.599f)
                verticalLineToRelative(4.802f)
                reflectiveCurveToRelative(0.314f, 0.0f, 0.7f, 0.0f)
                reflectiveCurveToRelative(0.7f, -0.314f, 0.7f, -0.7f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -0.386f, -0.314f, -0.7f, -0.7f, -0.7f)
                reflectiveCurveToRelative(-0.7f, 0.0f, -0.7f, 0.0f)
                close()
                moveTo(6.0f, 10.5f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.496f, 0.0f, 0.9f, -0.404f, 0.9f, -0.9f)
                close()
                moveTo(24.0f, 18.0f)
                horizontalLineToRelative(-1.611f)
                curveToRelative(-2.128f, 3.673f, -6.105f, 6.0f, -10.389f, 6.0f)
                reflectiveCurveToRelative(-8.261f, -2.327f, -10.389f, -6.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 6.0f)
                horizontalLineToRelative(1.611f)
                curveTo(3.739f, 2.327f, 7.716f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(8.261f, 2.327f, 10.389f, 6.0f)
                horizontalLineToRelative(1.611f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(18.7f, 8.0f)
                horizontalLineToRelative(-2.3f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.269f, 0.0f, 2.3f, -1.031f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -1.269f, -1.031f, -2.3f, -2.3f, -2.3f)
                close()
                moveTo(4.035f, 6.0f)
                horizontalLineToRelative(15.929f)
                curveToRelative(-1.823f, -2.42f, -4.701f, -4.0f, -7.965f, -4.0f)
                reflectiveCurveToRelative(-6.142f, 1.58f, -7.965f, 4.0f)
                close()
                moveTo(13.8f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(4.599f, 16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.1f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                close()
                moveTo(7.499f, 16.0f)
                horizontalLineToRelative(1.469f)
                lineToRelative(0.275f, -1.474f)
                horizontalLineToRelative(2.006f)
                lineToRelative(0.262f, 1.474f)
                horizontalLineToRelative(1.488f)
                lineToRelative(-1.397f, -6.807f)
                curveToRelative(-0.12f, -0.668f, -0.589f, -1.192f, -1.346f, -1.192f)
                reflectiveCurveToRelative(-1.281f, 0.587f, -1.385f, 1.167f)
                lineToRelative(-1.372f, 6.833f)
                close()
                moveTo(19.964f, 18.0f)
                lineTo(4.035f, 18.0f)
                curveToRelative(1.823f, 2.42f, 4.701f, 4.0f, 7.965f, 4.0f)
                reflectiveCurveToRelative(6.142f, -1.58f, 7.965f, -4.0f)
                close()
            }
        }
        .build()
        return _paid!!
    }

private var _paid: ImageVector? = null
