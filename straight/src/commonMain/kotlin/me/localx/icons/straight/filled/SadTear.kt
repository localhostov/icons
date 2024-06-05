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

public val Icons.Filled.SadTear: ImageVector
    get() {
        if (_sadTear != null) {
            return _sadTear!!
        }
        _sadTear = Builder(name = "SadTear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(15.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 8.0f)
                close()
                moveTo(8.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.59f, 2.0f, -3.6f, 2.0f, -3.6f)
                reflectiveCurveToRelative(2.0f, 1.969f, 2.0f, 3.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 18.0f)
                close()
                moveTo(8.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 11.0f)
                close()
                moveTo(16.336f, 17.747f)
                arcTo(7.517f, 7.517f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.457f, -1.962f)
                curveToRelative(2.834f, -0.409f, 6.172f, 2.151f, 6.123f, 2.216f)
                close()
            }
        }
        .build()
        return _sadTear!!
    }

private var _sadTear: ImageVector? = null
