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

public val Icons.Filled.UserAlien: ImageVector
    get() {
        if (_userAlien != null) {
            return _userAlien!!
        }
        _userAlien = Builder(name = "UserAlien", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.336f, 20.414f)
                lineToRelative(0.664f, 0.591f)
                lineToRelative(0.664f, -0.591f)
                curveToRelative(0.3f, -0.266f, 7.336f, -6.588f, 7.336f, -12.414f)
                curveTo(20.0f, 3.589f, 16.411f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.0f, 3.589f, 4.0f, 8.0f)
                curveToRelative(0.0f, 5.826f, 7.036f, 12.148f, 7.336f, 12.414f)
                close()
                moveTo(13.81f, 6.81f)
                curveToRelative(0.992f, -0.992f, 3.174f, -0.794f, 3.174f, -0.794f)
                curveToRelative(0.0f, 0.0f, 0.198f, 2.182f, -0.794f, 3.174f)
                reflectiveCurveToRelative(-3.174f, 0.794f, -3.174f, 0.794f)
                curveToRelative(0.0f, 0.0f, -0.198f, -2.182f, 0.794f, -3.174f)
                close()
                moveTo(7.017f, 6.017f)
                reflectiveCurveToRelative(2.19f, -0.199f, 3.185f, 0.796f)
                reflectiveCurveToRelative(0.796f, 3.185f, 0.796f, 3.185f)
                curveToRelative(0.0f, 0.0f, -2.19f, 0.199f, -3.185f, -0.796f)
                curveToRelative(-0.995f, -0.995f, -0.796f, -3.185f, -0.796f, -3.185f)
                close()
                moveTo(21.001f, 18.001f)
                verticalLineToRelative(6.0f)
                lineTo(3.0f, 24.001f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.159f, 0.503f, -2.195f, 1.292f, -2.926f)
                curveToRelative(2.18f, 3.625f, 5.202f, 6.38f, 5.715f, 6.834f)
                lineToRelative(1.993f, 1.773f)
                lineToRelative(1.99f, -1.771f)
                curveToRelative(0.515f, -0.456f, 3.537f, -3.211f, 5.718f, -6.837f)
                curveToRelative(0.789f, 0.731f, 1.292f, 1.767f, 1.292f, 2.926f)
                close()
            }
        }
        .build()
        return _userAlien!!
    }

private var _userAlien: ImageVector? = null
