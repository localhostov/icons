package me.localx.icons.straight.outline

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

public val Icons.Outline.PeopleCarryBox: ImageVector
    get() {
        if (_peopleCarryBox != null) {
            return _peopleCarryBox!!
        }
        _peopleCarryBox = Builder(name = "PeopleCarryBox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.999f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(22.628f, 15.789f)
                lineToRelative(-3.603f, 2.278f)
                verticalLineToRelative(5.933f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.034f)
                lineToRelative(1.565f, -0.99f)
                lineToRelative(-1.216f, -6.398f)
                lineToRelative(-1.348f, 2.275f)
                verticalLineToRelative(5.147f)
                lineTo(8.025f, 17.0f)
                verticalLineToRelative(-5.103f)
                lineToRelative(-1.379f, -2.326f)
                lineToRelative(-1.236f, 6.389f)
                lineToRelative(1.589f, 1.005f)
                verticalLineToRelative(7.034f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.933f)
                lineToRelative(-3.604f, -2.279f)
                curveTo(0.347f, 15.126f, -0.19f, 13.863f, 0.061f, 12.646f)
                lineToRelative(0.878f, -4.253f)
                curveToRelative(0.287f, -1.387f, 1.522f, -2.394f, 2.938f, -2.394f)
                horizontalLineToRelative(1.267f)
                curveToRelative(1.054f, 0.0f, 2.042f, 0.563f, 2.58f, 1.47f)
                lineToRelative(0.907f, 1.53f)
                horizontalLineToRelative(6.759f)
                lineToRelative(0.907f, -1.53f)
                curveToRelative(0.538f, -0.906f, 1.527f, -1.47f, 2.581f, -1.47f)
                horizontalLineToRelative(1.267f)
                curveToRelative(1.417f, 0.0f, 2.652f, 1.007f, 2.938f, 2.394f)
                lineToRelative(0.878f, 4.253f)
                curveToRelative(0.251f, 1.217f, -0.285f, 2.479f, -1.335f, 3.143f)
                close()
                moveTo(3.606f, 14.82f)
                lineToRelative(1.308f, -6.82f)
                horizontalLineToRelative(-1.036f)
                curveToRelative(-0.472f, 0.0f, -0.884f, 0.336f, -0.979f, 0.798f)
                lineToRelative(-0.878f, 4.253f)
                curveToRelative(-0.084f, 0.406f, 0.094f, 0.826f, 0.444f, 1.047f)
                lineToRelative(1.142f, 0.722f)
                close()
                moveTo(14.025f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(22.004f, 13.051f)
                lineToRelative(-0.878f, -4.253f)
                curveToRelative(-0.095f, -0.462f, -0.507f, -0.798f, -0.979f, -0.798f)
                horizontalLineToRelative(-1.038f)
                lineToRelative(1.287f, 6.835f)
                lineToRelative(1.165f, -0.737f)
                curveToRelative(0.35f, -0.222f, 0.529f, -0.643f, 0.445f, -1.048f)
                close()
                moveTo(18.525f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(0.025f, 24.0f)
                lineTo(2.078f, 24.0f)
                lineToRelative(1.04f, -4.756f)
                lineToRelative(-1.8f, -1.138f)
                lineTo(0.025f, 24.0f)
                close()
                moveTo(20.906f, 19.244f)
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
