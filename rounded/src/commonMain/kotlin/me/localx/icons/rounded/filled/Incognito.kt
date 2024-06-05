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

public val Icons.Filled.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.043f, 8.071f)
                curveTo(4.5f, 0.566f, 8.706f, 0.026f, 8.9f, 0.006f)
                arcTo(0.924f, 0.924f, 0.0f, false, true, 9.0f, 0.0f)
                arcToRelative(4.511f, 4.511f, 0.0f, false, true, 2.415f, 0.817f)
                arcToRelative(1.015f, 1.015f, 0.0f, false, false, 1.171f, 0.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, true, 15.0f, 0.0f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, true, 0.105f, 0.006f)
                curveToRelative(0.189f, 0.02f, 4.4f, 0.56f, 4.852f, 8.065f)
                arcTo(0.734f, 0.734f, 0.0f, false, true, 19.5f, 8.8f)
                arcTo(20.312f, 20.312f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(20.316f, 20.316f, 0.0f, false, true, 4.5f, 8.8f)
                arcTo(0.734f, 0.734f, 0.0f, false, true, 4.043f, 8.071f)
                close()
                moveTo(22.693f, 9.989f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, false, -1.028f, -0.035f)
                curveTo(20.564f, 10.6f, 17.538f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(3.437f, 10.6f, 2.335f, 9.954f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, false, -1.028f, 0.035f)
                arcTo(2.632f, 2.632f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.69f, 6.194f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(12.0f, -0.31f, 12.0f, -4.0f)
                arcTo(2.632f, 2.632f, 0.0f, false, false, 22.693f, 9.989f)
                close()
                moveTo(16.5f, 17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.235f, 2.174f)
                arcToRelative(4.685f, 4.685f, 0.0f, false, false, -2.53f, 0.0f)
                arcToRelative(3.494f, 3.494f, 0.0f, true, false, 0.193f, 2.033f)
                arcTo(3.52f, 3.52f, 0.0f, false, true, 12.0f, 21.0f)
                arcToRelative(3.514f, 3.514f, 0.0f, false, true, 1.072f, 0.207f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 16.5f, 17.0f)
                close()
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
