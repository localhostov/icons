package me.localx.icons.rounded.bold

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

public val Icons.Bold.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.727f, 1.273f)
                arcToRelative(4.31f, 4.31f, 0.0f, false, false, -4.112f, -1.144f)
                arcToRelative(30.23f, 30.23f, 0.0f, false, false, -13.315f, 7.487f)
                arcToRelative(7.862f, 7.862f, 0.0f, false, false, -0.969f, 9.933f)
                lineToRelative(-3.892f, 3.89f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(3.893f, -3.894f)
                arcToRelative(7.631f, 7.631f, 0.0f, false, false, 4.288f, 1.333f)
                arcToRelative(8.312f, 8.312f, 0.0f, false, false, 5.989f, -2.58f)
                arcToRelative(30.589f, 30.589f, 0.0f, false, false, 7.143f, -13.07f)
                arcToRelative(4.276f, 4.276f, 0.0f, false, false, -1.147f, -4.077f)
                close()
                moveTo(19.339f, 3.041f)
                arcToRelative(1.321f, 1.321f, 0.0f, false, true, 1.269f, 0.355f)
                arcToRelative(1.291f, 1.291f, 0.0f, false, true, 0.352f, 1.237f)
                arcToRelative(26.828f, 26.828f, 0.0f, false, true, -2.037f, 5.367f)
                horizontalLineToRelative(-2.8f)
                lineToRelative(1.44f, -1.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineToRelative(-4.441f, 4.44f)
                verticalLineToRelative(-4.035f)
                arcToRelative(28.164f, 28.164f, 0.0f, false, true, 8.339f, -3.803f)
                close()
                moveTo(6.006f, 13.418f)
                arcToRelative(4.895f, 4.895f, 0.0f, false, true, 1.417f, -3.683f)
                curveToRelative(0.184f, -0.185f, 0.386f, -0.35f, 0.577f, -0.527f)
                verticalLineToRelative(4.671f)
                lineToRelative(-1.488f, 1.488f)
                arcToRelative(4.861f, 4.861f, 0.0f, false, true, -0.506f, -1.949f)
                close()
                moveTo(14.565f, 16.34f)
                arcToRelative(5.12f, 5.12f, 0.0f, false, true, -5.941f, 1.16f)
                lineToRelative(1.936f, -1.936f)
                lineToRelative(2.561f, -2.564f)
                horizontalLineToRelative(4.072f)
                arcToRelative(23.562f, 23.562f, 0.0f, false, true, -2.628f, 3.34f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
