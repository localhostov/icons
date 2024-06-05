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

public val Icons.Outline.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(name = "Pills", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 11.0f)
                curveToRelative(-3.584f, 0.0f, -6.5f, 2.916f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.916f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.916f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.916f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 13.0f)
                curveToRelative(0.879f, 0.0f, 1.701f, 0.254f, 2.394f, 0.692f)
                lineToRelative(-6.203f, 6.203f)
                curveToRelative(-0.438f, -0.694f, -0.692f, -1.515f, -0.692f, -2.394f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(17.5f, 22.0f)
                curveToRelative(-0.879f, 0.0f, -1.701f, -0.254f, -2.394f, -0.692f)
                lineToRelative(6.203f, -6.203f)
                curveToRelative(0.438f, 0.694f, 0.692f, 1.515f, 0.692f, 2.394f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(2.0f, 13.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.722f, 0.0f, 1.409f, -0.165f, 2.044f, -0.49f)
                curveToRelative(0.493f, -0.249f, 1.095f, -0.057f, 1.346f, 0.436f)
                curveToRelative(0.251f, 0.491f, 0.057f, 1.094f, -0.435f, 1.346f)
                curveToRelative(-0.907f, 0.464f, -1.929f, 0.709f, -2.956f, 0.709f)
                curveTo(2.916f, 24.0f, 0.0f, 21.084f, 0.0f, 17.5f)
                lineTo(0.0f, 6.5f)
                curveTo(0.0f, 2.916f, 2.916f, 0.0f, 6.5f, 0.0f)
                reflectiveCurveToRelative(6.5f, 2.916f, 6.5f, 6.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveTo(2.0f, 4.019f, 2.0f, 6.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(2.0f, 13.0f)
                close()
            }
        }
        .build()
        return _pills!!
    }

private var _pills: ImageVector? = null
