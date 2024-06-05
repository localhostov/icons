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

public val Icons.Bold.SaltShaker: ImageVector
    get() {
        if (_saltShaker != null) {
            return _saltShaker!!
        }
        _saltShaker = Builder(name = "SaltShaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.963f, 18.938f)
                lineToRelative(-0.963f, -10.506f)
                verticalLineToRelative(-1.932f)
                curveTo(21.0f, 0.0f, 14.226f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.0f, 0.0f, 3.0f, 6.5f)
                verticalLineToRelative(1.932f)
                lineToRelative(-0.955f, 10.431f)
                curveToRelative(-0.185f, 1.292f, 0.2f, 2.599f, 1.055f, 3.585f)
                curveToRelative(0.855f, 0.986f, 2.094f, 1.552f, 3.399f, 1.552f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.305f, 0.0f, 2.544f, -0.565f, 3.399f, -1.552f)
                curveToRelative(0.855f, -0.986f, 1.24f, -2.292f, 1.064f, -3.51f)
                close()
                moveTo(8.0f, 3.503f)
                verticalLineToRelative(1.497f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.98f)
                curveToRelative(0.314f, -0.013f, 0.647f, -0.02f, 1.0f, -0.02f)
                reflectiveCurveToRelative(0.686f, 0.007f, 1.0f, 0.02f)
                verticalLineToRelative(1.98f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.497f)
                curveToRelative(1.591f, 0.576f, 2.0f, 1.619f, 2.0f, 2.997f)
                verticalLineToRelative(0.5f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 0.409f, -2.422f, 2.0f, -2.997f)
                close()
                moveTo(18.633f, 20.483f)
                curveToRelative(-0.29f, 0.333f, -0.692f, 0.517f, -1.133f, 0.517f)
                lineTo(6.5f, 21.0f)
                curveToRelative(-0.441f, 0.0f, -0.844f, -0.184f, -1.133f, -0.517f)
                curveToRelative(-0.289f, -0.333f, -0.414f, -0.758f, -0.343f, -1.27f)
                lineToRelative(0.845f, -9.213f)
                horizontalLineToRelative(12.263f)
                lineToRelative(0.853f, 9.288f)
                curveToRelative(0.062f, 0.437f, -0.062f, 0.861f, -0.352f, 1.195f)
                close()
                moveTo(14.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 13.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _saltShaker!!
    }

private var _saltShaker: ImageVector? = null
