package me.localx.icons.rounded.filled

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

public val Icons.Filled.UserSkillGear: ImageVector
    get() {
        if (_userSkillGear != null) {
            return _userSkillGear!!
        }
        _userSkillGear = Builder(name = "UserSkillGear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.298f, 13.885f)
                lineToRelative(-0.451f, -0.26f)
                curveToRelative(0.102f, -0.544f, 0.153f, -1.088f, 0.153f, -1.625f)
                reflectiveCurveToRelative(-0.051f, -1.082f, -0.153f, -1.625f)
                lineToRelative(0.451f, -0.26f)
                curveToRelative(1.436f, -0.826f, 1.931f, -2.66f, 1.105f, -4.096f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.826f, -1.437f, -2.659f, -1.932f, -4.096f, -1.106f)
                lineToRelative(-0.45f, 0.259f)
                curveToRelative(-0.841f, -0.721f, -1.81f, -1.28f, -2.857f, -1.649f)
                verticalLineToRelative(-0.522f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(0.522f)
                curveToRelative(-1.047f, 0.37f, -2.016f, 0.929f, -2.857f, 1.649f)
                lineToRelative(-0.45f, -0.259f)
                curveToRelative(-1.436f, -0.826f, -3.27f, -0.331f, -4.096f, 1.105f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.826f, 1.437f, -0.331f, 3.271f, 1.105f, 4.097f)
                lineToRelative(0.451f, 0.259f)
                curveToRelative(-0.102f, 0.544f, -0.153f, 1.088f, -0.153f, 1.625f)
                reflectiveCurveToRelative(0.051f, 1.082f, 0.153f, 1.625f)
                lineToRelative(-0.451f, 0.259f)
                curveToRelative(-1.436f, 0.826f, -1.931f, 2.66f, -1.105f, 4.096f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.826f, 1.437f, 2.66f, 1.932f, 4.096f, 1.106f)
                lineToRelative(0.45f, -0.259f)
                curveToRelative(0.841f, 0.721f, 1.81f, 1.28f, 2.857f, 1.649f)
                verticalLineToRelative(0.522f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-0.522f)
                curveToRelative(1.047f, -0.37f, 2.016f, -0.929f, 2.857f, -1.649f)
                lineToRelative(0.45f, 0.259f)
                curveToRelative(1.436f, 0.826f, 3.27f, 0.331f, 4.096f, -1.106f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.826f, -1.437f, 0.331f, -3.27f, -1.105f, -4.096f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.441f, 0.0f, -2.72f, -0.629f, -3.627f, -1.609f)
                curveToRelative(0.617f, -1.402f, 1.995f, -2.391f, 3.627f, -2.391f)
                reflectiveCurveToRelative(3.01f, 0.989f, 3.628f, 2.392f)
                curveToRelative(-0.907f, 0.98f, -2.187f, 1.608f, -3.628f, 1.608f)
                close()
            }
        }
        .build()
        return _userSkillGear!!
    }

private var _userSkillGear: ImageVector? = null
