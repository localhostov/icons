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

public val Icons.Bold.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.436f, 8.64f)
                lineTo(24.0f, 4.074f)
                lineTo(21.881f, 1.953f)
                lineTo(17.29f, 6.544f)
                lineToRelative(-1.75f, -1.71f)
                arcToRelative(2.458f, 2.458f, 0.0f, false, false, -3.333f, -0.091f)
                arcTo(18.25f, 18.25f, 0.0f, false, true, 6.336f, 8.322f)
                lineTo(0.0f, 10.18f)
                verticalLineTo(11.3f)
                arcTo(12.845f, 12.845f, 0.0f, false, false, 12.961f, 24.0f)
                horizontalLineToRelative(1.353f)
                lineToRelative(0.387f, -0.27f)
                arcToRelative(14.818f, 14.818f, 0.0f, false, false, 6.805f, -11.957f)
                arcToRelative(2.469f, 2.469f, 0.0f, false, false, -0.744f, -1.837f)
                close()
                moveTo(13.36f, 21.0f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(10.189f, 10.189f, 0.0f, false, true, -2.786f, -0.387f)
                arcToRelative(11.559f, 11.559f, 0.0f, false, false, 3.282f, -3.179f)
                lineToRelative(0.494f, -0.727f)
                lineToRelative(-2.48f, -1.687f)
                lineToRelative(-0.493f, 0.725f)
                arcToRelative(8.584f, 8.584f, 0.0f, false, true, -3.224f, 2.817f)
                lineTo(6.9f, 18.99f)
                arcTo(9.891f, 9.891f, 0.0f, false, true, 5.25f, 17.423f)
                arcToRelative(11.605f, 11.605f, 0.0f, false, false, 3.637f, -2.4f)
                lineToRelative(-2.1f, -2.142f)
                arcToRelative(8.627f, 8.627f, 0.0f, false, true, -3.1f, 1.931f)
                arcToRelative(9.424f, 9.424f, 0.0f, false, true, -0.619f, -2.407f)
                lineTo(7.18f, 11.2f)
                arcTo(16.87f, 16.87f, 0.0f, false, false, 11.5f, 9.043f)
                lineTo(17.826f, 15.2f)
                arcTo(12.492f, 12.492f, 0.0f, false, true, 13.36f, 21.0f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
