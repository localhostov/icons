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

public val Icons.Filled.Kiss: ImageVector
    get() {
        if (_kiss != null) {
            return _kiss!!
        }
        _kiss = Builder(name = "Kiss", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(8.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 11.0f)
                close()
                moveTo(15.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.5f, 20.0f)
                lineTo(11.0f, 20.0f)
                lineTo(11.0f, 18.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(12.0f, 17.0f)
                lineTo(12.0f, 15.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(11.0f, 14.0f)
                lineTo(11.0f, 12.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, true, 1.987f, 4.0f)
                arcTo(2.471f, 2.471f, 0.0f, false, true, 15.0f, 17.5f)
                close()
                moveTo(15.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 11.0f)
                close()
            }
        }
        .build()
        return _kiss!!
    }

private var _kiss: ImageVector? = null
