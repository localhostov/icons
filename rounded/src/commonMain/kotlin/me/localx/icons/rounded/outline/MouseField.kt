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

public val Icons.Outline.MouseField: ImageVector
    get() {
        if (_mouseField != null) {
            return _mouseField!!
        }
        _mouseField = Builder(name = "MouseField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.015f, 2.0f)
                horizontalLineToRelative(-0.015f)
                curveToRelative(-0.327f, -0.436f, -0.727f, -0.821f, -1.188f, -1.134f)
                curveTo(15.605f, 0.043f, 14.144f, -0.205f, 12.696f, 0.167f)
                curveToRelative(-1.77f, 0.453f, -3.171f, 1.905f, -3.57f, 3.699f)
                curveToRelative(-0.306f, 1.375f, -0.052f, 2.763f, 0.716f, 3.906f)
                curveToRelative(0.182f, 0.272f, 0.395f, 0.518f, 0.625f, 0.746f)
                curveToRelative(-5.046f, 1.624f, -6.467f, 6.693f, -6.467f, 9.482f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(12.0f, 24.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(20.0f, 20.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.998f)
                lineToRelative(0.01f, -5.0f)
                horizontalLineToRelative(2.987f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-1.812f)
                curveToRelative(0.0f, -3.533f, -2.239f, -7.188f, -5.985f, -7.188f)
                close()
                moveTo(6.0f, 18.0f)
                curveToRelative(0.002f, -0.309f, 0.133f, -7.177f, 6.778f, -7.921f)
                curveToRelative(0.869f, 1.499f, 2.43f, 2.547f, 4.235f, 2.834f)
                lineToRelative(-0.011f, 5.087f)
                lineTo(6.0f, 18.0f)
                close()
                moveTo(22.0f, 11.0f)
                horizontalLineToRelative(-3.985f)
                curveToRelative(-1.706f, 0.0f, -3.216f, -0.972f, -3.757f, -2.419f)
                curveToRelative(-0.125f, -0.333f, -0.417f, -0.575f, -0.768f, -0.635f)
                curveToRelative(-0.807f, -0.139f, -1.531f, -0.608f, -1.988f, -1.289f)
                curveToRelative(-0.459f, -0.685f, -0.61f, -1.522f, -0.424f, -2.357f)
                curveToRelative(0.233f, -1.049f, 1.083f, -1.932f, 2.114f, -2.196f)
                curveToRelative(0.271f, -0.069f, 0.542f, -0.104f, 0.809f, -0.104f)
                curveToRelative(0.603f, 0.0f, 1.183f, 0.175f, 1.686f, 0.518f)
                curveToRelative(0.714f, 0.486f, 1.184f, 1.253f, 1.294f, 2.132f)
                curveToRelative(0.0f, 0.004f, 0.06f, 0.464f, -0.156f, 0.926f)
                curveToRelative(-0.233f, 0.5f, -0.018f, 1.096f, 0.482f, 1.329f)
                curveToRelative(0.503f, 0.234f, 1.097f, 0.018f, 1.33f, -0.482f)
                curveToRelative(0.477f, -1.021f, 0.336f, -1.98f, 0.324f, -2.047f)
                curveToRelative(-0.011f, -0.086f, -0.023f, -0.172f, -0.039f, -0.257f)
                curveToRelative(2.115f, 0.582f, 3.078f, 3.167f, 3.078f, 5.068f)
                verticalLineToRelative(1.812f)
                close()
            }
        }
        .build()
        return _mouseField!!
    }

private var _mouseField: ImageVector? = null
