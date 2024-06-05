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

public val Icons.Outline.DocumentPaid: ImageVector
    get() {
        if (_documentPaid != null) {
            return _documentPaid!!
        }
        _documentPaid = Builder(name = "DocumentPaid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.1f, 12.0f)
                horizontalLineToRelative(-2.1f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(8.1f, 15.4f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.496f, 0.0f, 0.9f, 0.404f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.404f, 0.9f, -0.9f, 0.9f)
                close()
                moveTo(16.801f, 12.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(12.244f, 18.526f)
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
                moveTo(13.236f, 13.706f)
                lineToRelative(0.638f, 3.295f)
                horizontalLineToRelative(-1.261f)
                lineToRelative(0.624f, -3.295f)
                close()
                moveTo(21.701f, 12.0f)
                horizontalLineToRelative(-2.3f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.269f, 0.0f, 2.3f, -1.031f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -1.269f, -1.031f, -2.3f, -2.3f, -2.3f)
                close()
                moveTo(22.401f, 17.7f)
                curveToRelative(0.0f, 0.386f, -0.314f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, 0.0f, -0.7f, 0.0f)
                verticalLineToRelative(-4.802f)
                reflectiveCurveToRelative(0.314f, 0.0f, 0.7f, 0.0f)
                reflectiveCurveToRelative(0.7f, 0.314f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                close()
                moveTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.414f)
                lineTo(12.414f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(13.0f, 3.414f)
                lineToRelative(3.586f, 3.586f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(-3.586f)
                close()
            }
        }
        .build()
        return _documentPaid!!
    }

private var _documentPaid: ImageVector? = null
