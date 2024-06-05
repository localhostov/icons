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

public val Icons.Filled.Brand: ImageVector
    get() {
        if (_brand != null) {
            return _brand!!
        }
        _brand = Builder(name = "Brand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.463f, 13.791f)
                lineToRelative(1.086f, 1.086f)
                lineToRelative(-2.586f, 2.586f)
                lineToRelative(-1.086f, -1.086f)
                lineToRelative(2.586f, -2.586f)
                close()
                moveTo(23.271f, 16.821f)
                lineToRelative(-6.221f, 6.359f)
                curveToRelative(-0.546f, 0.547f, -1.26f, 0.819f, -1.973f, 0.819f)
                curveToRelative(-0.704f, 0.0f, -1.405f, -0.267f, -1.94f, -0.8f)
                lineTo(2.452f, 12.616f)
                lineToRelative(0.91f, -7.843f)
                lineToRelative(3.714f, 3.713f)
                curveToRelative(-0.044f, 0.164f, -0.074f, 0.334f, -0.074f, 0.512f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.178f, 0.0f, -0.347f, 0.031f, -0.511f, 0.074f)
                lineToRelative(-3.747f, -3.746f)
                lineToRelative(7.67f, -0.876f)
                lineToRelative(10.832f, 10.752f)
                curveToRelative(0.996f, 0.994f, 1.006f, 2.617f, 0.024f, 3.619f)
                close()
                moveTo(20.377f, 14.877f)
                lineToRelative(-3.914f, -3.914f)
                lineToRelative(-5.414f, 5.414f)
                lineToRelative(3.914f, 3.914f)
                lineToRelative(5.414f, -5.414f)
                close()
                moveTo(4.744f, 3.326f)
                lineTo(1.452f, 0.035f)
                lineTo(0.038f, 1.449f)
                lineToRelative(3.324f, 3.324f)
                lineToRelative(1.382f, -1.447f)
                close()
            }
        }
        .build()
        return _brand!!
    }

private var _brand: ImageVector? = null
