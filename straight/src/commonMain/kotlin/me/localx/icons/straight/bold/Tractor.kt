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

public val Icons.Bold.Tractor: ImageVector
    get() {
        if (_tractor != null) {
            return _tractor!!
        }
        _tractor = Builder(name = "Tractor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.861f, 13.614f)
                lineToRelative(-1.056f, 0.638f)
                arcTo(5.013f, 5.013f, 0.0f, false, false, 8.0f, 13.23f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(1.23f)
                arcTo(5.013f, 5.013f, 0.0f, false, false, 3.2f, 14.252f)
                lineToRelative(-1.056f, -0.638f)
                lineTo(0.588f, 16.183f)
                lineToRelative(1.053f, 0.635f)
                arcToRelative(5.025f, 5.025f, 0.0f, false, false, 0.0f, 2.364f)
                lineToRelative(-1.053f, 0.635f)
                lineToRelative(1.551f, 2.569f)
                lineTo(3.2f, 21.748f)
                arcTo(5.013f, 5.013f, 0.0f, false, false, 5.0f, 22.77f)
                verticalLineTo(24.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.77f)
                arcToRelative(5.013f, 5.013f, 0.0f, false, false, 1.8f, -1.022f)
                lineToRelative(1.056f, 0.638f)
                lineToRelative(1.551f, -2.569f)
                lineToRelative(-1.053f, -0.635f)
                arcToRelative(5.025f, 5.025f, 0.0f, false, false, 0.0f, -2.364f)
                lineToRelative(1.053f, -0.635f)
                close()
                moveTo(6.5f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.5f, 20.0f)
                close()
                moveTo(24.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.315f)
                lineTo(11.968f, 1.645f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 9.0f, 0.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.036f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 10.5f)
                verticalLineToRelative(2.221f)
                arcToRelative(8.007f, 8.007f, 0.0f, false, true, 3.0f, -2.134f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.07f)
                lineTo(19.422f, 15.1f)
                arcToRelative(4.508f, 4.508f, 0.0f, true, false, 2.562f, 1.56f)
                lineTo(24.0f, 13.43f)
                close()
                moveTo(6.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.424f, 0.235f)
                lineTo(11.777f, 7.0f)
                close()
                moveTo(18.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 20.0f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 21.0f)
                close()
            }
        }
        .build()
        return _tractor!!
    }

private var _tractor: ImageVector? = null
