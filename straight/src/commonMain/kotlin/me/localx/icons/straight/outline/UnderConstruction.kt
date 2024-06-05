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

public val Icons.Outline.UnderConstruction: ImageVector
    get() {
        if (_underConstruction != null) {
            return _underConstruction!!
        }
        _underConstruction = Builder(name = "UnderConstruction", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.048f, 9.703f)
                lineTo(14.292f, 0.948f)
                curveToRelative(-1.266f, -1.266f, -3.325f, -1.266f, -4.591f, 0.0f)
                lineTo(0.946f, 9.703f)
                curveTo(0.333f, 10.316f, -0.004f, 11.131f, -0.004f, 11.998f)
                curveToRelative(0.0f, 0.867f, 0.337f, 1.683f, 0.951f, 2.295f)
                lineToRelative(8.755f, 8.756f)
                curveToRelative(0.633f, 0.633f, 1.464f, 0.949f, 2.295f, 0.949f)
                reflectiveCurveToRelative(1.663f, -0.316f, 2.296f, -0.949f)
                lineToRelative(8.756f, -8.755f)
                curveToRelative(0.613f, -0.613f, 0.95f, -1.429f, 0.95f, -2.296f)
                reflectiveCurveToRelative(-0.338f, -1.682f, -0.951f, -2.295f)
                close()
                moveTo(21.634f, 12.88f)
                lineToRelative(-8.755f, 8.755f)
                curveToRelative(-0.487f, 0.487f, -1.277f, 0.485f, -1.763f, 0.0f)
                lineTo(2.361f, 12.879f)
                curveToRelative(-0.235f, -0.235f, -0.365f, -0.548f, -0.365f, -0.88f)
                reflectiveCurveToRelative(0.129f, -0.646f, 0.365f, -0.882f)
                lineTo(11.116f, 2.362f)
                curveToRelative(0.243f, -0.243f, 0.562f, -0.364f, 0.881f, -0.364f)
                reflectiveCurveToRelative(0.638f, 0.122f, 0.881f, 0.364f)
                lineToRelative(8.755f, 8.755f)
                curveToRelative(0.235f, 0.235f, 0.365f, 0.548f, 0.365f, 0.881f)
                reflectiveCurveToRelative(-0.129f, 0.646f, -0.365f, 0.881f)
                close()
                moveTo(13.974f, 6.363f)
                lineToRelative(-0.047f, -0.125f)
                curveToRelative(-0.349f, -0.764f, -1.088f, -1.239f, -1.928f, -1.239f)
                reflectiveCurveToRelative(-1.579f, 0.475f, -1.928f, 1.239f)
                lineToRelative(-2.312f, 7.75f)
                horizontalLineToRelative(-0.761f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-0.759f)
                lineToRelative(-2.265f, -7.626f)
                close()
                moveTo(12.089f, 7.037f)
                lineToRelative(0.848f, 2.963f)
                horizontalLineToRelative(-1.876f)
                lineToRelative(0.849f, -2.963f)
                curveToRelative(0.031f, -0.038f, 0.147f, -0.038f, 0.179f, 0.0f)
                close()
                moveTo(9.848f, 13.989f)
                lineToRelative(0.605f, -1.989f)
                horizontalLineToRelative(3.092f)
                lineToRelative(0.605f, 1.989f)
                horizontalLineToRelative(-4.302f)
                close()
            }
        }
        .build()
        return _underConstruction!!
    }

private var _underConstruction: ImageVector? = null
