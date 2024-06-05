package me.localx.icons.rounded.bold

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

public val Icons.Bold.SadCry: ImageVector
    get() {
        if (_sadCry != null) {
            return _sadCry!!
        }
        _sadCry = Builder(name = "SadCry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                curveToRelative(-0.052f, 3.948f, -3.948f, 3.948f, -4.0f, 0.0f)
                curveTo(10.052f, 13.052f, 13.948f, 13.052f, 14.0f, 17.0f)
                close()
                moveTo(19.0f, 22.5f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(8.0f, 22.5f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(9.807f, 11.969f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.161f, -1.776f)
                curveToRelative(-0.888f, -4.217f, -5.051f, -4.212f, -5.936f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.936f, 0.614f)
                curveToRelative(0.01f, -0.046f, 0.02f, -0.09f, 0.032f, -0.134f)
                curveToRelative(0.012f, 0.044f, 0.022f, 0.088f, 0.032f, 0.134f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 12.0f)
                arcTo(1.555f, 1.555f, 0.0f, false, false, 9.807f, 11.969f)
                close()
                moveTo(17.807f, 11.969f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.161f, -1.776f)
                curveToRelative(-0.888f, -4.217f, -5.051f, -4.212f, -5.936f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.936f, 0.614f)
                curveToRelative(0.01f, -0.046f, 0.02f, -0.09f, 0.032f, -0.134f)
                curveToRelative(0.012f, 0.044f, 0.022f, 0.088f, 0.032f, 0.134f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 12.0f)
                arcTo(1.555f, 1.555f, 0.0f, false, false, 17.807f, 11.969f)
                close()
                moveTo(23.507f, 15.429f)
                arcTo(12.058f, 12.058f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(12.058f, 12.058f, 0.0f, false, false, 0.5f, 15.429f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.875f, -0.858f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 17.254f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.875f, 0.858f)
                close()
                moveTo(12.571f, 23.986f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.142f, -3.0f)
                curveToRelative(-0.284f, 0.014f, -0.574f, 0.014f, -0.858f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.142f, 3.0f)
                curveToRelative(0.189f, 0.009f, 0.38f, 0.014f, 0.571f, 0.014f)
                reflectiveCurveTo(12.382f, 24.0f, 12.571f, 23.986f)
                close()
            }
        }
        .build()
        return _sadCry!!
    }

private var _sadCry: ImageVector? = null
