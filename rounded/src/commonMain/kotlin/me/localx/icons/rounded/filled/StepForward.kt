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

public val Icons.Filled.StepForward: ImageVector
    get() {
        if (_stepForward != null) {
            return _stepForward!!
        }
        _stepForward = Builder(name = "StepForward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.766f, 0.365f)
                curveToRelative(1.122f, -0.568f, 2.398f, -0.464f, 3.412f, 0.28f)
                lineToRelative(10.152f, 8.716f)
                curveToRelative(0.246f, 0.181f, 0.462f, 0.39f, 0.645f, 0.621f)
                verticalLineTo(0.998f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(22.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-8.984f)
                curveToRelative(-0.182f, 0.231f, -0.398f, 0.441f, -0.645f, 0.621f)
                lineToRelative(-10.152f, 8.725f)
                curveToRelative(-0.581f, 0.427f, -1.248f, 0.643f, -1.923f, 0.643f)
                curveToRelative(-0.503f, 0.0f, -1.01f, -0.12f, -1.489f, -0.363f)
                curveToRelative(-1.122f, -0.569f, -1.792f, -1.659f, -1.792f, -2.917f)
                verticalLineTo(3.282f)
                curveToRelative(0.0f, -1.258f, 0.67f, -2.348f, 1.792f, -2.917f)
                close()
            }
        }
        .build()
        return _stepForward!!
    }

private var _stepForward: ImageVector? = null
