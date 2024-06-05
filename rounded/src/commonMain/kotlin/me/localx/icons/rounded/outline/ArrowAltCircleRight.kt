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

public val Icons.Outline.ArrowAltCircleRight: ImageVector
    get() {
        if (_arrowAltCircleRight != null) {
            return _arrowAltCircleRight!!
        }
        _arrowAltCircleRight = Builder(name = "ArrowAltCircleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(17.768f, 11.448f)
                curveToRelative(0.309f, 0.305f, 0.309f, 0.799f, 0.0f, 1.104f)
                lineToRelative(-4.418f, 4.361f)
                curveToRelative(-0.498f, 0.492f, -1.35f, 0.143f, -1.35f, -0.552f)
                verticalLineToRelative(-3.361f)
                lineTo(7.0f, 13.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.361f)
                curveToRelative(0.0f, -0.695f, 0.852f, -1.044f, 1.35f, -0.552f)
                lineToRelative(4.418f, 4.361f)
                close()
            }
        }
        .build()
        return _arrowAltCircleRight!!
    }

private var _arrowAltCircleRight: ImageVector? = null
