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
                moveToRelative(21.0f, 12.0f)
                curveToRelative(0.0f, -0.537f, -0.051f, -1.082f, -0.153f, -1.625f)
                lineToRelative(3.052f, -1.755f)
                lineToRelative(-2.99f, -5.202f)
                lineToRelative(-3.051f, 1.754f)
                curveToRelative(-0.841f, -0.721f, -1.81f, -1.28f, -2.857f, -1.649f)
                lineTo(15.001f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.522f)
                curveToRelative(-1.047f, 0.37f, -2.016f, 0.929f, -2.857f, 1.649f)
                lineToRelative(-3.05f, -1.754f)
                lineTo(0.102f, 8.62f)
                lineToRelative(3.052f, 1.755f)
                curveToRelative(-0.102f, 0.544f, -0.153f, 1.088f, -0.153f, 1.625f)
                reflectiveCurveToRelative(0.051f, 1.082f, 0.153f, 1.625f)
                lineTo(0.102f, 15.38f)
                lineToRelative(2.991f, 5.202f)
                lineToRelative(3.05f, -1.754f)
                curveToRelative(0.841f, 0.721f, 1.81f, 1.28f, 2.857f, 1.649f)
                verticalLineToRelative(3.522f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.522f)
                curveToRelative(1.047f, -0.37f, 2.016f, -0.929f, 2.857f, -1.649f)
                lineToRelative(3.051f, 1.754f)
                lineToRelative(2.99f, -5.202f)
                lineToRelative(-3.052f, -1.755f)
                curveToRelative(0.102f, -0.544f, 0.153f, -1.088f, 0.153f, -1.625f)
                close()
                moveTo(11.495f, 7.051f)
                curveToRelative(0.169f, -0.017f, 0.332f, -0.051f, 0.505f, -0.051f)
                reflectiveCurveToRelative(0.336f, 0.034f, 0.504f, 0.051f)
                curveToRelative(1.139f, 0.233f, 1.995f, 1.241f, 1.995f, 2.449f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.208f, 0.856f, -2.215f, 1.995f, -2.449f)
                close()
                moveTo(14.0f, 16.576f)
                reflectiveCurveToRelative(-0.5f, 0.424f, -2.0f, 0.424f)
                reflectiveCurveToRelative(-2.0f, -0.424f, -2.0f, -0.424f)
                curveToRelative(-0.8f, -0.351f, -1.481f, -0.912f, -1.997f, -1.604f)
                curveToRelative(0.015f, -1.09f, 0.904f, -1.972f, 1.997f, -1.972f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.094f, 0.0f, 1.982f, 0.882f, 1.997f, 1.972f)
                curveToRelative(-0.516f, 0.692f, -1.197f, 1.253f, -1.997f, 1.604f)
                close()
            }
        }
        .build()
        return _userSkillGear!!
    }

private var _userSkillGear: ImageVector? = null
