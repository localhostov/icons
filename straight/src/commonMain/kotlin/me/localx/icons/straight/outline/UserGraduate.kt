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

public val Icons.Outline.UserGraduate: ImageVector
    get() {
        if (_userGraduate != null) {
            return _userGraduate!!
        }
        _userGraduate = Builder(name = "UserGraduate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.943f, 4.5f)
                lineTo(13.722f, 0.39f)
                curveToRelative(-1.048f, -0.521f, -2.4f, -0.521f, -3.446f, 0.002f)
                lineTo(2.057f, 4.5f)
                lineToRelative(3.943f, 1.971f)
                verticalLineToRelative(2.529f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-2.529f)
                lineToRelative(2.0f, -1.0f)
                verticalLineToRelative(6.529f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-0.057f)
                close()
                moveTo(11.17f, 2.181f)
                curveToRelative(0.481f, -0.239f, 1.18f, -0.24f, 1.66f, 0.0f)
                lineToRelative(4.641f, 2.32f)
                lineToRelative(-4.642f, 2.319f)
                curveToRelative(-0.479f, 0.24f, -1.177f, 0.24f, -1.658f, 0.0f)
                lineToRelative(-4.641f, -2.319f)
                lineToRelative(4.639f, -2.319f)
                close()
                moveTo(16.001f, 9.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-1.529f)
                lineToRelative(2.276f, 1.138f)
                curveToRelative(0.524f, 0.262f, 1.125f, 0.393f, 1.725f, 0.393f)
                reflectiveCurveToRelative(1.2f, -0.131f, 1.723f, -0.393f)
                lineToRelative(2.276f, -1.138f)
                verticalLineToRelative(1.529f)
                close()
                moveTo(20.001f, 20.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.276f, -0.961f, -2.333f, -2.199f, -2.481f)
                lineToRelative(-3.787f, 4.543f)
                lineToRelative(-3.79f, -4.547f)
                curveToRelative(-1.25f, 0.138f, -2.225f, 1.2f, -2.225f, 2.485f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(0.648f)
                lineToRelative(2.866f, 3.438f)
                lineToRelative(2.865f, -3.438f)
                horizontalLineToRelative(0.62f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _userGraduate!!
    }

private var _userGraduate: ImageVector? = null
