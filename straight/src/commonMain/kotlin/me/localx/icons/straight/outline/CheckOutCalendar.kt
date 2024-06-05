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

public val Icons.Outline.CheckOutCalendar: ImageVector
    get() {
        if (_checkOutCalendar != null) {
            return _checkOutCalendar!!
        }
        _checkOutCalendar = Builder(name = "CheckOutCalendar", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 2.0f)
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
                verticalLineToRelative(7.395f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(-0.395f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-0.395f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(4.395f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 8.0f)
                close()
                moveTo(4.623f, 13.429f)
                lineToRelative(-1.571f, 1.571f)
                horizontalLineToRelative(7.948f)
                verticalLineToRelative(2.0f)
                lineTo(3.052f, 17.0f)
                lineToRelative(1.571f, 1.571f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.659f, -2.659f)
                curveToRelative(-0.731f, -0.731f, -0.731f, -1.92f, 0.0f, -2.651f)
                lineToRelative(2.659f, -2.659f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _checkOutCalendar!!
    }

private var _checkOutCalendar: ImageVector? = null
