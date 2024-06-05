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

public val Icons.Filled.Kite: ImageVector
    get() {
        if (_kite != null) {
            return _kite!!
        }
        _kite = Builder(name = "Kite", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.587f, 7.0f)
                lineTo(4.1f, 15.485f)
                lineTo(7.242f, 3.712f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, 0.636f, -1.42f)
                close()
                moveTo(17.287f, 13.757f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, 1.42f, -0.636f)
                lineTo(14.0f, 8.415f)
                lineTo(5.52f, 16.9f)
                close()
                moveTo(20.129f, 11.715f)
                arcTo(4.976f, 4.976f, 0.0f, false, false, 21.0f, 8.927f)
                lineTo(21.0f, 5.0f)
                arcToRelative(4.973f, 4.973f, 0.0f, false, false, -0.832f, -2.752f)
                lineTo(15.415f, 7.0f)
                close()
                moveTo(16.0f, 0.0f)
                lineTo(12.073f, 0.0f)
                arcTo(4.976f, 4.976f, 0.0f, false, false, 9.284f, 0.87f)
                lineTo(14.0f, 5.587f)
                lineTo(18.754f, 0.834f)
                arcTo(4.962f, 4.962f, 0.0f, false, false, 16.0f, 0.0f)
                close()
                moveTo(24.0f, 21.5f)
                lineTo(24.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(22.0f, 21.4f)
                arcToRelative(3.347f, 3.347f, 0.0f, false, false, -2.88f, -3.379f)
                arcToRelative(3.228f, 3.228f, 0.0f, false, false, -2.7f, 0.973f)
                arcTo(15.143f, 15.143f, 0.0f, false, true, 5.613f, 24.0f)
                lineTo(3.627f, 24.0f)
                arcToRelative(3.423f, 3.423f, 0.0f, false, true, -3.3f, -1.743f)
                arcToRelative(3.081f, 3.081f, 0.0f, false, true, 0.594f, -3.585f)
                lineToRelative(2.377f, -2.379f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.416f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.412f)
                lineTo(2.33f, 20.086f)
                arcTo(1.121f, 1.121f, 0.0f, false, false, 3.123f, 22.0f)
                lineTo(4.274f, 22.0f)
                arcToRelative(15.923f, 15.923f, 0.0f, false, false, 10.888f, -4.571f)
                arcTo(5.207f, 5.207f, 0.0f, false, true, 18.9f, 16.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 24.0f, 21.5f)
                close()
            }
        }
        .build()
        return _kite!!
    }

private var _kite: ImageVector? = null
