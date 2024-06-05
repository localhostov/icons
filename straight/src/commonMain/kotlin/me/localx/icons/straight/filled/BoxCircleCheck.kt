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

public val Icons.Filled.BoxCircleCheck: ImageVector
    get() {
        if (_boxCircleCheck != null) {
            return _boxCircleCheck!!
        }
        _boxCircleCheck = Builder(name = "BoxCircleCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(18.619f, 20.414f)
                curveToRelative(-0.378f, 0.378f, -0.88f, 0.586f, -1.414f, 0.586f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.534f, 0.0f, -1.036f, -0.209f, -1.413f, -0.587f)
                lineToRelative(-2.012f, -2.012f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.013f, 2.013f)
                lineToRelative(3.615f, -3.615f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.615f, 3.615f)
                close()
                moveTo(24.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.343f, 1.343f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(12.715f, 24.0f)
                lineTo(1.0f, 24.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                curveToRelative(0.0f, 2.387f, 1.051f, 4.533f, 2.715f, 6.0f)
                close()
            }
        }
        .build()
        return _boxCircleCheck!!
    }

private var _boxCircleCheck: ImageVector? = null
