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

public val Icons.Outline.SpringCalendar: ImageVector
    get() {
        if (_springCalendar != null) {
            return _springCalendar!!
        }
        _springCalendar = Builder(name = "SpringCalendar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.765f, 19.0f)
                curveToRelative(0.0f, -0.044f, -0.006f, -0.087f, -0.008f, -0.131f)
                curveToRelative(1.421f, 0.774f, 3.405f, -0.027f, 3.405f, -0.027f)
                curveToRelative(0.0f, 0.0f, -0.22f, -1.879f, -1.378f, -2.831f)
                curveToRelative(1.158f, -0.952f, 1.378f, -2.831f, 1.378f, -2.831f)
                curveToRelative(0.0f, 0.0f, -1.985f, -0.802f, -3.407f, -0.026f)
                curveToRelative(0.003f, -0.051f, 0.01f, -0.102f, 0.01f, -0.154f)
                curveToRelative(0.0f, -1.657f, -1.765f, -3.0f, -1.765f, -3.0f)
                curveToRelative(0.0f, 0.0f, -1.765f, 1.343f, -1.765f, 3.0f)
                curveToRelative(0.0f, 0.052f, 0.007f, 0.103f, 0.01f, 0.154f)
                curveToRelative(-1.421f, -0.776f, -3.407f, 0.026f, -3.407f, 0.026f)
                curveToRelative(0.0f, 0.0f, 0.219f, 1.867f, 1.368f, 2.822f)
                curveToRelative(-1.148f, 0.955f, -1.368f, 2.822f, -1.368f, 2.822f)
                curveToRelative(0.0f, 0.0f, 1.985f, 0.802f, 3.406f, 0.026f)
                curveToRelative(-0.003f, 0.05f, -0.01f, 0.099f, -0.01f, 0.15f)
                curveToRelative(0.0f, 1.657f, 1.765f, 3.0f, 1.765f, 3.0f)
                curveToRelative(0.0f, 0.0f, 1.765f, -1.343f, 1.765f, -3.0f)
                close()
                moveTo(10.5f, 16.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.0f, 4.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 22.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 22.0f)
                close()
            }
        }
        .build()
        return _springCalendar!!
    }

private var _springCalendar: ImageVector? = null
