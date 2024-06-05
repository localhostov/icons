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

public val Icons.Filled.UserGraduate: ImageVector
    get() {
        if (_userGraduate != null) {
            return _userGraduate!!
        }
        _userGraduate = Builder(name = "UserGraduate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 22.5f)
                verticalLineToRelative(1.5f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(0.181f)
                lineToRelative(3.334f, 4.0f)
                lineToRelative(3.333f, -4.0f)
                horizontalLineToRelative(0.152f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(13.722f, 0.391f)
                curveToRelative(-1.047f, -0.521f, -2.399f, -0.521f, -3.446f, 0.0f)
                lineTo(2.057f, 4.5f)
                lineToRelative(8.219f, 4.109f)
                curveToRelative(0.524f, 0.262f, 1.124f, 0.393f, 1.724f, 0.393f)
                reflectiveCurveToRelative(1.2f, -0.131f, 1.724f, -0.393f)
                lineToRelative(6.276f, -3.137f)
                verticalLineToRelative(6.529f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.5f)
                lineTo(13.722f, 0.391f)
                close()
                moveTo(18.0f, 8.707f)
                lineToRelative(-3.382f, 1.691f)
                curveToRelative(-0.788f, 0.395f, -1.694f, 0.604f, -2.618f, 0.604f)
                reflectiveCurveToRelative(-1.827f, -0.208f, -2.617f, -0.604f)
                lineToRelative(-3.383f, -1.691f)
                verticalLineToRelative(1.293f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-1.293f)
                close()
            }
        }
        .build()
        return _userGraduate!!
    }

private var _userGraduate: ImageVector? = null
