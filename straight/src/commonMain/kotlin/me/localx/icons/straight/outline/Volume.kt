package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(name = "Volume", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.99f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.014f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(4.8f, 18.004f)
                lineTo(12.0f, 24.0f)
                lineTo(12.0f, 0.0f)
                lineTo(4.8f, 5.99f)
                close()
                moveTo(10.0f, 4.268f)
                lineTo(10.0f, 19.729f)
                lineTo(5.525f, 16.007f)
                lineTo(2.0f, 16.007f)
                lineTo(2.0f, 7.993f)
                lineTo(5.525f, 7.993f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, -5.0f, -5.008f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 0.0f, 6.01f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                arcTo(5.01f, 5.01f, 0.0f, false, false, 20.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.985f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(7.012f, 7.012f, 0.0f, false, true, 0.0f, 14.024f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(9.015f, 9.015f, 0.0f, false, false, 0.0f, -18.03f)
                close()
            }
        }
        .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
