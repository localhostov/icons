package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

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
                lineToRelative(1.94f, -1.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineToRelative(-1.939f, 1.94f)
                lineToRelative(-1.939f, -1.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 2.122f)
                lineToRelative(1.94f, 1.939f)
                lineToRelative(-1.94f, 1.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(1.939f, -1.94f)
                lineToRelative(1.939f, 1.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.57f, 20.99f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 9.42f, -9.42f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, -0.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.56f, 12.556f)
                horizontalLineToRelative(0.071f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.069f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(3.555f)
                lineToRelative(-2.4f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.475f, 2.068f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.068f, 0.475f)
                lineToRelative(2.869f, -1.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.938f, -1.7f)
                verticalLineToRelative(-4.098f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _timeDelete!!
    }

private var _timeDelete: ImageVector? = null
