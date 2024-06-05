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

public val Icons.Bold.Mound: ImageVector
    get() {
        if (_mound != null) {
            return _mound!!
        }
        _mound = Builder(name = "Mound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.79f, 10.425f)
                curveToRelative(-1.182f, -2.139f, -3.346f, -3.415f, -5.79f, -3.415f)
                reflectiveCurveToRelative(-4.607f, 1.276f, -5.79f, 3.415f)
                lineTo(0.0f, 21.664f)
                verticalLineToRelative(2.387f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.387f)
                lineToRelative(-6.21f, -11.239f)
                close()
                moveTo(3.767f, 21.051f)
                lineToRelative(5.07f, -9.174f)
                curveToRelative(0.646f, -1.168f, 1.828f, -1.866f, 3.164f, -1.866f)
                reflectiveCurveToRelative(2.518f, 0.698f, 3.164f, 1.866f)
                lineToRelative(5.07f, 9.174f)
                horizontalLineTo(3.767f)
                close()
            }
        }
        .build()
        return _mound!!
    }

private var _mound: ImageVector? = null
