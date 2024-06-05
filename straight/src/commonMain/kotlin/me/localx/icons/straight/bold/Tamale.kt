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

public val Icons.Bold.Tamale: ImageVector
    get() {
        if (_tamale != null) {
            return _tamale!!
        }
        _tamale = Builder(name = "Tamale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.843f, 13.0f)
                lineToRelative(1.288f, -11.594f)
                lineToRelative(-1.219f, -0.348f)
                curveToRelative(-0.151f, -0.043f, -3.761f, -1.058f, -8.912f, -1.058f)
                reflectiveCurveTo(3.239f, 1.015f, 3.088f, 1.058f)
                lineToRelative(-1.219f, 0.348f)
                lineToRelative(1.288f, 11.594f)
                horizontalLineToRelative(17.686f)
                close()
                moveTo(18.157f, 10.0f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(0.354f, -6.724f)
                curveToRelative(0.978f, 0.121f, 1.792f, 0.263f, 2.4f, 0.385f)
                lineToRelative(-0.705f, 6.339f)
                close()
                moveTo(13.47f, 3.03f)
                lineToRelative(-0.367f, 6.97f)
                horizontalLineToRelative(-2.206f)
                lineToRelative(-0.367f, -6.97f)
                curveToRelative(0.473f, -0.019f, 0.963f, -0.03f, 1.47f, -0.03f)
                reflectiveCurveToRelative(0.997f, 0.011f, 1.47f, 0.03f)
                close()
                moveTo(7.539f, 3.276f)
                lineToRelative(0.354f, 6.724f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(-0.705f, -6.339f)
                curveToRelative(0.608f, -0.122f, 1.423f, -0.264f, 2.4f, -0.385f)
                close()
                moveTo(22.132f, 22.674f)
                lineToRelative(-1.307f, 0.291f)
                curveToRelative(-0.19f, 0.042f, -4.708f, 1.036f, -8.825f, 1.036f)
                reflectiveCurveToRelative(-8.635f, -0.994f, -8.825f, -1.036f)
                lineToRelative(-1.307f, -0.291f)
                lineToRelative(0.808f, -7.674f)
                horizontalLineToRelative(3.016f)
                lineToRelative(-0.557f, 5.292f)
                curveToRelative(0.639f, 0.115f, 1.476f, 0.252f, 2.406f, 0.375f)
                lineToRelative(0.298f, -5.667f)
                horizontalLineToRelative(3.004f)
                lineToRelative(-0.313f, 5.953f)
                curveToRelative(0.492f, 0.027f, 0.985f, 0.047f, 1.469f, 0.047f)
                reflectiveCurveToRelative(0.977f, -0.019f, 1.469f, -0.046f)
                lineToRelative(-0.313f, -5.954f)
                horizontalLineToRelative(3.004f)
                lineToRelative(0.298f, 5.668f)
                curveToRelative(0.931f, -0.123f, 1.767f, -0.26f, 2.406f, -0.375f)
                lineToRelative(-0.557f, -5.292f)
                horizontalLineToRelative(3.016f)
                lineToRelative(0.808f, 7.674f)
                close()
            }
        }
        .build()
        return _tamale!!
    }

private var _tamale: ImageVector? = null
