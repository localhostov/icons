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

public val Icons.Filled.PersonCircleCheck: ImageVector
    get() {
        if (_personCircleCheck != null) {
            return _personCircleCheck!!
        }
        _personCircleCheck = Builder(name = "PersonCircleCheck", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(11.999f, 8.948f)
                curveToRelative(-0.028f, -1.63f, -1.362f, -2.948f, -2.999f, -2.948f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.204f, -1.635f, 0.963f, -3.116f, 2.0f, -4.291f)
                verticalLineToRelative(-3.709f)
                curveToRelative(0.0f, -0.017f, 0.0f, -0.035f, -0.001f, -0.052f)
                close()
                moveTo(18.0f, 12.0f)
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
            }
        }
        .build()
        return _personCircleCheck!!
    }

private var _personCircleCheck: ImageVector? = null
