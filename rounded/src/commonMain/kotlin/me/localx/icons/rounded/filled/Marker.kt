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

public val Icons.Filled.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.042f)
                arcToRelative(9.992f, 9.992f, 0.0f, false, false, -9.981f, 9.98f)
                curveToRelative(0.0f, 2.57f, 1.99f, 6.592f, 5.915f, 11.954f)
                arcToRelative(5.034f, 5.034f, 0.0f, false, false, 8.132f, 0.0f)
                curveToRelative(3.925f, -5.362f, 5.915f, -9.384f, 5.915f, -11.954f)
                arcTo(9.992f, 9.992f, 0.0f, false, false, 12.0f, 0.042f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
