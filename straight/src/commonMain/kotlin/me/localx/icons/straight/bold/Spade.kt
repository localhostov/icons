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

public val Icons.Bold.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.853f)
                curveTo(22.0f, 8.475f, 16.611f, 2.774f, 14.0f, 0.7f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -4.0f, 0.0f)
                curveTo(6.906f, 3.157f, 2.0f, 8.613f, 2.0f, 12.789f)
                curveTo(2.0f, 16.271f, 4.416f, 19.0f, 7.5f, 19.0f)
                arcToRelative(6.285f, 6.285f, 0.0f, false, false, 2.946f, -0.759f)
                curveTo(9.654f, 20.2f, 9.0f, 21.0f, 5.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(19.0f, 24.0f)
                lineTo(19.0f, 21.0f)
                curveToRelative(-4.0f, 0.0f, -4.654f, -0.8f, -5.446f, -2.76f)
                arcTo(6.277f, 6.277f, 0.0f, false, false, 16.5f, 19.0f)
                curveTo(19.636f, 19.0f, 22.0f, 16.357f, 22.0f, 12.853f)
                close()
                moveTo(13.218f, 14.125f)
                lineTo(12.009f, 12.456f)
                lineTo(10.787f, 14.118f)
                arcTo(4.768f, 4.768f, 0.0f, false, true, 7.5f, 16.0f)
                curveTo(5.876f, 16.0f, 5.0f, 14.346f, 5.0f, 12.789f)
                curveToRelative(0.0f, -2.524f, 3.618f, -7.16f, 6.866f, -9.741f)
                arcToRelative(0.211f, 0.211f, 0.0f, false, true, 0.269f, 0.0f)
                curveTo(15.382f, 5.63f, 19.0f, 10.291f, 19.0f, 12.853f)
                curveTo(19.0f, 14.646f, 17.925f, 16.0f, 16.5f, 16.0f)
                arcTo(4.766f, 4.766f, 0.0f, false, true, 13.218f, 14.125f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
