package me.localx.icons.straight.filled

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

public val Icons.Filled.SkillAlt: ImageVector
    get() {
        if (_skillAlt != null) {
            return _skillAlt!!
        }
        _skillAlt = Builder(name = "SkillAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                reflectiveCurveTo(0.0f, 10.0f, 0.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                reflectiveCurveToRelative(0.0f, 8.0f, 0.0f, 8.0f)
                close()
                moveTo(10.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                reflectiveCurveToRelative(2.247f, 0.0f, 2.247f, 0.0f)
                curveToRelative(1.5f, 0.0f, 2.778f, -1.121f, 2.974f, -2.607f)
                lineToRelative(0.449f, -3.393f)
                horizontalLineToRelative(2.33f)
                verticalLineToRelative(-2.212f)
                reflectiveCurveToRelative(-0.724f, -1.647f, -0.724f, -1.647f)
                curveToRelative(-1.171f, -2.686f, -2.305f, -5.256f, -3.5f, -6.751f)
                curveTo(17.448f, 1.303f, 13.823f, -0.274f, 10.0f, 0.067f)
                verticalLineToRelative(19.933f)
                close()
                moveTo(8.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(0.0f, 8.0f)
                lineTo(0.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                close()
                moveTo(7.324f, 2.43f)
                lineToRelative(-1.398f, -1.43f)
                lineToRelative(-2.543f, 2.631f)
                lineToRelative(-1.496f, -1.581f)
                lineTo(0.5f, 3.491f)
                lineToRelative(2.037f, 2.152f)
                curveToRelative(0.455f, 0.478f, 1.216f, 0.481f, 1.675f, 0.007f)
                lineToRelative(3.113f, -3.221f)
                close()
            }
        }
        .build()
        return _skillAlt!!
    }

private var _skillAlt: ImageVector? = null
