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

public val Icons.Outline.FacePensive: ImageVector
    get() {
        if (_facePensive != null) {
            return _facePensive!!
        }
        _facePensive = Builder(name = "FacePensive", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(5.369f, 9.334f)
                lineToRelative(-0.74f, -1.857f)
                curveToRelative(1.188f, -0.474f, 2.267f, -1.373f, 3.039f, -2.531f)
                lineToRelative(1.664f, 1.109f)
                curveToRelative(-1.01f, 1.514f, -2.38f, 2.648f, -3.963f, 3.279f)
                close()
                moveTo(14.668f, 6.055f)
                lineToRelative(1.664f, -1.109f)
                curveToRelative(0.772f, 1.158f, 1.852f, 2.058f, 3.039f, 2.531f)
                lineToRelative(-0.74f, 1.857f)
                curveToRelative(-1.583f, -0.631f, -2.953f, -1.766f, -3.963f, -3.279f)
                close()
                moveTo(9.0f, 17.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.966f, 13.724f)
                curveToRelative(-0.898f, 0.907f, -1.975f, 1.297f, -3.019f, 1.297f)
                curveToRelative(-1.16f, 0.0f, -2.281f, -0.48f, -3.073f, -1.265f)
                lineToRelative(1.406f, -1.422f)
                curveToRelative(0.659f, 0.652f, 2.073f, 1.186f, 3.264f, -0.017f)
                lineToRelative(1.422f, 1.406f)
                close()
                moveTo(17.797f, 12.317f)
                lineToRelative(1.406f, 1.422f)
                curveToRelative(-0.742f, 0.733f, -1.762f, 1.192f, -2.798f, 1.262f)
                curveToRelative(-0.09f, 0.006f, -0.181f, 0.009f, -0.271f, 0.009f)
                curveToRelative(-1.116f, 0.0f, -2.179f, -0.458f, -3.017f, -1.306f)
                lineToRelative(1.424f, -1.406f)
                curveToRelative(0.504f, 0.511f, 1.081f, 0.744f, 1.731f, 0.707f)
                curveToRelative(0.556f, -0.037f, 1.125f, -0.294f, 1.523f, -0.688f)
                close()
            }
        }
        .build()
        return _facePensive!!
    }

private var _facePensive: ImageVector? = null
