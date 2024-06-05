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

public val Icons.Bold.DocumentCircleWrong: ImageVector
    get() {
        if (_documentCircleWrong != null) {
            return _documentCircleWrong!!
        }
        _documentCircleWrong = Builder(name = "DocumentCircleWrong", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.536f, 20.121f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(12.723f, 24.001f)
                lineToRelative(-12.722f, 0.003f)
                lineTo(0.001f, 2.997f)
                curveTo(0.0f, 1.342f, 1.346f, -0.003f, 3.0f, -0.003f)
                horizontalLineToRelative(11.382f)
                lineToRelative(5.618f, 5.665f)
                verticalLineToRelative(4.601f)
                curveToRelative(-0.64f, -0.165f, -1.308f, -0.262f, -2.0f, -0.262f)
                curveToRelative(-0.339f, 0.0f, -0.672f, 0.028f, -1.0f, 0.069f)
                verticalLineToRelative(-2.072f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 2.997f)
                lineTo(3.0f, 2.997f)
                verticalLineToRelative(18.005f)
                horizontalLineToRelative(7.588f)
                curveToRelative(0.471f, 1.162f, 1.208f, 2.184f, 2.135f, 2.999f)
                close()
            }
        }
        .build()
        return _documentCircleWrong!!
    }

private var _documentCircleWrong: ImageVector? = null
