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

public val Icons.Bold.BookAtlas: ImageVector
    get() {
        if (_bookAtlas != null) {
            return _bookAtlas!!
        }
        _bookAtlas = Builder(name = "BookAtlas", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 9.5f)
                curveToRelative(0.0f, -2.02f, 1.092f, -3.78f, 2.715f, -4.737f)
                curveToRelative(-0.336f, 0.958f, -0.551f, 2.082f, -0.65f, 3.237f)
                horizontalLineToRelative(2.007f)
                curveToRelative(0.246f, -2.505f, 1.062f, -3.944f, 1.426f, -4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.367f, 0.055f, 1.184f, 1.495f, 1.43f, 4.0f)
                horizontalLineToRelative(2.007f)
                curveToRelative(-0.099f, -1.155f, -0.314f, -2.279f, -0.65f, -3.237f)
                curveToRelative(1.623f, 0.956f, 2.715f, 2.717f, 2.715f, 4.737f)
                reflectiveCurveToRelative(-1.092f, 3.78f, -2.715f, 4.737f)
                curveToRelative(0.336f, -0.958f, 0.551f, -2.082f, 0.65f, -3.237f)
                horizontalLineToRelative(-2.007f)
                curveToRelative(-0.246f, 2.505f, -1.062f, 3.944f, -1.426f, 4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.367f, -0.055f, -1.184f, -1.495f, -1.43f, -4.0f)
                horizontalLineToRelative(-2.007f)
                curveToRelative(0.099f, 1.155f, 0.314f, 2.279f, 0.65f, 3.237f)
                curveToRelative(-1.623f, -0.956f, -2.715f, -2.717f, -2.715f, -4.737f)
                close()
                moveTo(23.0f, 2.5f)
                lineTo(23.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(1.0f, 4.0f)
                curveTo(1.0f, 1.794f, 2.794f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                close()
                moveTo(20.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(12.126f)
                curveToRelative(0.32f, -0.083f, 0.655f, -0.126f, 1.0f, -0.126f)
                horizontalLineToRelative(15.0f)
                lineTo(20.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bookAtlas!!
    }

private var _bookAtlas: ImageVector? = null
