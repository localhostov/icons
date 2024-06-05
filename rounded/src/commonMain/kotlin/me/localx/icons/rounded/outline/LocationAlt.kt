package me.localx.icons.rounded.outline

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

public val Icons.Outline.LocationAlt: ImageVector
    get() {
        if (_locationAlt != null) {
            return _locationAlt!!
        }
        _locationAlt = Builder(name = "LocationAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 341.333f)
                curveToRelative(9.934f, 0.019f, 19.735f, -2.274f, 28.629f, -6.699f)
                lineToRelative(42.667f, -21.333f)
                curveToRelative(21.747f, -10.798f, 35.465f, -33.021f, 35.371f, -57.301f)
                verticalLineToRelative(-63.296f)
                curveToRelative(0.075f, -24.259f, -13.641f, -46.453f, -35.371f, -57.237f)
                lineToRelative(-42.667f, -21.333f)
                curveToRelative(-18.027f, -8.96f, -39.21f, -8.96f, -57.237f, 0.0f)
                lineToRelative(-42.667f, 21.333f)
                curveToRelative(-21.738f, 10.778f, -35.463f, 32.974f, -35.392f, 57.237f)
                verticalLineTo(256.0f)
                curveToRelative(-0.078f, 24.265f, 13.637f, 46.467f, 35.371f, 57.259f)
                lineToRelative(42.667f, 21.333f)
                curveTo(236.261f, 339.031f, 246.063f, 341.339f, 256.0f, 341.333f)
                close()
                moveTo(192.0f, 256.0f)
                verticalLineToRelative(-63.296f)
                curveToRelative(0.034f, -2.176f, 0.401f, -4.335f, 1.088f, -6.4f)
                lineToRelative(46.507f, 23.253f)
                curveToRelative(10.328f, 5.162f, 22.483f, 5.162f, 32.811f, 0.0f)
                lineToRelative(46.507f, -23.253f)
                curveToRelative(0.687f, 2.065f, 1.054f, 4.224f, 1.088f, 6.4f)
                verticalLineTo(256.0f)
                curveToRelative(0.034f, 8.094f, -4.543f, 15.502f, -11.797f, 19.093f)
                lineToRelative(-42.667f, 21.333f)
                curveToRelative(-6.016f, 2.977f, -13.077f, 2.977f, -19.093f, 0.0f)
                lineToRelative(-42.667f, -21.333f)
                curveTo(196.53f, 271.496f, 191.962f, 264.09f, 192.0f, 256.0f)
                close()
                moveTo(405.333f, 469.333f)
                horizontalLineToRelative(-57.792f)
                lineToRelative(74.389f, -68.736f)
                curveToRelative(91.645f, -91.642f, 91.647f, -240.224f, 0.005f, -331.869f)
                reflectiveCurveTo(181.712f, -22.918f, 90.067f, 68.723f)
                reflectiveCurveTo(-1.58f, 308.948f, 90.062f, 400.592f)
                curveToRelative(0.201f, 0.201f, 74.397f, 68.741f, 74.397f, 68.741f)
                horizontalLineToRelative(-57.792f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                horizontalLineToRelative(298.667f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(426.667f, 478.885f, 417.115f, 469.333f, 405.333f, 469.333f)
                close()
                moveTo(120.235f, 98.901f)
                curveToRelative(74.816f, -75.152f, 196.389f, -75.424f, 271.541f, -0.608f)
                reflectiveCurveToRelative(75.424f, 196.389f, 0.608f, 271.541f)
                lineToRelative(-85.013f, 78.528f)
                curveToRelative(-29.016f, 27.349f, -74.366f, 27.19f, -103.189f, -0.363f)
                lineToRelative(-83.947f, -77.568f)
                curveTo(45.37f, 295.402f, 45.371f, 173.931f, 120.235f, 98.901f)
                close()
            }
        }
        .build()
        return _locationAlt!!
    }

private var _locationAlt: ImageVector? = null
