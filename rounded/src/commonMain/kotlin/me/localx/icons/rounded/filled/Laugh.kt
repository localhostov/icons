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

public val Icons.Filled.Laugh: ImageVector
    get() {
        if (_laugh != null) {
            return _laugh!!
        }
        _laugh = Builder(name = "Laugh", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(6.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                curveToRelative(0.0f, 1.0f, -0.895f, 1.0f, -2.0f, 1.0f)
                reflectiveCurveTo(6.0f, 11.0f, 6.0f, 10.0f)
                close()
                moveTo(16.973f, 15.285f)
                arcTo(5.469f, 5.469f, 0.0f, false, true, 12.007f, 19.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -4.966f, -3.715f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 14.0f)
                lineTo(16.01f, 14.0f)
                arcTo(1.02f, 1.02f, 0.0f, false, true, 16.973f, 15.285f)
                close()
                moveTo(16.0f, 11.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.0f, -2.0f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                curveTo(18.0f, 11.0f, 17.105f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _laugh!!
    }

private var _laugh: ImageVector? = null
