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

public val Icons.Bold.EndlessLoop: ImageVector
    get() {
        if (_endlessLoop != null) {
            return _endlessLoop!!
        }
        _endlessLoop = Builder(name = "EndlessLoop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-4.136f, 0.0f, -7.5f, -3.364f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.364f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(3.849f)
                lineToRelative(-3.914f, -3.943f)
                lineToRelative(2.13f, -2.113f)
                lineToRelative(5.677f, 5.721f)
                curveToRelative(1.011f, 1.011f, 1.011f, 2.661f, -0.004f, 3.676f)
                lineToRelative(-5.673f, 5.717f)
                lineToRelative(-2.13f, -2.113f)
                lineToRelative(3.914f, -3.943f)
                horizontalLineToRelative(-3.849f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -1.953f, -1.258f, -3.602f, -3.0f, -4.224f)
                verticalLineToRelative(-3.125f)
                curveToRelative(3.419f, 0.697f, 6.0f, 3.727f, 6.0f, 7.349f)
                close()
            }
        }
        .build()
        return _endlessLoop!!
    }

private var _endlessLoop: ImageVector? = null
