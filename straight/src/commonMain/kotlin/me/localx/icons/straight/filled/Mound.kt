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

public val Icons.Filled.Mound: ImageVector
    get() {
        if (_mound != null) {
            return _mound!!
        }
        _mound = Builder(name = "Mound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-1.782f)
                lineToRelative(6.678f, -12.083f)
                curveToRelative(1.086f, -1.966f, 3.076f, -3.14f, 5.322f, -3.14f)
                reflectiveCurveToRelative(4.236f, 1.174f, 5.323f, 3.14f)
                lineToRelative(6.677f, 12.083f)
                verticalLineToRelative(1.782f)
                close()
            }
        }
        .build()
        return _mound!!
    }

private var _mound: ImageVector? = null
