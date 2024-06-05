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

public val Icons.Bold.HatSanta: ImageVector
    get() {
        if (_hatSanta != null) {
            return _hatSanta!!
        }
        _hatSanta = Builder(name = "HatSanta", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.496f, 16.158f)
                curveToRelative(-0.325f, -1.165f, -0.735f, -2.274f, -1.189f, -3.334f)
                curveToRelative(2.154f, -0.557f, 3.751f, -2.496f, 3.751f, -4.824f)
                curveToRelative(0.0f, -1.695f, -0.848f, -3.186f, -2.137f, -4.091f)
                curveToRelative(-0.527f, -0.599f, -3.611f, -3.909f, -7.921f, -3.909f)
                curveTo(10.669f, 0.0f, 4.033f, 3.437f, 2.154f, 16.271f)
                curveToRelative(-1.263f, 0.529f, -2.154f, 1.776f, -2.154f, 3.229f)
                verticalLineToRelative(4.5f)
                lineToRelative(24.0f, -0.002f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.935f, -0.364f, -1.814f, -1.025f, -2.475f)
                curveToRelative(-0.418f, -0.418f, -0.928f, -0.701f, -1.479f, -0.865f)
                close()
                moveTo(19.059f, 10.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(14.0f, 3.0f)
                curveToRelative(0.965f, 0.0f, 1.871f, 0.264f, 2.671f, 0.633f)
                curveToRelative(-1.549f, 0.849f, -2.612f, 2.476f, -2.612f, 4.367f)
                curveToRelative(0.0f, 1.947f, 1.125f, 3.616f, 2.749f, 4.442f)
                curveToRelative(0.564f, 1.111f, 1.079f, 2.297f, 1.494f, 3.556f)
                lineToRelative(-13.063f, 0.002f)
                curveTo(6.991f, 5.404f, 12.088f, 3.0f, 14.0f, 3.0f)
                close()
                moveTo(21.0f, 20.998f)
                lineToRelative(-18.0f, 0.002f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineToRelative(17.0f, -0.002f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.18f, 0.0f, 0.298f, 0.091f, 0.353f, 0.146f)
                reflectiveCurveToRelative(0.146f, 0.173f, 0.146f, 0.354f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _hatSanta!!
    }

private var _hatSanta: ImageVector? = null
