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

public val Icons.Bold.Pennant: ImageVector
    get() {
        if (_pennant != null) {
            return _pennant!!
        }
        _pennant = Builder(name = "Pennant", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.643f, 8.832f)
                lineTo(4.754f, 3.582f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 1.0f, 4.5f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(4.0f, 20.8f)
                lineTo(21.671f, 15.3f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -0.028f, -6.47f)
                close()
                moveTo(20.752f, 12.446f)
                lineTo(4.0f, 17.653f)
                lineTo(4.0f, 6.489f)
                lineToRelative(16.724f, 5.2f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, 0.276f, 0.384f)
                arcTo(0.362f, 0.362f, 0.0f, false, true, 20.752f, 12.446f)
                close()
            }
        }
        .build()
        return _pennant!!
    }

private var _pennant: ImageVector? = null
