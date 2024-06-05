package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.863f, 12.592f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-1.452f, -1.452f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-9.997f, 9.995f)
                lineToRelative(4.279f, 4.279f)
                lineToRelative(9.998f, -9.994f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.586f, 6.854f)
                lineTo(15.636f, 1.904f)
                curveToRelative(-1.228f, -1.228f, -2.859f, -1.904f, -4.596f, -1.904f)
                reflectiveCurveToRelative(-3.369f, 0.676f, -4.597f, 1.904f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(15.283f, 12.157f)
                lineToRelative(5.303f, -5.303f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.415f, 9.682f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-5.303f, 5.303f)
                lineToRelative(1.415f, 1.414f)
                curveToRelative(0.39f, 0.39f, 0.902f, 0.585f, 1.414f, 0.585f)
                reflectiveCurveToRelative(1.024f, -0.195f, 1.414f, -0.585f)
                lineToRelative(2.475f, -2.475f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.049f, 0.0f, -2.829f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
