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

public val Icons.Bold.PlugCircleCheck: ImageVector
    get() {
        if (_plugCircleCheck != null) {
            return _plugCircleCheck!!
        }
        _plugCircleCheck = Builder(name = "PlugCircleCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-4.15f)
                curveToRelative(-3.419f, -0.697f, -6.0f, -3.728f, -6.0f, -7.35f)
                verticalLineToRelative(-3.092f)
                curveToRelative(-0.581f, -0.207f, -1.0f, -0.756f, -1.0f, -1.408f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                lineTo(4.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.652f, -0.419f, 1.201f, -1.0f, 1.408f)
                verticalLineToRelative(1.592f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(21.712f, 16.298f)
                curveToRelative(-0.383f, -0.399f, -1.017f, -0.41f, -1.414f, -0.029f)
                lineToRelative(-2.713f, 2.624f)
                curveToRelative(-0.143f, 0.141f, -0.379f, 0.144f, -0.522f, 0.002f)
                lineToRelative(-1.354f, -1.331f)
                curveToRelative(-0.396f, -0.388f, -1.028f, -0.381f, -1.414f, 0.014f)
                curveToRelative(-0.387f, 0.395f, -0.381f, 1.027f, 0.014f, 1.414f)
                lineToRelative(1.354f, 1.332f)
                curveToRelative(0.46f, 0.449f, 1.062f, 0.674f, 1.663f, 0.674f)
                reflectiveCurveToRelative(1.201f, -0.225f, 1.653f, -0.671f)
                lineToRelative(2.703f, -2.614f)
                curveToRelative(0.398f, -0.383f, 0.411f, -1.016f, 0.029f, -1.414f)
                close()
            }
        }
        .build()
        return _plugCircleCheck!!
    }

private var _plugCircleCheck: ImageVector? = null
