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

public val Icons.Bold.PersonShelter: ImageVector
    get() {
        if (_personShelter != null) {
            return _personShelter!!
        }
        _personShelter = Builder(name = "PersonShelter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.132f)
                verticalLineToRelative(13.868f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-13.868f)
                curveToRelative(0.0f, -0.125f, -0.059f, -0.245f, -0.157f, -0.323f)
                lineTo(12.252f, 3.087f)
                curveToRelative(-0.148f, -0.116f, -0.355f, -0.116f, -0.504f, 0.0f)
                lineTo(3.157f, 9.81f)
                curveToRelative(-0.099f, 0.077f, -0.157f, 0.197f, -0.157f, 0.322f)
                verticalLineToRelative(13.868f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-13.868f)
                curveToRelative(0.0f, -1.055f, 0.477f, -2.033f, 1.308f, -2.684f)
                lineTo(9.898f, 0.725f)
                curveToRelative(1.238f, -0.969f, 2.965f, -0.969f, 4.203f, 0.0f)
                lineToRelative(8.591f, 6.723f)
                curveToRelative(0.831f, 0.651f, 1.308f, 1.629f, 1.308f, 2.685f)
                close()
                moveTo(14.5f, 8.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(17.0f, 15.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(10.0f, 18.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }
        .build()
        return _personShelter!!
    }

private var _personShelter: ImageVector? = null
