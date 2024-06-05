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

public val Icons.Filled.PeopleCarryBox: ImageVector
    get() {
        if (_peopleCarryBox != null) {
            return _peopleCarryBox!!
        }
        _peopleCarryBox = Builder(name = "PeopleCarryBox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.975f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(22.604f, 15.789f)
                lineToRelative(-3.604f, 2.279f)
                verticalLineToRelative(5.932f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.033f)
                lineToRelative(1.565f, -0.99f)
                lineToRelative(-1.217f, -6.398f)
                lineToRelative(-1.348f, 2.273f)
                verticalLineToRelative(5.147f)
                lineTo(8.001f, 16.999f)
                verticalLineToRelative(-5.103f)
                lineToRelative(-1.379f, -2.325f)
                lineToRelative(-1.236f, 6.39f)
                lineToRelative(1.589f, 1.005f)
                verticalLineToRelative(7.033f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.932f)
                lineToRelative(-3.604f, -2.279f)
                curveTo(0.322f, 15.126f, -0.214f, 13.862f, 0.037f, 12.646f)
                lineToRelative(0.878f, -4.253f)
                curveToRelative(0.287f, -1.387f, 1.522f, -2.394f, 2.938f, -2.394f)
                horizontalLineToRelative(1.267f)
                curveToRelative(1.054f, 0.0f, 2.042f, 0.563f, 2.58f, 1.471f)
                lineToRelative(0.907f, 1.529f)
                horizontalLineToRelative(6.76f)
                lineToRelative(0.907f, -1.529f)
                curveToRelative(0.538f, -0.907f, 1.527f, -1.471f, 2.581f, -1.471f)
                horizontalLineToRelative(1.267f)
                curveToRelative(1.416f, 0.0f, 2.652f, 1.007f, 2.938f, 2.394f)
                lineToRelative(0.878f, 4.253f)
                curveToRelative(0.251f, 1.216f, -0.285f, 2.479f, -1.334f, 3.143f)
                close()
                moveTo(18.501f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(0.0f, 24.0f)
                lineTo(2.054f, 24.0f)
                lineToRelative(1.04f, -4.756f)
                lineToRelative(-1.8f, -1.138f)
                lineTo(0.0f, 24.0f)
                close()
                moveTo(20.881f, 19.244f)
                lineToRelative(1.04f, 4.756f)
                horizontalLineToRelative(2.053f)
                lineToRelative(-1.293f, -5.895f)
                lineToRelative(-1.8f, 1.138f)
                close()
            }
        }
        .build()
        return _peopleCarryBox!!
    }

private var _peopleCarryBox: ImageVector? = null
