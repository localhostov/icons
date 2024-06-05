package me.localx.icons.straight.bold

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

public val Icons.Bold.TimeDelete: ImageVector
    get() {
        if (_timeDelete != null) {
            return _timeDelete!!
        }
        _timeDelete = Builder(name = "TimeDelete", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.621f, 19.5f)
                lineToRelative(2.44f, 2.439f)
                lineToRelative(-2.122f, 2.122f)
                lineToRelative(-2.439f, -2.44f)
                lineToRelative(-2.439f, 2.44f)
                lineToRelative(-2.122f, -2.122f)
                lineToRelative(2.44f, -2.439f)
                lineToRelative(-2.44f, -2.439f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(2.439f, 2.44f)
                lineToRelative(2.439f, -2.44f)
                lineToRelative(2.122f, 2.122f)
                close()
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 17.941f, 1.0f)
                horizontalLineToRelative(3.008f)
                curveToRelative(0.028f, -0.331f, 0.051f, -0.662f, 0.051f, -1.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                curveToRelative(0.338f, 0.0f, 0.669f, -0.023f, 1.0f, -0.051f)
                verticalLineToRelative(-3.008f)
                arcToRelative(8.972f, 8.972f, 0.0f, false, true, -10.0f, -8.941f)
                close()
                moveTo(10.0f, 6.0f)
                verticalLineToRelative(5.379f)
                lineToRelative(-2.561f, 2.56f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(3.439f, -3.44f)
                verticalLineToRelative(-6.621f)
                close()
            }
        }
        .build()
        return _timeDelete!!
    }

private var _timeDelete: ImageVector? = null
