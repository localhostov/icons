package me.localx.icons.straight.bold

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

public val Icons.Bold.SkillAlt: ImageVector
    get() {
        if (_skillAlt != null) {
            return _skillAlt!!
        }
        _skillAlt = Builder(name = "SkillAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 0.0f)
                lineTo(0.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                lineTo(8.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(4.212f, 5.651f)
                curveToRelative(-0.459f, 0.474f, -1.22f, 0.471f, -1.675f, -0.007f)
                lineTo(0.5f, 3.491f)
                lineToRelative(1.387f, -1.441f)
                lineToRelative(1.496f, 1.581f)
                lineTo(5.926f, 1.0f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.113f, 3.221f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(5.995f, 21.0f)
                horizontalLineToRelative(7.005f)
                reflectiveCurveToRelative(0.0f, -3.0f, 0.0f, -3.0f)
                horizontalLineToRelative(4.889f)
                curveToRelative(0.248f, 0.0f, 0.462f, -0.186f, 0.495f, -0.432f)
                lineToRelative(0.703f, -5.568f)
                horizontalLineToRelative(1.557f)
                curveToRelative(-0.063f, -0.146f, -0.127f, -0.292f, -0.19f, -0.438f)
                curveToRelative(-0.991f, -2.284f, -2.021f, -4.145f, -2.976f, -5.327f)
                curveToRelative(-1.746f, -2.331f, -4.588f, -3.508f, -7.478f, -3.153f)
                lineTo(10.0f, 0.075f)
                curveToRelative(3.835f, -0.349f, 7.556f, 1.26f, 9.844f, 4.317f)
                curveToRelative(1.178f, 1.456f, 2.24f, 3.394f, 3.361f, 5.975f)
                curveToRelative(0.222f, 0.512f, 0.795f, 1.815f, 0.795f, 1.815f)
                verticalLineToRelative(2.818f)
                horizontalLineToRelative(-2.298f)
                reflectiveCurveToRelative(-0.346f, 2.978f, -0.346f, 2.978f)
                curveToRelative(-0.238f, 1.723f, -1.729f, 3.022f, -3.468f, 3.022f)
                horizontalLineToRelative(-1.894f)
                reflectiveCurveToRelative(0.0f, 3.0f, 0.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.995f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _skillAlt!!
    }

private var _skillAlt: ImageVector? = null
