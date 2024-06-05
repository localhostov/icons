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

public val Icons.Bold.Church: ImageVector
    get() {
        if (_church != null) {
            return _church!!
        }
        _church = Builder(name = "Church", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 5.769f)
                verticalLineToRelative(-1.769f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.769f)
                lineTo(0.0f, 13.736f)
                verticalLineToRelative(10.264f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-10.264f)
                lineToRelative(-11.0f, -7.967f)
                close()
                moveTo(12.0f, 8.752f)
                lineToRelative(4.0f, 2.909f)
                verticalLineToRelative(9.339f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.339f)
                lineToRelative(4.0f, -2.909f)
                close()
                moveTo(3.0f, 15.264f)
                lineToRelative(2.0f, -1.455f)
                verticalLineToRelative(7.191f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.736f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.191f)
                lineToRelative(2.0f, 1.455f)
                verticalLineToRelative(5.736f)
                close()
            }
        }
        .build()
        return _church!!
    }

private var _church: ImageVector? = null
