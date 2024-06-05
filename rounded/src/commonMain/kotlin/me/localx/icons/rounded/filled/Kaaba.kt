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

public val Icons.Filled.Kaaba: ImageVector
    get() {
        if (_kaaba != null) {
            return _kaaba!!
        }
        _kaaba = Builder(name = "Kaaba", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.593f, 10.649f)
                lineTo(1.562f, 5.897f)
                curveToRelative(0.459f, -0.892f, 1.174f, -1.646f, 2.096f, -2.135f)
                lineTo(9.659f, 0.582f)
                curveToRelative(1.466f, -0.776f, 3.217f, -0.775f, 4.683f, 0.0f)
                lineToRelative(5.999f, 3.18f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.947f, 0.502f, 1.677f, 1.283f, 2.133f, 2.207f)
                lineToRelative(-9.07f, 4.681f)
                curveToRelative(-0.881f, 0.466f, -1.931f, 0.466f, -2.812f, 0.0f)
                close()
                moveTo(19.449f, 12.487f)
                verticalLineToRelative(0.025f)
                curveToRelative(0.0f, 0.746f, 0.796f, 1.222f, 1.453f, 0.87f)
                lineToRelative(2.098f, -1.119f)
                verticalLineToRelative(3.556f)
                curveToRelative(0.0f, 1.856f, -1.019f, 3.549f, -2.659f, 4.418f)
                lineToRelative(-5.999f, 3.18f)
                curveToRelative(-0.733f, 0.388f, -1.537f, 0.583f, -2.342f, 0.583f)
                reflectiveCurveToRelative(-1.608f, -0.194f, -2.342f, -0.583f)
                lineToRelative(-5.999f, -3.18f)
                curveToRelative(-1.641f, -0.87f, -2.659f, -2.562f, -2.659f, -4.418f)
                verticalLineToRelative(-3.556f)
                lineToRelative(2.098f, 1.119f)
                curveToRelative(0.657f, 0.353f, 1.453f, -0.124f, 1.453f, -0.87f)
                verticalLineToRelative(-0.025f)
                curveToRelative(0.0f, -0.363f, -0.2f, -0.697f, -0.52f, -0.869f)
                lineToRelative(-3.031f, -1.619f)
                verticalLineToRelative(-1.82f)
                curveToRelative(0.0f, -0.104f, 0.015f, -0.205f, 0.021f, -0.308f)
                lineToRelative(8.637f, 4.546f)
                curveToRelative(0.733f, 0.389f, 1.538f, 0.582f, 2.342f, 0.583f)
                curveToRelative(0.804f, 0.0f, 1.608f, -0.194f, 2.342f, -0.583f)
                lineToRelative(8.637f, -4.546f)
                curveToRelative(0.006f, 0.103f, 0.021f, 0.204f, 0.021f, 0.308f)
                verticalLineToRelative(1.82f)
                lineToRelative(-3.031f, 1.619f)
                curveToRelative(-0.32f, 0.172f, -0.52f, 0.506f, -0.52f, 0.869f)
                close()
                moveTo(11.0f, 15.888f)
                curveToRelative(0.0f, -0.365f, -0.202f, -0.701f, -0.525f, -0.872f)
                lineToRelative(-2.475f, -1.291f)
                curveToRelative(-0.657f, -0.348f, -1.449f, 0.128f, -1.449f, 0.872f)
                verticalLineToRelative(0.03f)
                curveToRelative(0.0f, 0.365f, 0.202f, 0.701f, 0.525f, 0.872f)
                lineToRelative(2.475f, 1.29f)
                curveToRelative(0.657f, 0.348f, 1.449f, -0.128f, 1.449f, -0.872f)
                verticalLineToRelative(-0.03f)
                close()
                moveTo(17.449f, 14.597f)
                curveToRelative(0.0f, -0.744f, -0.792f, -1.22f, -1.449f, -0.872f)
                lineToRelative(-2.475f, 1.291f)
                curveToRelative(-0.323f, 0.171f, -0.525f, 0.507f, -0.525f, 0.872f)
                verticalLineToRelative(0.03f)
                curveToRelative(0.0f, 0.744f, 0.792f, 1.22f, 1.449f, 0.872f)
                lineToRelative(2.475f, -1.29f)
                curveToRelative(0.323f, -0.171f, 0.525f, -0.507f, 0.525f, -0.872f)
                verticalLineToRelative(-0.03f)
                close()
            }
        }
        .build()
        return _kaaba!!
    }

private var _kaaba: ImageVector? = null
