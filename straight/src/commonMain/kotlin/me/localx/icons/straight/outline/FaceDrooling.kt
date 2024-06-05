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

public val Icons.Outline.FaceDrooling: ImageVector
    get() {
        if (_faceDrooling != null) {
            return _faceDrooling!!
        }
        _faceDrooling = Builder(name = "FaceDrooling", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 3.542f, -1.552f, 6.721f, -4.0f, 8.919f)
                verticalLineToRelative(-2.945f)
                curveToRelative(1.25f, -1.669f, 2.0f, -3.733f, 2.0f, -5.974f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 4.829f, 3.441f, 8.869f, 8.0f, 9.798f)
                verticalLineToRelative(2.021f)
                curveTo(4.334f, 22.863f, 0.0f, 17.934f, 0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(9.893f, 9.015f)
                lineToRelative(-0.784f, -1.84f)
                curveToRelative(-1.674f, 0.714f, -3.042f, 1.852f, -3.953f, 3.29f)
                lineToRelative(1.689f, 1.07f)
                curveToRelative(0.684f, -1.079f, 1.766f, -1.975f, 3.048f, -2.521f)
                close()
                moveTo(14.892f, 7.175f)
                lineToRelative(-0.784f, 1.84f)
                curveToRelative(1.282f, 0.546f, 2.364f, 1.441f, 3.048f, 2.521f)
                lineToRelative(1.689f, -1.07f)
                curveToRelative(-0.912f, -1.438f, -2.279f, -2.576f, -3.953f, -3.29f)
                close()
                moveTo(16.412f, 14.551f)
                curveToRelative(-0.02f, 0.015f, -2.027f, 1.449f, -4.411f, 1.449f)
                curveToRelative(-2.331f, 0.0f, -4.316f, -1.73f, -4.336f, -1.747f)
                lineToRelative(-1.33f, 1.493f)
                curveToRelative(0.103f, 0.092f, 2.559f, 2.254f, 5.666f, 2.254f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.25f)
                curveToRelative(0.759f, -0.179f, 1.444f, -0.428f, 2.0f, -0.683f)
                verticalLineToRelative(5.934f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineToRelative(-0.002f, -9.599f)
                lineToRelative(-1.586f, 1.149f)
                close()
            }
        }
        .build()
        return _faceDrooling!!
    }

private var _faceDrooling: ImageVector? = null
