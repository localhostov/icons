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

public val Icons.Outline.TransformationCircle: ImageVector
    get() {
        if (_transformationCircle != null) {
            return _transformationCircle!!
        }
        _transformationCircle = Builder(name = "TransformationCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.957f, 8.457f)
                lineToRelative(2.043f, 2.043f)
                verticalLineToRelative(-4.583f)
                curveToRelative(0.0f, -0.506f, -0.41f, -0.917f, -0.917f, -0.917f)
                horizontalLineToRelative(-4.583f)
                lineToRelative(2.043f, 2.043f)
                lineToRelative(-1.789f, 1.789f)
                curveToRelative(-1.448f, -1.143f, -3.271f, -1.832f, -5.254f, -1.832f)
                curveTo(3.813f, 7.0f, 0.0f, 10.813f, 0.0f, 15.5f)
                reflectiveCurveToRelative(3.813f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.813f, 8.5f, -8.5f)
                curveToRelative(0.0f, -1.984f, -0.688f, -3.806f, -1.832f, -5.254f)
                lineToRelative(1.789f, -1.789f)
                close()
                moveTo(8.5f, 22.0f)
                curveToRelative(-3.584f, 0.0f, -6.5f, -2.916f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.916f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.916f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.916f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(24.0f, 8.5f)
                curveToRelative(0.0f, 3.453f, -2.074f, 6.427f, -5.038f, 7.755f)
                curveToRelative(0.018f, -0.25f, 0.038f, -0.5f, 0.038f, -0.755f)
                curveToRelative(0.0f, -0.496f, -0.047f, -0.981f, -0.117f, -1.457f)
                curveToRelative(1.867f, -1.142f, 3.117f, -3.194f, 3.117f, -5.543f)
                curveToRelative(0.0f, -3.59f, -2.91f, -6.5f, -6.5f, -6.5f)
                curveToRelative(-2.349f, 0.0f, -4.4f, 1.25f, -5.543f, 3.117f)
                curveToRelative(-0.477f, -0.07f, -0.961f, -0.117f, -1.457f, -0.117f)
                curveToRelative(-0.255f, 0.0f, -0.505f, 0.02f, -0.755f, 0.038f)
                curveTo(9.073f, 2.074f, 12.046f, 0.0f, 15.5f, 0.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                close()
            }
        }
        .build()
        return _transformationCircle!!
    }

private var _transformationCircle: ImageVector? = null
