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

public val Icons.Outline.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.472f, 16.194f)
                lineToRelative(-1.641f, -2.486f)
                lineToRelative(-1.668f, 1.1f)
                lineTo(21.8f, 17.3f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 0.056f, 1.154f)
                arcToRelative(1.151f, 1.151f, 0.0f, false, true, -1.032f, 0.608f)
                horizontalLineTo(12.879f)
                lineToRelative(1.478f, -1.475f)
                lineToRelative(-1.412f, -1.416f)
                lineToRelative(-2.523f, 2.517f)
                arcToRelative(2.009f, 2.009f, 0.0f, false, false, 0.01f, 2.843f)
                lineTo(12.951f, 24.0f)
                lineToRelative(1.4f, -1.427f)
                lineToRelative(-1.542f, -1.515f)
                horizontalLineToRelative(8.019f)
                arcTo(3.164f, 3.164f, 0.0f, false, false, 23.621f, 19.4f)
                arcTo(3.077f, 3.077f, 0.0f, false, false, 23.472f, 16.194f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.76f, 3.013f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.994f, 0.522f)
                lineTo(17.027f, 10.0f)
                lineToRelative(-2.215f, -0.437f)
                lineToRelative(-0.386f, 1.962f)
                lineToRelative(3.62f, 0.714f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.4f, 10.646f)
                lineToRelative(0.684f, -3.664f)
                lineToRelative(-1.967f, -0.367f)
                lineToRelative(-0.425f, 2.279f)
                lineTo(14.423f, 2.433f)
                arcTo(3.175f, 3.175f, 0.0f, false, false, 9.087f, 2.5f)
                lineTo(7.852f, 4.468f)
                lineTo(9.545f, 5.532f)
                lineToRelative(1.238f, -1.971f)
                arcTo(1.146f, 1.146f, 0.0f, false, true, 11.76f, 3.013f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.457f, 10.453f)
                lineToRelative(0.43f, 2.31f)
                lineTo(8.854f, 12.4f)
                lineTo(8.17f, 8.732f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.818f, 7.138f)
                lineTo(2.2f, 7.851f)
                lineToRelative(0.387f, 1.962f)
                lineToRelative(2.184f, -0.431f)
                lineTo(0.478f, 16.21f)
                arcTo(3.087f, 3.087f, 0.0f, false, false, 0.4f, 19.378f)
                arcTo(3.129f, 3.129f, 0.0f, false, false, 3.171f, 21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.171f)
                arcToRelative(1.154f, 1.154f, 0.0f, false, true, -1.024f, -0.594f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 0.027f, -1.136f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
