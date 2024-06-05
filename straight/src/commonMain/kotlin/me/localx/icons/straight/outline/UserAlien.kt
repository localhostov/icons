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

public val Icons.Outline.UserAlien: ImageVector
    get() {
        if (_userAlien != null) {
            return _userAlien!!
        }
        _userAlien = Builder(name = "UserAlien", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.934f, 14.122f)
                curveToRelative(1.165f, -1.907f, 2.066f, -4.044f, 2.066f, -6.122f)
                curveTo(20.0f, 3.589f, 16.411f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.0f, 3.589f, 4.0f, 8.0f)
                curveToRelative(0.0f, 2.078f, 0.9f, 4.215f, 2.066f, 6.122f)
                curveToRelative(-1.755f, 0.423f, -3.066f, 1.996f, -3.066f, 3.878f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(0.341f)
                curveToRelative(1.863f, 2.493f, 3.839f, 4.276f, 3.995f, 4.414f)
                lineToRelative(0.664f, 0.591f)
                lineToRelative(0.664f, -0.591f)
                curveToRelative(0.156f, -0.138f, 2.133f, -1.921f, 3.995f, -4.414f)
                horizontalLineToRelative(0.341f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.883f, -1.311f, -3.455f, -3.066f, -3.878f)
                close()
                moveTo(12.0f, 18.289f)
                curveToRelative(-1.688f, -1.66f, -6.0f, -6.296f, -6.0f, -10.288f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                curveToRelative(0.0f, 3.984f, -4.313f, 8.626f, -6.0f, 10.288f)
                close()
                moveTo(15.792f, 9.292f)
                curveToRelative(-0.868f, 0.868f, -2.777f, 0.694f, -2.777f, 0.694f)
                curveToRelative(0.0f, 0.0f, -0.174f, -1.909f, 0.694f, -2.777f)
                curveToRelative(0.868f, -0.868f, 2.777f, -0.694f, 2.777f, -0.694f)
                curveToRelative(0.0f, 0.0f, 0.174f, 1.909f, -0.694f, 2.777f)
                close()
                moveTo(10.306f, 7.223f)
                curveToRelative(0.868f, 0.868f, 0.694f, 2.777f, 0.694f, 2.777f)
                curveToRelative(0.0f, 0.0f, -1.909f, 0.174f, -2.777f, -0.694f)
                reflectiveCurveToRelative(-0.694f, -2.777f, -0.694f, -2.777f)
                curveToRelative(0.0f, 0.0f, 1.909f, -0.174f, 2.777f, 0.694f)
                close()
            }
        }
        .build()
        return _userAlien!!
    }

private var _userAlien: ImageVector? = null
