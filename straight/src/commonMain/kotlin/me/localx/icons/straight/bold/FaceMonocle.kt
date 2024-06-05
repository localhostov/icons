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

public val Icons.Bold.FaceMonocle: ImageVector
    get() {
        if (_faceMonocle != null) {
            return _faceMonocle!!
        }
        _faceMonocle = Builder(name = "FaceMonocle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(3.187f, 0.0f, 5.625f, 1.234f, 7.248f, 3.668f)
                lineToRelative(-2.496f, 1.664f)
                curveToRelative(-1.555f, -2.332f, -3.877f, -2.332f, -4.752f, -2.332f)
                close()
                moveTo(9.0f, 9.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(19.0f, 10.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(16.0f, 14.743f)
                curveToRelative(-0.469f, 0.166f, -0.974f, 0.257f, -1.5f, 0.257f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(16.0f, 10.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(0.683f, 0.0f, 1.348f, -0.071f, 2.0f, -0.181f)
                verticalLineToRelative(-3.051f)
                curveToRelative(-0.644f, 0.147f, -1.312f, 0.232f, -2.0f, 0.232f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                verticalLineToRelative(7.911f)
                curveToRelative(1.861f, -2.115f, 3.0f, -4.879f, 3.0f, -7.911f)
                close()
            }
        }
        .build()
        return _faceMonocle!!
    }

private var _faceMonocle: ImageVector? = null
