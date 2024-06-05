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

public val Icons.Bold.Skiing: ImageVector
    get() {
        if (_skiing != null) {
            return _skiing!!
        }
        _skiing = Builder(name = "Skiing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 19.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 2.5f)
                close()
                moveTo(21.282f, 20.212f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.006f, 0.7f)
                lineToRelative(-6.441f, -3.061f)
                lineToRelative(1.875f, -3.505f)
                lineToRelative(-2.245f, -1.624f)
                lineTo(15.0f, 9.319f)
                verticalLineToRelative(3.616f)
                lineToRelative(4.785f, 2.2f)
                lineToRelative(1.252f, -2.726f)
                lineTo(18.0f, 11.011f)
                lineTo(18.0f, 6.986f)
                lineTo(16.484f, 5.833f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 14.367f, 5.0f)
                arcToRelative(3.524f, 3.524f, 0.0f, false, false, -2.7f, 1.14f)
                lineTo(10.659f, 7.284f)
                lineTo(6.638f, 5.337f)
                lineToRelative(0.8f, -1.692f)
                lineTo(4.729f, 2.359f)
                lineToRelative(-0.792f, 1.67f)
                lineTo(2.171f, 3.174f)
                lineTo(0.885f, 5.885f)
                lineToRelative(1.766f, 0.855f)
                lineTo(1.808f, 8.517f)
                lineTo(4.519f, 9.8f)
                lineToRelative(0.832f, -1.755f)
                lineTo(8.624f, 9.634f)
                arcToRelative(3.211f, 3.211f, 0.0f, false, false, 0.386f, 4.278f)
                lineToRelative(1.819f, 1.331f)
                lineToRelative(-0.707f, 1.32f)
                lineToRelative(-8.837f, -4.2f)
                lineTo(0.0f, 15.073f)
                lineToRelative(17.986f, 8.548f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 6.0f, -2.111f)
                close()
            }
        }
        .build()
        return _skiing!!
    }

private var _skiing: ImageVector? = null
