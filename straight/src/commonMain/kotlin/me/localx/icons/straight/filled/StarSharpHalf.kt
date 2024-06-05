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

public val Icons.Filled.StarSharpHalf: ImageVector
    get() {
        if (_starSharpHalf != null) {
            return _starSharpHalf!!
        }
        _starSharpHalf = Builder(name = "StarSharpHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.567f, 23.088f)
                lineToRelative(2.829f, -8.754f)
                lineTo(0.039f, 8.999f)
                horizontalLineToRelative(9.242f)
                lineTo(12.5f, -0.668f)
                verticalLineToRelative(18.188f)
                lineToRelative(-7.933f, 5.568f)
                close()
            }
        }
        .build()
        return _starSharpHalf!!
    }

private var _starSharpHalf: ImageVector? = null
