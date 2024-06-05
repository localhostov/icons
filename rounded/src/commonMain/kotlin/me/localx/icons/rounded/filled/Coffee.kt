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

public val Icons.Filled.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(3.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 2.0f)
                lineTo(4.184f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 0.0f)
                lineTo(17.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.816f, 2.0f)
                lineTo(21.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 4.0f)
                close()
                moveTo(10.0f, 16.0f)
                curveToRelative(0.105f, 3.954f, 3.895f, 3.953f, 4.0f, 0.0f)
                curveTo(13.9f, 12.046f, 10.105f, 12.047f, 10.0f, 16.0f)
                close()
                moveTo(8.081f, 15.0f)
                curveToRelative(0.892f, -5.287f, 6.948f, -5.284f, 7.838f, 0.0f)
                horizontalLineToRelative(5.088f)
                lineToRelative(0.735f, -5.876f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.75f, 8.0f)
                lineTo(3.25f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.992f, 1.124f)
                lineTo(2.992f, 15.0f)
                close()
                moveTo(15.919f, 17.0f)
                curveToRelative(-0.892f, 5.287f, -6.947f, 5.284f, -7.838f, 0.0f)
                lineTo(3.242f, 17.0f)
                lineToRelative(0.328f, 2.62f)
                arcTo(5.008f, 5.008f, 0.0f, false, false, 8.531f, 24.0f)
                horizontalLineToRelative(6.938f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 4.961f, -4.38f)
                lineTo(20.757f, 17.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
