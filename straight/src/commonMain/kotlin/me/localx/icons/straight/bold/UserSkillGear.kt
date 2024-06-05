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

public val Icons.Bold.UserSkillGear: ImageVector
    get() {
        if (_userSkillGear != null) {
            return _userSkillGear!!
        }
        _userSkillGear = Builder(name = "UserSkillGear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 9.5f)
                curveToRelative(0.0f, -1.208f, 0.856f, -2.215f, 1.995f, -2.449f)
                curveToRelative(0.169f, -0.017f, 0.332f, -0.051f, 0.505f, -0.051f)
                reflectiveCurveToRelative(0.336f, 0.034f, 0.504f, 0.051f)
                curveToRelative(1.139f, 0.233f, 1.995f, 1.241f, 1.995f, 2.449f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(21.304f, 15.64f)
                lineToRelative(1.838f, 1.061f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(-1.839f, -1.062f)
                curveToRelative(-1.537f, 1.919f, -3.765f, 3.253f, -6.304f, 3.638f)
                verticalLineToRelative(2.125f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.125f)
                curveToRelative(-2.539f, -0.385f, -4.767f, -1.719f, -6.304f, -3.638f)
                lineToRelative(-1.839f, 1.062f)
                lineToRelative(-1.5f, -2.598f)
                lineToRelative(1.838f, -1.061f)
                curveToRelative(-0.444f, -1.13f, -0.696f, -2.355f, -0.696f, -3.64f)
                reflectiveCurveToRelative(0.252f, -2.51f, 0.696f, -3.64f)
                lineToRelative(-1.838f, -1.061f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(1.839f, 1.062f)
                curveToRelative(1.537f, -1.919f, 3.765f, -3.253f, 6.304f, -3.638f)
                lineTo(10.499f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.125f)
                curveToRelative(2.539f, 0.385f, 4.767f, 1.719f, 6.304f, 3.638f)
                lineToRelative(1.839f, -1.062f)
                lineToRelative(1.5f, 2.598f)
                lineToRelative(-1.838f, 1.061f)
                curveToRelative(0.444f, 1.13f, 0.696f, 2.355f, 0.696f, 3.64f)
                reflectiveCurveToRelative(-0.252f, 2.51f, -0.696f, 3.64f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.095f, 0.0f, -1.982f, 0.881f, -1.997f, 1.972f)
                curveToRelative(0.912f, 1.223f, 2.357f, 2.028f, 3.997f, 2.028f)
                reflectiveCurveToRelative(3.085f, -0.804f, 3.997f, -2.028f)
                curveToRelative(-0.015f, -1.091f, -0.902f, -1.972f, -1.997f, -1.972f)
                close()
            }
        }
        .build()
        return _userSkillGear!!
    }

private var _userSkillGear: ImageVector? = null
