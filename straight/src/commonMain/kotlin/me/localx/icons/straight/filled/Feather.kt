package me.localx.icons.straight.filled

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

public val Icons.Filled.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.974f, 2.94f)
                arcToRelative(29.725f, 29.725f, 0.0f, false, true, -2.489f, 8.06f)
                horizontalLineToRelative(-7.071f)
                lineToRelative(3.543f, -3.543f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-6.543f, 6.543f)
                verticalLineToRelative(-8.418f)
                arcToRelative(30.117f, 30.117f, 0.0f, false, true, 11.039f, -4.141f)
                arcToRelative(2.582f, 2.582f, 0.0f, false, true, 2.935f, 2.913f)
                close()
                moveTo(8.0f, 5.533f)
                arcToRelative(24.715f, 24.715f, 0.0f, false, false, -2.744f, 2.336f)
                arcToRelative(7.754f, 7.754f, 0.0f, false, false, -2.247f, 5.836f)
                arcToRelative(7.636f, 7.636f, 0.0f, false, false, 1.569f, 4.3f)
                lineToRelative(3.422f, -3.419f)
                close()
                moveTo(10.586f, 20.994f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.914f, -2.553f)
                arcToRelative(26.623f, 26.623f, 0.0f, false, false, 3.962f, -5.441f)
                horizontalLineToRelative(-8.048f)
                lineToRelative(-6.423f, 6.423f)
                arcToRelative(7.436f, 7.436f, 0.0f, false, false, 4.595f, 1.571f)
                close()
                moveTo(4.578f, 18.008f)
                lineTo(0.043f, 22.543f)
                lineTo(1.457f, 23.957f)
                lineTo(5.991f, 19.423f)
                curveToRelative(-0.054f, -0.042f, -0.115f, -0.071f, -0.169f, -0.115f)
                arcToRelative(7.947f, 7.947f, 0.0f, false, true, -1.244f, -1.3f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
