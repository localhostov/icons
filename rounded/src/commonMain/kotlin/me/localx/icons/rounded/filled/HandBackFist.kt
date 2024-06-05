package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.HandBackFist: ImageVector
    get() {
        if (_handBackFist != null) {
            return _handBackFist!!
        }
        _handBackFist = Builder(name = "HandBackFist", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.431f, 2.439f)
                lineTo(10.582f, 0.043f)
                curveToRelative(-0.886f, -0.174f, -1.791f, 0.054f, -2.486f, 0.625f)
                curveToRelative(-0.696f, 0.572f, -1.096f, 1.417f, -1.096f, 2.318f)
                verticalLineToRelative(7.014f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineTo(5.252f)
                lineToRelative(-2.815f, 2.791f)
                curveToRelative(-1.543f, 1.529f, -1.574f, 4.047f, -0.067f, 5.615f)
                lineToRelative(4.883f, 5.065f)
                verticalLineToRelative(2.277f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-3.808f)
                lineToRelative(1.428f, -3.569f)
                curveToRelative(0.378f, -0.945f, 0.572f, -1.954f, 0.572f, -2.972f)
                verticalLineTo(4.392f)
                curveToRelative(0.0f, -0.938f, -0.652f, -1.751f, -1.569f, -1.953f)
                close()
            }
        }
        .build()
        return _handBackFist!!
    }

private var _handBackFist: ImageVector? = null
