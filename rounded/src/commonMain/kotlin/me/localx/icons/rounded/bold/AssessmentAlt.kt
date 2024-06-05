package me.localx.icons.rounded.bold

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

public val Icons.Bold.AssessmentAlt: ImageVector
    get() {
        if (_assessmentAlt != null) {
            return _assessmentAlt!!
        }
        _assessmentAlt = Builder(name = "AssessmentAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.361f, 11.725f)
                lineToRelative(-6.016f, 6.016f)
                curveToRelative(-0.806f, 0.806f, -1.9f, 1.259f, -3.041f, 1.259f)
                horizontalLineToRelative(-1.304f)
                verticalLineToRelative(-1.304f)
                curveToRelative(0.0f, -1.14f, 0.453f, -2.234f, 1.259f, -3.041f)
                lineToRelative(6.016f, -6.016f)
                curveToRelative(0.852f, -0.852f, 2.234f, -0.852f, 3.086f, 0.0f)
                reflectiveCurveToRelative(0.852f, 2.234f, 0.0f, 3.086f)
                close()
                moveTo(6.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveTo(2.686f, 0.0f, 6.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.686f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(5.326f, 8.997f)
                curveToRelative(0.602f, 0.0f, 1.201f, -0.225f, 1.653f, -0.671f)
                lineToRelative(2.703f, -2.614f)
                curveToRelative(0.398f, -0.383f, 0.411f, -1.016f, 0.029f, -1.414f)
                curveToRelative(-0.383f, -0.399f, -1.017f, -0.41f, -1.414f, -0.029f)
                lineToRelative(-2.713f, 2.624f)
                curveToRelative(-0.143f, 0.141f, -0.379f, 0.144f, -0.522f, 0.002f)
                lineToRelative(-1.354f, -1.331f)
                curveToRelative(-0.396f, -0.388f, -1.028f, -0.381f, -1.414f, 0.014f)
                curveToRelative(-0.387f, 0.395f, -0.381f, 1.027f, 0.014f, 1.414f)
                lineToRelative(1.354f, 1.332f)
                curveToRelative(0.46f, 0.449f, 1.062f, 0.674f, 1.663f, 0.674f)
                close()
                moveTo(15.5f, 9.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(19.5f, 18.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _assessmentAlt!!
    }

private var _assessmentAlt: ImageVector? = null
