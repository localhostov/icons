package me.localx.icons.straight.outline

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

public val Icons.Outline.Broccoli: ImageVector
    get() {
        if (_broccoli != null) {
            return _broccoli!!
        }
        _broccoli = Builder(name = "Broccoli", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.794f, 6.206f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, -4.6f, -3.194f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 5.083f, 5.0f)
                arcTo(5.052f, 5.052f, 0.0f, false, false, 0.0f, 10.0f)
                curveToRelative(0.0f, 3.408f, 2.154f, 5.571f, 5.827f, 5.943f)
                arcTo(19.615f, 19.615f, 0.0f, false, true, 7.0f, 23.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(23.0f)
                arcToRelative(17.969f, 17.969f, 0.0f, false, true, 1.631f, -8.084f)
                arcTo(5.339f, 5.339f, 0.0f, false, false, 19.5f, 15.0f)
                arcToRelative(4.491f, 4.491f, 0.0f, false, false, 1.294f, -8.794f)
                close()
                moveTo(15.019f, 22.0f)
                horizontalLineTo(8.981f)
                arcToRelative(21.852f, 21.852f, 0.0f, false, false, -1.042f, -6.091f)
                arcToRelative(8.134f, 8.134f, 0.0f, false, false, 2.57f, -1.0f)
                arcToRelative(4.721f, 4.721f, 0.0f, false, false, 0.491f, 0.329f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.928f)
                arcTo(6.783f, 6.783f, 0.0f, false, false, 14.0f, 16.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 2.208f, -0.514f)
                arcTo(21.192f, 21.192f, 0.0f, false, false, 15.019f, 22.0f)
                close()
                moveTo(19.5f, 13.0f)
                arcTo(2.6f, 2.6f, 0.0f, false, true, 17.0f, 10.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(4.481f, 4.481f, 0.0f, false, false, 0.957f, 2.772f)
                arcTo(2.989f, 2.989f, 0.0f, false, true, 14.0f, 14.0f)
                arcToRelative(3.459f, 3.459f, 0.0f, false, true, -2.636f, -1.009f)
                lineToRelative(-0.6f, -0.674f)
                lineToRelative(-0.734f, 0.523f)
                arcTo(5.75f, 5.75f, 0.0f, false, true, 7.0f, 14.0f)
                curveToRelative(-2.281f, 0.0f, -5.0f, -0.694f, -5.0f, -4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 7.0f)
                arcToRelative(3.064f, 3.064f, 0.0f, false, true, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                arcTo(5.008f, 5.008f, 0.0f, false, false, 7.04f, 5.435f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.7f, 4.5f)
                lineToRelative(0.33f, 0.811f)
                lineToRelative(0.848f, -0.219f)
                arcTo(2.437f, 2.437f, 0.0f, false, true, 16.5f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.463f, 2.176f)
                lineToRelative(0.1f, 0.762f)
                lineToRelative(0.762f, 0.1f)
                arcTo(2.491f, 2.491f, 0.0f, false, true, 19.5f, 13.0f)
                close()
            }
        }
        .build()
        return _broccoli!!
    }

private var _broccoli: ImageVector? = null
