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

public val Icons.Filled.UserCoach: ImageVector
    get() {
        if (_userCoach != null) {
            return _userCoach!!
        }
        _userCoach = Builder(name = "UserCoach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -3.197f, 1.681f, -6.003f, 4.2f, -7.6f)
                lineToRelative(1.591f, 3.178f)
                curveToRelative(0.332f, 0.521f, 1.074f, 0.569f, 1.47f, 0.094f)
                lineToRelative(1.701f, -2.041f)
                lineToRelative(1.701f, 2.041f)
                curveToRelative(0.395f, 0.474f, 1.138f, 0.427f, 1.47f, -0.094f)
                lineToRelative(1.661f, -3.182f)
                curveToRelative(2.523f, 1.596f, 4.207f, 4.404f, 4.207f, 7.604f)
                close()
                moveTo(19.0f, 5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.815f)
                curveToRelative(-1.037f, -1.791f, -2.97f, -3.0f, -5.185f, -3.0f)
                curveToRelative(-2.967f, 0.0f, -5.431f, 2.167f, -5.91f, 5.0f)
                horizontalLineToRelative(12.91f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(2.967f, 0.0f, 5.431f, -2.167f, 5.91f, -5.0f)
                lineTo(6.09f, 7.0f)
                curveToRelative(0.478f, 2.833f, 2.942f, 5.0f, 5.91f, 5.0f)
                close()
            }
        }
        .build()
        return _userCoach!!
    }

private var _userCoach: ImageVector? = null
