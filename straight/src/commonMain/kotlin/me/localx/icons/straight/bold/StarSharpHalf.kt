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

public val Icons.Bold.StarSharpHalf: ImageVector
    get() {
        if (_starSharpHalf != null) {
            return _starSharpHalf!!
        }
        _starSharpHalf = Builder(name = "StarSharpHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.954f, 0.0f)
                lineToRelative(-2.226f, 6.956f)
                lineTo(1.0f, 6.956f)
                lineToRelative(-1.0f, 4.467f)
                lineToRelative(5.096f, 3.734f)
                lineToRelative(-2.533f, 7.86f)
                lineToRelative(4.325f, 0.983f)
                lineToRelative(6.112f, -4.521f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-3.046f)
                close()
                moveTo(6.511f, 20.548f)
                lineToRelative(1.441f, -4.47f)
                lineToRelative(0.664f, -2.061f)
                lineToRelative(-1.746f, -1.28f)
                lineToRelative(-3.513f, -2.574f)
                lineToRelative(0.046f, -0.207f)
                horizontalLineToRelative(6.597f)
                verticalLineToRelative(8.011f)
                lineToRelative(-3.489f, 2.581f)
                close()
            }
        }
        .build()
        return _starSharpHalf!!
    }

private var _starSharpHalf: ImageVector? = null
