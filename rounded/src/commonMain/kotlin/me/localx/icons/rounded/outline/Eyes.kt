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

public val Icons.Outline.Eyes: ImageVector
    get() {
        if (_eyes != null) {
            return _eyes!!
        }
        _eyes = Builder(name = "Eyes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 0.0f)
                curveToRelative(-2.346f, 0.0f, -4.359f, 2.19f, -5.5f, 5.54f)
                curveTo(10.859f, 2.19f, 8.846f, 0.0f, 6.5f, 0.0f)
                curveTo(2.855f, 0.0f, 0.0f, 5.271f, 0.0f, 12.0f)
                reflectiveCurveToRelative(2.855f, 12.0f, 6.5f, 12.0f)
                curveToRelative(2.346f, 0.0f, 4.359f, -2.19f, 5.5f, -5.54f)
                curveToRelative(1.141f, 3.35f, 3.154f, 5.54f, 5.5f, 5.54f)
                curveToRelative(3.645f, 0.0f, 6.5f, -5.271f, 6.5f, -12.0f)
                reflectiveCurveTo(21.145f, 0.0f, 17.5f, 0.0f)
                close()
                moveTo(6.5f, 22.0f)
                curveToRelative(-1.48f, 0.0f, -3.075f, -1.988f, -3.911f, -5.178f)
                curveToRelative(0.283f, 0.111f, 0.589f, 0.178f, 0.911f, 0.178f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.559f, 0.0f, -1.07f, 0.191f, -1.487f, 0.502f)
                curveToRelative(-0.004f, -0.168f, -0.013f, -0.331f, -0.013f, -0.502f)
                curveTo(2.0f, 6.106f, 4.372f, 2.0f, 6.5f, 2.0f)
                reflectiveCurveToRelative(4.5f, 4.106f, 4.5f, 10.0f)
                reflectiveCurveToRelative(-2.372f, 10.0f, -4.5f, 10.0f)
                close()
                moveTo(17.5f, 22.0f)
                curveToRelative(-1.48f, 0.0f, -3.075f, -1.988f, -3.911f, -5.178f)
                curveToRelative(0.283f, 0.111f, 0.589f, 0.178f, 0.911f, 0.178f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.559f, 0.0f, -1.07f, 0.191f, -1.487f, 0.502f)
                curveToRelative(-0.004f, -0.168f, -0.013f, -0.331f, -0.013f, -0.502f)
                curveToRelative(0.0f, -5.894f, 2.372f, -10.0f, 4.5f, -10.0f)
                reflectiveCurveToRelative(4.5f, 4.106f, 4.5f, 10.0f)
                reflectiveCurveToRelative(-2.372f, 10.0f, -4.5f, 10.0f)
                close()
            }
        }
        .build()
        return _eyes!!
    }

private var _eyes: ImageVector? = null
