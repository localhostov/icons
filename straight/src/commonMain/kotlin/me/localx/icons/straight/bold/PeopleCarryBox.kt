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

public val Icons.Bold.PeopleCarryBox: ImageVector
    get() {
        if (_peopleCarryBox != null) {
            return _peopleCarryBox!!
        }
        _peopleCarryBox = Builder(name = "PeopleCarryBox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.974f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(23.928f, 13.028f)
                lineToRelative(-0.879f, -4.254f)
                curveToRelative(-0.334f, -1.617f, -1.775f, -2.791f, -3.428f, -2.791f)
                horizontalLineToRelative(-1.245f)
                curveToRelative(-1.253f, 0.0f, -2.417f, 0.676f, -3.04f, 1.764f)
                lineToRelative(-1.286f, 2.253f)
                horizontalLineToRelative(-4.102f)
                lineToRelative(-1.286f, -2.253f)
                curveToRelative(-0.622f, -1.088f, -1.786f, -1.764f, -3.039f, -1.764f)
                horizontalLineToRelative(-1.245f)
                curveToRelative(-1.652f, 0.0f, -3.094f, 1.174f, -3.428f, 2.791f)
                lineTo(0.073f, 13.028f)
                curveToRelative(-0.293f, 1.418f, 0.333f, 2.892f, 1.557f, 3.666f)
                lineToRelative(3.371f, 2.132f)
                verticalLineToRelative(5.174f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.826f)
                lineToRelative(-2.751f, -1.74f)
                lineToRelative(1.24f, -5.443f)
                lineToRelative(2.511f, 4.398f)
                verticalLineToRelative(1.611f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.611f)
                lineToRelative(2.511f, -4.399f)
                lineToRelative(1.24f, 5.444f)
                lineToRelative(-2.751f, 1.74f)
                verticalLineToRelative(6.826f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.174f)
                lineToRelative(3.371f, -2.132f)
                curveToRelative(1.224f, -0.774f, 1.849f, -2.248f, 1.557f, -3.666f)
                close()
                moveTo(18.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(20.195f, 20.437f)
                lineToRelative(0.779f, 3.563f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-1.147f, -5.228f)
                lineToRelative(-2.632f, 1.664f)
                close()
                moveTo(0.026f, 24.0f)
                lineTo(3.026f, 24.0f)
                lineToRelative(0.779f, -3.563f)
                lineToRelative(-2.632f, -1.664f)
                lineTo(0.026f, 24.0f)
                close()
            }
        }
        .build()
        return _peopleCarryBox!!
    }

private var _peopleCarryBox: ImageVector? = null
