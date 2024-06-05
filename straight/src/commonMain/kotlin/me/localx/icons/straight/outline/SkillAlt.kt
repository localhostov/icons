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

public val Icons.Outline.SkillAlt: ImageVector
    get() {
        if (_skillAlt != null) {
            return _skillAlt!!
        }
        _skillAlt = Builder(name = "SkillAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 22.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.0f)
                reflectiveCurveToRelative(4.247f, 0.0f, 4.247f, 0.0f)
                curveToRelative(0.5f, 0.0f, 0.926f, -0.373f, 0.991f, -0.869f)
                lineToRelative(0.68f, -5.131f)
                horizontalLineToRelative(1.99f)
                reflectiveCurveToRelative(-0.465f, -1.06f, -0.465f, -1.06f)
                curveToRelative(-1.075f, -2.465f, -2.21f, -5.043f, -3.244f, -6.322f)
                curveToRelative(-1.939f, -2.591f, -4.989f, -3.894f, -8.199f, -3.549f)
                lineTo(10.0f, 0.067f)
                curveToRelative(3.823f, -0.341f, 7.448f, 1.235f, 9.776f, 4.323f)
                curveToRelative(1.195f, 1.494f, 2.329f, 4.065f, 3.5f, 6.751f)
                lineToRelative(0.724f, 1.647f)
                verticalLineToRelative(2.212f)
                reflectiveCurveToRelative(-2.33f, 0.0f, -2.33f, 0.0f)
                lineToRelative(-0.449f, 3.393f)
                curveToRelative(-0.195f, 1.486f, -1.474f, 2.607f, -2.974f, 2.607f)
                horizontalLineToRelative(-2.247f)
                verticalLineToRelative(3.0f)
                reflectiveCurveToRelative(-13.0f, 0.0f, -13.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                reflectiveCurveToRelative(2.0f, 0.0f, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(0.0f, 8.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(8.0f)
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
                moveTo(8.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                reflectiveCurveTo(0.0f, 10.0f, 0.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                reflectiveCurveToRelative(0.0f, 8.0f, 0.0f, 8.0f)
                close()
                moveTo(6.0f, 12.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _skillAlt!!
    }

private var _skillAlt: ImageVector? = null
