package me.localx.icons.rounded.outline

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

public val Icons.Outline.InsertButtonCircle: ImageVector
    get() {
        if (_insertButtonCircle != null) {
            return _insertButtonCircle!!
        }
        _insertButtonCircle = Builder(name = "InsertButtonCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(7.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(8.0f, 9.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(15.358f, 11.0f)
                horizontalLineToRelative(-6.717f)
                curveToRelative(-0.743f, 0.0f, -1.411f, 0.412f, -1.745f, 1.075f)
                curveToRelative(-0.333f, 0.664f, -0.266f, 1.446f, 0.203f, 2.076f)
                lineToRelative(3.332f, 4.105f)
                curveToRelative(0.372f, 0.501f, 0.944f, 0.789f, 1.568f, 0.789f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.625f, 0.0f, 1.196f, -0.288f, 1.541f, -0.755f)
                lineToRelative(3.386f, -4.173f)
                curveToRelative(0.442f, -0.596f, 0.51f, -1.378f, 0.176f, -2.042f)
                curveToRelative(-0.334f, -0.663f, -1.002f, -1.075f, -1.745f, -1.075f)
                close()
                moveTo(8.641f, 13.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(12.01f, 17.03f)
                lineToRelative(-3.307f, -4.03f)
                horizontalLineToRelative(6.556f)
                lineToRelative(-3.249f, 4.03f)
                close()
            }
        }
        .build()
        return _insertButtonCircle!!
    }

private var _insertButtonCircle: ImageVector? = null
