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

public val Icons.Outline.ArrowLeftFromArc: ImageVector
    get() {
        if (_arrowLeftFromArc != null) {
            return _arrowLeftFromArc!!
        }
        _arrowLeftFromArc = Builder(name = "ArrowLeftFromArc", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(2.462f, 13.116f)
                curveToRelative(-0.036f, -0.036f, -0.064f, -0.078f, -0.096f, -0.116f)
                horizontalLineToRelative(13.633f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(2.367f, 11.0f)
                curveToRelative(0.033f, -0.04f, 0.061f, -0.082f, 0.098f, -0.119f)
                lineToRelative(5.134f, -5.177f)
                curveToRelative(0.389f, -0.392f, 0.386f, -1.025f, -0.006f, -1.414f)
                curveToRelative(-0.392f, -0.39f, -1.026f, -0.387f, -1.414f, 0.006f)
                lineTo(1.047f, 9.47f)
                curveToRelative(-0.675f, 0.677f, -1.047f, 1.575f, -1.047f, 2.53f)
                reflectiveCurveToRelative(0.372f, 1.854f, 1.045f, 2.527f)
                lineToRelative(5.134f, 5.177f)
                curveToRelative(0.195f, 0.197f, 0.453f, 0.296f, 0.71f, 0.296f)
                curveToRelative(0.254f, 0.0f, 0.509f, -0.097f, 0.704f, -0.29f)
                curveToRelative(0.392f, -0.389f, 0.395f, -1.022f, 0.006f, -1.414f)
                lineToRelative(-5.137f, -5.18f)
                close()
            }
        }
        .build()
        return _arrowLeftFromArc!!
    }

private var _arrowLeftFromArc: ImageVector? = null
