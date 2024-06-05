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

public val Icons.Filled.SkillUser: ImageVector
    get() {
        if (_skillUser != null) {
            return _skillUser!!
        }
        _skillUser = Builder(name = "SkillUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.999f, 0.0f)
                lineToRelative(-6.0f, 0.002f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.901f, -1.999f, 2.001f)
                lineToRelative(0.002f, 7.772f)
                curveToRelative(0.0f, 0.858f, 0.949f, 1.377f, 1.672f, 0.915f)
                lineToRelative(2.454f, -1.689f)
                horizontalLineToRelative(5.872f)
                lineTo(24.0f, 2.0f)
                curveTo(24.0f, 0.895f, 23.104f, 0.0f, 21.999f, 0.0f)
                close()
                moveTo(19.468f, 6.666f)
                curveToRelative(-0.459f, 0.474f, -1.22f, 0.471f, -1.675f, -0.007f)
                lineToRelative(-2.037f, -2.152f)
                lineToRelative(1.387f, -1.441f)
                lineToRelative(1.496f, 1.581f)
                lineToRelative(2.543f, -2.631f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.113f, 3.221f)
                close()
                moveTo(7.499f, 12.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                reflectiveCurveTo(4.468f, 1.0f, 7.5f, 1.0f)
                reflectiveCurveToRelative(5.5f, 2.467f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.468f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(14.999f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }
        .build()
        return _skillUser!!
    }

private var _skillUser: ImageVector? = null
