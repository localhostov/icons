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

public val Icons.Filled.BowlSoftServe: ImageVector
    get() {
        if (_bowlSoftServe != null) {
            return _bowlSoftServe!!
        }
        _bowlSoftServe = Builder(name = "BowlSoftServe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.094f, 16.0f)
                horizontalLineToRelative(17.812f)
                reflectiveCurveToRelative(-0.381f, 0.966f, -0.41f, 1.014f)
                curveToRelative(-1.633f, 2.725f, -3.929f, 3.006f, -6.409f, 3.006f)
                curveToRelative(-0.317f, 0.0f, -0.753f, -0.006f, -1.077f, -0.011f)
                curveToRelative(-0.001f, 0.0f, -0.004f, 0.0f, -0.01f, 0.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(1.991f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.991f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.006f, 0.0f, -0.009f, 0.0f, -0.01f, 0.0f)
                curveToRelative(-2.844f, 0.042f, -5.644f, 0.078f, -7.486f, -2.995f)
                curveToRelative(-0.029f, -0.048f, -0.41f, -1.014f, -0.41f, -1.014f)
                close()
                moveTo(21.5f, 9.0f)
                horizontalLineToRelative(-3.346f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-0.107f)
                curveToRelative(0.0f, -0.493f, 0.4f, -0.893f, 0.893f, -0.893f)
                horizontalLineToRelative(0.953f)
                curveToRelative(0.996f, 0.0f, 1.92f, -0.681f, 2.08f, -1.664f)
                curveToRelative(0.204f, -1.253f, -0.758f, -2.336f, -1.973f, -2.336f)
                horizontalLineToRelative(-3.084f)
                curveToRelative(-0.523f, -1.5f, -1.219f, -2.113f, -2.372f, -2.846f)
                curveToRelative(-0.596f, -0.379f, -1.373f, -0.022f, -1.486f, 0.675f)
                curveToRelative(-0.242f, 1.492f, -1.164f, 2.171f, -1.164f, 2.171f)
                horizontalLineToRelative(-5.893f)
                curveToRelative(-0.996f, 0.0f, -1.92f, 0.681f, -2.08f, 1.664f)
                curveToRelative(-0.204f, 1.253f, 0.758f, 2.336f, 1.973f, 2.336f)
                horizontalLineToRelative(7.154f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(2.643f, 9.0f)
                curveTo(1.335f, 9.0f, 0.143f, 9.941f, 0.013f, 11.242f)
                curveToRelative(-0.15f, 1.496f, 1.021f, 2.758f, 2.487f, 2.758f)
                horizontalLineToRelative(18.857f)
                curveToRelative(1.308f, 0.0f, 2.499f, -0.941f, 2.63f, -2.242f)
                curveToRelative(0.15f, -1.497f, -1.021f, -2.758f, -2.487f, -2.758f)
                close()
            }
        }
        .build()
        return _bowlSoftServe!!
    }

private var _bowlSoftServe: ImageVector? = null
