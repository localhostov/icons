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

public val Icons.Outline.FaceSleeping: ImageVector
    get() {
        if (_faceSleeping != null) {
            return _faceSleeping!!
        }
        _faceSleeping = Builder(name = "FaceSleeping", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.3f, 8.0f)
                curveToRelative(0.445f, 1.253f, 0.7f, 2.596f, 0.7f, 4.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                curveTo(0.0f, 6.066f, 4.334f, 1.137f, 10.0f, 0.181f)
                lineTo(10.0f, 2.202f)
                curveTo(5.441f, 3.131f, 2.0f, 7.171f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -1.422f, -0.303f, -2.774f, -0.841f, -4.0f)
                horizontalLineToRelative(2.141f)
                close()
                moveTo(24.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(19.0f, 2.0f)
                horizontalLineToRelative(2.086f)
                lineToRelative(-2.086f, 2.086f)
                verticalLineToRelative(1.914f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.086f)
                lineToRelative(2.086f, -2.086f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(17.0f, 6.0f)
                horizontalLineToRelative(-2.086f)
                lineToRelative(2.086f, -2.086f)
                verticalLineToRelative(-1.914f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.086f)
                lineToRelative(-2.086f, 2.086f)
                verticalLineToRelative(1.914f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.203f, 11.289f)
                lineToRelative(-1.406f, 1.422f)
                curveToRelative(0.792f, 0.784f, 1.913f, 1.265f, 3.073f, 1.265f)
                curveToRelative(1.044f, 0.0f, 2.12f, -0.389f, 3.019f, -1.296f)
                lineToRelative(-1.422f, -1.407f)
                curveToRelative(-1.189f, 1.205f, -2.604f, 0.669f, -3.264f, 0.017f)
                close()
                moveTo(14.502f, 11.268f)
                lineToRelative(-1.422f, 1.406f)
                curveToRelative(0.897f, 0.908f, 1.973f, 1.297f, 3.017f, 1.297f)
                curveToRelative(1.158f, 0.0f, 2.277f, -0.479f, 3.068f, -1.261f)
                lineToRelative(-1.406f, -1.423f)
                curveToRelative(-0.658f, 0.652f, -2.067f, 1.183f, -3.257f, -0.02f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _faceSleeping!!
    }

private var _faceSleeping: ImageVector? = null
