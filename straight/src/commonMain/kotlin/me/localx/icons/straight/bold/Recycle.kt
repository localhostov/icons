package me.localx.icons.straight.bold

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

public val Icons.Bold.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.41f, 14.537f)
                lineToRelative(-1.568f, -2.349f)
                lineToRelative(-2.5f, 1.665f)
                lineTo(20.913f, 16.2f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, true, 0.03f, 0.508f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, -0.51f, 0.291f)
                horizontalLineTo(14.508f)
                verticalLineTo(13.5f)
                lineTo(9.835f, 17.762f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.478f)
                lineToRelative(4.673f, 4.26f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(5.925f)
                arcToRelative(3.565f, 3.565f, 0.0f, false, false, 3.154f, -1.875f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 23.41f, 14.537f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3f, 3.265f)
                arcTo(0.558f, 0.558f, 0.0f, false, true, 11.778f, 3.0f)
                arcToRelative(0.537f, 0.537f, 0.0f, false, true, 0.49f, 0.25f)
                lineTo(15.4f, 7.946f)
                lineTo(12.5f, 9.764f)
                lineToRelative(6.092f, 1.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.252f, -0.785f)
                lineTo(20.97f, 4.452f)
                lineToRelative(-3.028f, 1.9f)
                lineTo(14.764f, 1.588f)
                arcTo(3.482f, 3.482f, 0.0f, false, false, 11.736f, 0.0f)
                arcTo(3.555f, 3.555f, 0.0f, false, false, 8.761f, 1.664f)
                lineTo(7.582f, 3.522f)
                lineTo(10.115f, 5.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.263f, 11.21f)
                lineTo(9.0f, 13.156f)
                lineTo(8.236f, 6.879f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.205f, -0.856f)
                lineTo(0.852f, 7.366f)
                lineToRelative(2.962f, 2.1f)
                lineTo(0.543f, 14.626f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, -0.1f, 3.548f)
                arcToRelative(3.573f, 3.573f, 0.0f, false, false, 3.133f, 1.832f)
                lineTo(7.006f, 20.0f)
                lineTo(7.0f, 17.0f)
                lineToRelative(-3.427f, 0.006f)
                arcToRelative(0.554f, 0.554f, 0.0f, false, true, -0.5f, -0.284f)
                arcToRelative(0.466f, 0.466f, 0.0f, false, true, 0.012f, -0.5f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
