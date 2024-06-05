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

public val Icons.Bold.Heat: ImageVector
    get() {
        if (_heat != null) {
            return _heat!!
        }
        _heat = Builder(name = "Heat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.44f, -1.921f)
                curveToRelative(0.119f, -0.41f, 0.253f, -0.792f, 0.386f, -1.168f)
                curveToRelative(1.221f, -2.468f, 0.157f, -5.931f, -1.192f, -7.648f)
                arcTo(11.872f, 11.872f, 0.0f, false, true, 17.4f, 0.838f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.1f, 2.162f)
                arcToRelative(8.866f, 8.866f, 0.0f, false, false, 0.649f, 9.429f)
                curveToRelative(1.766f, 2.162f, 3.114f, 7.121f, 1.529f, 10.319f)
                curveToRelative(-0.114f, 0.325f, -0.231f, 0.655f, -0.336f, 1.011f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 24.0f)
                close()
                moveTo(13.5f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.44f, -1.921f)
                curveToRelative(0.119f, -0.41f, 0.253f, -0.792f, 0.386f, -1.168f)
                curveToRelative(1.221f, -2.468f, 0.157f, -5.931f, -1.192f, -7.648f)
                arcTo(11.872f, 11.872f, 0.0f, false, true, 10.4f, 0.838f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.1f, 2.162f)
                arcToRelative(8.866f, 8.866f, 0.0f, false, false, 0.649f, 9.429f)
                curveToRelative(1.766f, 2.162f, 3.114f, 7.121f, 1.529f, 10.319f)
                curveToRelative(-0.114f, 0.325f, -0.231f, 0.655f, -0.336f, 1.011f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 24.0f)
                close()
                moveTo(6.5f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.44f, -1.921f)
                curveToRelative(0.119f, -0.41f, 0.253f, -0.792f, 0.386f, -1.168f)
                curveToRelative(1.221f, -2.468f, 0.157f, -5.931f, -1.192f, -7.648f)
                arcTo(11.872f, 11.872f, 0.0f, false, true, 3.4f, 0.838f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.1f, 2.162f)
                arcToRelative(8.866f, 8.866f, 0.0f, false, false, 0.649f, 9.429f)
                curveTo(8.512f, 13.753f, 9.86f, 18.712f, 8.275f, 21.91f)
                curveToRelative(-0.114f, 0.325f, -0.231f, 0.655f, -0.336f, 1.011f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 24.0f)
                close()
            }
        }
        .build()
        return _heat!!
    }

private var _heat: ImageVector? = null
