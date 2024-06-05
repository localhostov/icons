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

public val Icons.Filled.UserPen: ImageVector
    get() {
        if (_userPen != null) {
            return _userPen!!
        }
        _userPen = Builder(name = "UserPen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(5.691f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(13.27f, 19.48f)
                curveToRelative(-0.813f, 0.813f, -1.27f, 1.915f, -1.27f, 3.065f)
                verticalLineToRelative(1.455f)
                horizontalLineToRelative(1.455f)
                curveToRelative(1.15f, 0.0f, 2.252f, -0.457f, 3.065f, -1.27f)
                lineToRelative(6.807f, -6.807f)
                curveToRelative(0.897f, -0.897f, 0.897f, -2.353f, 0.0f, -3.25f)
                curveToRelative(-0.897f, -0.897f, -2.353f, -0.897f, -3.25f, 0.0f)
                lineToRelative(-6.807f, 6.807f)
                close()
                moveTo(10.0f, 22.545f)
                curveToRelative(0.0f, -1.692f, 0.659f, -3.283f, 1.855f, -4.479f)
                lineToRelative(2.376f, -2.376f)
                curveToRelative(-1.476f, -1.06f, -3.279f, -1.691f, -5.231f, -1.691f)
                curveTo(4.038f, 14.0f, 0.0f, 18.038f, 0.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                lineTo(10.0f, 24.0f)
                verticalLineToRelative(-1.455f)
                close()
            }
        }
        .build()
        return _userPen!!
    }

private var _userPen: ImageVector? = null
