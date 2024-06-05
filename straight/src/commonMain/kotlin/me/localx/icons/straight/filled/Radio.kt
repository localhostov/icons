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

public val Icons.Filled.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 15.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                close()
                moveTo(24.0f, 8.95f)
                verticalLineToRelative(15.0f)
                lineTo(0.0f, 23.95f)
                verticalLineToRelative(-15.0f)
                curveToRelative(0.0f, -1.488f, 1.091f, -2.717f, 2.514f, -2.951f)
                lineTo(20.687f, 0.0f)
                lineToRelative(0.627f, 1.899f)
                lineToRelative(-12.27f, 4.05f)
                horizontalLineToRelative(11.956f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 10.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 15.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
