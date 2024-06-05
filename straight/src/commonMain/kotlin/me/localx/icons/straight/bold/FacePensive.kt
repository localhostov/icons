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

public val Icons.Bold.FacePensive: ImageVector
    get() {
        if (_facePensive != null) {
            return _facePensive!!
        }
        _facePensive = Builder(name = "FacePensive", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.037f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveTo(16.963f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 11.0f)
                reflectiveCurveToRelative(-2.0f, 1.0f, -3.0f, 1.0f)
                reflectiveCurveToRelative(-3.0f, -1.0f, -3.0f, -1.0f)
                curveToRelative(0.0f, 1.631f, 1.0f, 4.0f, 3.0f, 4.0f)
                reflectiveCurveToRelative(3.0f, -2.369f, 3.0f, -4.0f)
                close()
                moveTo(19.0f, 11.0f)
                reflectiveCurveToRelative(-2.0f, 1.0f, -3.0f, 1.0f)
                reflectiveCurveToRelative(-3.0f, -1.0f, -3.0f, -1.0f)
                curveToRelative(0.0f, 1.631f, 1.0f, 4.0f, 3.0f, 4.0f)
                reflectiveCurveToRelative(3.0f, -2.369f, 3.0f, -4.0f)
                close()
                moveTo(9.332f, 6.555f)
                lineToRelative(-1.664f, -1.109f)
                curveToRelative(-0.772f, 1.158f, -1.852f, 2.058f, -3.039f, 2.531f)
                lineToRelative(0.74f, 1.857f)
                curveToRelative(1.583f, -0.631f, 2.953f, -1.766f, 3.963f, -3.279f)
                close()
                moveTo(19.371f, 7.977f)
                curveToRelative(-1.188f, -0.474f, -2.267f, -1.373f, -3.039f, -2.531f)
                lineToRelative(-1.664f, 1.109f)
                curveToRelative(1.01f, 1.514f, 2.38f, 2.648f, 3.963f, 3.279f)
                lineToRelative(0.74f, -1.857f)
                close()
            }
        }
        .build()
        return _facePensive!!
    }

private var _facePensive: ImageVector? = null
